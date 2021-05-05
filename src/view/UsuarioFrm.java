package view;

import controller.ControleLookAndFeel;
import controller.UsuarioCtrl;
import dao.UsuarioDao;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Usuario;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

public class UsuarioFrm extends javax.swing.JFrame {

    public UsuarioFrm() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        initComponents();
        ControleLookAndFeel.mudarLookAndFeel();
        // coloca uma figura na barra de título da janela
        URL url = this.getClass().getResource("/icones/iconLogoSc.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);

        this.setIconImage(imagemTitulo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        iptSenha = new javax.swing.JPasswordField();
        lblPerfil = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        cbbPerfil = new javax.swing.JComboBox<>();
        lblNomeFuncionario = new javax.swing.JLabel();
        iptLogin = new javax.swing.JTextField();
        cbbIdFuncionario = new javax.swing.JComboBox<>();
        lblSenha = new javax.swing.JLabel();
        iptCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnDesativar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Usuário");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iptSenha.setAlignmentX(0.0F);
        iptSenha.setAlignmentY(0.0F);
        jPanel1.add(iptSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 120, 30));

        lblPerfil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPerfil.setText("Nível Acesso:");
        jPanel1.add(lblPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 134, 20));

        lblLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLogin.setText("Login:");
        jPanel1.add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 134, 20));

        cbbPerfil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbbPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuário", "Administrador" }));
        cbbPerfil.setAlignmentX(0.0F);
        cbbPerfil.setAlignmentY(0.0F);
        cbbPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbPerfilActionPerformed(evt);
            }
        });
        jPanel1.add(cbbPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 160, 30));

        lblNomeFuncionario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNomeFuncionario.setText("Nome Funcionário:");
        jPanel1.add(lblNomeFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, 20));

        iptLogin.setAlignmentX(0.0F);
        iptLogin.setAlignmentY(0.0F);
        iptLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iptLoginActionPerformed(evt);
            }
        });
        jPanel1.add(iptLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 120, 30));

        cbbIdFuncionario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbbIdFuncionario.setAlignmentX(0.0F);
        cbbIdFuncionario.setAlignmentY(0.0F);
        cbbIdFuncionario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbbIdFuncionarioFocusGained(evt);
            }
        });
        cbbIdFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbIdFuncionarioActionPerformed(evt);
            }
        });
        jPanel1.add(cbbIdFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 120, 30));

        lblSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSenha.setText("Senha:");
        jPanel1.add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 50, 20));

        iptCodigo.setAlignmentX(0.0F);
        iptCodigo.setAlignmentY(0.0F);
        jPanel1.add(iptCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 120, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Código:");
        jLabel1.setAlignmentY(0.0F);
        jLabel1.setDisplayedMnemonicIndex(0);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 50, 20));

        btnNovo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconAdd.png"))); // NOI18N
        btnNovo.setText("NOVO");
        btnNovo.setAlignmentY(0.0F);
        btnNovo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 120, 30));

        btnIncluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconOk.png"))); // NOI18N
        btnIncluir.setText("SALVAR");
        btnIncluir.setAlignmentY(0.0F);
        btnIncluir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });
        jPanel1.add(btnIncluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 120, 30));

        btnDesativar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDesativar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconDesativarPeq.png"))); // NOI18N
        btnDesativar.setText("DESATIVAR");
        btnDesativar.setAlignmentY(0.0F);
        btnDesativar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDesativar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDesativar.setIconTextGap(5);
        btnDesativar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnDesativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesativarActionPerformed(evt);
            }
        });
        jPanel1.add(btnDesativar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 120, 30));

        btnSair.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconSairPeq.png"))); // NOI18N
        btnSair.setText("SAIR");
        btnSair.setAlignmentY(0.0F);
        btnSair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSair.setIconTextGap(5);
        btnSair.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jPanel1.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 120, 30));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo" }));
        jComboBox1.setAlignmentX(0.0F);
        jComboBox1.setAlignmentY(0.0F);
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 120, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Status:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 100, 20));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconLupaPeq.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 40, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconLupaPeq.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 40, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbbPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbPerfilActionPerformed

    private void iptLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iptLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iptLoginActionPerformed

    private void cbbIdFuncionarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbbIdFuncionarioFocusGained
        UsuarioDao user = new UsuarioDao();
        try {
            user.listarCbb();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UsuarioFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbbIdFuncionarioFocusGained

    private void cbbIdFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbIdFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbIdFuncionarioActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        try {
            UsuarioCtrl.incluirUsuarioCtrl();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnDesativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesativarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDesativarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // exibe uma caixa de dialogo
        int sair = JOptionPane.showConfirmDialog(null, "Sair da Tela de Veículo? ", "Atenção", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            this.dispose();//fecha o formulário Veículo
        }
    }//GEN-LAST:event_btnSairActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDesativar;
    private javax.swing.JButton btnIncluir;
    public static javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSair;
    public static javax.swing.JComboBox<String> cbbIdFuncionario;
    public static javax.swing.JComboBox<String> cbbPerfil;
    public static javax.swing.JTextField iptCodigo;
    public static javax.swing.JTextField iptLogin;
    public static javax.swing.JPasswordField iptSenha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblNomeFuncionario;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblSenha;
    // End of variables declaration//GEN-END:variables

    public static void limparCampos() {
        cbbIdFuncionario.setSelectedIndex(-1);
        iptLogin.setText("");
        iptSenha.setText("");
        cbbPerfil.setSelectedIndex(-1);

    }
}
