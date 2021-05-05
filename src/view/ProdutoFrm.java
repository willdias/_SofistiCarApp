package view;

import controller.ControleLookAndFeel;
import controller.FornecedorCtrl;
import controller.ProdutoCtrl;
import dao.ProdutoDao;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Fornecedor;
import model.Produto;

public class ProdutoFrm extends javax.swing.JFrame {

    public ProdutoFrm() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException, SQLException {
        initComponents();
        ControleLookAndFeel.mudarLookAndFeel();
        // coloca uma figura na barra de título da janela
        URL url = this.getClass().getResource("/icones/iconLogoSc.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);

        this.setIconImage(imagemTitulo);
        
        DefaultTableModel modelo = (DefaultTableModel) jTbProdutos.getModel();
        jTbProdutos.setRowSorter(new TableRowSorter(modelo));

        readJTable();
    }
    
    public void readJTable() throws SQLException {
        
        DefaultTableModel modelo = (DefaultTableModel) jTbProdutos.getModel();
        modelo.setNumRows(0);
        ProdutoDao produtoDao = new ProdutoDao();

        for (Produto p : produtoDao.read()) {

            modelo.addRow(new Object[]{
                p.getCodigo_produto(),
                p.getTipo_produto(),
                p.getDescricao_produto(),
                p.getAplicacao_produto(),
                p.getValor_compra_produto(),
                p.getValor_venda_produto()
            });

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnProduto = new javax.swing.JPanel();
        lblStatus = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        iptCodigo = new javax.swing.JTextField();
        cbbStatus = new javax.swing.JComboBox<>();
        lblTipo = new javax.swing.JLabel();
        lblPrecoCompra = new javax.swing.JLabel();
        lblPrecoVenda = new javax.swing.JLabel();
        cbbTipo = new javax.swing.JComboBox<>();
        iptValorCompra = new javax.swing.JTextField();
        iptValorVenda = new javax.swing.JTextField();
        lblDescricao = new javax.swing.JLabel();
        lblAplicacao = new javax.swing.JLabel();
        iptDescricaoProd = new javax.swing.JTextField();
        iptAplicacao = new javax.swing.JTextField();
        Fabricante = new javax.swing.JLabel();
        iptFabricante = new javax.swing.JTextField();
        lblFornecedor = new javax.swing.JLabel();
        cbbFornecedor = new javax.swing.JComboBox<>();
        iptFornecedor = new javax.swing.JTextField();
        btnIncluir = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnDesativar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTbProdutos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Produto");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnProduto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnProduto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblStatus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblStatus.setText("Status:");
        lblStatus.setAlignmentY(0.0F);
        pnProduto.add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Código:");
        jLabel2.setAlignmentY(0.0F);
        pnProduto.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 50, 20));

        iptCodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        iptCodigo.setAlignmentX(0.0F);
        iptCodigo.setAlignmentY(0.0F);
        iptCodigo.setNextFocusableComponent(iptDescricaoProd);
        pnProduto.add(iptCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 50, 30));

        cbbStatus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo" }));
        cbbStatus.setAlignmentX(0.0F);
        cbbStatus.setAlignmentY(0.0F);
        cbbStatus.setNextFocusableComponent(iptCodigo);
        pnProduto.add(cbbStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 70, 30));

        lblTipo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTipo.setText("Tipo:");
        lblTipo.setAlignmentY(0.0F);
        pnProduto.add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 40, 20));

        lblPrecoCompra.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPrecoCompra.setText("R$ Compra:");
        lblPrecoCompra.setAlignmentY(0.0F);
        pnProduto.add(lblPrecoCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 70, 20));

        lblPrecoVenda.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPrecoVenda.setText("R$ Venda:");
        lblPrecoVenda.setAlignmentY(0.0F);
        pnProduto.add(lblPrecoVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 70, 20));

        cbbTipo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Peça Motor", "Peça Carroceria", "Acessórios", "Lubrificantes" }));
        cbbTipo.setAlignmentX(0.0F);
        cbbTipo.setAlignmentY(0.0F);
        pnProduto.add(cbbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 110, 30));

        iptValorCompra.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        iptValorCompra.setAlignmentY(0.0F);
        pnProduto.add(iptValorCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 60, 30));

        iptValorVenda.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        iptValorVenda.setAlignmentY(0.0F);
        pnProduto.add(iptValorVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 60, 30));

        lblDescricao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDescricao.setText("Descrição:");
        lblDescricao.setAlignmentY(0.0F);
        pnProduto.add(lblDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 100, 20));

        lblAplicacao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblAplicacao.setText("Aplicação:");
        lblAplicacao.setAlignmentY(0.0F);
        pnProduto.add(lblAplicacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 100, 20));

        iptDescricaoProd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        iptDescricaoProd.setAlignmentX(0.0F);
        iptDescricaoProd.setAlignmentY(0.0F);
        iptDescricaoProd.setAutoscrolls(false);
        iptDescricaoProd.setNextFocusableComponent(btnConsultar);
        pnProduto.add(iptDescricaoProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 200, 30));

        iptAplicacao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        iptAplicacao.setAlignmentX(0.0F);
        iptAplicacao.setAlignmentY(0.0F);
        pnProduto.add(iptAplicacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 250, 30));

        Fabricante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Fabricante.setText("Fabricante:");
        Fabricante.setAlignmentY(0.0F);
        pnProduto.add(Fabricante, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 70, 20));

        iptFabricante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        iptFabricante.setAlignmentX(0.0F);
        iptFabricante.setAlignmentY(0.0F);
        pnProduto.add(iptFabricante, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 80, 30));

        lblFornecedor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblFornecedor.setText("Fornecedor:");
        lblFornecedor.setAlignmentY(0.0F);
        pnProduto.add(lblFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 70, 20));

        cbbFornecedor.setAlignmentX(0.0F);
        cbbFornecedor.setAlignmentY(0.0F);
        cbbFornecedor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbbFornecedorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cbbFornecedorFocusLost(evt);
            }
        });
        pnProduto.add(cbbFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 100, 30));

        iptFornecedor.setEditable(false);
        iptFornecedor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        iptFornecedor.setAlignmentX(0.0F);
        iptFornecedor.setAlignmentY(0.0F);
        iptFornecedor.setEnabled(false);
        iptFornecedor.setFocusable(false);
        iptFornecedor.setOpaque(false);
        iptFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iptFornecedorActionPerformed(evt);
            }
        });
        iptFornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                iptFornecedorKeyReleased(evt);
            }
        });
        pnProduto.add(iptFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 40, 30));

        btnIncluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconAdd.png"))); // NOI18N
        btnIncluir.setText("NOVO");
        btnIncluir.setAlignmentY(0.0F);
        btnIncluir.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnIncluir.setMaximumSize(new java.awt.Dimension(0, 0));
        btnIncluir.setMinimumSize(new java.awt.Dimension(0, 0));
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });
        pnProduto.add(btnIncluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 150, 30));

        btnConsultar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconLupaPeq.png"))); // NOI18N
        btnConsultar.setToolTipText("");
        btnConsultar.setAlignmentY(0.0F);
        btnConsultar.setMaximumSize(new java.awt.Dimension(0, 0));
        btnConsultar.setMinimumSize(new java.awt.Dimension(0, 0));
        btnConsultar.setNextFocusableComponent(iptValorCompra);
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        pnProduto.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 30, 30));

        btnDesativar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDesativar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconDesativarPeq.png"))); // NOI18N
        btnDesativar.setText("DESATIVAR");
        btnDesativar.setAlignmentY(0.0F);
        btnDesativar.setDisplayedMnemonicIndex(0);
        btnDesativar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnDesativar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnDesativar.setMaximumSize(new java.awt.Dimension(0, 0));
        btnDesativar.setMinimumSize(new java.awt.Dimension(0, 0));
        btnDesativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesativarActionPerformed(evt);
            }
        });
        pnProduto.add(btnDesativar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 150, 30));

        btnSair.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconSairPeq.png"))); // NOI18N
        btnSair.setText("SAIR");
        btnSair.setAlignmentY(0.0F);
        btnSair.setMaximumSize(new java.awt.Dimension(0, 0));
        btnSair.setMinimumSize(new java.awt.Dimension(0, 0));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        pnProduto.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 150, 30));

        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconOk.png"))); // NOI18N
        btnSalvar.setText("SALVAR");
        pnProduto.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 150, 30));

        getContentPane().add(pnProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 580, 210));

        jTbProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "cod", "tipo", "descricao", "aplicação", "vlrcompra", "vlrvenda", "marca", "dt cadastro", "status"
            }
        ));
        jTbProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTbProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTbProdutos);
        if (jTbProdutos.getColumnModel().getColumnCount() > 0) {
            jTbProdutos.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTbProdutos.getColumnModel().getColumn(1).setPreferredWidth(70);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 750, 250));

        setSize(new java.awt.Dimension(792, 542));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbbFornecedorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbbFornecedorFocusGained
        try {
            FornecedorCtrl.buscarFornecedorProdCtrl();
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbbFornecedorFocusGained

    private void cbbFornecedorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbbFornecedorFocusLost
        String var = (String) cbbFornecedor.getSelectedItem();
        if (var != null) {
            String frase = var;

            String array[] = new String[3];
            array = frase.split("-");

            String s = var;
            String[] parts = s.split("-"); //retorna um array com 2 partes
            String firstPart = parts[0];
            iptFornecedor.setText(firstPart);
        }
    }//GEN-LAST:event_cbbFornecedorFocusLost

    private void iptFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iptFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iptFornecedorActionPerformed

    private void iptFornecedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iptFornecedorKeyReleased
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNome(iptFornecedor.getText());
        fornecedor.setRazaoSocial(iptFornecedor.getText());
        try {
            FornecedorCtrl.buscarFornecedorCtrl();
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_iptFornecedorKeyReleased

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        try {
            ProdutoCtrl.incluirProdutoCtrl();
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            readJTable();
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        Produto produto = new Produto();
        produto.setCodigo_produto(Integer.parseInt(iptCodigo.getText()));
        try {
            ProdutoCtrl.buscarProdutoCtrl(produto);

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        iptDescricaoProd.setText(produto.getDescricao_produto());
        iptCodigo.setText(Integer.toString(produto.getCodigo_produto()));
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnDesativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesativarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDesativarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // exibe uma caixa de dialogo
        // exibe uma caixa de dialogo
        int sair = JOptionPane.showConfirmDialog(null, "Sair da Tela de Produto? ", "Atenção", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            this.dispose();//fecha o formulário de login após logar
        }
    }//GEN-LAST:event_btnSairActionPerformed

    private void jTbProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTbProdutosMouseClicked
        if (jTbProdutos.getSelectedRow() != -1) {

            iptCodigo.setText(jTbProdutos.getValueAt(jTbProdutos.getSelectedRow(), 0).toString());
            cbbTipo.setSelectedItem(jTbProdutos.getValueAt(jTbProdutos.getSelectedRow(), 1).toString());
            iptDescricaoProd.setText(jTbProdutos.getValueAt(jTbProdutos.getSelectedRow(), 2).toString());
            iptAplicacao.setText(jTbProdutos.getValueAt(jTbProdutos.getSelectedRow(), 3).toString());
            //iptFabricante.setText(jTbProdutos.getValueAt(jTbProdutos.getSelectedRow(), 4).toString());
            //iptFornecedor.setText(jTbProdutos.getValueAt(jTbProdutos.getSelectedRow(), 5).toString());
            iptValorCompra.setText(jTbProdutos.getValueAt(jTbProdutos.getSelectedRow(), 4).toString());
            iptValorVenda.setText(jTbProdutos.getValueAt(jTbProdutos.getSelectedRow(), 5).toString());
            iptFabricante.setText(jTbProdutos.getValueAt(jTbProdutos.getSelectedRow(), 6).toString());
        }
    }//GEN-LAST:event_jTbProdutosMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fabricante;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnDesativar;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    public static javax.swing.JComboBox<String> cbbFornecedor;
    public static javax.swing.JComboBox<String> cbbStatus;
    public static javax.swing.JComboBox<String> cbbTipo;
    public static javax.swing.JTextField iptAplicacao;
    public static javax.swing.JTextField iptCodigo;
    public static javax.swing.JTextField iptDescricaoProd;
    public static javax.swing.JTextField iptFabricante;
    public static javax.swing.JTextField iptFornecedor;
    public static javax.swing.JTextField iptValorCompra;
    public static javax.swing.JTextField iptValorVenda;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTbProdutos;
    private javax.swing.JLabel lblAplicacao;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblFornecedor;
    private javax.swing.JLabel lblPrecoCompra;
    private javax.swing.JLabel lblPrecoVenda;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JPanel pnProduto;
    // End of variables declaration//GEN-END:variables

    public static void limparCampos() {
        iptCodigo.setText("");
        iptValorCompra.setText("");
        iptValorVenda.setText("");
        iptDescricaoProd.setText("");
        iptAplicacao.setText("");
        iptFabricante.setText("");
        iptFornecedor.setText("");
        cbbFornecedor.setSelectedItem(-1);
    }
}
