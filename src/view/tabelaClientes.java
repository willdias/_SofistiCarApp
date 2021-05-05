package view;

import conexoes.ConexoesMySql;
import controller.ControleLookAndFeel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;
import dao.ClienteDao;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.TableModel;

import net.proteanit.sql.DbUtils;

public class tabelaClientes extends javax.swing.JFrame {

    static Connection conexao = null;// Isso sempre pode ser static
    static PreparedStatement pst = null;// Isso sempre pode ser static
    static ResultSet rs = null;// Isso sempre pode ser static

    public tabelaClientes() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        initComponents();
        ControleLookAndFeel.mudarLookAndFeel();
        // coloca uma figura na barra de título da janela
        URL url = this.getClass().getResource("/icones/iconLogoSc.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);

        this.setIconImage(imagemTitulo);
        conexao = ConexoesMySql.conectar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnBuscarTodosClientes = new javax.swing.JButton();
        iptNomeCliente = new javax.swing.JTextField();
        btnBuscarCliente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaClienteOs = new javax.swing.JTable();
        btnSair = new javax.swing.JButton();
        LblDefeito = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnBuscarTodosClientes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscarTodosClientes.setText("BUSCAR TODOS");
        btnBuscarTodosClientes.setAlignmentY(0.0F);
        btnBuscarTodosClientes.setMargin(null);
        btnBuscarTodosClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarTodosClientesActionPerformed(evt);
            }
        });

        iptNomeCliente.setAlignmentX(0.0F);
        iptNomeCliente.setAlignmentY(0.0F);

        btnBuscarCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscarCliente.setText("BUSCAR");
        btnBuscarCliente.setAlignmentY(0.0F);
        btnBuscarCliente.setMargin(null);
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        tabelaClienteOs.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tabelaClienteOs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "CPF", "CNPJ", "RG", "IE", "Data Nascimento", "Observacoes", "Fone Fixo", "Fone Celular", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaClienteOs.setAlignmentX(0.0F);
        tabelaClienteOs.setAlignmentY(0.0F);
        tabelaClienteOs.setEditingColumn(0);
        tabelaClienteOs.setEditingRow(0);
        jScrollPane2.setViewportView(tabelaClienteOs);

        btnSair.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSair.setText("SAIR");
        btnSair.setAlignmentY(0.0F);
        btnSair.setMargin(null);
        btnSair.setPreferredSize(new java.awt.Dimension(150, 30));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        LblDefeito.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblDefeito.setText("Dados do Cliente :");
        LblDefeito.setAlignmentY(0.0F);
        LblDefeito.setDisplayedMnemonicIndex(0);
        LblDefeito.setPreferredSize(new java.awt.Dimension(150, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblDefeito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(898, 898, 898))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1035, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(iptNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscarTodosClientes)
                        .addGap(6, 6, 6)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LblDefeito, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarTodosClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(iptNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarTodosClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTodosClientesActionPerformed
        ClienteDao cliente = new ClienteDao();
        //tabelaClienteOs.setModel(DbUtils.resultSetToTableModel(cliente.buscarCliente()));
    }//GEN-LAST:event_btnBuscarTodosClientesActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        ClienteDao cliente = new ClienteDao();
        //tabelaClienteOs.setModel(DbUtils.resultSetToTableModel(cliente.buscarCliente(iptNomeCliente.getText())));        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // exibe uma caixa de dialogo
        int sair = JOptionPane.showConfirmDialog(null, "Sair da Pesquisa? ", "Atenção", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            TelaPrincipalFrm principal = null;
            try {
                principal = new TelaPrincipalFrm(); // instancia a tela principal
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                Logger.getLogger(TelaPrincipalFrm.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();//fecha o formulário de login após logar

        }
    }//GEN-LAST:event_btnSairActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblDefeito;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarTodosClientes;
    private javax.swing.JButton btnSair;
    private javax.swing.JTextField iptNomeCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaClienteOs;
    // End of variables declaration//GEN-END:variables
}
