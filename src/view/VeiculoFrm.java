package view;

import controller.ControleLookAndFeel;
import controller.ClienteCtrl;
import controller.VeiculoCtrl;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.UIManager.getInt;
import javax.swing.UnsupportedLookAndFeelException;
import model.Cliente;
import model.Veiculo;

public class VeiculoFrm extends javax.swing.JFrame {

    public VeiculoFrm() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
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
        LblCliente = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        cbbStatus = new javax.swing.JComboBox<>();
        iptCodVeiculo = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        LblCor = new javax.swing.JLabel();
        LblChassi = new javax.swing.JLabel();
        iptCor = new javax.swing.JTextField();
        iptChassi = new javax.swing.JTextField();
        LblModelo = new javax.swing.JLabel();
        LblAno = new javax.swing.JLabel();
        LblPlaca = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        btnDesativar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        LblFabricante = new javax.swing.JLabel();
        iptFabricante = new javax.swing.JTextField();
        iptDescricao = new javax.swing.JTextField();
        lblDescricao = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        iptPlaca = new javax.swing.JFormattedTextField();
        iptAno = new javax.swing.JFormattedTextField();
        iptModelo = new javax.swing.JFormattedTextField();
        cbbCliente = new javax.swing.JComboBox<>();
        iptCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Veículo");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblCliente.setText("*Cliente / Proprietário:");
        LblCliente.setAlignmentY(0.0F);
        jPanel1.add(LblCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 150, 20));

        lblStatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblStatus.setText("Status:");
        jPanel1.add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 100, 20));

        cbbStatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo" }));
        cbbStatus.setAlignmentX(0.0F);
        cbbStatus.setAlignmentY(0.0F);
        cbbStatus.setEnabled(false);
        jPanel1.add(cbbStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 50, 140, 30));

        iptCodVeiculo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        iptCodVeiculo.setEnabled(false);
        jPanel1.add(iptCodVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 50, 130, 30));

        lblCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCodigo.setText("Código:");
        jPanel1.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 100, 20));

        LblCor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblCor.setText("Cor:");
        jPanel1.add(LblCor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 100, 20));

        LblChassi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblChassi.setText("Chassi:");
        jPanel1.add(LblChassi, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 100, 20));

        iptCor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        iptCor.setEnabled(false);
        jPanel1.add(iptCor, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 170, 130, 30));

        iptChassi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        iptChassi.setEnabled(false);
        jPanel1.add(iptChassi, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 170, 130, 30));

        LblModelo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblModelo.setText("Ano Modelo:");
        jPanel1.add(LblModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 80, 20));

        LblAno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblAno.setText("Ano Fabricação:");
        jPanel1.add(LblAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 100, 20));

        LblPlaca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblPlaca.setText("*Placa:");
        jPanel1.add(LblPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 100, 20));

        btnSair.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconSairPeq.png"))); // NOI18N
        btnSair.setText("SAIR");
        btnSair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSair.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jPanel1.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 121, 30));

        btnDesativar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDesativar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconDesativarPeq.png"))); // NOI18N
        btnDesativar.setText("DESATIVAR");
        btnDesativar.setAlignmentY(0.0F);
        btnDesativar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDesativar.setEnabled(false);
        btnDesativar.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnDesativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesativarActionPerformed(evt);
            }
        });
        jPanel1.add(btnDesativar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 121, 30));

        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconOk.png"))); // NOI18N
        btnSalvar.setText("SALVAR");
        btnSalvar.setAlignmentY(0.0F);
        btnSalvar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalvar.setEnabled(false);
        btnSalvar.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 121, 30));

        LblFabricante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblFabricante.setText("Fabricante/Marca:");
        jPanel1.add(LblFabricante, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 110, 20));

        iptFabricante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        iptFabricante.setEnabled(false);
        jPanel1.add(iptFabricante, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 110, 110, 30));

        iptDescricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        iptDescricao.setEnabled(false);
        jPanel1.add(iptDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 110, 130, 30));

        lblDescricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDescricao.setText("*Descrição:");
        jPanel1.add(lblDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 100, 20));

        btnConsultar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconLupaPeq.png"))); // NOI18N
        btnConsultar.setAlignmentY(0.0F);
        btnConsultar.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 50, 30, 30));

        btnNovo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconAdd.png"))); // NOI18N
        btnNovo.setText("NOVO");
        btnNovo.setAlignmentY(0.0F);
        btnNovo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNovo.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 121, 30));

        try {
            iptPlaca.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("AAA-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        iptPlaca.setAlignmentX(0.0F);
        iptPlaca.setAlignmentY(0.0F);
        jPanel1.add(iptPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 50, 130, 30));

        iptAno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####"))));
        iptAno.setAlignmentX(0.0F);
        iptAno.setAlignmentY(0.0F);
        iptAno.setEnabled(false);
        jPanel1.add(iptAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 110, 100, 30));

        iptModelo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####"))));
        iptModelo.setAlignmentX(0.0F);
        iptModelo.setAlignmentY(0.0F);
        iptModelo.setEnabled(false);
        jPanel1.add(iptModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 110, 80, 30));

        cbbCliente.setAlignmentX(0.0F);
        cbbCliente.setAlignmentY(0.0F);
        cbbCliente.setEnabled(false);
        cbbCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbbClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cbbClienteFocusLost(evt);
            }
        });
        jPanel1.add(cbbCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 170, 132, 30));

        iptCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        iptCliente.setAlignmentX(0.0F);
        iptCliente.setAlignmentY(0.0F);
        iptCliente.setEnabled(false);
        iptCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iptClienteActionPerformed(evt);
            }
        });
        iptCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                iptClienteKeyReleased(evt);
            }
        });
        jPanel1.add(iptCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 170, 40, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("* Campos Obrigatórios");
        jLabel2.setAlignmentY(0.0F);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 140, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // exibe uma caixa de dialogo
        int sair = JOptionPane.showConfirmDialog(null, "Sair da Tela de Veículo? ", "Atenção", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            this.dispose();//fecha o formulário Veículo
        }
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnDesativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesativarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDesativarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Veiculo veiculo = new Veiculo();
        if (!iptDescricao.getText().isEmpty() && !iptPlaca.getText().isEmpty() && !iptCliente.getText().isEmpty()) {
            try {
                VeiculoCtrl.alterarVeiculoCtrl();
            } catch (SQLException ex) {
                Logger.getLogger(VeiculoFrm.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios.");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        Veiculo veiculo = new Veiculo();
        veiculo.setPlaca_veiculo(iptPlaca.getText());
        try {
            VeiculoCtrl.buscarVeiculoCtrl(veiculo);
        } catch (SQLException ex) {
            Logger.getLogger(OrdemServicoFrm.class.getName()).log(Level.SEVERE, null, ex);
        }

        String cli = Integer.toString(veiculo.getVeiculo_id_cliente());
        iptCodVeiculo.setText(Integer.toString(veiculo.getCodigo_veiculo()));
        iptDescricao.setText(veiculo.getDescricao_veiculo());
        iptPlaca.setText(veiculo.getPlaca_veiculo());
        iptCliente.setText(cli);
        iptFabricante.setText(veiculo.getFabricante_veiculo());
        iptAno.setText(veiculo.getAno_veiculo());
        iptModelo.setText(veiculo.getModelo_veiculo());
        iptCor.setText(veiculo.getCor_veiculo());
        iptChassi.setText(veiculo.getChassi_veiculo());

        iptCodVeiculo.setEnabled(true);
        iptDescricao.setEnabled(true);
        iptPlaca.setEnabled(true);
        iptCliente.setEnabled(true);
        iptFabricante.setEnabled(true);
        iptAno.setEnabled(true);
        iptModelo.setEnabled(true);
        iptCor.setEnabled(true);
        iptChassi.setEnabled(true);
        cbbCliente.setEnabled(true);
        btnDesativar.setEnabled(true);
        btnSalvar.setEnabled(true);
        btnNovo.setEnabled(false);
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        limparCampos();
        Veiculo veiculo = new Veiculo();
        try {
            VeiculoCtrl.incluirVeiculoCtrl(veiculo);
            iptCodVeiculo.setText(Integer.toString(veiculo.getCodigo_veiculo()));
        } catch (SQLException ex) {
            Logger.getLogger(VeiculoFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        iptDescricao.setEnabled(true);
        iptFabricante.setEnabled(true);
        iptAno.setEnabled(true);
        iptModelo.setEnabled(true);
        iptCor.setEnabled(true);
        iptChassi.setEnabled(true);
        cbbCliente.setEnabled(true);
        btnSalvar.setEnabled(true);
        btnDesativar.setEnabled(true);
        btnNovo.setEnabled(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void cbbClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbbClienteFocusGained
        try {
            ClienteCtrl.buscarClienteVeiCtrl();
        } catch (SQLException ex) {
            Logger.getLogger(VeiculoFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbbClienteFocusGained

    private void iptClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iptClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iptClienteActionPerformed

    private void iptClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iptClienteKeyReleased
        Cliente cliente = new Cliente();
        cliente.setNome(iptCliente.getText());
        cliente.setRazaoSocial(iptCliente.getText());
        try {
            ClienteCtrl.buscarClienteVeiCtrl();
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_iptClienteKeyReleased

    private void cbbClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbbClienteFocusLost
        String var = (String) cbbCliente.getSelectedItem();
        if (var != null) {
            String frase = var;

            String array[] = new String[3];
            array = frase.split("-");

            String s = var;
            String[] parts = s.split("-"); //retorna um array com 2 partes
            String firstPart = parts[0];
            iptCliente.setText(firstPart);
        }
    }//GEN-LAST:event_cbbClienteFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblAno;
    private javax.swing.JLabel LblChassi;
    private javax.swing.JLabel LblCliente;
    private javax.swing.JLabel LblCor;
    private javax.swing.JLabel LblFabricante;
    private javax.swing.JLabel LblModelo;
    private javax.swing.JLabel LblPlaca;
    private javax.swing.JButton btnConsultar;
    public static javax.swing.JButton btnDesativar;
    public static javax.swing.JButton btnNovo;
    public static javax.swing.JButton btnSair;
    public static javax.swing.JButton btnSalvar;
    public static javax.swing.JComboBox<String> cbbCliente;
    public static javax.swing.JComboBox<String> cbbStatus;
    public static javax.swing.JFormattedTextField iptAno;
    public static javax.swing.JTextField iptChassi;
    public static javax.swing.JTextField iptCliente;
    public static javax.swing.JTextField iptCodVeiculo;
    public static javax.swing.JTextField iptCor;
    public static javax.swing.JTextField iptDescricao;
    public static javax.swing.JTextField iptFabricante;
    public static javax.swing.JFormattedTextField iptModelo;
    public static javax.swing.JFormattedTextField iptPlaca;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblStatus;
    // End of variables declaration//GEN-END:variables

    public static void limparCampos() {
        iptCodVeiculo.setText("");
        iptDescricao.setText("");
        iptPlaca.setText("");
        iptCliente.setText("");
        iptFabricante.setText("");
        iptAno.setText("");
        iptModelo.setText("");
        iptCor.setText("");
        iptChassi.setText("");
        cbbCliente.setSelectedIndex(-1);

        btnSalvar.setEnabled(false);
        btnDesativar.setEnabled(false);
        iptCodVeiculo.setEnabled(false);
        iptDescricao.setEnabled(false);
        iptCliente.setEnabled(false);
        iptFabricante.setEnabled(false);
        iptAno.setEnabled(false);
        iptModelo.setEnabled(false);
        iptCor.setEnabled(false);
        iptChassi.setEnabled(false);
        cbbCliente.setEnabled(false);
    }
}
