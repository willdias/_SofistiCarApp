package dao;

import conexoes.ConexoesMySql;
import model.Movimento_Estoque;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MovimentoEstoqueDao {

    static Connection conexao = null;
    static PreparedStatement pst = null;
    static ResultSet rs = null;

    public static boolean incluirEstoqueDao(Movimento_Estoque movimento) throws SQLException {
        conexao = ConexoesMySql.base();
        pst = null;
        rs = null;
        String dataMovimento;

        String sql = "INSERT INTO MOVIMENTACAO_ESTOQUE ( data_movimentacao_estoque,"
                + " id_produto_movimentacao_estoque, id_tipo_movimentacao) VALUES (?,?,?)";

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
        conexao = ConexoesMySql.base();
        pst = null;
        rs = null;
        String dataMovimento;

        String sql = "UPDATE MOVIMENTACAO_ESTOQUE SET data_movimentacao_estoque = ?,"
                + " id_produto_movimentacao_estoque = ?, id_tipo_movimentacao = ? WHERE id_movimentacao_estoque = ?";

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
