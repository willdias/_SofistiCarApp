package model;

import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import view.UsuarioFrm;

public class Usuario{

    private int codigo_usuario;
    private String login_usuario;
    private String senha_usuario;
    private int id_funcionario_usuario;
    private int id_nivel_acesso;
    private int id_status_usuario;
    
    public Usuario() {
        
    }

    public Usuario(int codigo_usuario, String login_usuario, String senha_usuario, int id_funcionario_usuario, int id_nivel_acesso, int id_status_usuario) {
        this.codigo_usuario = codigo_usuario;
        this.login_usuario = login_usuario;
        this.senha_usuario = senha_usuario;
        this.id_funcionario_usuario = id_funcionario_usuario;
        this.id_nivel_acesso = id_nivel_acesso;
        this.id_status_usuario = id_status_usuario;
    }

    public int getCodigo_usuario() {
        return codigo_usuario;
    }

    public void setCodigo_usuario(int codigo_usuario) {
        this.codigo_usuario = codigo_usuario;
    }

    public String getLogin_usuario() {
        return login_usuario;
    }

    public void setLogin_usuario(String login_usuario) {
        this.login_usuario = login_usuario;
    }

    public String getSenha_usuario() {
        return senha_usuario;
    }

    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }

    public int getId_funcionario_usuario() {
        return id_funcionario_usuario;
    }

    public void setId_funcionario_usuario(int id_funcionario_usuario) {
        this.id_funcionario_usuario = id_funcionario_usuario;
    }

    public int getId_nivel_acesso() {
        return id_nivel_acesso;
    }

    public void setId_nivel_acesso(int id_nivel_acesso) {
        this.id_nivel_acesso = id_nivel_acesso;
    }

    public int getId_status_usuario() {
        return id_status_usuario;
    }

    public void setId_status_usuario(int id_status_usuario) {
        this.id_status_usuario = id_status_usuario;
    }

    public String getTextCodigo(JTextField iptCodigo) {
        return iptCodigo.getText().trim();
    }
    
    public String getTxtLogin(JTextField iptLogin) {
        return iptLogin.getText().trim();
    }
    
    public String getTxtSenha(JPasswordField iptSenha) {
        return iptSenha.getText().trim();
    }
    
    public String getComboCodFunc(JComboBox<String> cbbtIdFuncionario) {
        return cbbtIdFuncionario.getSelectedItem().toString();
    }
    
    public String getComboPerfil(JComboBox<String> cbbPerfilUsuario) {
        return cbbPerfilUsuario.getSelectedItem().toString();
    }
    
    public Usuario capturarUsuario(Usuario usuario) {
        usuario.setCodigo_usuario(Integer.parseInt(getTextCodigo(UsuarioFrm.iptCodigo)));
        usuario.setLogin_usuario(getTxtLogin(UsuarioFrm.iptLogin));
        usuario.setSenha_usuario(getTxtSenha(UsuarioFrm.iptSenha));
        usuario.setId_funcionario_usuario(Integer.parseInt(getComboCodFunc(UsuarioFrm.cbbIdFuncionario)));
        usuario.setId_nivel_acesso(Integer.parseInt(getComboPerfil(UsuarioFrm.cbbPerfil)));        
        return usuario;
    }
}