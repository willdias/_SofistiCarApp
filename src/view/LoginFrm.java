package view;

import conexoes.ConexoesMySql;
import controller.ControleLookAndFeel;
import dao.LoginDao;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.UnsupportedLookAndFeelException;

public class LoginFrm extends javax.swing.JFrame {

    //instacia a classe conexao mysql e conectar
    ConexoesMySql conexao = null;

    public LoginFrm() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        initComponents();
        ControleLookAndFeel.mudarLookAndFeel();

        //A linha abaixo muda o botao padrao da tela para podermos dar enter.
        this.getRootPane().setDefaultButton(btnEntrar);

        conexao = new ConexoesMySql();
        conexao.base();

        // coloca uma figura na barra de título da janela
        URL url = this.getClass().getResource("/icones/iconLogoSc.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);

        this.setIconImage(imagemTitulo);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        pnLogin = new javax.swing.JPanel();
        btnSairLogin = new javax.swing.JButton();
        btnEntrar = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        iptLogin = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        iptSenha = new javax.swing.JPasswordField();
        lblStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(204, 204, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setModalExclusionType(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconSofisticarLogin.png"))); // NOI18N
        jLabel4.setAlignmentY(0.0F);
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel4.setDoubleBuffered(true);
        jLabel4.setPreferredSize(new java.awt.Dimension(500, 100));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 390, 320));

        pnLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSairLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSairLogin.setText("SAIR");
        btnSairLogin.setAlignmentY(0.0F);
        btnSairLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSairLogin.setMaximumSize(new java.awt.Dimension(73, 23));
        btnSairLogin.setMinimumSize(new java.awt.Dimension(73, 23));
        btnSairLogin.setPreferredSize(new java.awt.Dimension(63, 23));
        btnSairLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairLoginActionPerformed(evt);
            }
        });
        pnLogin.add(btnSairLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 220, 40));

        btnEntrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEntrar.setText("ENTRAR");
        btnEntrar.setAlignmentY(0.0F);
        btnEntrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        pnLogin.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 220, 40));

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUsuario.setText("Usuário:");
        pnLogin.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 220, 30));

        iptLogin.setAlignmentX(0.0F);
        iptLogin.setAlignmentY(0.0F);
        iptLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        iptLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iptLoginActionPerformed(evt);
            }
        });
        pnLogin.add(iptLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 220, 40));

        lblSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSenha.setText("Senha:");
        pnLogin.add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 220, 30));

        iptSenha.setAlignmentX(0.0F);
        iptSenha.setAlignmentY(0.0F);
        iptSenha.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnLogin.add(iptSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 220, 40));

        getContentPane().add(pnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 280, 330));

        lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconDbError.png"))); // NOI18N
        lblStatus.setAlignmentY(0.0F);
        lblStatus.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblStatusAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 40, 40));

        getAccessibleContext().setAccessibleParent(this);

        setSize(new java.awt.Dimension(735, 419));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void iptLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iptLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iptLoginActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        // esse botão chama o método logar
        try {
            LoginDao.logar(iptLogin.getText(), iptSenha.getText());
            limparCampos();
        } catch (Exception e) {
        }
        this.dispose();
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnSairLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairLoginActionPerformed
        //encerra o sistema
        System.exit(0);
    }//GEN-LAST:event_btnSairLoginActionPerformed

    private void lblStatusAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblStatusAncestorAdded

        if (!ConexoesMySql.bancoAtivo()) {
            lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconDbError.png")));
        } else {
            lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconDbOk.png")));
        }
    }//GEN-LAST:event_lblStatusAncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnSairLogin;
    public static javax.swing.JTextField iptLogin;
    public static javax.swing.JPasswordField iptSenha;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnLogin;
    // End of variables declaration//GEN-END:variables

    public void limparCampos() {
        iptLogin.setText("");
        iptSenha.setText("");
    }

}
