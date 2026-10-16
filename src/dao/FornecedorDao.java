package dao;

import conexoes.ConexoesMySql;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import model.Fornecedor;
import view.FornecedorFrm;
import view.ProdutoFrm;

public class FornecedorDao {

    static Connection conexao = null;
    static PreparedStatement pst = null;
    static PreparedStatement pst0 = null;
    static PreparedStatement pst1 = null;
    static PreparedStatement pst2 = null;
    static PreparedStatement pst3 = null;
    static PreparedStatement pst4 = null;
    static PreparedStatement pst5 = null;
    static PreparedStatement pst6 = null;
    static ResultSet rs = null;
    static ResultSet rs0 = null;
    static ResultSet rs1 = null;
    static ResultSet rs2 = null;
    static ResultSet rs3 = null;
    static ResultSet rs4 = null;
    static ResultSet rs6 = null;
    static int sts;
    static String dataNascimento;
    static String cnpjAtual = null;

    public FornecedorDao() {
        conexao = ConexoesMySql.base();

    }

    public static boolean addFornecedorDao(Fornecedor fornecedor) throws SQLException {
        conexao = ConexoesMySql.base();
        pst = null;
        pst0 = null;
        pst1 = null;
        pst2 = null;
        pst3 = null;
        pst4 = null;
        pst5 = null;
        rs = null;

        String sqlPessoa = "INSERT INTO PESSOA (nome_pessoa, cpf_pessoa, rg_pessoa, orgaoemissor_pessoa, dtnasc_pessoa,"
                + " tipo_pessoa, razaosocial_pessoa, nomefantasia_pessoa, cnpj_pessoa, ie_pessoa, observacoes_pessoa) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        String sqlfornecedor = "INSERT INTO FORNECEDOR (id_pessoa) VALUES (?)";
        String sqltelefone = "INSERT INTO CONTATO_FORNECEDOR (id_fornecedor, descricao_fornecedor_contato, id_contato_tipo) VALUES (?,?,1)";
        String sqlcelular = "INSERT INTO CONTATO_FORNECEDOR (id_fornecedor, descricao_fornecedor_contato, id_contato_tipo) VALUES (?,?,2)";
        String sqlemail = "INSERT INTO CONTATO_FORNECEDOR (id_fornecedor, descricao_fornecedor_contato, id_contato_tipo) VALUES (?,?,3)";
        String sqlendereco = "INSERT INTO ENDERECO_FORNECEDOR (cep_endereco_fornecedor, logradouro_endereco_fornecedor, complemento_endereco_fornecedor,"
                + " numero_endereco_fornecedor, bairro_endereco_fornecedor,"
                + " cidade_endereco_fornecedor, estado_endereco_fornecedor, id_fornecedor) VALUES (?,?,?,?,?,?,?,?)";
        String sqlCpf = "SELECT * FROM PESSOA WHERE cpf_pessoa = ?";

        if (conexao != null) {
            try {
                String cpf = fornecedor.getCpf();
                if (!cpf.equals(null) && !cpf.equals(".   .   -")) {
                    pst0 = conexao.prepareStatement(sqlCpf);
                    pst0.setString(1, fornecedor.getCpf());
                    rs = pst0.executeQuery();
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(null, "Não é possível usar o mesmo CPF para mais de um fornecedor", "CPF já cadastrado para um Fornecedor", JOptionPane.OK_OPTION);
                        FornecedorFrm.limparCampos();

                    }
                }
                if (!cpf.isEmpty() && !cpf.equals("   .   .   -  ")) {
                    try {

                        pst = conexao.prepareStatement(sqlPessoa, Statement.RETURN_GENERATED_KEYS);
                        pst1 = conexao.prepareStatement(sqlfornecedor, Statement.RETURN_GENERATED_KEYS);
                        pst2 = conexao.prepareStatement(sqltelefone);
                        pst3 = conexao.prepareStatement(sqlcelular);
                        pst4 = conexao.prepareStatement(sqlemail);
                        pst5 = conexao.prepareStatement(sqlendereco);

                        pst.setString(1, fornecedor.getNome());

                        cpf = fornecedor.getCpf();
                        String cpfAtual = null;
                        if (cpf.equals("   .   .   -  ")) {
                            cpfAtual = null;
                        }
                        pst.setString(2, cpfAtual);
                        pst.setString(3, fornecedor.getRg());
                        pst.setString(4, fornecedor.getOrgaoEmissorRg());

                        String data = FornecedorFrm.iptDataNascimento.getText();
                        if (data.equals("  /  /    ")) {
                            dataNascimento = null;
                        } else {
                            String dia = data.substring(0, 2);
                            String mes = data.substring(3, 5);
                            String ano = data.substring(6);
                            dataNascimento = ano + "-" + mes + "-" + dia;
                        }

                        pst.setString(5, dataNascimento);
                        pst.setInt(6, fornecedor.getTipoPessoa());

                        pst.setString(7, fornecedor.getRazaoSocial());
                        pst.setString(8, fornecedor.getNomeFantasia());
                        String cnpj = fornecedor.getCnpj();
                        if (cnpj.equals("  .   .   /    -  ")) {
                            cnpjAtual = null;
                        } else {
                            cnpjAtual = cnpj;
                        }
                        pst.setString(9, cnpjAtual);
                        pst.setString(10, fornecedor.getIe());
                        pst.setString(11, fornecedor.getObservacoes());
                        pst.executeUpdate();
                        ResultSet keys = pst.getGeneratedKeys();
                        keys.next();
                        int key = keys.getInt(1);

                        String status = fornecedor.getStatus();
                        if (status.equals("Ativo")) {
                            sts = 1;
                        } else {
                            sts = 2;
                        }
                        pst1.setInt(1, key);
                        pst1.setInt(2, sts);
                        pst1.executeUpdate();
                        ResultSet keys1 = pst1.getGeneratedKeys();
                        keys1.next();
                        int key1 = keys1.getInt(1);

                        pst2.setInt(1, key1);
                        pst2.setString(2, fornecedor.getFoneFixo());
                        pst2.executeUpdate();

                        pst3.setInt(1, key1);
                        pst3.setString(2, fornecedor.getFoneCelular());
                        pst3.executeUpdate();

                        pst4.setInt(1, key1);
                        pst4.setString(2, fornecedor.getEmail());
                        pst4.executeUpdate();

                        pst5.setString(1, fornecedor.getCep());
                        pst5.setString(2, fornecedor.getLogradouro());
                        pst5.setString(3, fornecedor.getComplemento());
                        pst5.setString(4, fornecedor.getNumero());
                        pst5.setString(5, fornecedor.getBairro());
                        pst5.setString(6, fornecedor.getCidade());
                        pst5.setString(7, fornecedor.getEstado());
                        pst5.setInt(8, key1);
                        pst5.executeUpdate();

                        JOptionPane.showMessageDialog(null, "Fornecedor Cadastrado com sucesso!");
                        return true;

                    } catch (SQLException sqlException) {
                        System.out.println("Ocorreu uma exceção SQL ..." + sqlException);
                        JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Fornecedor!");
                    } catch (HeadlessException exception) {
                        System.out.println("Ocorreu uma exceção SQL" + exception);
                        JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Fornecedor!" + exception);
                    }
                }
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        conexao.close();
        return false;
    }

    public ResultSet buscarFornecedorDao(String cpf, String nome, String cnpj, String razaoSocial, String tipoBusca) throws SQLException {
        conexao = ConexoesMySql.base();
        pst = null;
        pst1 = null;
        pst2 = null;
        pst3 = null;
        pst4 = null;
        String codigoPessoa = null;
        String nomeCli = null;
        String cpfCli = null;
        String rgCli = null;
        String orgaoEmissorRgCli = null;
        String dtNascCli = null;
        String razaoSocCli = null;
        String nomeFanCli = null;
        String cnpjCli = null;
        String ieCli = null;
        String obs = null;
        String tipoPessoa = null;
        String foneFixoCli = null;
        String celularCli = null;
        String emailCli = null;
        String codigoFornecedor = null;
        String stat = null;
        String cep = null;
        String logradouro = null;
        String complemento = null;
        String numero = null;
        String bairro = null;
        String cidade = null;
        String estado = null;

        String sqlCpf = "SELECT * FROM PESSOA p"
                + "	INNER JOIN FORNECEDOR c"
                + "    INNER JOIN CONTATO_FORNECEDOR t"
                + "    ON c.id_pessoa = p.ID_PESSOA"
                + "    AND t.id_fornecedor = c.ID_FORNECEDOR"
                + "    WHERE p.cpf_pessoa = ?"
                + "    OR p.nome_pessoa LIKE ?"
                + "    OR p.cnpj_pessoa = ?"
                + "    OR p.razaosocial_pessoa LIKE ?";
        String sqlContato1 = "SELECT descricao_fornecedor_contato FROM CONTATO_FORNECEDOR t"
                + "    INNER JOIN FORNECEDOR c"
                + "    INNER JOIN PESSOA p"
                + "    ON t.id_fornecedor = c.ID_FORNECEDOR"
                + "    AND c.id_pessoa = p.ID_PESSOA"
                + "    AND t.id_contato_tipo = 1"
                + "    WHERE p.cpf_pessoa = ? "
                + "    OR p.nome_pessoa LIKE ? "
                + "    OR p.cnpj_pessoa = ? "
                + "    OR p.razaosocial_pessoa LIKE ? ";
        String sqlContato2 = "SELECT descricao_fornecedor_contato FROM CONTATO_FORNECEDOR t"
                + "    INNER JOIN FORNECEDOR c"
                + "    INNER JOIN PESSOA p"
                + "    ON t.id_fornecedor = c.ID_FORNECEDOR"
                + "    AND c.id_pessoa = p.ID_PESSOA"
                + "    AND t.id_contato_tipo = 2"
                + "    WHERE p.cpf_pessoa = ? "
                + "    OR p.nome_pessoa LIKE ? "
                + "    OR p.cnpj_pessoa = ? "
                + "    OR p.razaosocial_pessoa LIKE ? ";
        String sqlContato3 = "SELECT descricao_fornecedor_contato FROM CONTATO_FORNECEDOR t"
                + "    INNER JOIN FORNECEDOR c"
                + "    INNER JOIN PESSOA p"
                + "    ON t.id_fornecedor = c.ID_FORNECEDOR"
                + "    AND c.id_pessoa = p.ID_PESSOA"
                + "    AND t.id_contato_tipo = 3"
                + "    WHERE p.cpf_pessoa = ? "
                + "    OR p.nome_pessoa LIKE ? "
                + "    OR p.cnpj_pessoa = ? "
                + "    OR p.razaosocial_pessoa LIKE ? ";
        String sqlEndereco = "SELECT * FROM ENDERECO_FORNECEDOR e"
                + " INNER JOIN FORNECEDOR c"
                + " INNER JOIN PESSOA p"
                + " ON c.id_pessoa = p.ID_PESSOA"
                + " AND e.id_fornecedor = c.ID_FORNECEDOR"
                + " WHERE p.cpf_pessoa = ? "
                + " OR p.nome_pessoa LIKE ? "
                + " OR p.cnpj_pessoa = ? "
                + " OR p.razaosocial_pessoa LIKE ? ";

        try {
            pst = conexao.prepareStatement(sqlCpf);
            pst1 = conexao.prepareStatement(sqlContato1);
            pst2 = conexao.prepareStatement(sqlContato2);
            pst3 = conexao.prepareStatement(sqlContato3);
            pst4 = conexao.prepareStatement(sqlEndereco);

            pst.setString(1, cpf);
            pst.setString(2, nome + "%");
            pst.setString(3, cnpj);
            pst.setString(4, razaoSocial + "%");
            rs = pst.executeQuery();

            pst1.setString(1, cpf);
            pst1.setString(2, nome + "%");
            pst1.setString(3, cnpj);
            pst1.setString(4, razaoSocial + "%");
            rs1 = pst1.executeQuery();

            pst2.setString(1, cpf);
            pst2.setString(2, nome + "%");
            pst2.setString(3, cnpj);
            pst2.setString(4, razaoSocial + "%");
            rs2 = pst2.executeQuery();

            pst3.setString(1, cpf);
            pst3.setString(2, nome + "%");
            pst3.setString(3, cnpj);
            pst3.setString(4, razaoSocial + "%");
            rs3 = pst3.executeQuery();

            pst4.setString(1, cpf);
            pst4.setString(2, nome + "%");
            pst4.setString(3, cnpj);
            pst4.setString(4, razaoSocial + "%");
            rs4 = pst4.executeQuery();

            if (rs.next()) {

                codigoPessoa = rs.getString(1);
                nomeCli = rs.getString(2);
                cpfCli = rs.getString(3);
                rgCli = rs.getString(4);
                orgaoEmissorRgCli = rs.getString(5);
                String dataNascimento = rs.getString(6);

                if (dataNascimento != null) {
                    String ano = dataNascimento.substring(0, 4);
                    String mes = dataNascimento.substring(5, 7);
                    String dia = dataNascimento.substring(8);

                    dtNascCli = dia + "/" + mes + "/" + ano;
                } else {
                    dtNascCli = "  /  /    ";
                }
                razaoSocCli = rs.getString(7);
                nomeFanCli = rs.getString(8);
                cnpjCli = rs.getString(9);
                ieCli = rs.getString(10);
                obs = rs.getString(11);
                tipoPessoa = rs.getString(12);

                codigoFornecedor = rs.getString(13);
                stat = rs.getString(15);

            }
            if (rs1.next()) {
                foneFixoCli = rs1.getString(1);

            }
            if (rs2.next()) {
                celularCli = rs2.getString(1);

            }
            if (rs3.next()) {
                emailCli = rs3.getString(1);

            }
            if (rs4.next()) {
                cep = rs4.getString(2);
                logradouro = rs4.getString(3);
                complemento = rs4.getString(4);
                numero = rs4.getString(5);
                bairro = rs4.getString(6);
                cidade = rs4.getString(7);
                estado = rs4.getString(8);

            } else {
                JOptionPane.showMessageDialog(null, "Fornecedor não cadastrado!");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e + " Contate o administrador do sistema!");
        }
        conexao.close();
        return rs;
    }

    public ResultSet buscarFornecedorProdDao() throws SQLException {
        conexao = ConexoesMySql.base();
        DefaultComboBoxModel fornecedor = null;
        List<String> strList = new ArrayList<>();

        String sql1 = "SELECT f.ID_FORNECEDOR, \n"
                + "CASE WHEN p.nome_pessoa IS NOT NULL THEN \n"
                + "p.nome_pessoa\n"
                + "else p.razaosocial_pessoa END AS NOME\n"
                + "FROM PESSOA p\n"
                + "INNER JOIN FORNECEDOR f ON f.id_pessoa = p.ID_PESSOA\n"
                + "WHERE f.ID_FORNECEDOR IS NOT null\n"
                + "ORDER BY f.ID_FORNECEDOR;";
        
        try {

            pst = conexao.prepareStatement(sql1);
            rs = pst.executeQuery();
        
            while (rs.next()) {
                strList.add(rs.getString(1) + "-" + rs.getString(2));
                fornecedor = new DefaultComboBoxModel(strList.toArray());
            }
            ProdutoFrm.cbbFornecedor.setModel(fornecedor);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        conexao.close();
        return rs;
    }

    public static boolean alterarFornecedorDao(Fornecedor fornecedor) throws SQLException {
        conexao = ConexoesMySql.base();
        pst = null;
        pst2 = null;
        pst3 = null;
        pst4 = null;
        pst5 = null;
        rs = null;

        String sql = "UPDATE PESSOA SET NOME_PESSOA = ?, CPF_PESSOA = ?, RG_PESSOA = ?, ORGAOEMISSOR_PESSOA = ?, DTNASC_PESSOA = ?,"
                + " TIPO_PESSOA = ?, RAZAOSOCIAL_PESSOA = ?, NOMEFANTASIA_PESSOA = ?, CNPJ_PESSOA = ?, IE_PESSOA = ? WHERE ID_PESSOA = ?";
        String sqltelefone = "UPDATE CONTATO_FORNECEDOR SET descricao_fornecedor_contato = ? WHERE id_fornecedor = ? AND id_contato_tipo = ?";
        String sqlcelular = "UPDATE CONTATO_FORNECEDOR SET descricao_fornecedor_contato = ? WHERE id_fornecedor = ? AND id_contato_tipo = ?";
        String sqlemail = "UPDATE CONTATO_FORNECEDOR SET descricao_fornecedor_contato = ? WHERE id_fornecedor = ? AND id_contato_tipo = ?";
        String sqlendereco = "UPDATE ENDERECO_FORNECEDOR SET cep_endereco_fornecedor = ?, logradouro_endereco_fornecedor = ?, complemento_endereco_fornecedor = ?,"
                + " numero_endereco_fornecedor = ?, bairro_endereco_fornecedor = ?, cidade_endereco_fornecedor = ?, estado_endereco_fornecedor = ? WHERE id_fornecedor = ?";

        if (conexao != null) {
            try {

                pst = conexao.prepareStatement(sql);
                pst2 = conexao.prepareStatement(sqltelefone);
                pst3 = conexao.prepareStatement(sqlcelular);
                pst4 = conexao.prepareStatement(sqlemail);
                pst5 = conexao.prepareStatement(sqlendereco);

                pst.setString(1, fornecedor.getNome());
                pst.setString(2, fornecedor.getCpf());
                pst.setString(3, fornecedor.getRg());
                pst.setString(4, fornecedor.getOrgaoEmissorRg());

                String dia = FornecedorFrm.iptDataNascimento.getText().substring(0, 2);
                String mes = FornecedorFrm.iptDataNascimento.getText().substring(3, 5);
                String ano = FornecedorFrm.iptDataNascimento.getText().substring(6);
                String dataNascimento = ano + "-" + mes + "-" + dia;

                pst.setString(5, dataNascimento);
                pst.setInt(6, fornecedor.getTipoPessoa());
                pst.setString(7, fornecedor.getRazaoSocial());
                pst.setString(8, fornecedor.getNomeFantasia());
                pst.setString(9, fornecedor.getCnpj());
                pst.setString(10, fornecedor.getIe());
                pst.setString(11, fornecedor.getObservacoes());
                pst.executeUpdate();

                pst2.setInt(1, fornecedor.getCodigo());
                pst2.setString(2, fornecedor.getFoneFixo());
                pst2.executeUpdate();

                pst3.setInt(1, fornecedor.getCodigo());
                pst3.setString(2, fornecedor.getFoneCelular());
                pst3.executeUpdate();

                pst4.setInt(1, fornecedor.getCodigo());
                pst4.setString(2, fornecedor.getEmail());
                pst4.executeUpdate();

                pst5.setString(1, fornecedor.getCep());
                pst5.setString(2, fornecedor.getLogradouro());
                pst5.setString(3, fornecedor.getComplemento());
                pst5.setString(4, fornecedor.getNumero());
                pst5.setString(5, fornecedor.getBairro());
                pst5.setString(6, fornecedor.getCidade());
                pst5.setString(7, fornecedor.getEstado());
                pst5.setInt(8, fornecedor.getCodigo());
                pst5.executeUpdate();

                JOptionPane.showMessageDialog(null, "Dados do Fornecedor Alterados com sucesso!");
                return true;

            } catch (SQLException sqlException) {
                System.out.println("Ocorreu uma exceção SQL" + sqlException);
                JOptionPane.showMessageDialog(null, "Erro ao Alterar dados do Fornecedor!");
            } catch (HeadlessException exception) {
                System.out.println("Ocorreu uma exceção");
                JOptionPane.showMessageDialog(null, "Erro ao Alterar dados do Fornecedor!");
            }
        }
        conexao.close();
        return false;
    }
}
