package dao;

import conexoes.ConexoesMySql;
import model.Usuario;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDao {

    static Connection conexao = null;
    static PreparedStatement pst = null;
    static ResultSet rs = null;

    /*public static void listarCbb(JComboBox<String> cbbIdFuncionario, String funcionario, String nome) {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
        // Tools | Templates.
    }*/

    public static boolean addUsuario(Usuario usuario) throws SQLException {
        conexao = ConexoesMySql.base();
        pst = null;
        rs = null;
        int iQtdeRegAfetados = 0;
        int iCodFuncionario = 0;

        String sql = "INSERT INTO USUARIO (LOGIN_USUARIO, SENHA_USUARIO, ID_FUNCIONARIO_USUARIO, ID_NIVEL_ACESSO) VALUES (?,?,?,?)";
        String sqlFunc = " SELECT idFuncionario,nome from FUNCIONARIO WHERE NOME = '"
                + usuario.getId_funcionario_usuario() + "'";
        pst = conexao.prepareStatement(sqlFunc);
        rs = pst.executeQuery();

        if (rs.next()) {
            iCodFuncionario = rs.getInt(1);
        }

        if (conexao != null) { //
            try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1, usuario.getLogin_usuario());
                pst.setString(2, usuario.getSenha_usuario());
                pst.setInt(3, usuario.getId_funcionario_usuario());
                pst.setInt(4, usuario.getId_nivel_acesso());
                pst.execute();

                JOptionPane.showMessageDialog(null, "Usuário Cadastrado com sucesso!");
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
        // return iQtdeRegAfetados > 0;
    }

    public static void listarCbb() throws ClassNotFoundException, SQLException {
        String listarModelos = "SELECT p.NOME_PESSOA from FUNCIONARIO f"
				+ " INNER JOIN PESSOA p"
                + " ON f.FUNCIONARIO_ID_PESSOA = p.ID_PESSOA"
				+ " ORDER BY nome_pessoa ASC";
        try {
            /// adicionar os itens do select
            conexao = ConexoesMySql.base();
            pst = conexao.prepareStatement(listarModelos);
            rs = pst.executeQuery();

            while (rs.next()) {
                // UsuarioFrm.cbbIdFuncionario.setName(String rs.getString());
            }
        } catch (SQLException err) {
            System.err.println("listarCbb erro SQL!");
        } finally {
            conexao.close();// fechar conexão
            pst.close();
            rs.close();
        }
    }

    public static boolean updateUsuario(Usuario usuario) throws SQLException {
        conexao = ConexoesMySql.base();
        pst = null;
        rs = null;
        int iCodFuncionario = 0;

        String sql = "UPDATE USUARIO SET LOGIN_USUARIO = ?, SENHA_USUARIO = ?, ID_FUNCIONARIO_USUARIO = ?, ID_NIVEL_ACESSO = ? WHERE ID_USUARIO = ?";
        String sqlFunc = " SELECT idFuncionario,nome from FUNCIONARIO WHERE NOME = '"
                + usuario.getId_funcionario_usuario() + "'";
        pst = conexao.prepareStatement(sqlFunc);
        rs = pst.executeQuery();

        if (rs.next()) {
            iCodFuncionario = rs.getInt(1);
        }

        if (conexao != null) {
            try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1, usuario.getLogin_usuario());
                pst.setString(2, usuario.getSenha_usuario());
                pst.setInt(3, usuario.getId_funcionario_usuario());
                pst.setInt(4, usuario.getId_nivel_acesso());

                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Usuário Alterado com sucesso!");
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
}
