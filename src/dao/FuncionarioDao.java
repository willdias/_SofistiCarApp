package dao;

import conexoes.ConexoesMySql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Funcionario;
import model.Pessoa;
import view.FuncionarioFrm;
import static view.FuncionarioFrm.limparCampos;

public class FuncionarioDao {

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
    static String cpfFunc = null;
    static String dataParaMysql;
    static String dataParaMysql2;
    static int key = 0;

    public static boolean addFuncionarioDao(Pessoa pessoa) throws SQLException {
        conexao = ConexoesMySql.base();
        String sqlCpf = "SELECT * FROM PESSOA WHERE cpf_pessoa = ?";
        String sqlPessoa = "INSERT INTO PESSOA "
                + "(nome_pessoa,"
                + " cpf_pessoa,"
                + " rg_pessoa, "
                + " orgaoemissor_pessoa,"
                + " dtnasc_pessoa,"
                + " tipo_pessoa,"
                + " observacoes_pessoa)"
                + " VALUES (?,?,?,?,?,?,?)";
        try {
            String cpf = pessoa.getCpf_pessoa();
            if (cpf.equals("   .   .   -  ") || cpf.equals(null)) {
                cpfFunc = null;
            } else {
                cpfFunc = cpf;

                pst = conexao.prepareStatement(sqlPessoa, Statement.RETURN_GENERATED_KEYS);

                pst0 = conexao.prepareStatement(sqlCpf);
                pst0.setString(1, cpfFunc);
                rs0 = pst0.executeQuery();
                if (rs0.next()) {
                    JOptionPane.showMessageDialog(null, "Não é possível usar o mesmo CPF para mais de um Funcionário (" + cpf + ")", "CPF já cadastrado para um Funcionário", JOptionPane.OK_OPTION);
                    FuncionarioFrm.limparCampos();

                } else {
                    //O código abaixo executa a query de inserção de uma nova pessaa e pega o código gerado.
                    pst = conexao.prepareStatement(sqlPessoa, Statement.RETURN_GENERATED_KEYS);

                    pst.setString(1, pessoa.getNome_pessoa());
                    pst.setString(2, pessoa.getCpf_pessoa());
                    pst.setString(3, pessoa.getRg_pessoa());
                    pst.setString(4, pessoa.getOrgaoemissor_pessoa());

                    String data = pessoa.getDtnasc_pessoa();
                    if (data.equals("  /  /    ")) {
                        dataNascimento = null;
                    } else if (!data.equals(null)) {
                        String dia = data.substring(0, 2);
                        String mes = data.substring(3, 5);
                        String ano = data.substring(6);
                        dataNascimento = ano + "-" + mes + "-" + dia;
                    }
                    pst.setString(5, dataNascimento);
                    pst.setInt(6, 1);
                    pst.setString(7, pessoa.getObservacoes_pessoa());
                    pst.executeUpdate();
                    ResultSet keys = pst.getGeneratedKeys();
                    keys.next();
                    key = keys.getInt(1);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar Funcionário: ..." + ex);
        }
        conexao.close();
        return false;
    }

    public static boolean addFuncionarioDao(Funcionario funcionario) throws SQLException {
        conexao = ConexoesMySql.base();
        /*String sqlCpf = "SELECT * FROM pessoa WHERE cpf_pessoa = ?";
        String sqlPessoa = "INSERT INTO pessoa "
                + "(nome_pessoa,"
                + " cpf_pessoa,"
                + " rg_pessoa, "
                + " orgaoemissor_pessoa,"
                + " dtnasc_pessoa,"
                + " tipo_pessoa,"
                + " observacoes_pessoa)"
                + " VALUES (?,?,?,?,?,?,?)";*/
        String sqlFuncionario = "INSERT INTO FUNCIONARIO "
                + "(cargo_funcionario,"
                + "departamento_funcionario,"
                + "salario_funcionario,"
                + "ctps_funcionario,"
                + "seriectps_funcionario,"
                + "pispasep_funcionario,"
                + "uf_ctps_funcionario,"
                + "datacontratacao_funcionario,"
                + "datasaida_funcionario,"
                + "titulo_eleitor_funcionario,"
                + "zona_funcionario,"
                + "secao_funcionario,"
                + "nome_pai_funcionario,"
                + "nome_mae_funcionario,"
                + "estado_civil_funcionario,"
                + "qtde_filhos_funcionario,"
                + "funcionario_id_pessoa)"
                + " Values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        String sqltelefone = "INSERT INTO FUNCIONARIO_CONTATO (id_funcionario, descricao_funcionario_contato, ID_CONTATO_FUNCIONARIO_TIPO) VALUES (?,?,1)";
        String sqlcelular = "INSERT INTO FUNCIONARIO_CONTATO (id_funcionario, descricao_funcionario_contato, ID_CONTATO_FUNCIONARIO_TIPO) VALUES (?,?,2)";
        String sqlemail = "INSERT INTO FUNCIONARIO_CONTATO (id_funcionario, descricao_funcionario_contato, ID_CONTATO_FUNCIONARIO_TIPO) VALUES (?,?,3)";
        String sqlendereco = "INSERT INTO ENDERECO_FUNCIONARIO (cep_endereco_funcionario, logradouro_endereco_funcionario, complemento_endereco_funcionario,"
                + " numero_endereco_funcionario, bairro_endereco_funcionario,"
                + " cidade_endereco_funcionario, estado_endereco_funcionario, id_funcionario) VALUES (?,?,?,?,?,?,?,?)";

        try {
            /*String cpf = pessoa.getCpf_pessoa();
            if (cpf.equals("   .   .   -  ") || cpf.equals(null)) {
                cpfFunc = null;
            } else {
                cpfFunc = cpf;
            }*/

            //pst = conexao.prepareStatement(sqlPessoa, Statement.RETURN_GENERATED_KEYS);
            pst1 = conexao.prepareStatement(sqlFuncionario, Statement.RETURN_GENERATED_KEYS);
            pst2 = conexao.prepareStatement(sqltelefone);
            pst3 = conexao.prepareStatement(sqlcelular);
            pst4 = conexao.prepareStatement(sqlemail);
            pst5 = conexao.prepareStatement(sqlendereco);

            /*pst0 = conexao.prepareStatement(sqlCpf);
            pst0.setString(1, cpfFunc);
            rs0 = pst0.executeQuery();
            if (rs0.next()) {
                JOptionPane.showMessageDialog(null, "Não é possível usar o mesmo CPF para mais de um Funcionário", "CPF já cadastrado para um Funcionário", JOptionPane.OK_OPTION);
                FuncionarioFrm.limparCampos();

            } else {
                //O código abaixo executa a query de inserção de uma nova pessaa e pega o código gerado.
                pst = conexao.prepareStatement(sqlPessoa, Statement.RETURN_GENERATED_KEYS);
            
                pst.setString(1, funcionario.getNome());
                pst.setString(2, funcionario.getCpf());
                pst.setString(3, funcionario.getRg());
                pst.setString(4, funcionario.getOrgaoEmissorRg());

                String data = funcionario.getDataNascimento();
                if (data.equals("/  /") || data.isEmpty()) {
                    dataNascimento = "0000-00-00";
                } else {
                    String dia = data.substring(0, 2);
                    String mes = data.substring(3, 5);
                    String ano = data.substring(6);
                    dataNascimento = ano + "-" + mes + "-" + dia;
                }
                pst.setString(5, dataNascimento);
                pst.setInt(6, 1);
                pst.setString(7, funcionario.getObservacoes());
                pst.executeUpdate();
                ResultSet keys = pst.getGeneratedKeys();
                keys.next();
                int key = keys.getInt(1);*/
            if (key > 0) {
                //O código abaixo insere os dados do funcionário na tabela funcionário
                pst1.setString(1, funcionario.getCargo());
                pst1.setString(2, funcionario.getDepartamento());
                pst1.setString(3, funcionario.getSalario());
                pst1.setString(4, funcionario.getCtps());
                pst1.setString(5, funcionario.getSerieCtps());
                pst1.setString(6, funcionario.getPisPasep());
                pst1.setString(7, funcionario.getUfCtps());

                //O código abaixo formata a data de contratação para inserir no banco
                String dtContratacao = funcionario.getDataContratacao();
                if (dtContratacao.equals("  /  /    ") || dtContratacao.isEmpty()) {
                    dataParaMysql = null;
                } else {
                    String dia = funcionario.getDataContratacao().substring(0, 2);
                    String mes = funcionario.getDataContratacao().substring(3, 5);
                    String ano = funcionario.getDataContratacao().substring(6);
                    dataParaMysql = ano + "-" + mes + "-" + dia;
                }

                pst1.setString(8, dataParaMysql);

                //O código abaixo formata a data de demissão para inserir no banco
                String dtSaida = funcionario.getDataSaida();
                if (dtSaida.equals("/  /")) {
                    dataParaMysql2 = null;
                } else {
                    String dia2 = dtSaida.substring(0, 2);
                    String mes2 = dtSaida.substring(3, 5);
                    String ano2 = dtSaida.substring(6);
                    dataParaMysql2 = ano2 + "-" + mes2 + "-" + dia2;

                }

                pst1.setString(9, dataParaMysql2);
                pst1.setString(10, funcionario.getTituloEleitor());
                pst1.setString(11, funcionario.getZona());
                pst1.setString(12, funcionario.getSecao());
                pst1.setString(13, funcionario.getNomePai());
                pst1.setString(14, funcionario.getNomeMae());
                pst1.setString(15, funcionario.getEstadoCivil());
                pst1.setString(16, funcionario.getQtdeFilhos());
                pst1.setInt(17, key);

                //O código abaixo formata o status para int
                /*String status = funcionario.getStatus();
                JOptionPane.showMessageDialog(null, status);
                int sts = 0;
                if (status.equals("Ativo")) {
                    pst1.setInt(18, 1);
                } else {
                    pst1.setInt(18, 2);
                }
                 */
                pst1.executeUpdate();
                ResultSet keys1 = pst1.getGeneratedKeys();
                keys1.next();
                int key1 = keys1.getInt(1);

                //O código abaixo insere o telefone fixo
                pst2.setInt(1, key1);
                pst2.setString(2, funcionario.getFoneFixo());
                pst2.executeUpdate();

                //O código abaixo insere o telefone celular
                pst3.setInt(1, key1);
                pst3.setString(2, funcionario.getFoneCelular());
                pst3.executeUpdate();

                //O código abaixo insere o email
                pst4.setInt(1, key1);
                pst4.setString(2, funcionario.getEmail());
                pst4.executeUpdate();

                //O código abaixo insere o endereço do funcionário
                pst5.setString(1, funcionario.getCep());
                pst5.setString(2, funcionario.getLogradouro());
                pst5.setString(3, funcionario.getComplemento());
                pst5.setString(4, funcionario.getNumero());
                pst5.setString(5, funcionario.getBairro());
                pst5.setString(6, funcionario.getCidade());
                pst5.setString(7, funcionario.getEstado());
                pst5.setInt(8, key1);
                pst5.executeUpdate();

                JOptionPane.showMessageDialog(null, "Funcionário Cadastrado com sucesso.");
                limparCampos();
            }
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar Funcionário: ..." + ex);
        }
        conexao.close();
        return false;
    }

    public static boolean alterarFuncionarioDao(Funcionario funcionario) throws SQLException {
        conexao = ConexoesMySql.base();

        //Query de atualização de pessoa
        String sqlPessoa = "UPDATE PESSOA SET nome_pessoa = ?, rg_pessoa = ?, orgaoemissor_pessoa = ?,"
                + " dtnasc_pessoa = ?, observacoes_pessoa = ?"
                + " WHERE ID_PESSOA = ?";

        //Query de atualização de funcionário
        String sqlFuncionario = "UPDATE FUNCIONARIO SET"
                + " cargo_funcionario = ?,"
                + " departamento_funcionario = ?,"
                + " salario_funcionario = ?,"
                + " ctps_funcionario = ?,"
                + " seriectps_funcionario = ?,"
                + " pispasep_funcionario = ?,"
                + " uf_ctps_funcionario = ?,"
                + " datacontratacao_funcionario = ?,"
                + " datasaida_funcionario = ?,"
                + " titulo_eleitor_funcionario = ?,"
                + " zona_funcionario = ?,"
                + " secao_funcionario = ?,"
                + " nome_pai_funcionario = ?,"
                + " nome_mae_funcionario = ?,"
                + " estado_civil_funcionario = ?,"
                + " qtde_filhos_funcionario = ?,"
                + " funcionario_id_pessoa = ?"
                //+ " id_status_funcionario = ?"
                + " WHERE ID_FUNCIONARIO = ?";

        //Query de atualização de telefone fixo do funcionário
        String sqltelefone = "UPDATE FUNCIONARIO_CONTATO t SET descricao_funcionario_contato = ? "
                + "WHERE t.id_funcionario = ? AND ID_CONTATO_FUNCIONARIO_TIPO = 1";

        //Query de atualização de telefone celular do funcionário
        String sqlcelular = "UPDATE FUNCIONARIO_CONTATO t SET descricao_funcionario_contato = ? "
                + "WHERE t.id_funcionario = ? AND ID_CONTATO_FUNCIONARIO_TIPO = 2";

        //Query de atualização do email do funcionário
        String sqlemail = "UPDATE FUNCIONARIO_CONTATO t SET descricao_funcionario_contato = ? "
                + "WHERE t.id_funcionario = ? AND ID_CONTATO_FUNCIONARIO_TIPO = 3";

        //Query de atualização do endereço do funcionário
        String sqlendereco = "UPDATE ENDERECO_FUNCIONARIO SET "
                + " CEP_ENDERECO_FUNCIONARIO = ?,"
                + " logradouro_endereco_funcionario = ?,"
                + " complemento_endereco_funcionario = ?,"
                + " numero_endereco_funcionario = ?,"
                + " bairro_endereco_funcionario = ?,"
                + " cidade_endereco_funcionario = ?,"
                + " estado_endereco_funcionario = ?"
                + " WHERE id_funcionario = ?";
        try {
            pst = conexao.prepareStatement(sqlPessoa);
            pst1 = conexao.prepareStatement(sqlFuncionario);
            pst2 = conexao.prepareStatement(sqltelefone);
            pst3 = conexao.prepareStatement(sqlcelular);
            pst4 = conexao.prepareStatement(sqlemail);
            pst5 = conexao.prepareStatement(sqlendereco);

            //O código abaixo executa a query da pessaa funcionário.
            pst = conexao.prepareStatement(sqlPessoa);

            pst.setString(1, funcionario.getNome_pessoa());
            pst.setString(2, funcionario.getRg_pessoa());
            pst.setString(3, funcionario.getOrgaoemissor_pessoa());

            String data = funcionario.getDtnasc_pessoa();
            if (data.equals("/  /")) {
                dataNascimento = null;
            } else {
                String dia = data.substring(0, 2);
                String mes = data.substring(3, 5);
                String ano = data.substring(6);
                dataNascimento = ano + "-" + mes + "-" + dia;
            }
            pst.setString(4, dataNascimento);
            pst.setString(5, funcionario.getObservacoes());
            pst.executeUpdate();

            //O código abaixo altera os dados do funcionário na tabela funcionário
            pst1.setString(1, funcionario.getCargo());
            pst1.setString(2, funcionario.getDepartamento());
            pst1.setString(3, funcionario.getSalario());
            pst1.setString(4, funcionario.getCtps());
            pst1.setString(5, funcionario.getSerieCtps());
            pst1.setString(6, funcionario.getPisPasep());
            pst1.setString(7, funcionario.getUfCtps());

            //O código abaixo formata a data de contratação para alterar no banco
            String dataParaMysql = null;
            if (!funcionario.getDataContratacao().equals("/  /")) {
                String dia = funcionario.getDataContratacao().substring(0, 2);
                String mes = funcionario.getDataContratacao().substring(3, 5);
                String ano = funcionario.getDataContratacao().substring(6);
                dataParaMysql = ano + "-" + mes + "-" + dia;
            }
            pst1.setString(8, dataParaMysql);

            //O código abaixo formata a data de demissão para inserir no banco
            String dataParaMysql2 = null;
            if (!funcionario.getDataSaida().equals("/  /")) {
                String dia = funcionario.getDataSaida().substring(0, 2);
                String mes = funcionario.getDataSaida().substring(3, 5);
                String ano = funcionario.getDataSaida().substring(6);
                dataParaMysql2 = ano + "-" + mes + "-" + dia;
            }
            JOptionPane.showMessageDialog(null, dataParaMysql2);
            pst1.setString(9, dataParaMysql2);

            pst1.setString(10, funcionario.getTituloEleitor());
            pst1.setString(11, funcionario.getZona());
            pst1.setString(12, funcionario.getSecao());
            pst1.setString(13, funcionario.getNomePai());
            pst1.setString(14, funcionario.getNomeMae());
            pst1.setString(15, funcionario.getEstadoCivil());
            pst1.setString(16, funcionario.getQtdeFilhos());

            //O código abaixo formata o status para int
            String status = funcionario.getStatus();
            int sts = 0;
            if (status.equals("Ativo")) {
                sts = 1;
            } else {
                sts = 2;
            }
            pst1.setInt(17, sts);
            pst1.executeUpdate();

            //O código abaixo altera o telefone fixo
            pst2.setInt(1, funcionario.getCodigo());
            pst2.setString(2, funcionario.getFoneFixo());
            pst2.executeUpdate();

            //O código abaixo altera o telefone celular
            pst3.setInt(1, funcionario.getCodigo());
            pst3.setString(2, funcionario.getFoneCelular());
            pst3.executeUpdate();

            //O código abaixo altera o email
            pst4.setInt(1, funcionario.getCodigo());
            pst4.setString(2, funcionario.getEmail());
            pst4.executeUpdate();

            //O código abaixo altera o endereço
            pst5.setString(1, funcionario.getCep());
            pst5.setString(2, funcionario.getLogradouro());
            pst5.setString(3, funcionario.getComplemento());
            pst5.setString(4, funcionario.getNumero());
            pst5.setString(5, funcionario.getBairro());
            pst5.setString(6, funcionario.getCidade());
            pst5.setString(7, funcionario.getEstado());
            pst5.setInt(8, funcionario.getCodigo());
            pst5.executeUpdate();

            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso.");
            limparCampos();
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        conexao.close();
        return false;
    }

    public ResultSet buscarFuncionarioDao(Pessoa pessoa) throws SQLException {
        Funcionario funcionario = new Funcionario();
        conexao = ConexoesMySql.base();
        pst = null;
        pst1 = null;
        pst2 = null;
        pst3 = null;
        pst4 = null;
        String dtNascCli;
        String sqlCpf = "SELECT * FROM PESSOA p"
                + " INNER JOIN FUNCIONARIO f ON f.funcionario_id_pessoa = p.id_pessoa"
                + " INNER JOIN FUNCIONARIO_CONTATO t ON t.id_funcionario = f.id_funcionario"
                + " WHERE p.cpf_pessoa = ?"
                + " OR f.id_funcionario = ?"
                + " OR p.nome_pessoa LIKE ?";
        String sqlContato1 = "SELECT descricao_funcionario_contato FROM FUNCIONARIO_CONTATO t"
                + "	INNER JOIN FUNCIONARIO f"
                + "    INNER JOIN PESSOA p"
                + "    ON t.id_funcionario = f.id_funcionario"
                + "    AND f.funcionario_id_pessoa = p.id_pessoa"
                + "    AND t.ID_CONTATO_FUNCIONARIO_TIPO = 1"
                + "    WHERE p.cpf_pessoa = ?"
                + "    OR f.ID_FUNCIONARIO = ?"
                + "    OR p.nome_pessoa LIKE ?";
        String sqlContato2 = "SELECT descricao_funcionario_contato FROM FUNCIONARIO_CONTATO t"
                + "	INNER JOIN FUNCIONARIO f"
                + "    INNER JOIN PESSOA p"
                + "    ON t.id_funcionario = f.id_funcionario"
                + "    AND f.funcionario_id_pessoa = p.id_pessoa"
                + "    AND f.funcionario_id_pessoa = p.id_pessoa"
                + "    AND t.ID_CONTATO_FUNCIONARIO_TIPO = 2"
                + "    WHERE p.cpf_pessoa = ?"
                + "    OR f.ID_FUNCIONARIO = ?"
                + "    OR p.nome_pessoa LIKE ?";
        String sqlContato3 = "SELECT descricao_funcionario_contato FROM FUNCIONARIO_CONTATO t"
                + "	INNER JOIN FUNCIONARIO f"
                + "    INNER JOIN PESSOA p"
                + "    ON t.id_funcionario = f.id_funcionario"
                + "    AND f.funcionario_id_pessoa = p.id_pessoa"
                + "    AND t.ID_CONTATO_FUNCIONARIO_TIPO = 3"
                + "    WHERE p.cpf_pessoa = ?"
                + "    OR f.ID_FUNCIONARIO = ?"
                + "    OR p.nome_pessoa LIKE ?";
        String sqlEndereco = "SELECT * FROM ENDERECO_FUNCIONARIO e"
                + "	INNER JOIN FUNCIONARIO f"
                + "    INNER JOIN PESSOA p"
                + "    ON f.funcionario_id_pessoa = p.id_pessoa"
                + "    AND e.id_funcionario = f.id_funcionario"
                + "    WHERE p.cpf_pessoa = ?"
                + "    OR f.ID_FUNCIONARIO = ?"
                + "    OR p.nome_pessoa LIKE ?";

        try {
            pst = conexao.prepareStatement(sqlCpf);
            pst1 = conexao.prepareStatement(sqlContato1);
            pst2 = conexao.prepareStatement(sqlContato2);
            pst3 = conexao.prepareStatement(sqlContato3);
            pst4 = conexao.prepareStatement(sqlEndereco);

            pst.setString(1, pessoa.getCpf_pessoa());

            pst.setInt(2, funcionario.getCodigo());
            pst.setString(3, pessoa.getNome_pessoa());
            rs = pst.executeQuery();
            if (rs.next()) {
            
                FuncionarioFrm func = new FuncionarioFrm();
                //pessoa.setCodigo_pessoa(Integer.parseInt(rs.getString(1)));
                pessoa.setNome_pessoa(rs.getString(2));
                pessoa.setCpf_pessoa(rs.getString(3));
                pessoa.setRg_pessoa(rs.getString(4));
                pessoa.setOrgaoemissor_pessoa(rs.getString(5));

                String dataNascimento = rs.getString(6);
                if (dataNascimento != null) {
                    String ano = dataNascimento.substring(0, 4);
                    String mes = dataNascimento.substring(5, 7);
                    String dia = dataNascimento.substring(8);

                    dtNascCli = dia + "/" + mes + "/" + ano;
                } else {
                    dtNascCli = "  /  /    ";
                }
                func.iptDataNascimento.setText(dtNascCli);
                func.txtObservacoes.setText(rs.getString(11));
                funcionario.setTipoPessoa(rs.getInt(12));
                func.iptCodigo.setText(Integer.toString(rs.getInt(13)));
                func.iptCargo.setText(rs.getString(14));
                func.iptDepartamento.setText(rs.getString(15));
                func.iptSalario.setText(rs.getString(16));
                func.iptCtps.setText(rs.getString(17));
                func.iptSerieCtps.setText(rs.getString(18));
                func.iptPisPasep.setText(rs.getString(19));
                func.cbbUfCtps.setSelectedItem(rs.getString(20));
                func.iptDataContratacao.setText(rs.getString(21));
                func.iptDataSaida.setText(rs.getString(22));
                func.iptTituloEleitor.setText(rs.getString(23));
                func.iptZona.setText(rs.getString(24));
                func.iptSecao.setText(rs.getString(25));
                func.iptNomePai.setText(rs.getString(26));
                func.iptNomeMae.setText(rs.getString(27));
                func.cbbEstadoCivil.setSelectedItem(rs.getString(28));
                func.iptQtdeFilhos.setText(rs.getString(29));
                //funcionario.setCodigo_pessoa(Integer.parseInt(rs.getString(31)));
                //funcionario.setStatus(rs.getString(32));
            }

            pst1.setString(1, funcionario.getCpf_pessoa());
            pst1.setInt(2, funcionario.getCodigo());
            pst1.setString(3, funcionario.getNome_pessoa());
            rs1 = pst1.executeQuery();

            pst2.setString(1, funcionario.getCpf_pessoa());
            pst2.setInt(2, funcionario.getCodigo());
            pst2.setString(3, funcionario.getNome_pessoa());
            rs2 = pst2.executeQuery();

            pst3.setString(1, funcionario.getCpf_pessoa());
            pst3.setInt(2, funcionario.getCodigo());
            pst3.setString(3, funcionario.getNome_pessoa());
            rs3 = pst3.executeQuery();

            pst4.setString(1, funcionario.getCpf_pessoa());
            pst4.setInt(2, funcionario.getCodigo());
            pst4.setString(3, funcionario.getNome_pessoa());
            rs4 = pst4.executeQuery();

            if (rs1.next()) {
                funcionario.setFoneFixo(rs1.getString(1));
            }
            if (rs2.next()) {
                funcionario.setFoneCelular(rs2.getString(1));
            }
            if (rs3.next()) {
                funcionario.setEmail(rs3.getString(1));
            }
            if (rs4.next()) {
                funcionario.setCep(rs4.getString(2));
                funcionario.setLogradouro(rs4.getString(3));
                funcionario.setComplemento(rs4.getString(4));
                funcionario.setNumero(rs4.getString(5));
                funcionario.setBairro(rs4.getString(6));
                funcionario.setCidade(rs4.getString(7));
                funcionario.setEstado(rs4.getString(8));

            }
            /*else {
                JOptionPane.showMessageDialog(null, "Funcionário não cadastrado.");
            }*/
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Contate o administrador do sistema! : " + e);
        }
        conexao.close();
        return rs;
    }

}
