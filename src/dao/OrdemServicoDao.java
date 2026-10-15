package dao;

import conexoes.ConexoesMySql;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.Ordem_Servico;
import view.OrdemServicoFrm;

public class OrdemServicoDao {

    static Connection conexao = null;
    static PreparedStatement pst = null;
    static ResultSet rs = null;
    static String dtEnt;
    static String dtSai;

    public static boolean addOrdemServicoDao(Ordem_Servico ordemServico) throws SQLException {
        conexao = ConexoesMySql.base();
        pst = null;
        rs = null;

        String sql = "INSERT INTO ordem_servico(dataentrada_ordem_servico,id_status) VALUES (?, ?)";

        if (conexao != null) {
            try {

                pst = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                String dataCadastro = null;
                String data = OrdemServicoFrm.iptDataEntrada.getText();

                if (data.equals("  /  /    ")) {
                    dataCadastro = null;
                } else {
                    String dia = data.substring(0, 2);
                    String mes = data.substring(3, 5);
                    String ano = data.substring(6);
                    dataCadastro = ano + "-" + mes + "-" + dia;
                }
                pst.setString(1, dataCadastro);

                pst.setInt(2, 3);
                pst.executeUpdate();
                ResultSet keys = pst.getGeneratedKeys();
                keys.next();
                int key = keys.getInt(1);
                ordemServico.setCodigo_os(key);

                return true;

            } catch (SQLException sqlException) {
                System.out.println("Ocorreu uma exceção SQL" + sqlException);
            } catch (HeadlessException exception) {
                System.out.println("Ocorreu uma exceção");
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

    public static boolean alterarOrdemServicoDao(Ordem_Servico ordemServico) throws SQLException {
        conexao = ConexoesMySql.base();
        pst = null;
        rs = null;

        String sql = "UPDATE ordem_servico SET "
                + " defeito_ordem_servico = ?,"
                + " valor_total_ordem_servico = ?,"
                + " datasaida_ordem_servico = ?,"
                + " id_cliente = ?,"
                + " id_veiculo = ? ,"
                + " id_status =?  "
                + " WHERE codigo_ordem_servico = ?";

        if (conexao != null) {   //
            try {
                pst = conexao.prepareStatement(sql);

                pst.setString(1, ordemServico.getDefeito());
                pst.setDouble(2, ordemServico.getValor_total_os());

                String dataSaida = null;
                String data = OrdemServicoFrm.iptDataSaida.getText();

                if (data.equals("  /  /    ")) {
                    dataSaida = null;
                } else {
                    String dia = data.substring(0, 2);
                    String mes = data.substring(3, 5);
                    String ano = data.substring(6);
                    dataSaida = ano + "-" + mes + "-" + dia;
                }
                pst.setString(3, dataSaida);
                pst.setInt(4, ordemServico.getId_cliente());
                pst.setInt(5, ordemServico.getId_veiculo());

                String stat = ordemServico.getStatus();
                int sts = 0;
                if (stat.equals("Aberto")) {
                    sts = 3;
                } else if (stat.equals("Cancelado")) {
                    sts = 5;
                } else if (stat.equals("Finalizado")) {
                    sts = 6;
                }
                pst.setInt(6, sts);
                pst.setInt(7, ordemServico.getCodigo_os());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Dados alterados.");
                return true;
            } catch (SQLException sqlException) {
                System.out.println("Ocorreu uma exceção SQL" + sqlException);
            } catch (HeadlessException exception) {
                System.out.println("Ocorreu uma exceção");
            }
        }
        conexao.close();
        return false;
    }

    public boolean finalizar(Ordem_Servico ordemServico) throws SQLException { //Isso deveria retornar boolean :) vai entender agora
        conexao = ConexoesMySql.base();
        pst = null;
        rs = null;

        String sql = "UPDATE ordemServico SET status = ?"
                + " WHERE idOrdem_Servico = ?";

        if (conexao != null) {
            try {

                pst = conexao.prepareStatement(sql);

//                pst.setInt(1, ordemServico.getId_status());
                pst.setInt(2, ordemServico.getCodigo_os());
                pst.executeUpdate();

                return true;

            } catch (SQLException sqlException) {
                System.out.println("Ocorreu uma exceção SQL" + sqlException);
                JOptionPane.showMessageDialog(null, "Erro ao Finalizar Ordem de Serviço.");
            } catch (HeadlessException exception) {
                System.out.println("Ocorreu uma exceção");
                JOptionPane.showMessageDialog(null, "Erro ao Finalizar Ordem de Serviço.");
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

        return false;

    }

    public ResultSet buscarOrdemServicoDao(Ordem_Servico os) throws SQLException {
        conexao = ConexoesMySql.base();
        pst = null;

        String sql = "SELECT * FROM ordem_servico"
                + " WHERE codigo_ordem_servico = ?";

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, os.getCodigo_os());
            rs = pst.executeQuery();

            if (rs.next()) {

                os.setCodigo_os(Integer.parseInt(rs.getString(1)));
                os.setDefeito(rs.getString(2));

                String dataEnt = rs.getString(3);
                if (dataEnt != null) {
                    String ano = dataEnt.substring(0, 4);
                    String mes = dataEnt.substring(5, 7);
                    String dia = dataEnt.substring(8);

                    dtEnt = dia + "/" + mes + "/" + ano;
                } else {
                    dtEnt = "  /  /    ";
                }
                os.setDt_ent_os(dtEnt);
                
                String dataSai = rs.getString(4);
                if (dataSai != null) {
                    String ano = dataSai.substring(0, 4);
                    String mes = dataSai.substring(5, 7);
                    String dia = dataSai.substring(8);

                    dtSai = dia + "/" + mes + "/" + ano;
                } else {
                    dtSai = "  /  /    ";
                }
                os.setDt_sai_os(dtSai);
                os.setValor_total_os(Double.parseDouble(rs.getString(5)));
                
                int stat = Integer.parseInt(rs.getString(7));
                String sts = null;
                if (stat == 3) {
                    sts = "Aberto";
                } else if (stat == 5) {
                    sts = "Cancelado";
                } else if (stat == 6) {
                    sts = "Finalizado";
                }
                os.setStatus(sts);
                os.setId_cliente(Integer.parseInt(rs.getString(8)));
                os.setId_veiculo(Integer.parseInt(rs.getString(9)));

            } else {
                JOptionPane.showMessageDialog(null, "Ordem de Serviço não cadastrada.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + " Contate o administrador do sistema!");
        }
        conexao.close();
        return rs;
    }
}
