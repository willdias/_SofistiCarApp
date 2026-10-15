package dao;

import conexoes.ConexoesMySql;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;
import view.LoginFrm;
import view.TelaPrincipalFrm;

public class LoginDao {

    static Connection conexao = null;
    static PreparedStatement pst = null;
    public static ResultSet result = null;

    public static void logar(String login, String senha) {

        String sql = "SELECT p.nome_pessoa, u.login_usuario, u.senha_usuario, u.id_nivel_acesso"
                + " FROM PESSOA p"
                + " INNER JOIN FUNCIONARIO f"
                + " LEFT JOIN USUARIO u"
                + " ON p.id_pessoa = f.funcionario_id_pessoa"
                + " AND f.id_funcionario = u.id_funcionario_usuario"
                + " WHERE login_usuario = ? AND senha_usuario = ?";
        try {
            conexao = ConexoesMySql.base();
            pst = conexao.prepareStatement(sql);

            pst.setString(1, login);
            pst.setString(2, senha);
            result = pst.executeQuery();

            if (result.next()) {
                
                String nomePerfil = result.getString(1);

                String perfil = result.getString(4);

                if (perfil.equals("1")) {

                    TelaPrincipalFrm principal = new TelaPrincipalFrm(); // instancia a tela principal
                    principal.setVisible(true); //chama a tela principal
                    TelaPrincipalFrm.lblUsuario.setText(nomePerfil);
                    TelaPrincipalFrm.MenRelatorio.setEnabled(true);
                } else {
                    TelaPrincipalFrm principal = new TelaPrincipalFrm(); // instancia a tela principal
                    principal.setVisible(true); //chama a tela principal
                    TelaPrincipalFrm.lblUsuario.setText(nomePerfil);
                    TelaPrincipalFrm.MenRelatorio.setEnabled(false);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuário e/ou senha inválido(s).");
                
            }
        } catch (HeadlessException | ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException | UnsupportedLookAndFeelException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
