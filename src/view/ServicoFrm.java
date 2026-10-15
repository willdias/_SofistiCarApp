
package view;

import controller.ControleLookAndFeel;
import controller.ServicoCtrl;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;
import model.Servico;

public class ServicoFrm extends javax.swing.JFrame {

    public ServicoFrm() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
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
        iptCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnIncluir = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnDesativar = new javax.swing.JButton();
        cmbSair = new javax.swing.JButton();
        iptDescricao = new javax.swing.JTextField();
        cbbStatus = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        iptValor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Serviço");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iptCodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        iptCodigo.setAlignmentX(0.0F);
        iptCodigo.setAlignmentY(0.0F);
        jPanel1.add(iptCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 50, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Código:");
        jLabel1.setAlignmentY(0.0F);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 50, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Descrição:");
        jLabel2.setAlignmentY(0.0F);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 50, 100, 20));

        btnIncluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconAdd.png"))); // NOI18N
        btnIncluir.setText("Novo");
        btnIncluir.setAlignmentY(0.0F);
        btnIncluir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });
        jPanel1.add(btnIncluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 100, 30));

        btnConsultar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconLupaPeq.png"))); // NOI18N
        btnConsultar.setAlignmentY(0.0F);
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 30, 30));

        btnAlterar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconOk.png"))); // NOI18N
        btnAlterar.setText("Salvar");
        btnAlterar.setAlignmentY(0.0F);
        btnAlterar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 100, 30));

        btnDesativar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDesativar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconDesativarPeq.png"))); // NOI18N
        btnDesativar.setText("Desativar");
        btnDesativar.setAlignmentY(0.0F);
        btnDesativar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDesativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesativarActionPerformed(evt);
            }
        });
        jPanel1.add(btnDesativar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 100, 30));

        cmbSair.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconSairPeq.png"))); // NOI18N
        cmbSair.setText("Sair");
        cmbSair.setAlignmentY(0.0F);
        cmbSair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cmbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSairActionPerformed(evt);
            }
        });
        jPanel1.add(cmbSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 100, 30));

        iptDescricao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        iptDescricao.setAlignmentX(0.0F);
        iptDescricao.setAlignmentY(0.0F);
        iptDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iptDescricaoActionPerformed(evt);
            }
        });
        jPanel1.add(iptDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 70, 150, 30));

        cbbStatus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo" }));
        cbbStatus.setAlignmentX(0.0F);
        cbbStatus.setAlignmentY(0.0F);
        jPanel1.add(cbbStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 100, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Status:");
        jLabel3.setAlignmentY(0.0F);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 100, 20));
        jPanel1.add(iptValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 70, 100, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Valor:");
        jLabel4.setAlignmentY(0.0F);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 50, 100, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        try {
            Servico servico = new Servico();
            ServicoCtrl.incluirServicoCtrl();
            iptCodigo.setText(Integer.toString(servico.getCodigo_servico()));
        } catch (SQLException ex) {
            Logger.getLogger(ServicoFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnDesativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesativarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDesativarActionPerformed

    private void cmbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSairActionPerformed
        // exibe uma caixa de dialogo
        int sair = JOptionPane.showConfirmDialog(null, "Sair do Menu Ordem de Serviço? ", "Atenção", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            TelaPrincipalFrm principal = null;
            try {
                principal = new TelaPrincipalFrm(); // instancia a tela principal
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                Logger.getLogger(MenuOsFrm.class.getName()).log(Level.SEVERE, null, ex);
            }
            principal.setVisible(true); //chama a tela principal
            this.dispose();//fecha o formulário de login após logar
        }
    }//GEN-LAST:event_cmbSairActionPerformed

    private void iptDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iptDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iptDescricaoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnDesativar;
    private javax.swing.JButton btnIncluir;
    public static javax.swing.JComboBox<String> cbbStatus;
    private javax.swing.JButton cmbSair;
    public static javax.swing.JTextField iptCodigo;
    public static javax.swing.JTextField iptDescricao;
    public static javax.swing.JTextField iptValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
