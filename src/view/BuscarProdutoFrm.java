package view;

import conexoes.ConexoesMySql;
import controller.ItemProdutoCtrl;
import controller.OrdemServicoCtrl;
import dao.ItemProdutoDao;
import dao.ProdutoDao;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import model.Itens_Produto;
import model.Ordem_Servico;
import net.proteanit.sql.DbUtils;
import static view.OrdemServicoFrm.atualizaValorOs;
import static view.OrdemServicoFrm.tblProduto;

public class BuscarProdutoFrm extends javax.swing.JDialog {

    Connection conexao = ConexoesMySql.conectar();

    public BuscarProdutoFrm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);

    }

    public BuscarProdutoFrm(JButton btnOk) {
        this.btnOk = btnOk;
    }

    public BuscarProdutoFrm() {
        initComponents();
        // coloca uma figura na barra de título da janela
        URL url = this.getClass().getResource("/icones/iconLogoSc.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);

        this.setIconImage(imagemTitulo);
    }

    public void setar() {
        int linha = tblProd.getSelectedRow();
        String codigo = tblProd.getValueAt(linha, 0).toString();
        String descricao = tblProd.getValueAt(linha, 1).toString();
        String precounit = tblProd.getValueAt(linha, 2).toString();

        iptCodigoProd.setText(codigo);
        iptDescricao.setText(descricao);
        iptPrecoUnit.setText(precounit);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        iptCodigoProd = new javax.swing.JTextField();
        iptDescricao = new javax.swing.JTextField();
        iptQuantidade = new javax.swing.JTextField();
        btnOk = new javax.swing.JButton();
        lblCodigo = new javax.swing.JLabel();
        lblDescricao = new javax.swing.JLabel();
        lblQuantidade = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProd = new javax.swing.JTable();
        iptPrecoUnit = new javax.swing.JTextField();
        iptPrecoTotal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        iptCodigoOs = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisar Produto");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iptCodigoProd.setEditable(false);
        iptCodigoProd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        iptCodigoProd.setAlignmentX(0.0F);
        iptCodigoProd.setAlignmentY(0.0F);
        iptCodigoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iptCodigoProdActionPerformed(evt);
            }
        });
        getContentPane().add(iptCodigoProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 50, 30));

        iptDescricao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        iptDescricao.setAlignmentX(0.0F);
        iptDescricao.setAlignmentY(0.0F);
        iptDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                iptDescricaoKeyReleased(evt);
            }
        });
        getContentPane().add(iptDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 150, 30));

        iptQuantidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        iptQuantidade.setText("1");
        iptQuantidade.setAlignmentX(0.0F);
        iptQuantidade.setAlignmentY(0.0F);
        iptQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                iptQuantidadeKeyReleased(evt);
            }
        });
        getContentPane().add(iptQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 80, 30));

        btnOk.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconOk.png"))); // NOI18N
        btnOk.setText("OK");
        btnOk.setAlignmentY(0.0F);
        btnOk.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        getContentPane().add(btnOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 100, 30));

        lblCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCodigo.setText("Cód. Produto:");
        lblCodigo.setAlignmentY(0.0F);
        getContentPane().add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, 20));

        lblDescricao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDescricao.setText("Descrição:");
        lblDescricao.setAlignmentY(0.0F);
        getContentPane().add(lblDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 100, 20));

        lblQuantidade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblQuantidade.setText("Quantidade:");
        lblQuantidade.setAlignmentY(0.0F);
        getContentPane().add(lblQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 80, 20));

        jScrollPane2.setAlignmentX(0.0F);
        jScrollPane2.setAlignmentY(0.0F);
        jScrollPane2.setFocusCycleRoot(true);
        jScrollPane2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jScrollPane2.setMinimumSize(new java.awt.Dimension(23, 27));

        tblProd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Descrição", "Preço R$", "Saldo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProd.setAlignmentX(0.0F);
        tblProd.setAlignmentY(0.0F);
        tblProd.setEditingColumn(0);
        tblProd.setEditingRow(0);
        tblProd.setMaximumSize(new java.awt.Dimension(210, 230));
        tblProd.setMinimumSize(new java.awt.Dimension(45, 170));
        tblProd.setPreferredSize(new java.awt.Dimension(360, 300));
        tblProd.setRequestFocusEnabled(false);
        tblProd.setRowHeight(20);
        tblProd.getTableHeader().setReorderingAllowed(false);
        tblProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProdMouseClicked(evt);
            }
        });
        tblProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblProdKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblProd);
        if (tblProd.getColumnModel().getColumnCount() > 0) {
            tblProd.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblProd.getColumnModel().getColumn(0).setMaxWidth(50);
            tblProd.getColumnModel().getColumn(2).setPreferredWidth(90);
            tblProd.getColumnModel().getColumn(2).setMaxWidth(90);
            tblProd.getColumnModel().getColumn(3).setPreferredWidth(50);
            tblProd.getColumnModel().getColumn(3).setMaxWidth(50);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 400, 190));

        iptPrecoUnit.setEditable(false);
        iptPrecoUnit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        iptPrecoUnit.setAlignmentX(0.0F);
        iptPrecoUnit.setAlignmentY(0.0F);
        getContentPane().add(iptPrecoUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 100, 30));

        iptPrecoTotal.setEditable(false);
        iptPrecoTotal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        iptPrecoTotal.setAlignmentX(0.0F);
        iptPrecoTotal.setAlignmentY(0.0F);
        getContentPane().add(iptPrecoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 100, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Preço Unitário:");
        jLabel1.setAlignmentY(0.0F);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 100, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Preço Total:");
        jLabel2.setAlignmentY(0.0F);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 100, 20));

        iptCodigoOs.setEditable(false);
        iptCodigoOs.setAlignmentX(0.0F);
        iptCodigoOs.setAlignmentY(0.0F);
        getContentPane().add(iptCodigoOs, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 50, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nr. OS");
        jLabel3.setAlignmentY(0.0F);
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 50, 20));

        setSize(new java.awt.Dimension(500, 459));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void iptCodigoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iptCodigoProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iptCodigoProdActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        Itens_Produto item = new Itens_Produto();
        Ordem_Servico os = new Ordem_Servico();
        OrdemServicoCtrl osctrl = new OrdemServicoCtrl();
        item.setCodigo_os(Integer.parseInt(iptCodigoOs.getText()));
        item.setDescricao(iptDescricao.getText());
        item.setPreco_unit(iptPrecoUnit.getText());
        item.setPreco_total(iptPrecoTotal.getText());
        item.setCodigo_produto(Integer.parseInt(iptCodigoProd.getText()));
        item.setQuantidade(Integer.parseInt(iptQuantidade.getText()));
        try {
            ItemProdutoCtrl.addItemCtrl(item);
        } catch (SQLException ex) {
            Logger.getLogger(BuscarProdutoFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        ItemProdutoDao pd = new ItemProdutoDao();
        os.setCodigo_os(Integer.parseInt(iptCodigoOs.getText()));
        try {
            tblProduto.setModel(DbUtils.resultSetToTableModel(pd.buscarItens(os)));

        } catch (SQLException ex) {
            Logger.getLogger(BuscarProdutoFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            pd.buscarValorTotalItens(os);
            OrdemServicoFrm.alterarOs();
        } catch (SQLException ex) {
            Logger.getLogger(OrdemServicoFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        //atualizaValorOs();
    }//GEN-LAST:event_btnOkActionPerformed

    private void tblProdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblProdKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblProdKeyReleased

    private void iptDescricaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iptDescricaoKeyReleased
        String descricao = iptDescricao.getText();
        ProdutoDao pd = new ProdutoDao();

        try {
            tblProd.setModel(DbUtils.resultSetToTableModel(pd.buscarTodosProdutosDao(descricao)));
        } catch (SQLException ex) {
            Logger.getLogger(BuscarProdutoFrm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_iptDescricaoKeyReleased

    private void tblProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProdMouseClicked
        setar();
    }//GEN-LAST:event_tblProdMouseClicked

    private void iptQuantidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iptQuantidadeKeyReleased
        calcularTotal();
    }//GEN-LAST:event_iptQuantidadeKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnOk;
    private javax.swing.ButtonGroup buttonGroup1;
    public static javax.swing.JTextField iptCodigoOs;
    public static javax.swing.JTextField iptCodigoProd;
    public static javax.swing.JTextField iptDescricao;
    public static javax.swing.JTextField iptPrecoTotal;
    public static javax.swing.JTextField iptPrecoUnit;
    public static javax.swing.JTextField iptQuantidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblQuantidade;
    public static javax.swing.JTable tblProd;
    // End of variables declaration//GEN-END:variables
public static void calcularTotal() {
        Double valorUn = Double.parseDouble(iptPrecoUnit.getText());
        Double qtde = Double.parseDouble(iptQuantidade.getText());
        if (valorUn != 0 || valorUn != null) {
            Double valor = qtde * valorUn;
            iptPrecoTotal.setText(Double.toString(valor));
        }
    }
}
