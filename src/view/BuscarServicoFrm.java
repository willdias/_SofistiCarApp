package view;

import conexoes.ConexoesMySql;
import controller.ItemServicoCtrl;
import controller.OrdemServicoCtrl;
import dao.ItemServicoDao;
import dao.ServicoDao;
import model.Itens_Servico;
import model.Ordem_Servico;
import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import static view.OrdemServicoFrm.atualizaValorOs;
import static view.OrdemServicoFrm.tblServico;

public class BuscarServicoFrm extends javax.swing.JDialog {

    Connection conexao = ConexoesMySql.base();
    //String dataInicial = null;
    //String dataFinal = null;

    public BuscarServicoFrm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);

    }

    public BuscarServicoFrm(JButton btnOk) {
        this.btnOk = btnOk;
    }

    BuscarServicoFrm() {
        initComponents();
        // coloca uma figura na barra de título da janela
        URL url = this.getClass().getResource("/icones/iconLogoSc.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);

        this.setIconImage(imagemTitulo);
    }

    public void setar() {
        int linha = tblServ.getSelectedRow();
        String codigo = tblServ.getValueAt(linha, 0).toString();
        String descricao = tblServ.getValueAt(linha, 1).toString();
        String precounit = tblServ.getValueAt(linha, 2).toString();

        iptCodigo.setText(codigo);
        iptDescricao.setText(descricao);
        iptPrecoUnit.setText(precounit);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        iptCodigo = new javax.swing.JTextField();
        iptDescricao = new javax.swing.JTextField();
        iptQuantidade = new javax.swing.JTextField();
        btnOk = new javax.swing.JButton();
        lblCodigo = new javax.swing.JLabel();
        lblDescricao = new javax.swing.JLabel();
        lblQuantidade = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblServ = new javax.swing.JTable();
        iptPrecoUnit = new javax.swing.JTextField();
        iptPrecoTotal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        iptCodigoOs = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisar Serviço");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iptCodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        iptCodigo.setAlignmentX(0.0F);
        iptCodigo.setAlignmentY(0.0F);
        iptCodigo.setEnabled(false);
        iptCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iptCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(iptCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 50, 30));

        iptDescricao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        iptDescricao.setAlignmentX(0.0F);
        iptDescricao.setAlignmentY(0.0F);
        iptDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iptDescricaoActionPerformed(evt);
            }
        });
        iptDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                iptDescricaoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                try {
					iptDescricaoKeyReleased(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        getContentPane().add(iptDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 150, 30));

        iptQuantidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
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
                try {
					btnOkActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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

        tblServ.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblServ.setModel(new javax.swing.table.DefaultTableModel(
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
        tblServ.setAlignmentX(0.0F);
        tblServ.setAlignmentY(0.0F);
        tblServ.setEditingColumn(0);
        tblServ.setEditingRow(0);
        tblServ.setMaximumSize(new java.awt.Dimension(210, 230));
        tblServ.setMinimumSize(new java.awt.Dimension(45, 170));
        tblServ.setPreferredSize(new java.awt.Dimension(360, 300));
        tblServ.setRequestFocusEnabled(false);
        tblServ.setRowHeight(20);
        tblServ.getTableHeader().setReorderingAllowed(false);
        tblServ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblServMouseClicked(evt);
            }
        });
        tblServ.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblServKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblServ);
        if (tblServ.getColumnModel().getColumnCount() > 0) {
            tblServ.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblServ.getColumnModel().getColumn(0).setMaxWidth(50);
            tblServ.getColumnModel().getColumn(2).setPreferredWidth(90);
            tblServ.getColumnModel().getColumn(2).setMaxWidth(90);
            tblServ.getColumnModel().getColumn(3).setPreferredWidth(50);
            tblServ.getColumnModel().getColumn(3).setMaxWidth(50);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 400, 190));

        iptPrecoUnit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        iptPrecoUnit.setAlignmentX(0.0F);
        iptPrecoUnit.setAlignmentY(0.0F);
        getContentPane().add(iptPrecoUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 100, 30));

        iptPrecoTotal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        iptPrecoTotal.setAlignmentX(0.0F);
        iptPrecoTotal.setAlignmentY(0.0F);
        iptPrecoTotal.setEnabled(false);
        getContentPane().add(iptPrecoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 100, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Preço Unitário:");
        jLabel1.setAlignmentY(0.0F);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 100, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Preço Total:");
        jLabel2.setAlignmentY(0.0F);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 100, 20));

        iptCodigoOs.setAlignmentX(0.0F);
        iptCodigoOs.setAlignmentY(0.0F);
        iptCodigoOs.setEnabled(false);
        getContentPane().add(iptCodigoOs, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 50, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nr. OS");
        jLabel3.setAlignmentY(0.0F);
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 50, 20));

        setSize(new java.awt.Dimension(500, 459));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void iptCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iptCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iptCodigoActionPerformed

    private void iptDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iptDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iptDescricaoActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_btnOkActionPerformed
        Itens_Servico item = new Itens_Servico();
        Ordem_Servico os = new Ordem_Servico();
        OrdemServicoCtrl osctrl = new OrdemServicoCtrl();
        ItemServicoDao serv = new ItemServicoDao();
        try {
            ItemServicoCtrl.addItemCtrl(item);
        } catch (SQLException ex) {
            Logger.getLogger(BuscarServicoFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        ItemServicoDao sd = new ItemServicoDao();
        os.setCodigo_os(Integer.parseInt(iptCodigoOs.getText()));
        tblServico.setModel(DbUtils.resultSetToTableModel(sd.buscarItemDao(os)));
        try {
            serv.buscarValorTotalItens(os);
        } catch (SQLException ex) {
            Logger.getLogger(BuscarServicoFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        atualizaValorOs();
        OrdemServicoFrm.alterarOs();
    }//GEN-LAST:event_btnOkActionPerformed

    private void tblServKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblServKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblServKeyReleased

    private void iptDescricaoKeyReleased(java.awt.event.KeyEvent evt) throws SQLException {//GEN-FIRST:event_iptDescricaoKeyReleased
        String descricao = iptDescricao.getText();
        ServicoDao pd = new ServicoDao();

        tblServ.setModel(DbUtils.resultSetToTableModel(pd.buscarTodosServicosDao(descricao)));

    }//GEN-LAST:event_iptDescricaoKeyReleased

    private void iptDescricaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iptDescricaoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_iptDescricaoKeyPressed

    private void tblServMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblServMouseClicked
        setar();
    }//GEN-LAST:event_tblServMouseClicked

    private void iptQuantidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iptQuantidadeKeyReleased
        calcularTotal();
    }//GEN-LAST:event_iptQuantidadeKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnOk;
    private javax.swing.ButtonGroup buttonGroup1;
    public static javax.swing.JTextField iptCodigo;
    public static javax.swing.JTextField iptCodigoOs;
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
    public static javax.swing.JTable tblServ;
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
