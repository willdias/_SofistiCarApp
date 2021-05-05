package dao;

import conexoes.ConexoesMySql;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import model.Cliente;
import view.ClienteFrm;
import static view.MovimentoEstoqueFrm.iptDataMovimento;
import view.VeiculoFrm;

public class ClienteDao {

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
    static String dataNascimento = null;
    static String dtNascCli = null;
    static String cpfCli = null;
    static String cnpjCli = null;
    static String dataCad;

    public ClienteDao() {
        conexao = ConexoesMySql.conectar();

    }

    public static boolean addCliente(Cliente cliente) throws SQLException {
        conexao = ConexoesMySql.conectar();
        pst = null;
        pst0 = null;
        pst1 = null;
        pst2 = null;
        pst3 = null;
        pst4 = null;
        pst5 = null;
        pst6 = null;

        rs = null;
        rs0 = null;
        rs6 = null;

        String sqlPessoa = "INSERT INTO pessoa ("
                + " nome_pessoa,"
                + " cpf_pessoa,"
                + " rg_pessoa,"
                + " orgaoemissor_pessoa,"
                + " dtnasc_pessoa,"
                + " tipo_pessoa,"
                + " razaosocial_pessoa,"
                + " nomefantasia_pessoa,"
                + " cnpj_pessoa,"
                + " ie_pessoa,"
                + " observacoes_pessoa,"
                + " data_cadastro) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        String sqlcliente = "INSERT INTO cliente (id_pessoa, id_status_cliente) VALUES (?,?)";
        String sqltelefone = "INSERT INTO cliente_contato (id_cliente, descricao_cliente_contato, id_contato_tipo) VALUES (?,?,1)";
        String sqlcelular = "INSERT INTO cliente_contato (id_cliente, descricao_cliente_contato, id_contato_tipo) VALUES (?,?,2)";
        String sqlemail = "INSERT INTO cliente_contato (id_cliente, descricao_cliente_contato, id_contato_tipo) VALUES (?,?,3)";
        String sqlendereco = "INSERT INTO cliente_endereco (cep_endereco_cliente, logradouro_endereco_cliente, complemento_endereco_cliente,"
                + " numero_endereco_cliente, bairro_endereco_cliente,"
                + " cidade_endereco_cliente, estado_endereco_cliente, id_cliente) VALUES (?,?,?,?,?,?,?,?)";
        String sqlCpf = "SELECT * FROM pessoa WHERE cpf_pessoa = ?";
        String sqlCnpj = "SELECT * FROM pessoa WHERE cnpj_pessoa = ?";

        if (conexao != null) {

            try {
                String cpf = cliente.getCpf();
                if (cpf.equals("   .   .   -  ") || cpf.equals(null)) {
                    cpfCli = null;
                } else {
                    cpfCli = cpf;
                }
                pst0 = conexao.prepareStatement(sqlCpf);
                pst0.setString(1, cpfCli);
                rs0 = pst0.executeQuery();

                if (rs0.next()) {
                    JOptionPane.showMessageDialog(null, "Não é possível usar o mesmo CPF para mais de um cliente", "CPF já cadastrado para um Cliente", JOptionPane.OK_OPTION);
                }

                String cnpj = cliente.getCnpj();
                if (cnpj.equals("  .   .   /    -  ") || cnpj.equals(null)) {
                    cnpjCli = null;
                } else {
                    cnpjCli = cnpj;
                }
                pst6 = conexao.prepareStatement(sqlCnpj);
                pst6.setString(1, cnpjCli);
                rs6 = pst6.executeQuery();

                if (rs6.next()) {
                    JOptionPane.showMessageDialog(null, "Não é possível usar o mesmo CNPJ para mais de um cliente", "CNPJ já cadastrado para um Cliente", JOptionPane.OK_OPTION);
                } else {

                    try {

                        pst = conexao.prepareStatement(sqlPessoa, Statement.RETURN_GENERATED_KEYS);
                        pst1 = conexao.prepareStatement(sqlcliente, Statement.RETURN_GENERATED_KEYS);
                        pst2 = conexao.prepareStatement(sqltelefone);
                        pst3 = conexao.prepareStatement(sqlcelular);
                        pst4 = conexao.prepareStatement(sqlemail);
                        pst5 = conexao.prepareStatement(sqlendereco);

                        pst.setString(1, cliente.getNome());
                        String cpffrm = ClienteFrm.iptCpf.getText();
                        if (cpffrm.equals("   .   .   -  ")) {
                            cpfCli = null;
                        }
                        pst.setString(2, cpfCli);
                        pst.setString(3, cliente.getRg());
                        pst.setString(4, cliente.getOrgaoEmissorRg());

                        String data = ClienteFrm.iptDataNascimento.getText();

                        if (data.equals("  /  /    ")) {
                            dataNascimento = null;
                        } else {
                            String dia = data.substring(0, 2);
                            String mes = data.substring(3, 5);
                            String ano = data.substring(6);
                            dataNascimento = ano + "-" + mes + "-" + dia;
                        }
                        pst.setString(5, dataNascimento);
                        pst.setInt(6, cliente.getTipoPessoa());

                        pst.setString(7, cliente.getRazaoSocial());
                        pst.setString(8, cliente.getNomeFantasia());
                        String cnpjfrm = ClienteFrm.iptCnpj.getText();
                        if (cnpjfrm.equals("  .   .   /    -  ")) {
                            cnpjCli = null;
                        }
                        pst.setString(9, cnpjCli);
                        pst.setString(10, cliente.getIe());
                        pst.setString(11, cliente.getObservacoes());

                        Date dtCad = new Date();
                        DateFormat formatador = DateFormat.getDateInstance(DateFormat.DEFAULT);
                        String dtCadastro = formatador.format(dtCad);
                        String dia = dtCadastro.substring(0, 2);
                        String mes = dtCadastro.substring(3, 5);
                        String ano = dtCadastro.substring(6);
                        dataCad = ano + "-" + mes + "-" + dia;

                        pst.setString(12, dataCad);
                        pst.executeUpdate();
                        ResultSet keys = pst.getGeneratedKeys();
                        keys.next();
                        int key = keys.getInt(1);

                        String status = cliente.getStatus();
                        if (status.equals("Ativo")) {
                            sts = 1;
                        } else if (status.equals("Inativo")) {
                            sts = 2;
                        }
                        pst1.setInt(1, key);
                        pst1.setInt(2, sts);
                        pst1.executeUpdate();
                        ResultSet keys1 = pst1.getGeneratedKeys();
                        keys1.next();
                        int key1 = keys1.getInt(1);

                        pst2.setInt(1, key1);
                        pst2.setString(2, cliente.getFoneFixo());
                        pst2.executeUpdate();

                        pst3.setInt(1, key1);
                        pst3.setString(2, cliente.getFoneCelular());
                        pst3.executeUpdate();

                        pst4.setInt(1, key1);
                        pst4.setString(2, cliente.getEmail());
                        pst4.executeUpdate();

                        pst5.setString(1, cliente.getCep());
                        pst5.setString(2, cliente.getLogradouro());
                        pst5.setString(3, cliente.getComplemento());
                        pst5.setInt(4, cliente.getNumero());
                        pst5.setString(5, cliente.getBairro());
                        pst5.setString(6, cliente.getCidade());
                        pst5.setString(7, cliente.getEstado());
                        pst5.setInt(8, key1);
                        pst5.executeUpdate();

                        JOptionPane.showMessageDialog(null, "Cliente Cadastrado com sucesso!");
                        return true;

                    } catch (SQLException sqlException) {
                        System.out.println("Ocorreu uma exceção SQL ..." + sqlException);
                        JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Cliente!");
                    } catch (HeadlessException exception) {
                        System.out.println("Ocorreu uma exceção quen quen quen");
                        JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Cliente!" + exception);
                    }
                }

            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        conexao.close();
        return false;

    }

    public ResultSet buscarCliente(Cliente cliente) throws SQLException {
        conexao = ConexoesMySql.conectar();
        pst = null;
        pst2 = null;
        pst3 = null;
        pst4 = null;

        String sqlCpf = "SELECT * FROM pessoa p"
                + " INNER JOIN cliente c ON p.codigo_pessoa = c.id_pessoa"
                + " INNER JOIN cliente_contato t ON t.id_cliente = c.codigo_cliente"
                + " WHERE p.cpf_pessoa = ?"
                + " OR c.codigo_cliente = ?"
                + " OR p.nome_pessoa LIKE ?"
                + " OR p.cnpj_pessoa = ?"
                + " OR p.razaosocial_pessoa LIKE ?";
        String sqlContato2 = "SELECT descricao_cliente_contato FROM cliente_contato t"
                + " INNER JOIN cliente c"
                + " INNER JOIN pessoa p"
                + " ON t.id_cliente = c.codigo_cliente"
                + " AND c.id_pessoa = p.codigo_pessoa"
                + " AND t.id_contato_tipo = 2"
                + " WHERE p.cpf_pessoa = ? "
                + " OR c.codigo_cliente = ?"
                + " OR p.nome_pessoa LIKE ?"
                + " OR p.cnpj_pessoa = ?"
                + " OR p.razaosocial_pessoa LIKE ?";
        String sqlContato3 = "SELECT descricao_cliente_contato FROM cliente_contato t"
                + " INNER JOIN cliente c"
                + " INNER JOIN pessoa p"
                + " ON t.id_cliente = c.codigo_cliente"
                + " AND c.id_pessoa = p.codigo_pessoa"
                + " AND t.id_contato_tipo = 3"
                + " WHERE p.cpf_pessoa = ? "
                + " OR c.codigo_cliente = ?"
                + " OR p.nome_pessoa LIKE ?"
                + " OR p.cnpj_pessoa = ?"
                + " OR p.razaosocial_pessoa LIKE ?";
        String sqlEndereco = "SELECT * FROM cliente_endereco e"
                + " INNER JOIN cliente c"
                + " INNER JOIN pessoa p"
                + " ON c.id_pessoa = p.codigo_pessoa"
                + " AND e.id_cliente = c.codigo_cliente"
                + " WHERE p.cpf_pessoa = ? "
                + " OR c.codigo_cliente = ?"
                + " OR p.nome_pessoa LIKE ?"
                + " OR p.cnpj_pessoa = ?"
                + " OR p.razaosocial_pessoa LIKE ?";

        try {
            pst = conexao.prepareStatement(sqlCpf);
            pst2 = conexao.prepareStatement(sqlContato2);
            pst3 = conexao.prepareStatement(sqlContato3);
            pst4 = conexao.prepareStatement(sqlEndereco);

            pst.setString(1, cliente.getCpf());
            pst.setInt(2, cliente.getCodigo());
            pst.setString(3, cliente.getNome());
            pst.setString(4, cliente.getCnpj());
            pst.setString(5, cliente.getRazaoSocial());
            rs = pst.executeQuery();

            pst2.setString(1, cliente.getCpf());
            pst2.setInt(2, cliente.getCodigo());
            pst2.setString(3, cliente.getNome());
            pst2.setString(4, cliente.getCnpj());
            pst2.setString(5, cliente.getRazaoSocial());
            rs2 = pst2.executeQuery();

            pst3.setString(1, cliente.getCpf());
            pst3.setInt(2, cliente.getCodigo());
            pst3.setString(3, cliente.getNome());
            pst3.setString(4, cliente.getCnpj());
            pst3.setString(5, cliente.getRazaoSocial());
            rs3 = pst3.executeQuery();

            pst4.setString(1, cliente.getCpf());
            pst4.setInt(2, cliente.getCodigo());
            pst4.setString(3, cliente.getNome());
            pst4.setString(4, cliente.getCnpj());
            pst4.setString(5, cliente.getRazaoSocial());
            rs4 = pst4.executeQuery();

            if (rs.next()) {

                cliente.setNome(rs.getString(2));
                cliente.setCpf(rs.getString(3));
                cliente.setRg(rs.getString(4));
                cliente.setOrgaoEmissorRg(rs.getString(5));

                dataNascimento = rs.getString(6);
                if (dataNascimento != null) {
                    String ano = dataNascimento.substring(0, 4);
                    String mes = dataNascimento.substring(5, 7);
                    String dia = dataNascimento.substring(8);

                    dtNascCli = dia + "/" + mes + "/" + ano;
                } else {
                    dtNascCli = "  /  /    ";
                }
                cliente.setDataNascimento(dtNascCli);
                cliente.setRazaoSocial(rs.getString(7));
                cliente.setNomeFantasia(rs.getString(8));
                cliente.setCnpj(rs.getString(9));
                cliente.setIe(rs.getString(10));
                cliente.setObservacoes(rs.getString(11));
                cliente.setTipoPessoa(rs.getInt(12));
                cliente.setCodigo(rs.getInt(14));
                cliente.setStatus(rs.getString(16));
                cliente.setFoneFixo(rs.getString(18));

            }
            if (rs2.next()) {
                cliente.setFoneCelular(rs2.getString(1));
            }
            if (rs3.next()) {
                cliente.setEmail(rs3.getString(1));
            }
            if (rs4.next()) {
                cliente.setCep(rs4.getString(2));
                cliente.setLogradouro(rs4.getString(3));
                cliente.setComplemento(rs4.getString(4));
                cliente.setNumero(Integer.parseInt(rs4.getString(5)));
                cliente.setBairro(rs4.getString(6));
                cliente.setCidade(rs4.getString(7));
                cliente.setEstado(rs4.getString(8));

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e + " Contate o administrador do sistema!");
        }
        conexao.close();
        return rs;
    }

    public ResultSet buscarClienteCodigo(Cliente cliente) throws SQLException {
        conexao = ConexoesMySql.conectar();
        pst = null;
        pst2 = null;
        pst3 = null;
        pst4 = null;

        String sqlCpf = "SELECT * FROM pessoa p"
                + " INNER JOIN cliente c ON p.codigo_pessoa = c.id_pessoa"
                + " INNER JOIN cliente_contato t ON t.id_cliente = c.codigo_cliente"
                + " WHERE c.codigo_cliente = ?";
        String sqlContato2 = "SELECT descricao_cliente_contato FROM cliente_contato t"
                + " INNER JOIN cliente c"
                + " INNER JOIN pessoa p"
                + " ON t.id_cliente = c.codigo_cliente"
                + " AND c.id_pessoa = p.codigo_pessoa"
                + " AND t.id_contato_tipo = 2"
                + " WHERE c.codigo_cliente = ?";
        String sqlContato3 = "SELECT descricao_cliente_contato FROM cliente_contato t"
                + " INNER JOIN cliente c"
                + " INNER JOIN pessoa p"
                + " ON t.id_cliente = c.codigo_cliente"
                + " AND c.id_pessoa = p.codigo_pessoa"
                + " AND t.id_contato_tipo = 3"
                + " WHERE c.codigo_cliente = ?";
        String sqlEndereco = "SELECT * FROM cliente_endereco e"
                + " INNER JOIN cliente c"
                + " INNER JOIN pessoa p"
                + " ON c.id_pessoa = p.codigo_pessoa"
                + " AND e.id_cliente = c.codigo_cliente"
                + " WHERE c.codigo_cliente = ?";

        try {
            pst = conexao.prepareStatement(sqlCpf);
            pst2 = conexao.prepareStatement(sqlContato2);
            pst3 = conexao.prepareStatement(sqlContato3);
            pst4 = conexao.prepareStatement(sqlEndereco);

            pst.setInt(1, cliente.getCodigo());
            rs = pst.executeQuery();

            pst2.setInt(1, cliente.getCodigo());
            rs2 = pst2.executeQuery();

            pst3.setInt(1, cliente.getCodigo());
            rs3 = pst3.executeQuery();

            pst4.setInt(1, cliente.getCodigo());
            rs4 = pst4.executeQuery();

            if (rs.next()) {

                cliente.setNome(rs.getString(2));
                cliente.setCpf(rs.getString(3));
                cliente.setRg(rs.getString(4));
                cliente.setOrgaoEmissorRg(rs.getString(5));

                dataNascimento = rs.getString(6);
                if (dataNascimento != null) {
                    String ano = dataNascimento.substring(0, 4);
                    String mes = dataNascimento.substring(5, 7);
                    String dia = dataNascimento.substring(8);

                    dtNascCli = dia + "/" + mes + "/" + ano;
                } else {
                    dtNascCli = "  /  /    ";
                }
                cliente.setDataNascimento(dtNascCli);
                cliente.setRazaoSocial(rs.getString(7));
                cliente.setNomeFantasia(rs.getString(8));
                cliente.setCnpj(rs.getString(9));
                cliente.setIe(rs.getString(10));
                cliente.setObservacoes(rs.getString(11));
                cliente.setTipoPessoa(rs.getInt(12));
                cliente.setCodigo(rs.getInt(14));
                cliente.setStatus(rs.getString(16));
                cliente.setFoneFixo(rs.getString(18));

            }
            if (rs2.next()) {
                cliente.setFoneCelular(rs2.getString(1));
            }
            if (rs3.next()) {
                cliente.setEmail(rs3.getString(1));
            }
            if (rs4.next()) {
                cliente.setCep(rs4.getString(2));
                cliente.setLogradouro(rs4.getString(3));
                cliente.setComplemento(rs4.getString(4));
                cliente.setNumero(Integer.parseInt(rs4.getString(5)));
                cliente.setBairro(rs4.getString(6));
                cliente.setCidade(rs4.getString(7));
                cliente.setEstado(rs4.getString(8));

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e + " Contate o administrador do sistema!");
        }
        conexao.close();
        return rs;
    }

    public static boolean alterarCliente(Cliente cliente) throws SQLException {
        conexao = ConexoesMySql.conectar();
        pst = null;
        pst0 = null;
        pst1 = null;
        pst2 = null;
        pst3 = null;
        pst4 = null;
        pst5 = null;
        rs = null;

        String sqlPessoa = "UPDATE pessoa p SET p.nome_pessoa = ?, p.rg_pessoa = ?, "
                + " p.orgaoemissor_pessoa = ?, p.dtnasc_pessoa = ?, p.tipo_pessoa = ?, "
                + " p.razaosocial_pessoa = ?, p.nomefantasia_pessoa = ?, p.ie_pessoa = ?, "
                + " p.observacoes_pessoa = ? WHERE p.cpf_pessoa = ?";
        String sqlCliente = "UPDATE cliente SET id_status_cliente = ? WHERE codigo_cliente =?";
        String sqltelefone = "UPDATE cliente_contato t SET descricao_cliente_contato = ? WHERE t.id_cliente = ? AND id_contato_tipo = 1";
        String sqlcelular = "UPDATE cliente_contato t SET descricao_cliente_contato = ? WHERE t.id_cliente = ? AND id_contato_tipo = 2";
        String sqlemail = "UPDATE cliente_contato t SET descricao_cliente_contato = ? WHERE t.id_cliente = ? AND id_contato_tipo = 3";
        String sqlendereco = "UPDATE cliente_endereco SET "
                + " cep_endereco_cliente = ?,"
                + " logradouro_endereco_cliente = ?,"
                + " complemento_endereco_cliente = ?,"
                + " numero_endereco_cliente = ?,"
                + " bairro_endereco_cliente = ?,"
                + " cidade_endereco_cliente = ?,"
                + " estado_endereco_cliente = ?"
                + " WHERE id_cliente = ?";

        if (conexao != null) {
            try {

                pst = conexao.prepareStatement(sqlPessoa);
                pst0 = conexao.prepareStatement(sqlCliente);
                pst2 = conexao.prepareStatement(sqltelefone);
                pst3 = conexao.prepareStatement(sqlcelular);
                pst4 = conexao.prepareStatement(sqlemail);
                pst5 = conexao.prepareStatement(sqlendereco);

                if (cliente.getStatus().equals("Ativo")) {
                    sts = 1;
                } else if (cliente.getStatus().equals("Inativo")) {
                    sts = 2;
                }

                int varCliente = Integer.parseInt(ClienteFrm.iptCodigoCliente.getText());
                String status = cliente.getStatus();

                if (status.equals("Ativo")) {
                    sts = 1;
                } else if (status.equals("Inativo")) {
                    sts = 2;
                }
                pst0.setInt(1, sts);
                pst0.setInt(2, varCliente);
                pst0.executeUpdate();

                pst.setString(1, cliente.getNome());
                pst.setString(2, cliente.getRg());
                pst.setString(3, cliente.getOrgaoEmissorRg());

                String dtNascim = ClienteFrm.iptDataNascimento.getText();
                if (dtNascim.equals("  /  /   ")) {
                    dtNascCli = null;
                } else if (!dtNascim.equals("  /  /   ") && !dtNascim.equals(null)) {
                    dtNascCli = dtNascim;
                    String dia = dtNascCli.substring(0, 2);
                    String mes = dtNascCli.substring(3, 5);
                    String ano = dtNascCli.substring(6);
                    dataNascimento = ano + "-" + mes + "-" + dia;
                }

                pst.setString(4, dataNascimento);
                pst.setInt(5, cliente.getTipoPessoa());
                pst.setString(6, cliente.getRazaoSocial());
                pst.setString(7, cliente.getNomeFantasia());
                pst.setString(8, cliente.getIe());
                pst.setString(9, cliente.getObservacoes());
                pst.setString(10, cliente.getCpf());
                pst.executeUpdate();

                pst2.setString(1, cliente.getFoneFixo());
                pst2.setInt(2, varCliente);
                pst2.executeUpdate();

                pst3.setString(1, cliente.getFoneCelular());
                pst3.setInt(2, varCliente);
                pst3.executeUpdate();

                pst4.setString(1, cliente.getEmail());
                pst4.setInt(2, varCliente);
                pst4.executeUpdate();

                pst5.setString(1, cliente.getCep());
                pst5.setString(2, cliente.getLogradouro());
                pst5.setString(3, cliente.getComplemento());
                pst5.setInt(4, Integer.parseInt(ClienteFrm.iptNumero.getText()));

                pst5.setString(5, cliente.getBairro());
                pst5.setString(6, cliente.getCidade());
                pst5.setString(7, cliente.getEstado());
                pst5.setInt(8, varCliente);
                pst5.executeUpdate();

                JOptionPane.showMessageDialog(null, "Dados do Cliente Alterados com sucesso!");
                return true;

            } catch (SQLException sqlException) {
                System.out.println("Ocorreu uma exceção SQL" + sqlException);
                JOptionPane.showMessageDialog(null, "Erro ao Alterar dados do Cliente!");
            } catch (HeadlessException exception) {
                System.out.println("Ocorreu uma exceção");
                JOptionPane.showMessageDialog(null, "Erro ao Alterar dados do Cliente!");
            } finally {
                try {
                    if (rs != null) {
                        rs.close();
                    }
                    if (pst != null) {
                        pst.close();
                    }
                } catch (SQLException exception) {
                    System.out.println("Ocorreu uma exceção SQL");
                }
            }
        }
        conexao.close();
        return false;
    }

    public ResultSet buscarClienteVeiDao() throws SQLException {
        conexao = ConexoesMySql.conectar();
        DefaultComboBoxModel cliente = null;
        String sql1 = "SELECT c.codigo_cliente,\n"
                + "	CASE WHEN p.nome_pessoa IS NOT NULL\n"
                + "    THEN p.nome_pessoa\n"
                + "    ELSE p.razaosocial_pessoa END AS nome FROM pessoa p\n"
                + "    INNER JOIN cliente c\n"
                + "    ON c.id_pessoa = p.codigo_pessoa\n"
                + "    AND c.codigo_cliente IS NOT null";

        try {

            List<String> strList = new ArrayList<>();

            pst = conexao.prepareStatement(sql1);
            rs = pst.executeQuery();

            while (rs.next()) {
                strList.add(rs.getString(1) + "-" + rs.getString(2));
                cliente = new DefaultComboBoxModel(strList.toArray());
            }
            VeiculoFrm.cbbCliente.setModel(cliente);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        conexao.close();
        return rs;
    }
}
