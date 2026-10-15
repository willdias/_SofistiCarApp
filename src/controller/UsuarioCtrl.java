package controller;

import dao.UsuarioDao;
import java.sql.SQLException;
import model.Usuario;
import static view.UsuarioFrm.limparCampos;

public class UsuarioCtrl {

    public UsuarioCtrl() {

    }

    public static Usuario incluirUsuarioCtrl() throws SQLException {
        Usuario usuario = new Usuario();
        UsuarioDao usu = new UsuarioDao();
        if (usu.addUsuario(usuario.capturarUsuario(usuario))) {
            limparCampos();
        }
        return usuario;
    }

    public static Usuario alterarUsuarioCtrl() throws SQLException {
        Usuario Usuario = new Usuario();
        if (UsuarioDao.updateUsuario(Usuario.capturarUsuario(Usuario))) {
            limparCampos();
        }
        return Usuario;
    }

    public static Usuario buscarUsuarioCtrl(Usuario Usuario) throws SQLException {
        UsuarioDao usuario = new UsuarioDao();
        return Usuario;

    }
}
