package dao;

import conexoes.ConexoesMySql;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Itens_Produto;
import model.Ordem_Servico;
import view.OrdemServicoFrm;

public class ItemProdutoDao {

    static Connection conexao = null;
    static PreparedStatement pst = null;
    static PreparedStatement pst1 = null;
    static ResultSet rs1 = null;
    static ResultSet rs = null;
    static int sts;
    String codigo;
    String descricao;
    String placa;

    public ItemProdutoDao() {
        conexao = ConexoesMySql.conectar();

    }

    public ResultSet buscarItens(Ordem_Servico os) throws SQLException {
        conexao = ConexoesMySql.conectar();
        try {
            String sql = "SELECT codigo_produto AS 'Código',descricao AS 'Descrição',quantidade AS 'Quantidade',"
                    + " preco_unit AS 'Preço Unit. R$', preco_total AS 'Preço Total R$'"
                    + " FROM itens_produtos"
                    + " WHERE codigo_os = ?";
            conexao = ConexoesMySql.conectar();
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, os.getCodigo_os());
            rs = pst.executeQuery();
            if (rs.next()) {

            }

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Produto. " + err);
        }
        //conexao.close();
        return rs;
    }

    public ResultSet buscarValorTotalItens(Ordem_Servico os) throws SQLException {
        conexao = ConexoesMySql.conectar();

        String sqlVerifica = "SELECT codigo_itens_produtos"
                + " FROM itens_produtos "
                + " WHERE codigo_os =?";
        String sql = "SELECT SUM(preco_total) "
                + " FROM itens_produtos"
                + " WHERE codigo_os =?";

        pst = conexao.prepareStatement(sqlVerifica);
        pst.setInt(1, os.getCodigo_os());
        rs = pst.executeQuery();

        try {
            if (rs.next()) {
                pst1 = conexao.prepareStatement(sql);
                pst1.setInt(1, os.getCodigo_os());
                rs1 = pst1.executeQuery();
                if (rs1.next()) {
                    Itens_Produto itemp = new Itens_Produto();
                    OrdemServicoFrm.iptValorTotalProdutos.setText(rs1.getString(1));

                }
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Soma. " + err);
        }
        //conexao.close();
        return rs1;
    }

    public static boolean addItemDao(Itens_Produto item) throws SQLException {
        conexao = ConexoesMySql.conectar();
        pst = null;
        rs = null;
        rs1 = null;

        String sql = "INSERT INTO itens_produtos "
                + "(descricao,"
                + " codigo_os,"
                + " codigo_produto,"
                + " quantidade,"
                + " preco_unit,"
                + " preco_total)"
                + " VALUES (?, ?, ?, ?, ?, ?);";
        if (conexao != null) {
            try {
                /*item.setCodigo_produto(Integer.parseInt(iptCodigo.getText()));
                item.setDescricao(iptDescricao.getText());
                item.setQuantidade(Integer.parseInt(iptQuantidade.getText()));
                item.setPreco_unit(iptPrecoUnit.getText());
                item.setPreco_total(iptPrecoTotal.getText());
                item.setCodigo_os(Integer.parseInt(iptCodigoOs.getText()));*/

                String vlrUnit = item.getPreco_unit();
                String vlrTot = item.getPreco_total();
                if (vlrUnit == null) {
                    vlrUnit = "0.0";
                }
                if (vlrTot == null) {
                    vlrTot = "0.0";
                }

                pst = conexao.prepareStatement(sql);
                pst.setString(1, item.getDescricao());
                pst.setInt(2, item.getCodigo_os());
                pst.setInt(3, item.getCodigo_produto());
                pst.setInt(4, item.getQuantidade());
                pst.setString(5, vlrUnit);
                pst.setString(6, vlrTot);
                pst.executeUpdate();

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
        return false;

    }

    public static boolean alterarItemDao(Itens_Produto item) throws SQLException {
        conexao = ConexoesMySql.conectar();
        pst = null;
        rs = null;

        String sql = "UPDATE itens_produtos SET "
                + " descricao = ?,"
                + " codigo_os = ?,"
                + " codigo_produto = ?,"
                + " quantidade = ?,"
                + " preco_unit = ?,"
                + " preco_total = ?";
        if (conexao != null) {
            try {

                pst = conexao.prepareStatement(sql);

                pst.setString(1, item.getDescricao());
                pst.setInt(2, item.getCodigo_os());
                pst.setInt(3, item.getCodigo_produto());
                pst.setInt(4, item.getQuantidade());
                pst.setString(5, item.getPreco_unit());
                pst.setString(6, item.getPreco_total());
                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Item Alterado com sucesso!");
                return true;

            } catch (SQLException sqlException) {
                System.out.println("Ocorreu uma exceção SQL" + sqlException);
                JOptionPane.showMessageDialog(null, "Erro ao Alterar item!" + sqlException);
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
        return false;

    }

    public ResultSet buscarItensMovimento(Ordem_Servico os) throws SQLException {
        conexao = ConexoesMySql.conectar();
        String dataMovimento;
        int idTipo = 2;

        String sql = "SELECT codigo_produto, codigo_os, quantidade "
                + " FROM itens_produtos"
                + " WHERE codigo_os = ?";

        String movimento = "INSERT INTO movimentacao_estoque("
                + " data_movimentacao_estoque,"
                + " qtd_produto,"
                + " id_produto_movimentacao_estoque,"
                + " id_tipo_movimentacao,"
                + " codigo_ordem_servico)"
                + " VALUES (?,?,?,?,?)";

        try {

            conexao = ConexoesMySql.conectar();
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, os.getCodigo_os());
            rs = pst.executeQuery();
            if (rs.next()) {
                
            }

            while (rs.next()) {

                String data = os.getDt_sai_os();
                if (data.equals("  /  /    ")) {
                    dataMovimento = null;
                } else {
                    String dia = data.substring(0, 2);
                    String mes = data.substring(3, 5);
                    String ano = data.substring(6);
                    dataMovimento = ano + "-" + mes + "-" + dia;
                }
                pst1 = conexao.prepareStatement(movimento);
                pst1.setString(1, dataMovimento);
                pst1.setInt(2, rs.getInt(3));
                pst1.setInt(3, rs.getInt(1));
                pst1.setInt(4, idTipo);
                pst1.setInt(5, Integer.parseInt(rs.getString(2)));
                pst1.executeUpdate();

            }

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao Finalizar Ordem de Serviço. " + err);
        }
        //conexao.close();
        return rs;
    }
}
