package view;

import controller.ControleLookAndFeel;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

public class MenuCadastroFrm extends javax.swing.JFrame {

    public MenuCadastroFrm() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
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

        pnCadastros = new javax.swing.JPanel();
        btnCadFornecedor = new javax.swing.JButton();
        btnCadProduto = new javax.swing.JButton();
        btnCadVeiculo = new javax.swing.JButton();
        btnCadUsuario = new javax.swing.JButton();
        btnCadServico = new javax.swing.JButton();
        btnCadFuncionário = new javax.swing.JButton();
        btnCadCliente = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastros");

        pnCadastros.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnCadastros.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnCadastros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCadFornecedor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCadFornecedor.setText("Fornecedor");
        btnCadFornecedor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCadFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadFornecedorActionPerformed(evt);
            }
        });
        pnCadastros.add(btnCadFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 250, 50));

        btnCadProduto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCadProduto.setText("Produto");
        btnCadProduto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCadProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadProdutoActionPerformed(evt);
            }
        });
        pnCadastros.add(btnCadProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 250, 50));

        btnCadVeiculo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCadVeiculo.setText("Veículo");
        btnCadVeiculo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCadVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadVeiculoActionPerformed(evt);
            }
        });
        pnCadastros.add(btnCadVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 250, 50));

        btnCadUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCadUsuario.setText("Usuário");
        btnCadUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadUsuarioActionPerformed(evt);
            }
        });
        pnCadastros.add(btnCadUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 250, 50));

        btnCadServico.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCadServico.setText("Serviço");
        btnCadServico.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCadServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadServicoActionPerformed(evt);
            }
        });
        pnCadastros.add(btnCadServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 250, 50));

        btnCadFuncionário.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCadFuncionário.setText("Funcionário");
        btnCadFuncionário.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCadFuncionário.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadFuncionárioActionPerformed(evt);
            }
        });
        pnCadastros.add(btnCadFuncionário, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 250, 50));

        btnCadCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCadCliente.setText("Cliente");
        btnCadCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadClienteActionPerformed(evt);
            }
        });
        pnCadastros.add(btnCadCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 250, 50));

        btnSair.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconSairPeq.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.setAlignmentY(0.0F);
        btnSair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSair.setIconTextGap(5);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        pnCadastros.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 250, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnCadastros, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnCadastros, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setSize(new java.awt.Dimension(666, 459));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadFornecedorActionPerformed
        FornecedorFrm fornecedor = null;
        try {
            fornecedor = new FornecedorFrm();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MenuCadastroFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        fornecedor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCadFornecedorActionPerformed

    private void btnCadProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadProdutoActionPerformed
        ProdutoFrm produto = null;
        try {
            produto = new ProdutoFrm();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MenuCadastroFrm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MenuCadastroFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        produto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCadProdutoActionPerformed

    private void btnCadVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadVeiculoActionPerformed
        VeiculoFrm veiculo = null;
        try {
            veiculo = new VeiculoFrm();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MenuCadastroFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        veiculo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCadVeiculoActionPerformed

    private void btnCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadUsuarioActionPerformed
        UsuarioFrm usuario = null;
        try {
            usuario = new UsuarioFrm();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MenuCadastroFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        usuario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCadUsuarioActionPerformed

    private void btnCadServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadServicoActionPerformed
        ServicoFrm servico = null;
        try {
            servico = new ServicoFrm();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MenuCadastroFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        servico.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCadServicoActionPerformed

    private void btnCadFuncionárioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadFuncionárioActionPerformed
        FuncionarioFrm funcionario = null;
        try {
            funcionario = new FuncionarioFrm();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MenuCadastroFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        funcionario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCadFuncionárioActionPerformed

    private void btnCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadClienteActionPerformed
        ClienteFrm cliente = null;
        try {
            cliente = new ClienteFrm();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MenuCadastroFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        cliente.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnCadClienteActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // exibe uma caixa de dialogo
        int sair = JOptionPane.showConfirmDialog(null, "Sair do Menu Cadastros? ", "Atenção", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            this.dispose();//fecha o formulário de login após logar
        }
    }//GEN-LAST:event_btnSairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadCliente;
    private javax.swing.JButton btnCadFornecedor;
    private javax.swing.JButton btnCadFuncionário;
    private javax.swing.JButton btnCadProduto;
    private javax.swing.JButton btnCadServico;
    private javax.swing.JButton btnCadUsuario;
    private javax.swing.JButton btnCadVeiculo;
    private javax.swing.JButton btnSair;
    public static javax.swing.JPanel pnCadastros;
    // End of variables declaration//GEN-END:variables
}
