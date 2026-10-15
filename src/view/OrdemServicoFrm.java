package view;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import conexoes.ConexoesMySql;
import controller.CNPJ;
import controller.CPF;
import controller.ClienteCtrl;
import controller.ControleLookAndFeel;
import controller.ItemProdutoCtrl;
import controller.OrdemServicoCtrl;
import controller.VeiculoCtrl;
import dao.ClienteDao;
import dao.ItemProdutoDao;
import dao.ItemServicoDao;
import dao.ProdutoDao;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import javax.swing.UnsupportedLookAndFeelException;
import model.Cliente;
import model.Itens_Produto;
import model.Itens_Servico;
import model.Ordem_Servico;
import model.Veiculo;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class OrdemServicoFrm extends javax.swing.JFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public OrdemServicoFrm() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        initComponents();
        ControleLookAndFeel.mudarLookAndFeel();
        // coloca uma figura na barra de título da janela
        URL url = this.getClass().getResource("/icones/iconLogoSc.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);

        this.setIconImage(imagemTitulo);
        conexao = ConexoesMySql.base();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoOperacao = new javax.swing.ButtonGroup();
        pnDadosCliente = new javax.swing.JPanel();
        btnBuscarCliente = new javax.swing.JButton();
        iptNomeRazaoSocial = new javax.swing.JTextField();
        lblNomeCliente = new javax.swing.JLabel();
        lblCodigoCliente = new javax.swing.JLabel();
        iptCodigoCliente = new javax.swing.JTextField();
        lblTelefoneFixo = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        iptTelefoneFixo = new javax.swing.JTextField();
        iptCelular = new javax.swing.JTextField();
        LblDadosCliente = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbbTipoDocumento = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        iptDocumento = new javax.swing.JFormattedTextField();
        iptEmail = new javax.swing.JTextField();
        lblCelular1 = new javax.swing.JLabel();
        pnDadosVeiculo = new javax.swing.JPanel();
        lblCodVeiculo = new javax.swing.JLabel();
        iptCodVeiculo = new javax.swing.JTextField();
        lblDescricaoVeiculo = new javax.swing.JLabel();
        iptDescricaoVeiculo = new javax.swing.JTextField();
        lblDefeito = new javax.swing.JLabel();
        txtDefeito = new javax.swing.JTextField();
        pnProdutos = new javax.swing.JPanel();
        LblProdutoUsado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        LblServicoRealizado = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        iptDescricaoProduto = new javax.swing.JTextField();
        btnBuscarProduto = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lblDadosVeiculo = new javax.swing.JLabel();
        btnBuscarVeiculo = new javax.swing.JButton();
        lblFabricante = new javax.swing.JLabel();
        iptFabricante = new javax.swing.JTextField();
        iptPlaca = new javax.swing.JFormattedTextField();
        pnDadosOs = new javax.swing.JPanel();
        LblDataEntrada = new javax.swing.JLabel();
        LblValor = new javax.swing.JLabel();
        iptValorTotal = new javax.swing.JTextField();
        LblDataSaida1 = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        iptCodigoOs = new javax.swing.JTextField();
        lblTecnico = new javax.swing.JLabel();
        iptTecnico = new javax.swing.JTextField();
        rdOrcamento = new javax.swing.JRadioButton();
        rdOrdemServico = new javax.swing.JRadioButton();
        cbbStatus = new javax.swing.JComboBox<>();
        lblDadosOS = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBuscarOs = new javax.swing.JButton();
        btnBuscaTecnico = new javax.swing.JButton();
        iptDataEntrada = new javax.swing.JFormattedTextField();
        iptDataSaida = new javax.swing.JFormattedTextField();
        btnIncluir = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnDesativar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        pnProduto = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();
        lblProduto = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnAddProduto = new javax.swing.JButton();
        iptValorTotalProdutos = new javax.swing.JFormattedTextField();
        pnServiço = new javax.swing.JPanel();
        lblServico = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblServico = new javax.swing.JTable();
        btnAddServico = new javax.swing.JButton();
        iptValorTotalServicos = new javax.swing.JFormattedTextField();
        btnFinalizar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ordem de Serviço");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnDadosCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnDadosCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnDadosCliente.setPreferredSize(new java.awt.Dimension(350, 300));
        pnDadosCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscarCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconLupaPeq.png"))); // NOI18N
        btnBuscarCliente.setToolTipText("Buscar Cliente");
        btnBuscarCliente.setAlignmentY(0.0F);
        btnBuscarCliente.setEnabled(false);
        btnBuscarCliente.setMargin(null);
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });
        pnDadosCliente.add(btnBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 30, 30));

        iptNomeRazaoSocial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        iptNomeRazaoSocial.setAlignmentX(0.0F);
        iptNomeRazaoSocial.setAlignmentY(0.0F);
        iptNomeRazaoSocial.setEnabled(false);
        iptNomeRazaoSocial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                iptNomeRazaoSocialKeyReleased(evt);
            }
        });
        pnDadosCliente.add(iptNomeRazaoSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 380, 30));

        lblNomeCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNomeCliente.setText("Nome / Razão Social:");
        pnDadosCliente.add(lblNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 130, -1));

        lblCodigoCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCodigoCliente.setText("Código Cliente:");
        lblCodigoCliente.setAlignmentY(0.0F);
        lblCodigoCliente.setDisplayedMnemonicIndex(0);
        pnDadosCliente.add(lblCodigoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 100, 20));

        iptCodigoCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        iptCodigoCliente.setToolTipText("");
        iptCodigoCliente.setAlignmentX(0.0F);
        iptCodigoCliente.setAlignmentY(0.0F);
        iptCodigoCliente.setEnabled(false);
        iptCodigoCliente.setInheritsPopupMenu(true);
        pnDadosCliente.add(iptCodigoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 100, 30));

        lblTelefoneFixo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTelefoneFixo.setText("Telefone Fixo:");
        pnDadosCliente.add(lblTelefoneFixo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        lblEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEmail.setText("Email:");
        lblEmail.setAlignmentY(0.0F);
        pnDadosCliente.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 60, -1));

        iptTelefoneFixo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        iptTelefoneFixo.setEnabled(false);
        pnDadosCliente.add(iptTelefoneFixo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 120, 30));

        iptCelular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        iptCelular.setAlignmentX(0.0F);
        iptCelular.setAlignmentY(0.0F);
        iptCelular.setEnabled(false);
        pnDadosCliente.add(iptCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 120, 30));

        LblDadosCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblDadosCliente.setText("Dados do Cliente:");
        LblDadosCliente.setAlignmentY(0.0F);
        LblDadosCliente.setPreferredSize(new java.awt.Dimension(150, 30));
        pnDadosCliente.add(LblDadosCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 130, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Tipo Doc.:");
        jLabel11.setAlignmentY(0.0F);
        pnDadosCliente.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 90, -1));

        cbbTipoDocumento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbbTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "CPF", "CNPJ" }));
        cbbTipoDocumento.setToolTipText("Selecione CPF ou CNPJ");
        cbbTipoDocumento.setEnabled(false);
        cbbTipoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbTipoDocumentoActionPerformed(evt);
            }
        });
        pnDadosCliente.add(cbbTipoDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 90, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Documento:");
        pnDadosCliente.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        iptDocumento.setAlignmentX(0.0F);
        iptDocumento.setAlignmentY(0.0F);
        iptDocumento.setEnabled(false);
        iptDocumento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pnDadosCliente.add(iptDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 140, 30));

        iptEmail.setEnabled(false);
        pnDadosCliente.add(iptEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 120, 30));

        lblCelular1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCelular1.setText("Celular:");
        pnDadosCliente.add(lblCelular1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 60, -1));

        getContentPane().add(pnDadosCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 35, 420, 250));

        pnDadosVeiculo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnDadosVeiculo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnDadosVeiculo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCodVeiculo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCodVeiculo.setText("Código Veículo:");
        lblCodVeiculo.setAlignmentY(0.0F);
        lblCodVeiculo.setName(""); // NOI18N
        lblCodVeiculo.setPreferredSize(new java.awt.Dimension(150, 30));
        pnDadosVeiculo.add(lblCodVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 100, 20));

        iptCodVeiculo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        iptCodVeiculo.setAlignmentX(0.0F);
        iptCodVeiculo.setAlignmentY(0.0F);
        iptCodVeiculo.setEnabled(false);
        iptCodVeiculo.setMargin(null);
        iptCodVeiculo.setMaximumSize(null);
        iptCodVeiculo.setPreferredSize(new java.awt.Dimension(150, 30));
        pnDadosVeiculo.add(iptCodVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 90, -1));

        lblDescricaoVeiculo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDescricaoVeiculo.setText("Descrição Veículo:");
        lblDescricaoVeiculo.setAlignmentY(0.0F);
        lblDescricaoVeiculo.setName(""); // NOI18N
        lblDescricaoVeiculo.setPreferredSize(new java.awt.Dimension(150, 30));
        pnDadosVeiculo.add(lblDescricaoVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 120, 20));

        iptDescricaoVeiculo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        iptDescricaoVeiculo.setAlignmentX(0.0F);
        iptDescricaoVeiculo.setAlignmentY(0.0F);
        iptDescricaoVeiculo.setEnabled(false);
        iptDescricaoVeiculo.setMargin(null);
        iptDescricaoVeiculo.setMaximumSize(null);
        iptDescricaoVeiculo.setPreferredSize(new java.awt.Dimension(150, 30));
        pnDadosVeiculo.add(iptDescricaoVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 180, 30));

        lblDefeito.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDefeito.setText("Defeito / Queixa:");
        lblDefeito.setAlignmentY(0.0F);
        lblDefeito.setName(""); // NOI18N
        lblDefeito.setPreferredSize(new java.awt.Dimension(150, 30));
        pnDadosVeiculo.add(lblDefeito, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 110, 20));

        txtDefeito.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDefeito.setAlignmentX(0.0F);
        txtDefeito.setAlignmentY(0.0F);
        txtDefeito.setEnabled(false);
        txtDefeito.setMargin(null);
        txtDefeito.setMaximumSize(null);
        pnDadosVeiculo.add(txtDefeito, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 380, 70));

        LblProdutoUsado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblProdutoUsado.setText("Produtos Usados :");
        LblProdutoUsado.setAlignmentY(0.0F);
        LblProdutoUsado.setDisplayedMnemonicIndex(0);
        LblProdutoUsado.setName(""); // NOI18N
        LblProdutoUsado.setPreferredSize(new java.awt.Dimension(150, 30));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Descrição", "Quantidade", "Valor Unitátio", "Valor Total"
            }
        ));
        jTable1.setAlignmentX(0.0F);
        jTable1.setAlignmentY(0.0F);
        jTable1.setEditingColumn(0);
        jTable1.setEditingRow(0);
        jTable1.setRowHeight(20);
        jTable1.setRowMargin(0);
        jScrollPane1.setViewportView(jTable1);

        LblServicoRealizado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblServicoRealizado.setText("Serviço Realizado:");
        LblServicoRealizado.setAlignmentY(0.0F);
        LblServicoRealizado.setDisplayedMnemonicIndex(0);

        jTextField1.setAlignmentX(0.0F);
        jTextField1.setAlignmentY(0.0F);

        iptDescricaoProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                iptDescricaoProdutoKeyReleased(evt);
            }
        });

        btnBuscarProduto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuscarProduto.setText("Buscar");
        btnBuscarProduto.setAlignmentY(0.0F);
        btnBuscarProduto.setDisplayedMnemonicIndex(0);
        btnBuscarProduto.setMargin(null);
        btnBuscarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnProdutosLayout = new javax.swing.GroupLayout(pnProdutos);
        pnProdutos.setLayout(pnProdutosLayout);
        pnProdutosLayout.setHorizontalGroup(
            pnProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnProdutosLayout.createSequentialGroup()
                        .addComponent(LblProdutoUsado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(iptDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(pnProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblServicoRealizado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(138, 138, 138))
        );
        pnProdutosLayout.setVerticalGroup(
            pnProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProdutosLayout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(pnProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnBuscarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(iptDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LblProdutoUsado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LblServicoRealizado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pnDadosVeiculo.add(pnProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1072, 729, 1005, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Placa:");
        pnDadosVeiculo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, 20));

        lblDadosVeiculo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDadosVeiculo.setText("Dados do Veículo:");
        lblDadosVeiculo.setAlignmentY(0.0F);
        lblDadosVeiculo.setPreferredSize(new java.awt.Dimension(200, 40));
        pnDadosVeiculo.add(lblDadosVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 140, 20));

        btnBuscarVeiculo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBuscarVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconLupaPeq.png"))); // NOI18N
        btnBuscarVeiculo.setToolTipText("Buscar Veículo pela Placa");
        btnBuscarVeiculo.setAlignmentY(0.0F);
        btnBuscarVeiculo.setEnabled(false);
        btnBuscarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVeiculoActionPerformed(evt);
            }
        });
        pnDadosVeiculo.add(btnBuscarVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 30, 30));

        lblFabricante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFabricante.setText("Fabricante/Marca:");
        lblFabricante.setAlignmentY(0.0F);
        lblFabricante.setName(""); // NOI18N
        lblFabricante.setPreferredSize(new java.awt.Dimension(150, 30));
        pnDadosVeiculo.add(lblFabricante, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 120, 20));

        iptFabricante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        iptFabricante.setAlignmentX(0.0F);
        iptFabricante.setAlignmentY(0.0F);
        iptFabricante.setEnabled(false);
        iptFabricante.setMargin(null);
        iptFabricante.setMaximumSize(null);
        iptFabricante.setPreferredSize(new java.awt.Dimension(150, 30));
        pnDadosVeiculo.add(iptFabricante, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 180, 30));

        try {
            iptPlaca.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("AAA-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        iptPlaca.setAlignmentX(0.0F);
        iptPlaca.setAlignmentY(0.0F);
        iptPlaca.setEnabled(false);
        pnDadosVeiculo.add(iptPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 100, 30));

        getContentPane().add(pnDadosVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 35, 420, 250));

        pnDadosOs.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnDadosOs.setAlignmentX(100.0F);
        pnDadosOs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pnDadosOs.setPreferredSize(new java.awt.Dimension(300, 350));
        pnDadosOs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblDataEntrada.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblDataEntrada.setText("Data da entrada:");
        LblDataEntrada.setAlignmentY(0.0F);
        LblDataEntrada.setDisplayedMnemonicIndex(0);
        pnDadosOs.add(LblDataEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 105, 20));

        LblValor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblValor.setText("Valor Total OS R$:");
        LblValor.setAlignmentY(0.0F);
        pnDadosOs.add(LblValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 120, 20));

        iptValorTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        iptValorTotal.setAlignmentX(0.0F);
        iptValorTotal.setAlignmentY(0.0F);
        iptValorTotal.setEnabled(false);
        iptValorTotal.setMargin(null);
        iptValorTotal.setMaximumSize(null);
        iptValorTotal.setPreferredSize(new java.awt.Dimension(150, 30));
        pnDadosOs.add(iptValorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 100, -1));

        LblDataSaida1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblDataSaida1.setText("Data da Saída :");
        pnDadosOs.add(LblDataSaida1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 100, 20));

        lblCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCodigo.setText("Número OS:");
        pnDadosOs.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 80, 20));

        iptCodigoOs.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pnDadosOs.add(iptCodigoOs, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 80, 30));

        lblTecnico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTecnico.setText("Técnico Responsável / Mecânico:");
        lblTecnico.setAlignmentY(0.0F);
        lblTecnico.setName(""); // NOI18N
        lblTecnico.setPreferredSize(new java.awt.Dimension(150, 30));
        pnDadosOs.add(lblTecnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 210, 20));

        iptTecnico.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        iptTecnico.setAlignmentX(0.0F);
        iptTecnico.setAlignmentY(0.0F);
        iptTecnico.setEnabled(false);
        iptTecnico.setMargin(null);
        iptTecnico.setMaximumSize(null);
        iptTecnico.setPreferredSize(new java.awt.Dimension(150, 30));
        pnDadosOs.add(iptTecnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 200, 30));

        tipoOperacao.add(rdOrcamento);
        rdOrcamento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdOrcamento.setActionCommand("Orçamento");
        rdOrcamento.setAlignmentY(0.0F);
        rdOrcamento.setLabel("Orçamento");
        rdOrcamento.setMargin(null);
        pnDadosOs.add(rdOrcamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 100, 30));

        tipoOperacao.add(rdOrdemServico);
        rdOrdemServico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdOrdemServico.setText("Ordem Serviço");
        rdOrdemServico.setMargin(null);
        pnDadosOs.add(rdOrdemServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, 30));

        cbbStatus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aberto", "Cancelado", "Finalizado" }));
        cbbStatus.setAlignmentX(0.0F);
        cbbStatus.setAlignmentY(0.0F);
        cbbStatus.setEnabled(false);
        cbbStatus.setMaximumSize(null);
        cbbStatus.setPreferredSize(new java.awt.Dimension(150, 30));
        pnDadosOs.add(cbbStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 110, -1));

        lblDadosOS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDadosOS.setText("Dados da Ordem de Serviço:");
        lblDadosOS.setAlignmentY(0.0F);
        lblDadosOS.setPreferredSize(new java.awt.Dimension(200, 40));
        pnDadosOs.add(lblDadosOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 237, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Status:");
        jLabel2.setToolTipText("");
        pnDadosOs.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 50, 20));

        btnBuscarOs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBuscarOs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconLupaPeq.png"))); // NOI18N
        btnBuscarOs.setToolTipText("Buscar OS pelo Número");
        btnBuscarOs.setAlignmentY(0.0F);
        btnBuscarOs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					btnBuscarOsActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        pnDadosOs.add(btnBuscarOs, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 30, 30));

        btnBuscaTecnico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBuscaTecnico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconLupaPeq.png"))); // NOI18N
        btnBuscaTecnico.setToolTipText("Buscar Técnico ou Mecânico");
        btnBuscaTecnico.setAlignmentY(0.0F);
        pnDadosOs.add(btnBuscaTecnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 30, 30));

        try {
            iptDataEntrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        iptDataEntrada.setAlignmentX(0.0F);
        iptDataEntrada.setAlignmentY(0.0F);
        iptDataEntrada.setEnabled(false);
        pnDadosOs.add(iptDataEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 100, 30));

        try {
            iptDataSaida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        iptDataSaida.setAlignmentX(0.0F);
        iptDataSaida.setAlignmentY(0.0F);
        iptDataSaida.setEnabled(false);
        pnDadosOs.add(iptDataSaida, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 100, 30));

        getContentPane().add(pnDadosOs, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 35, 420, 250));

        btnIncluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconAdd.png"))); // NOI18N
        btnIncluir.setText("NOVO");
        btnIncluir.setAlignmentY(0.0F);
        btnIncluir.setMargin(null);
        btnIncluir.setPreferredSize(new java.awt.Dimension(150, 30));
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnIncluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 320, 160, -1));

        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconOk.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setAlignmentY(0.0F);
        btnSalvar.setMargin(null);
        btnSalvar.setPreferredSize(new java.awt.Dimension(150, 30));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 370, 160, -1));

        btnDesativar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDesativar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconDesativarPeq.png"))); // NOI18N
        btnDesativar.setText("CANCELAR");
        btnDesativar.setAlignmentY(0.0F);
        btnDesativar.setIconTextGap(5);
        btnDesativar.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnDesativar.setPreferredSize(new java.awt.Dimension(150, 30));
        btnDesativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesativarActionPerformed(evt);
            }
        });
        getContentPane().add(btnDesativar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 520, 160, -1));

        btnSair.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconSairPeq.png"))); // NOI18N
        btnSair.setText("SAIR");
        btnSair.setAlignmentY(0.0F);
        btnSair.setMargin(null);
        btnSair.setPreferredSize(new java.awt.Dimension(150, 30));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 565, 160, -1));

        pnProduto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnProduto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnProduto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setAlignmentX(0.0F);
        jScrollPane2.setAlignmentY(0.0F);
        jScrollPane2.setFocusCycleRoot(true);
        jScrollPane2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jScrollPane2.setMinimumSize(new java.awt.Dimension(23, 27));

        tblProduto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Descrição", "Quantidade", "Preço Unit. R$", "Preço Total R$"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProduto.setAlignmentX(0.0F);
        tblProduto.setAlignmentY(0.0F);
        tblProduto.setEditingColumn(0);
        tblProduto.setEditingRow(0);
        tblProduto.setMaximumSize(new java.awt.Dimension(200, 220));
        tblProduto.setPreferredSize(new java.awt.Dimension(350, 300));
        tblProduto.setRequestFocusEnabled(false);
        tblProduto.setRowHeight(20);
        tblProduto.getTableHeader().setReorderingAllowed(false);
        tblProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblProdutoKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblProduto);

        pnProduto.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 500, 190));

        lblProduto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblProduto.setText("Dados Produtos:");
        lblProduto.setAlignmentY(0.0F);
        lblProduto.setDisplayedMnemonicIndex(0);
        pnProduto.add(lblProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 150, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("VALOR TOTAL DE PRODUTOS R$:");
        jLabel6.setAlignmentY(0.0F);
        pnProduto.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, 30));

        btnAddProduto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAddProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconAdd.png"))); // NOI18N
        btnAddProduto.setText("Adicionar");
        btnAddProduto.setAlignmentY(0.0F);
        btnAddProduto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAddProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProdutoActionPerformed(evt);
            }
        });
        pnProduto.add(btnAddProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 110, 30));

        iptValorTotalProdutos.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        iptValorTotalProdutos.setText("0.00");
        iptValorTotalProdutos.setAlignmentX(0.0F);
        iptValorTotalProdutos.setAlignmentY(0.0F);
        iptValorTotalProdutos.setEnabled(false);
        iptValorTotalProdutos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        iptValorTotalProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iptValorTotalProdutosActionPerformed(evt);
            }
        });
        pnProduto.add(iptValorTotalProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 80, 30));

        getContentPane().add(pnProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 295, 520, 300));

        pnServiço.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnServiço.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblServico.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblServico.setText("Dados do Serviço:");
        lblServico.setAlignmentY(0.0F);
        lblServico.setDisplayedMnemonicIndex(0);
        pnServiço.add(lblServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("VALOR TOTAL DE SERVIÇOS R$:");
        pnServiço.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, -1, 30));

        jScrollPane4.setAlignmentX(0.0F);
        jScrollPane4.setAlignmentY(0.0F);
        jScrollPane4.setFocusCycleRoot(true);
        jScrollPane4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jScrollPane4.setMinimumSize(new java.awt.Dimension(23, 27));

        tblServico.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblServico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código:", "Descrição", "Quantidade", "Preço Unit. R$:", "Preço Total R$:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblServico.setAlignmentX(0.0F);
        tblServico.setAlignmentY(0.0F);
        tblServico.setEditingColumn(0);
        tblServico.setEditingRow(0);
        tblServico.setMaximumSize(new java.awt.Dimension(200, 220));
        tblServico.setPreferredSize(new java.awt.Dimension(350, 300));
        tblServico.setRequestFocusEnabled(false);
        tblServico.setRowHeight(20);
        tblServico.getTableHeader().setReorderingAllowed(false);
        tblServico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblServicoKeyReleased(evt);
            }
        });
        jScrollPane4.setViewportView(tblServico);

        pnServiço.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 500, 190));

        btnAddServico.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAddServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconAdd.png"))); // NOI18N
        btnAddServico.setText("Adicionar");
        btnAddServico.setAlignmentY(0.0F);
        btnAddServico.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAddServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddServicoActionPerformed(evt);
            }
        });
        pnServiço.add(btnAddServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 110, 30));

        iptValorTotalServicos.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        iptValorTotalServicos.setText("0.00");
        iptValorTotalServicos.setAlignmentX(0.0F);
        iptValorTotalServicos.setAlignmentY(0.0F);
        iptValorTotalServicos.setEnabled(false);
        iptValorTotalServicos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        iptValorTotalServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iptValorTotalServicosActionPerformed(evt);
            }
        });
        pnServiço.add(iptValorTotalServicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 80, 30));

        getContentPane().add(pnServiço, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 295, 520, 300));

        btnFinalizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnFinalizar.setText("FINALIZAR");
        btnFinalizar.setAlignmentY(0.0F);
        btnFinalizar.setIconTextGap(5);
        btnFinalizar.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnFinalizar.setPreferredSize(new java.awt.Dimension(150, 30));
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 420, 160, -1));

        btnImprimir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnImprimir.setText("IMPRIMIR");
        btnImprimir.setAlignmentY(0.0F);
        btnImprimir.setDisplayedMnemonicIndex(0);
        btnImprimir.setMargin(null);
        btnImprimir.setPreferredSize(new java.awt.Dimension(150, 30));
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        getContentPane().add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 470, 160, -1));

        setSize(new java.awt.Dimension(1336, 669));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        Cliente cliente = new Cliente();
        ClienteCtrl cliCtrl = new ClienteCtrl();
        String result = null;
        String cpf;
        String cnpj;

        String codCli = iptCodigoCliente.getText();
        int tipoDoc = cbbTipoDocumento.getSelectedIndex();
        String documento = iptDocumento.getText();

        if (!codCli.isEmpty() && codCli != null) {
            try {
                cliente.setCodigo(Integer.parseInt(codCli));
                ClienteCtrl.buscarClienteCtrl(cliente);
            } catch (SQLException ex) {
                Logger.getLogger(OrdemServicoFrm.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipoDoc != 0 && (codCli.isEmpty() || codCli == null)) {
            if (!documento.isEmpty() || !documento.equals(".   .   -") || !documento.equals("  .   .   /    -  ")) {
                JOptionPane.showMessageDialog(null, documento);
                if (tipoDoc == 1) {
                    cliente.setCpf(documento);
                    try {
                        ClienteCtrl.buscarClienteCtrl(cliente);
                    } catch (SQLException ex) {
                        Logger.getLogger(OrdemServicoFrm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (tipoDoc == 2) {
                    cliente.setCnpj(documento);
                    try {
                        ClienteCtrl.buscarClienteCtrl(cliente);
                    } catch (SQLException ex) {
                        Logger.getLogger(OrdemServicoFrm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                String tipoBusca = "OS";

                cpf = cliente.getCpf();
                cnpj = cliente.getCnpj();
                if (cpf != null) {
                    iptNomeRazaoSocial.setText(cliente.getNome());
                    iptDocumento.setText(cliente.getCpf());

                } else if (cnpj != null) {
                    iptNomeRazaoSocial.setText(cliente.getRazaoSocial());
                    iptDocumento.setText(cliente.getCnpj());
                }
                iptCodigoCliente.setText(codCli);
                iptTelefoneFixo.setText(cliente.getFoneFixo());
                iptCelular.setText(cliente.getFoneCelular());
                iptEmail.setText(cliente.getEmail());
            } else {
                JOptionPane.showMessageDialog(null, "Insira o número do documento para fazer a pesquisa.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Insira o código do cliente ou o número do documento para fazer a pesquisa.");
        }
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void iptNomeRazaoSocialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iptNomeRazaoSocialKeyReleased

    }//GEN-LAST:event_iptNomeRazaoSocialKeyReleased

    private void cbbTipoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbTipoDocumentoActionPerformed
        int tipoDoc = cbbTipoDocumento.getSelectedIndex();
        iptDocumento.setValue(null);
        switch (tipoDoc) {
            case 0:
                JOptionPane.showMessageDialog(rootPane, "Selecione um tipo de documento!");
                break;
            case 1:
                iptDocumento.setFormatterFactory(CPF.getFormat());
                iptDocumento.setEnabled(true);
                break;

            case 2:
                iptDocumento.setFormatterFactory(CNPJ.getFormat());
                iptDocumento.setEnabled(true);
                break;
        }
    }//GEN-LAST:event_cbbTipoDocumentoActionPerformed

    private void iptDescricaoProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iptDescricaoProdutoKeyReleased

    }//GEN-LAST:event_iptDescricaoProdutoKeyReleased

    private void btnBuscarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProdutoActionPerformed

    }//GEN-LAST:event_btnBuscarProdutoActionPerformed

    private void btnBuscarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVeiculoActionPerformed
        buscarVeiculo();
    }//GEN-LAST:event_btnBuscarVeiculoActionPerformed

    private void btnBuscarOsActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_btnBuscarOsActionPerformed
        Ordem_Servico os = new Ordem_Servico();
        os.setCodigo_os(Integer.parseInt(iptCodigoOs.getText()));
        try {
            OrdemServicoCtrl.buscarOrdemServicoCtrl(os);

            int codCliente = os.getId_cliente();
            if (codCliente == 0) {
                iptCodigoCliente.setText(null);
            } else {
                iptCodigoCliente.setText(Integer.toString(codCliente));
            }

            int codVeiculo = os.getId_veiculo();
            if (codVeiculo == 0) {
                iptCodVeiculo.setText(null);
            } else {
                iptCodVeiculo.setText(Integer.toString(codVeiculo));
                buscarVeiculo();
            }

        } catch (SQLException ex) {
            Logger.getLogger(OrdemServicoFrm.class.getName()).log(Level.SEVERE, null, ex);
        }

        iptValorTotal.setText(Double.toString(os.getValor_total_os()));
        String valor = iptValorTotal.getText();
        Double vlr = Double.parseDouble(valor);
        if (vlr != null) {
            ItemProdutoDao pd = new ItemProdutoDao();

            try {
                tblProduto.setModel(DbUtils.resultSetToTableModel(pd.buscarItens(os)));
            } catch (SQLException ex) {
                Logger.getLogger(OrdemServicoFrm.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Itens_Produto itemProd = new Itens_Produto();
                pd.buscarValorTotalItens(os);

            } catch (SQLException ex) {
                Logger.getLogger(OrdemServicoFrm.class.getName()).log(Level.SEVERE, null, ex);
            }
            ItemServicoDao sd = new ItemServicoDao();
            tblServico.setModel(DbUtils.resultSetToTableModel(sd.buscarItemDao(os)));
            try {
                Itens_Servico itemServ = new Itens_Servico();
                sd.buscarValorTotalItens(os);

            } catch (SQLException ex) {
                Logger.getLogger(OrdemServicoFrm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        Double vlrProd = Double.parseDouble(iptValorTotalProdutos.getText());
        Double vlrServ = Double.parseDouble(iptValorTotalServicos.getText());
        if (vlrProd == null) {
            vlrProd = 0.0;
        }
        if (vlrServ == null) {
            vlrProd = 0.0;
        }
        Double vlrTot = vlrProd + vlrServ;
        iptValorTotal.setText(Double.toString(vlrTot));

        if (!iptCodigoOs.getText().isEmpty() || !iptCodigoOs.getText().equals(0)) {
            iptCodigoOs.setText(Integer.toString(os.getCodigo_os()));
            cbbStatus.setSelectedItem(os.getStatus());
            iptDataEntrada.setText(os.getDt_ent_os());
            iptDataSaida.setText(os.getDt_sai_os());
            iptDataSaida.setText(os.getDt_sai_os());
            txtDefeito.setText(os.getDefeito());

            iptCodVeiculo.setEnabled(true);
            iptPlaca.setEnabled(true);
            txtDefeito.setEnabled(true);
            iptCodigoCliente.setEnabled(true);
            cbbTipoDocumento.setEnabled(true);
            btnBuscarVeiculo.setEnabled(true);
            btnBuscarCliente.setEnabled(true);
        }
        if (cbbStatus.getSelectedIndex() == 2) {
            iptNomeRazaoSocial.setEnabled(false);
            iptCodVeiculo.setEnabled(false);
            iptDescricaoVeiculo.setEnabled(false);
            iptPlaca.setEnabled(false);
            iptCodigoCliente.setEnabled(false);
            txtDefeito.setEnabled(false);
            btnAddProduto.setEnabled(false);
            btnAddServico.setEnabled(false);
            btnBuscarCliente.setEnabled(false);
            btnDesativar.setEnabled(false);
            btnFinalizar.setEnabled(false);
            btnBuscaTecnico.setEnabled(false);
            btnBuscarVeiculo.setEnabled(false);
            btnIncluir.setEnabled(false);
            btnSalvar.setEnabled(false);
            tblProduto.setEnabled(false);
            tblServico.setEnabled(false);
            cbbTipoDocumento.setEnabled(false);
            cbbStatus.setEnabled(false);
            rdOrcamento.setEnabled(false);
            rdOrdemServico.setEnabled(false);
        }
    }//GEN-LAST:event_btnBuscarOsActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        Date data = new Date();
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.DEFAULT);
        iptDataEntrada.setText(formatador.format(data));
        iptValorTotal.setText("0.00");

        OrdemServicoCtrl os = new OrdemServicoCtrl();
        Ordem_Servico osmd = new Ordem_Servico();
        osmd.setDt_ent_os(iptDataEntrada.getText());
        try {
            os.incluirOrdemServicoCtrl(osmd);
        } catch (SQLException ex) {
            Logger.getLogger(OrdemServicoFrm.class.getName()).log(Level.SEVERE, null, ex);
        }

        iptCodigoOs.setText(Integer.toString(osmd.getCodigo_os()));

        Itens_Produto item = new Itens_Produto();
        item.setCodigo_os(osmd.getCodigo_os());
        try {
            ItemProdutoCtrl.addItemCtrl(item);
        } catch (SQLException ex) {
            Logger.getLogger(BuscarProdutoFrm.class.getName()).log(Level.SEVERE, null, ex);
        }

        iptCodVeiculo.setEnabled(true);
        iptPlaca.setEnabled(true);
        txtDefeito.setEnabled(true);
        iptCodigoCliente.setEnabled(true);
        cbbTipoDocumento.setEnabled(true);
        btnBuscarVeiculo.setEnabled(true);
        btnBuscarCliente.setEnabled(true);
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        alterarOs();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnDesativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesativarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDesativarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // exibe uma caixa de dialogo
        int sair = JOptionPane.showConfirmDialog(null, "Sair da Tela Ordem de Serviço? ", "Atenção", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            this.dispose();//Fecha o formulário de OS
        }
    }//GEN-LAST:event_btnSairActionPerformed

    private void tblProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblProdutoKeyReleased

    }//GEN-LAST:event_tblProdutoKeyReleased

    private void btnAddProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProdutoActionPerformed
        BuscarProdutoFrm buscaPd = new BuscarProdutoFrm();
        buscaPd.setVisible(true);
        BuscarProdutoFrm.iptCodigoOs.setText(iptCodigoOs.getText());
    }//GEN-LAST:event_btnAddProdutoActionPerformed

    private void iptValorTotalProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iptValorTotalProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iptValorTotalProdutosActionPerformed

    private void tblServicoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblServicoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblServicoKeyReleased

    private void btnAddServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddServicoActionPerformed
        BuscarServicoFrm buscaSc = new BuscarServicoFrm();
        buscaSc.setVisible(true);
        BuscarServicoFrm.iptCodigoOs.setText(iptCodigoOs.getText());
    }//GEN-LAST:event_btnAddServicoActionPerformed

    private void iptValorTotalServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iptValorTotalServicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iptValorTotalServicosActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        Date data = new Date();
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.DEFAULT);
        iptDataSaida.setText(formatador.format(data));
        cbbStatus.setSelectedIndex(2);
        Ordem_Servico os = new Ordem_Servico();
        ItemProdutoDao itemOs = new ItemProdutoDao();
        if (cbbStatus.getSelectedIndex() == 2) {
            os.setCodigo_os(Integer.parseInt(iptCodigoOs.getText()));
            os.setDt_sai_os(iptDataSaida.getText());
            try {
                itemOs.buscarItensMovimento(os);
            } catch (SQLException ex) {
                Logger.getLogger(OrdemServicoFrm.class.getName()).log(Level.SEVERE, null, ex);
            }
            iptNomeRazaoSocial.setEnabled(false);
            iptCodVeiculo.setEnabled(false);
            iptDescricaoVeiculo.setEnabled(false);
            iptPlaca.setEnabled(false);
            iptCodigoCliente.setEnabled(false);
            txtDefeito.setEnabled(false);
            btnAddProduto.setEnabled(false);
            btnAddServico.setEnabled(false);
            btnBuscarCliente.setEnabled(false);
            btnDesativar.setEnabled(false);
            btnFinalizar.setEnabled(false);
            btnBuscaTecnico.setEnabled(false);
            btnBuscarVeiculo.setEnabled(false);
            btnIncluir.setEnabled(false);
            btnSalvar.setEnabled(false);
            tblProduto.setEnabled(false);
            tblServico.setEnabled(false);
            cbbTipoDocumento.setEnabled(false);
            cbbStatus.setEnabled(false);
            rdOrcamento.setEnabled(false);
            rdOrdemServico.setEnabled(false);

            alterarOs();
        }
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        int os = Integer.parseInt(iptCodigoOs.getText());
        try {
            HashMap filtro = new HashMap();
            filtro.put("PK_ID", os);

            JasperPrint print = JasperFillManager.fillReport("C:/Reports/ordem_servico.jasper", filtro, conexao);
            JasperViewer.viewReport(print, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Deu Não " + e);
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblDadosCliente;
    private javax.swing.JLabel LblDataEntrada;
    private javax.swing.JLabel LblDataSaida1;
    private javax.swing.JLabel LblProdutoUsado;
    private javax.swing.JLabel LblServicoRealizado;
    private javax.swing.JLabel LblValor;
    private javax.swing.JButton btnAddProduto;
    private javax.swing.JButton btnAddServico;
    private javax.swing.JButton btnBuscaTecnico;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarOs;
    private javax.swing.JButton btnBuscarProduto;
    private javax.swing.JButton btnBuscarVeiculo;
    private javax.swing.JButton btnDesativar;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnImprimir;
    public static javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    public static javax.swing.JComboBox<String> cbbStatus;
    private javax.swing.JComboBox cbbTipoDocumento;
    public static javax.swing.JTextField iptCelular;
    public static javax.swing.JTextField iptCodVeiculo;
    public static javax.swing.JTextField iptCodigoCliente;
    public static javax.swing.JTextField iptCodigoOs;
    public static javax.swing.JFormattedTextField iptDataEntrada;
    public static javax.swing.JFormattedTextField iptDataSaida;
    private javax.swing.JTextField iptDescricaoProduto;
    public static javax.swing.JTextField iptDescricaoVeiculo;
    public static javax.swing.JFormattedTextField iptDocumento;
    public static javax.swing.JTextField iptEmail;
    public static javax.swing.JTextField iptFabricante;
    public static javax.swing.JTextField iptNomeRazaoSocial;
    public static javax.swing.JFormattedTextField iptPlaca;
    public static javax.swing.JTextField iptTecnico;
    public static javax.swing.JTextField iptTelefoneFixo;
    public static javax.swing.JTextField iptValorTotal;
    public static javax.swing.JFormattedTextField iptValorTotalProdutos;
    public static javax.swing.JFormattedTextField iptValorTotalServicos;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblCelular1;
    private javax.swing.JLabel lblCodVeiculo;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCodigoCliente;
    private javax.swing.JLabel lblDadosOS;
    private javax.swing.JLabel lblDadosVeiculo;
    private javax.swing.JLabel lblDefeito;
    private javax.swing.JLabel lblDescricaoVeiculo;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFabricante;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JLabel lblServico;
    private javax.swing.JLabel lblTecnico;
    private javax.swing.JLabel lblTelefoneFixo;
    private javax.swing.JPanel pnDadosCliente;
    private javax.swing.JPanel pnDadosOs;
    private javax.swing.JPanel pnDadosVeiculo;
    private javax.swing.JPanel pnProduto;
    private javax.swing.JPanel pnProdutos;
    private javax.swing.JPanel pnServiço;
    private javax.swing.JRadioButton rdOrcamento;
    private javax.swing.JRadioButton rdOrdemServico;
    public static javax.swing.JTable tblProduto;
    public static javax.swing.JTable tblServico;
    private javax.swing.ButtonGroup tipoOperacao;
    public static javax.swing.JTextField txtDefeito;
    // End of variables declaration//GEN-END:variables

    private static void limparCampos() {
        iptNomeRazaoSocial.setText("");
        iptCodVeiculo.setText("");
        iptDescricaoVeiculo.setText("");
        iptPlaca.setText("");
        iptCodigoCliente.setText("");
    }

    public static void atualizaValorOs() {
        String prod = iptValorTotalProdutos.getText();
        String serv = iptValorTotalServicos.getText();
        Double vlrProd = Double.parseDouble(prod);
        Double vlrServ = Double.parseDouble(serv);
        Double vlrTotal = vlrProd + vlrServ;
        iptValorTotal.setText(Double.toString(vlrTotal));
    }

    public static void alterarOs() {
        OrdemServicoCtrl os = new OrdemServicoCtrl();
        Ordem_Servico osmd = new Ordem_Servico();
        osmd.setDefeito(txtDefeito.getText());
        osmd.setValor_total_os(Double.parseDouble(iptValorTotal.getText()));
        osmd.setStatus((String) cbbStatus.getSelectedItem());
        osmd.setId_cliente(Integer.parseInt(iptCodigoCliente.getText()));
        osmd.setId_veiculo(Integer.parseInt(iptCodVeiculo.getText()));
        osmd.setCodigo_os(Integer.parseInt(iptCodigoOs.getText()));
        try {
            os.alterarOrdemServicoCtrl(osmd);
        } catch (SQLException ex) {
            Logger.getLogger(OrdemServicoFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void buscarVeiculo() {
        Veiculo veiculo = new Veiculo();
        ClienteCtrl clienteCtrl = new ClienteCtrl();
        Cliente cliente = new Cliente();
        String codVeiculo = iptCodVeiculo.getText();
        String placa = iptPlaca.getText();
        if (!codVeiculo.isEmpty()) {
            veiculo.setCodigo_veiculo(Integer.parseInt(codVeiculo));
            veiculo.setPlaca_veiculo("");
            try {
                VeiculoCtrl.buscarVeiculoCtrl(veiculo);
            } catch (SQLException ex) {
                Logger.getLogger(OrdemServicoFrm.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (!placa.isEmpty()) {
            veiculo.setPlaca_veiculo(placa);
            try {
                VeiculoCtrl.buscarVeiculoCtrl(veiculo);
            } catch (SQLException ex) {
                Logger.getLogger(OrdemServicoFrm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        String codVei = Integer.toString(veiculo.getCodigo_veiculo());
        String cli = Integer.toString(veiculo.getVeiculo_id_cliente());
        iptCodVeiculo.setText(codVei);
        iptDescricaoVeiculo.setText(veiculo.getDescricao_veiculo());
        iptPlaca.setText(veiculo.getPlaca_veiculo());
        iptFabricante.setText(veiculo.getFabricante_veiculo());

        cliente.setCodigo(Integer.parseInt(cli));
        try {
            clienteCtrl.buscarClienteCtrl(cliente);

        } catch (SQLException ex) {
            Logger.getLogger(OrdemServicoFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (cliente.getCpf() != null) {
            iptNomeRazaoSocial.setText(cliente.getNome());
            iptDocumento.setText(cliente.getCpf());

        } else if (cliente.getCnpj() != null) {
            iptNomeRazaoSocial.setText(cliente.getRazaoSocial());
            iptDocumento.setText(cliente.getCnpj());

        }
        iptCodigoCliente.setText(cli);
        iptTelefoneFixo.setText(cliente.getFoneFixo());
        iptCelular.setText(cliente.getFoneCelular());
        iptEmail.setText(cliente.getEmail());
    }
}
