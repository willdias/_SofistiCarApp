package dao;

import conexoes.ConexoesMySql;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import model.Usuario;

public class UsuarioDao {

    static Connection con = null;
    static PreparedStatement pst = null;
    static ResultSet rs = null;

    public static void listarCbb(JComboBox<String> cbbIdFuncionario, String funcionario, String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    String login;
    String senha;
    int idFuncionario;
    String perfil;

    public UsuarioDao() {
        con = ConexoesMySql.conectar();

    }

    public static boolean addUsuario(Usuario usuario) throws SQLException {
        con = ConexoesMySql.conectar();
        pst = null;
        rs = null;
        int iQtdeRegAfetados = 0;
        int iCodFuncionario = 0;
        
        String sql = "INSERT INTO usuario (login, senha, idFuncionario, perfil) VALUES (?,?,?,?)";
        String sqlFunc = " SELECT idFuncionario,nome from FUNCIONARIO WHERE NOME = '" + usuario.getId_funcionario_usuario()+ "'";
        pst = con.prepareStatement(sqlFunc);
        rs = pst.executeQuery();

        if (rs.next()) {
            iCodFuncionario = rs.getInt(1);
        }

        if (con != null) {   //
            try {
                pst = con.prepareStatement(sql);
                pst.setString(1,usuario.getLogin_usuario());
                pst.setString(2,usuario.getSenha_usuario());
                pst.setInt(3, usuario.getId_funcionario_usuario());
                pst.setInt(4,usuario.getId_nivel_acesso());
                pst.execute();
             
             JOptionPane.showMessageDialog(null,"Usuário Cadastrado com sucesso!");
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
            return false;
        //return iQtdeRegAfetados > 0;
    }
    
    public static void listarCbb() throws ClassNotFoundException, SQLException {
        String listarModelos = "SELECT nome_pessoa from funcionario f"
                + "INNER JOIN pessoa p"
                + "ON f.funcionario_id_pessoa = p.codigo_pessoa"
                + "ORDER BY nome_pessoa ASC";
        try {
            /// adicionar os itens do select
            con = ConexoesMySql.conectar();
            pst = con.prepareStatement(listarModelos);
            rs = pst.executeQuery();

            while (rs.next()) {
                //UsuarioFrm.cbbIdFuncionario.setName(String rs.getString());
            }
        } catch (SQLException err) {
            System.err.println("listarCbb erro SQL!");
        } finally {
            con.close();//fechar conexão
            pst.close();
            rs.close();
        }
    }
    
    public static boolean updateUsuario(Usuario usuario) throws SQLException {
        con = ConexoesMySql.conectar();
        pst = null;
        rs = null;
        int iCodFuncionario = 0;
        
        String sql = "UPDATE usuario (login, senha, idFuncionario, perfil) SET VALUES (?,?,?,?)";
        String sqlFunc = " SELECT idFuncionario,nome from FUNCIONARIO WHERE NOME = '" + usuario.getId_funcionario_usuario()+ "'";
        pst = con.prepareStatement(sqlFunc);
        rs = pst.executeQuery();

        if (rs.next()) {
            iCodFuncionario = rs.getInt(1);
        }

        if (con != null) { 
            try {
                pst = con.prepareStatement(sql);
                pst.setString(1,usuario.getLogin_usuario());
                pst.setString(2,usuario.getSenha_usuario());
                pst.setInt(3, usuario.getId_funcionario_usuario());
                pst.setInt(4,usuario.getId_nivel_acesso());
                
             pst.executeUpdate();
             
             JOptionPane.showMessageDialog(null,"Usuário Alterado com sucesso!");
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
            return false;
       
    }
}
