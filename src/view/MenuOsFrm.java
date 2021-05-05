
package view;

import controller.ControleLookAndFeel;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

public class MenuOsFrm extends javax.swing.JFrame {

    public MenuOsFrm() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        initComponents();
        ControleLookAndFeel.mudarLookAndFeel();
         // coloca uma figura na barra de título da janela
        URL url = this.getClass().getResource("/icones/iconLogoSc.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);

        this.setIconImage(imagemTitulo);    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        btnAlterar = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();
        btnFinalizadas = new javax.swing.JButton();
        btnPendentes = new javax.swing.JButton();
        btnEmitir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnNova = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAlterar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 250, 50));

        btnFinalizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnFinalizar.setText("Finalizar OS em Aberto");
        btnFinalizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(btnFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 250, 50));

        btnFinalizadas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnFinalizadas.setText("OS Finalizadas");
        btnFinalizadas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(btnFinalizadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 250, 50));

        btnPendentes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPendentes.setText("OS Pendentes");
        btnPendentes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(btnPendentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 250, 50));

        btnEmitir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEmitir.setText("Emitir");
        btnEmitir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(btnEmitir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 250, 50));

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancelar.setText("Cancelar OS pendente");
        btnCancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 250, 50));

        btnNova.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNova.setText("Nova");
        btnNova.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNova.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaActionPerformed(evt);
            }
        });
        jPanel4.add(btnNova, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 250, 50));

        btnSair.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSair.setText("SAIR");
        btnSair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jPanel4.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 250, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("        Ordem de Serviço");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 170, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaActionPerformed
        OrdemServicoFrm ordemServico = null;
        try {
            ordemServico = new OrdemServicoFrm();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MenuOsFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        ordemServico.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnNovaActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // exibe uma caixa de dialogo
        int sair = JOptionPane.showConfirmDialog(null, "Sair do Menu Ordem de Serviço? ", "Atenção", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            this.dispose();//fecha o menu de OS
        }
    }//GEN-LAST:event_btnSairActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEmitir;
    private javax.swing.JButton btnFinalizadas;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnNova;
    private javax.swing.JButton btnPendentes;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
