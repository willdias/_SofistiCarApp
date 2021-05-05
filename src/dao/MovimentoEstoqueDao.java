package dao;

import conexoes.ConexoesMySql;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.Movimento_Estoque;

public class MovimentoEstoqueDao {

    static Connection conexao = null;
    static PreparedStatement pst = null;
    static ResultSet rs = null;

    public MovimentoEstoqueDao() {
        conexao = ConexoesMySql.conectar();

    }

    public static boolean incluirEstoqueDao(Movimento_Estoque movimento) throws SQLException {
        conexao = ConexoesMySql.conectar();
        pst = null;
        rs = null;
        String dataMovimento;

        String sql = "INSERT INTO movimentacao_estoque ( data_movimentacao_estoque,"
                + " qtd_produto, id_produto_movimentacao_estoque, id_tipo_movimentacao) VALUES (?,?,?,?)";

        if (conexao != null) {
            try {

                pst = conexao.prepareStatement(sql);

                String data = movimento.getData_movimentacao_estoque();
                if (data.equals("  /  /    ")) {
                    dataMovimento = null;
                } else {
                    String dia = data.substring(0, 2);
                    String mes = data.substring(3, 5);
                    String ano = data.substring(6);
                    dataMovimento = ano + "-" + mes + "-" + dia;
                }
                pst.setString(1, dataMovimento);
                pst.setInt(2, movimento.getQtd_produto());
                pst.setInt(3, movimento.getId_produto_movimentacao_estoque());
                pst.setInt(4, movimento.getId_tipo_movimentacao());
                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Movimento de estoque registrado.");
                return true;

            } catch (SQLException sqlException) {
                System.out.println("Ocorreu uma exceção SQL" + sqlException);
                JOptionPane.showMessageDialog(null, "Erro ao Atualizar Estoque!");
            } catch (HeadlessException exception) {
                System.out.println("Ocorreu uma exceção");
                JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Estoque!");
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

    public static boolean alterarEstoqueDao(Movimento_Estoque movimento) throws SQLException {
        conexao = ConexoesMySql.conectar();
        pst = null;
        rs = null;
        String dataMovimento;

        String sql = "UPDATE movimento_estoque data_movimentacao_estoque = ?,"
                + " qtd_produto = ?, id_produto_movimentacao_estoque = ?, id_tipo_movimentacao = ?)";

        if (conexao != null) {
            try {

                pst = conexao.prepareStatement(sql);

                String data = movimento.getData_movimentacao_estoque();
                if (data.equals("  /  /    ")) {
                    dataMovimento = null;
                } else {
                    String dia = data.substring(0, 2);
                    String mes = data.substring(3, 5);
                    String ano = data.substring(6);
                    dataMovimento = ano + "-" + mes + "-" + dia;
                }
                pst.setString(1, dataMovimento);
                pst.setInt(2, movimento.getQtd_produto());
                pst.setInt(3, movimento.getId_produto_movimentacao_estoque());
                pst.setInt(4, movimento.getId_tipo_movimentacao());
                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Estoque Cadastrado com sucesso!");
                return true;

            } catch (SQLException sqlException) {
                System.out.println("Ocorreu uma exceção SQL" + sqlException);
                JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Estoque!");
            } catch (HeadlessException exception) {
                System.out.println("Ocorreu uma exceção");
                JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Estoque!");
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
