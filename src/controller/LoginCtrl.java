package controller;

import dao.LoginDao;
import javax.swing.UnsupportedLookAndFeelException;
import view.LoginFrm;
import view.TelaPrincipalFrm;

public class LoginCtrl {

    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        LoginFrm login = new LoginFrm();
        login.setVisible(true);
        
    }
}
