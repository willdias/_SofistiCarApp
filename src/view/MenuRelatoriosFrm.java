
package view;

import controller.ControleLookAndFeel;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import static view.tabelaClientes.conexao;

public class MenuRelatoriosFrm extends javax.swing.JFrame {

    public MenuRelatoriosFrm() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        initComponents();
        ControleLookAndFeel.mudarLookAndFeel();
         // coloca uma figura na barra de título da janela
        URL url = this.getClass().getResource("/icones/iconLogoSc.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);

        this.setIconImage(imagemTitulo);    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnFuncionario = new javax.swing.JButton();
        btnCliente = new javax.swing.JButton();
        btnProduto = new javax.swing.JButton();
        btnServiços = new javax.swing.JButton();
        btnUsuario = new javax.swing.JButton();
        btnFornecedor = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnVeiculo = new javax.swing.JButton();
        btnMovEstoque = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatórios");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFuncionario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnFuncionario.setText("Funcionário");
        btnFuncionario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuncionarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 200, 50));

        btnCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCliente.setText("Cliente");
        btnCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 200, 50));

        btnProduto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnProduto.setText("Produto");
        btnProduto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutoActionPerformed(evt);
            }
        });
        jPanel1.add(btnProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 200, 50));

        btnServiços.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnServiços.setText("Serviços");
        btnServiços.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnServiços.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServiçosActionPerformed(evt);
            }
        });
        jPanel1.add(btnServiços, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 200, 50));

        btnUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUsuario.setText("Usuário");
        btnUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 200, 50));

        btnFornecedor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnFornecedor.setText("Fornecedor");
        btnFornecedor.setAlignmentY(0.0F);
        btnFornecedor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFornecedorActionPerformed(evt);
            }
        });
        jPanel1.add(btnFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 200, 50));

        btnSair.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconSairPeq.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.setAlignmentY(0.0F);
        btnSair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSair.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSair.setIconTextGap(5);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jPanel1.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 200, 50));

        btnVeiculo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVeiculo.setText("Veículo");
        btnVeiculo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVeiculoActionPerformed(evt);
            }
        });
        jPanel1.add(btnVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 200, 50));

        btnMovEstoque.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMovEstoque.setText("Movimento de Estoque");
        btnMovEstoque.setAlignmentY(0.0F);
        btnMovEstoque.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMovEstoque.setIconTextGap(5);
        btnMovEstoque.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnMovEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMovEstoqueActionPerformed(evt);
            }
        });
        jPanel1.add(btnMovEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 200, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setSize(new java.awt.Dimension(576, 479));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuncionarioActionPerformed
        try {
            JasperPrint print = JasperFillManager.fillReport("C:/Reports/relatoriofuncionario.jasper", null, conexao);
            JasperViewer.viewReport(print, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Deu Não " + e);
        }
    }//GEN-LAST:event_btnFuncionarioActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        RelClienteFrm rel = null;
        try {
            rel = new RelClienteFrm();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MenuRelatoriosFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        rel.setVisible(true);
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutoActionPerformed
        try {
            JasperPrint print = JasperFillManager.fillReport("C:/Reports/Produto.jasper", null, conexao);
            JasperViewer.viewReport(print, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Deu Não " + e);
        }
    }//GEN-LAST:event_btnProdutoActionPerformed

    private void btnServiçosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServiçosActionPerformed
        try {
            JasperPrint print = JasperFillManager.fillReport("C:/Reports/Servico.jasper", null, conexao);
            JasperViewer.viewReport(print, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Deu Não " + e);
        }
    }//GEN-LAST:event_btnServiçosActionPerformed

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        try {
            JasperPrint print = JasperFillManager.fillReport("C:/Reports/Usuario.jasper", null, conexao);
            JasperViewer.viewReport(print, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Deu Não " + e);
        }
    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void btnFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFornecedorActionPerformed
        try {
            JasperPrint print = JasperFillManager.fillReport("C:/Reports/fornecedor_juridico.jasper", null, conexao);
            JasperViewer.viewReport(print, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Deu Não " + e);
        }
    }//GEN-LAST:event_btnFornecedorActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVeiculoActionPerformed
        try {
            JasperPrint print = JasperFillManager.fillReport("C:/Reports/Veiculo.jasper", null, conexao);
            JasperViewer.viewReport(print, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao emitir relatório " + e);
        }
    }//GEN-LAST:event_btnVeiculoActionPerformed

    private void btnMovEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMovEstoqueActionPerformed
        RelMovEstoqueFrm rel = null;
        try {
            rel = new RelMovEstoqueFrm();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MenuRelatoriosFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        rel.setVisible(true);
    }//GEN-LAST:event_btnMovEstoqueActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnFornecedor;
    private javax.swing.JButton btnFuncionario;
    private javax.swing.JButton btnMovEstoque;
    private javax.swing.JButton btnProduto;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnServiços;
    private javax.swing.JButton btnUsuario;
    private javax.swing.JButton btnVeiculo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
