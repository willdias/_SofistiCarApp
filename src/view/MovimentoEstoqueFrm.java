package view;

import controller.ControleLookAndFeel;
import controller.MovimentacaoEstoqueCtrl;
import controller.ProdutoCtrl;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;
import model.Produto;

public class MovimentoEstoqueFrm extends javax.swing.JFrame {

    public MovimentoEstoqueFrm() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        initComponents();
        ControleLookAndFeel.mudarLookAndFeel();
         // coloca uma figura na barra de título da janela
        URL url = this.getClass().getResource("/icones/iconLogoSc.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);

        this.setIconImage(imagemTitulo);
        // as linhas abaixo substituem a label lblData pela data atual do sistema ao iniciar o form
        Date data = new Date();
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.DEFAULT);
        iptDataMovimento.setText(formatador.format(data));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gpEntSai = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        iptCodigoProduto = new javax.swing.JTextField();
        LblProduto = new javax.swing.JLabel();
        LblDataSaída = new javax.swing.JLabel();
        LblCodigoProduto = new javax.swing.JLabel();
        iptProduto = new javax.swing.JTextField();
        LblEstoqueAtual = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        iptEstoqueAtual = new javax.swing.JTextField();
        rdEntrada = new javax.swing.JRadioButton();
        btnConsultar1 = new javax.swing.JButton();
        LblQuantidadeMovimento = new javax.swing.JLabel();
        iptQtdeMovimento = new javax.swing.JTextField();
        btnBuscarProduto = new javax.swing.JButton();
        iptDataMovimento = new javax.swing.JFormattedTextField();
        rdSaida = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Movimento de Estoque");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iptCodigoProduto.setAlignmentY(0.0F);
        jPanel1.add(iptCodigoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, 30));

        LblProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblProduto.setText("Produto:");
        LblProduto.setAlignmentY(0.0F);
        jPanel1.add(LblProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 120, 20));

        LblDataSaída.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblDataSaída.setText("Data Movimento:");
        LblDataSaída.setAlignmentY(0.0F);
        jPanel1.add(LblDataSaída, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 110, 20));

        LblCodigoProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblCodigoProduto.setText("Código Produto:");
        LblCodigoProduto.setAlignmentY(0.0F);
        jPanel1.add(LblCodigoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, 18));

        iptProduto.setAlignmentY(0.0F);
        iptProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iptProdutoActionPerformed(evt);
            }
        });
        jPanel1.add(iptProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 240, 30));

        LblEstoqueAtual.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblEstoqueAtual.setText("Estoque Atual:");
        LblEstoqueAtual.setAlignmentY(0.0F);
        jPanel1.add(LblEstoqueAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 90, 20));

        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconOk.png"))); // NOI18N
        btnSalvar.setText("SALVAR");
        btnSalvar.setAlignmentY(0.0F);
        btnSalvar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalvar.setMaximumSize(new java.awt.Dimension(0, 0));
        btnSalvar.setMinimumSize(new java.awt.Dimension(0, 0));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 120, 30));

        btnSair.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconSairPeq.png"))); // NOI18N
        btnSair.setText("SAIR");
        btnSair.setAlignmentY(0.0F);
        btnSair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSair.setMaximumSize(new java.awt.Dimension(0, 0));
        btnSair.setMinimumSize(new java.awt.Dimension(0, 0));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jPanel1.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 120, 30));

        iptEstoqueAtual.setAlignmentX(0.0F);
        iptEstoqueAtual.setAlignmentY(0.0F);
        iptEstoqueAtual.setEnabled(false);
        jPanel1.add(iptEstoqueAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 100, 30));

        gpEntSai.add(rdEntrada);
        rdEntrada.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdEntrada.setSelected(true);
        rdEntrada.setText("ENTRADA");
        jPanel1.add(rdEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        btnConsultar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnConsultar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconLupaPeq.png"))); // NOI18N
        btnConsultar1.setText("CONSULTAR");
        btnConsultar1.setAlignmentY(0.0F);
        btnConsultar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConsultar1.setMaximumSize(new java.awt.Dimension(0, 0));
        btnConsultar1.setMinimumSize(new java.awt.Dimension(0, 0));
        btnConsultar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 140, 30));

        LblQuantidadeMovimento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblQuantidadeMovimento.setText("Quantidade:");
        LblQuantidadeMovimento.setAlignmentY(0.0F);
        jPanel1.add(LblQuantidadeMovimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 90, 20));

        iptQtdeMovimento.setAlignmentX(0.0F);
        iptQtdeMovimento.setAlignmentY(0.0F);
        jPanel1.add(iptQtdeMovimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 100, 30));

        btnBuscarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconLupaPeq.png"))); // NOI18N
        btnBuscarProduto.setAlignmentY(0.0F);
        btnBuscarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProdutoActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 50, 30));

        try {
            iptDataMovimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        iptDataMovimento.setAlignmentX(0.0F);
        iptDataMovimento.setAlignmentY(0.0F);
        iptDataMovimento.setEnabled(false);
        jPanel1.add(iptDataMovimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 100, 30));

        gpEntSai.add(rdSaida);
        rdSaida.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdSaida.setText("SAÍDA");
        jPanel1.add(rdSaida, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 25, 460, 180));

        setSize(new java.awt.Dimension(529, 272));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void iptProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iptProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iptProdutoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Produto produto = new Produto();
        int codigo = Integer.parseInt(iptCodigoProduto.getText());
        int quantidade = Integer.parseInt(iptQtdeMovimento.getText());
        int movimento;
        if (rdEntrada.isSelected()) {
            movimento = 1;

        } else if (rdSaida.isSelected()) {
            movimento = 2;
        }
        
        //O código abaixo registra a movimentação de estoque
        try {
            MovimentacaoEstoqueCtrl.incluirEstoqueCtrl();
        } catch (SQLException ex) {
            Logger.getLogger(MovimentoEstoqueFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        //limparCampos();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        int sair = javax.swing.JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair? ", "Atenção", javax.swing.JOptionPane.YES_NO_OPTION);
        TelaPrincipalFrm principal = null;
        try {
            principal = new TelaPrincipalFrm(); // instancia a tela principal
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TelaPrincipalFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnConsultar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultar1ActionPerformed

    private void btnBuscarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProdutoActionPerformed
        Produto produto = new Produto();
        produto.setCodigo_produto(Integer.parseInt(iptCodigoProduto.getText()));
        try {
            ProdutoCtrl.buscarProdutoCtrl(produto);
        } catch (SQLException ex) {
            Logger.getLogger(MovimentoEstoqueFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        iptProduto.setText(produto.getDescricao_produto());
        iptCodigoProduto.setText(Integer.toString(produto.getCodigo_produto()));
    }//GEN-LAST:event_btnBuscarProdutoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblCodigoProduto;
    private javax.swing.JLabel LblDataSaída;
    private javax.swing.JLabel LblEstoqueAtual;
    private javax.swing.JLabel LblProduto;
    private javax.swing.JLabel LblQuantidadeMovimento;
    private javax.swing.JButton btnBuscarProduto;
    private javax.swing.JButton btnConsultar1;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.ButtonGroup gpEntSai;
    public static javax.swing.JTextField iptCodigoProduto;
    public static javax.swing.JFormattedTextField iptDataMovimento;
    public static javax.swing.JTextField iptEstoqueAtual;
    public static javax.swing.JTextField iptProduto;
    public static javax.swing.JTextField iptQtdeMovimento;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JRadioButton rdEntrada;
    public static javax.swing.JRadioButton rdSaida;
    // End of variables declaration//GEN-END:variables
}
