package dao;

import conexoes.ConexoesMySql;
import model.EntradaProduto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EntradaEstoqueDao {

    static Connection conexao = null;
    static PreparedStatement pst = null;
    static ResultSet rs = null;

    public static boolean updateSaldo(EntradaProduto entrada) throws SQLException {
        conexao = ConexoesMySql.base();
        PreparedStatement pst = null;
        ResultSet rs = null;

        /*String sql = "UPDATE ESTOQUE SET saldoProduto = ? WHERE id = ?";

        if (conexao != null) {
            try {

                pst = conexao.prepareStatement("sql");

                pst.setString(1, entrada.getQuantidade());
                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Entrada de Produto realizada com sucesso!");
                return true;

            } catch (SQLException sqlException) {
                System.out.println("Ocorreu uma exceção SQL" + sqlException);
                JOptionPane.showMessageDialog(null, "Erro ao Realizar Entrada de Produto!");
            } catch (HeadlessException exception) {
                System.out.println("Ocorreu uma exceção");
                JOptionPane.showMessageDialog(null, "Erro ao Realizar Entrada de Produto!");
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
        }*/
        conexao.close();
        return false;
    }
}
