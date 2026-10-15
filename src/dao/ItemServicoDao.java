package dao;

import conexoes.ConexoesMySql;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Itens_Servico;
import model.Ordem_Servico;
import view.OrdemServicoFrm;

public class ItemServicoDao {

    static Connection conexao = null;
    static PreparedStatement pst = null;
    static PreparedStatement pst1 = null;
    static ResultSet rs1 = null;
    static ResultSet rs = null;
    static int sts;
    String codigo;
    String descricao;
    String placa;

    public ResultSet buscarItemDao(Ordem_Servico servico) throws SQLException {
        conexao = ConexoesMySql.base();
        String sql = "SELECT * FROM itens_servicos WHERE codigo_os = ?";
        
        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, servico.getCodigo_os());
            rs = pst.executeQuery();

            if (rs.next()) {

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar item de serviço: " + e);

        }
        conexao.close();
        return rs;
    }

    public ResultSet buscarValorTotalItens(Ordem_Servico os) throws SQLException {
        conexao = ConexoesMySql.base();

        String sqlVerifica = "SELECT codigo_itens_servico"
                + " FROM itens_servicos "
                + " WHERE codigo_os =? ";
        String sql = "SELECT SUM(valor_total)"
                + " FROM itens_servicos"
                + " WHERE codigo_os =? ";

        pst = conexao.prepareStatement(sqlVerifica);
        pst.setInt(1, os.getCodigo_os());
        rs = pst.executeQuery();

        try {
            if (rs.next()) {
                pst1 = conexao.prepareStatement(sql);
                pst1.setInt(1, os.getCodigo_os());
                rs1 = pst1.executeQuery();
                if (rs1.next()) {
                    Itens_Servico items = new Itens_Servico();
                    OrdemServicoFrm.iptValorTotalServicos.setText(rs1.getString(1));
                }
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Soma. " + err);
        }
        conexao.close();
        return rs1;
    }

    public static boolean addItemDao(Itens_Servico item) throws SQLException {
        conexao = ConexoesMySql.base();
        pst = null;
        rs = null;
        rs1 = null;

        String sql = "INSERT INTO itens_servicos (descricao_servico, quantidade, valor_unitario,"
                + "valor_total, codigo_servico, codigo_os) VALUES (?,?,?,?,?,?);";
        if (conexao != null) {
            try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1, item.getDescricao_itens_servico());
                pst.setInt(2, item.getQuantidade());
                pst.setString(3, item.getPreco_unit());
                pst.setString(4, item.getPreco_total());
                pst.setInt(5, item.getCodigo_servico());
                pst.setInt(6, item.getCodigo_ordem_servico());
                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Item incluído com sucesso");
                return true;

            } catch (SQLException sqlException) {
                System.out.println("Ocorreu uma exceção SQL" + sqlException);
                JOptionPane.showMessageDialog(null, "Erro ao incluir item!" + sqlException);
            } catch (HeadlessException exception) {
                System.out.println("Ocorreu uma exceção");
                JOptionPane.showMessageDialog(null, "Erro ao incluir item" + exception);
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

    public static boolean alterarItemDao(Itens_Servico item) throws SQLException {
        conexao = ConexoesMySql.base();
        pst = null;
        rs = null;

        String sql = "UPDATE servico SET descricao_servico = ?, fabricante_servico = ?,"
                + " ano_servico = ?, modelo_servico = ?, cor_servico = ?,"
                + " chassi_servico = ?, servico_id_cliente = ?, id_status_servico = ? WHERE placa_servico = ?";
        if (conexao != null) {
            try {

                pst = conexao.prepareStatement(sql);

                pst.setString(1, item.getDescricao_itens_servico());
                pst.setInt(2, item.getCodigo_ordem_servico());
                pst.setInt(3, item.getCodigo_servico());
                pst.setInt(4, item.getQuantidade());
                pst.setString(5, item.getPreco_unit());
                pst.setString(6, item.getPreco_total());
                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Dados do Veículo Alterados com sucesso!");
                return true;

            } catch (SQLException sqlException) {
                System.out.println("Ocorreu uma exceção SQL" + sqlException);
                JOptionPane.showMessageDialog(null, "Erro ao Alterar dados do Veículo!" + sqlException);
            } catch (HeadlessException exception) {
                System.out.println("Ocorreu uma exceção");
                JOptionPane.showMessageDialog(null, "Erro ao Alterar dados do Veículo!" + exception);
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
}
