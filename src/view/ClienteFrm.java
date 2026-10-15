package view;

import controller.ClienteCtrl;
import controller.ControleLookAndFeel;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;
import model.Cliente;

public class ClienteFrm extends javax.swing.JFrame {

    public ClienteFrm() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
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

        grpPessoa = new javax.swing.ButtonGroup();
        painelGeral = new javax.swing.JPanel();
        lblObservacoes = new javax.swing.JLabel();
        iptDataNascimento = new javax.swing.JFormattedTextField();
        lblCpf = new javax.swing.JLabel();
        iptFoneCelular = new javax.swing.JFormattedTextField();
        lblCnpj = new javax.swing.JLabel();
        iptCnpj = new javax.swing.JFormattedTextField();
        lblIe = new javax.swing.JLabel();
        iptLogradouro = new javax.swing.JTextField();
        lblCep = new javax.swing.JLabel();
        iptBairro = new javax.swing.JTextField();
        lblDataNascimento = new javax.swing.JLabel();
        LblNumero = new javax.swing.JLabel();
        cbbEstado = new javax.swing.JComboBox<>();
        iptCep = new javax.swing.JFormattedTextField();
        lblLogradouro = new javax.swing.JLabel();
        LblBairro = new javax.swing.JLabel();
        lblFoneFixo = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        iptEmail = new javax.swing.JTextField();
        iptComplemento = new javax.swing.JTextField();
        iptFoneFixo = new javax.swing.JFormattedTextField();
        iptCpf = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservacoes = new javax.swing.JTextArea();
        lblRg = new javax.swing.JLabel();
        lblComplemento = new javax.swing.JLabel();
        iptIe = new javax.swing.JTextField();
        lblFoneCelular = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        iptNome = new javax.swing.JTextField();
        btnSair = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        rdPessoaFisica = new javax.swing.JRadioButton();
        rdPessoaJuridica = new javax.swing.JRadioButton();
        lblRazaoSocial = new javax.swing.JLabel();
        iptRazaoSocial = new javax.swing.JTextField();
        iptNomeFantasia = new javax.swing.JTextField();
        lblNomeFantasia = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnConsultar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnDesativar = new javax.swing.JButton();
        lblOrgaoEmissor = new javax.swing.JLabel();
        iptOrgaoEmissor = new javax.swing.JTextField();
        cbbStatus = new javax.swing.JComboBox<>();
        lblStatus = new javax.swing.JLabel();
        iptCodigoCliente = new javax.swing.JTextField();
        cbbCidade = new javax.swing.JComboBox<>();
        iptNumero = new javax.swing.JFormattedTextField();
        iptRg = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnConsultarCodigo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cliente");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelGeral.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        painelGeral.setDoubleBuffered(false);
        painelGeral.setVerifyInputWhenFocusTarget(false);
        painelGeral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblObservacoes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblObservacoes.setText("Observações   ");
        lblObservacoes.setPreferredSize(new java.awt.Dimension(150, 30));
        painelGeral.add(lblObservacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 100, 20));

        try {
            iptDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        iptDataNascimento.setAlignmentX(0.0F);
        iptDataNascimento.setAlignmentY(0.0F);
        iptDataNascimento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        iptDataNascimento.setMargin(new java.awt.Insets(0, 0, 0, 0));
        iptDataNascimento.setMaximumSize(new java.awt.Dimension(0, 0));
        iptDataNascimento.setMinimumSize(new java.awt.Dimension(0, 0));
        painelGeral.add(iptDataNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 80, 110, 30));

        lblCpf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCpf.setText("*CPF :");
        lblCpf.setAlignmentY(0.0F);
        lblCpf.setPreferredSize(new java.awt.Dimension(100, 30));
        painelGeral.add(lblCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, 20));

        try {
            iptFoneCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        iptFoneCelular.setAlignmentX(0.0F);
        iptFoneCelular.setAlignmentY(0.0F);
        iptFoneCelular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        iptFoneCelular.setMargin(null);
        iptFoneCelular.setMaximumSize(null);
        iptFoneCelular.setMinimumSize(null);
        painelGeral.add(iptFoneCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 140, 30));

        lblCnpj.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCnpj.setText("*CNPJ:");
        lblCnpj.setAlignmentY(0.0F);
        lblCnpj.setPreferredSize(new java.awt.Dimension(100, 30));
        painelGeral.add(lblCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 70, 20));

        try {
            iptCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        iptCnpj.setAlignmentX(0.0F);
        iptCnpj.setAlignmentY(0.0F);
        iptCnpj.setEnabled(false);
        iptCnpj.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        iptCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iptCnpjActionPerformed(evt);
            }
        });
        painelGeral.add(iptCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 140, 30));

        lblIe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblIe.setText("Inscrição Estadual");
        lblIe.setAlignmentY(0.0F);
        lblIe.setPreferredSize(new java.awt.Dimension(100, 30));
        painelGeral.add(lblIe, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 120, 20));

        iptLogradouro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        iptLogradouro.setAlignmentX(0.0F);
        iptLogradouro.setAlignmentY(0.0F);
        iptLogradouro.setMargin(null);
        iptLogradouro.setMaximumSize(null);
        iptLogradouro.setPreferredSize(new java.awt.Dimension(100, 30));
        iptLogradouro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iptLogradouroActionPerformed(evt);
            }
        });
        painelGeral.add(iptLogradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 140, 30));

        lblCep.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCep.setText("CEP:");
        lblCep.setAlignmentY(0.0F);
        lblCep.setPreferredSize(new java.awt.Dimension(150, 30));
        painelGeral.add(lblCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 40, 20));

        iptBairro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        iptBairro.setMargin(null);
        iptBairro.setMaximumSize(null);
        painelGeral.add(iptBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 140, 30));

        lblDataNascimento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDataNascimento.setText("Data Nasc.:");
        lblDataNascimento.setPreferredSize(new java.awt.Dimension(100, 30));
        painelGeral.add(lblDataNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 60, 80, 20));

        LblNumero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblNumero.setText("Número:");
        LblNumero.setAlignmentY(0.0F);
        LblNumero.setPreferredSize(new java.awt.Dimension(100, 30));
        painelGeral.add(LblNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 70, 20));

        cbbEstado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        cbbEstado.setSelectedIndex(8);
        cbbEstado.setAlignmentX(0.0F);
        cbbEstado.setAlignmentY(0.0F);
        painelGeral.add(cbbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, 60, 30));

        try {
            iptCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        iptCep.setAlignmentX(0.0F);
        iptCep.setAlignmentY(0.0F);
        iptCep.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        iptCep.setMargin(null);
        iptCep.setMaximumSize(null);
        iptCep.setPreferredSize(new java.awt.Dimension(100, 30));
        iptCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iptCepActionPerformed(evt);
            }
        });
        painelGeral.add(iptCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        lblLogradouro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLogradouro.setText("Logradouro:");
        lblLogradouro.setPreferredSize(new java.awt.Dimension(150, 30));
        painelGeral.add(lblLogradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 120, 20));

        LblBairro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblBairro.setText("Bairro:");
        LblBairro.setPreferredSize(new java.awt.Dimension(100, 30));
        painelGeral.add(LblBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 40, 20));

        lblFoneFixo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFoneFixo.setText("*Telefone Fixo:");
        lblFoneFixo.setAlignmentY(0.0F);
        lblFoneFixo.setPreferredSize(new java.awt.Dimension(100, 30));
        painelGeral.add(lblFoneFixo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 100, 20));

        lblNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNome.setText("*Nome:");
        lblNome.setAlignmentY(0.0F);
        lblNome.setPreferredSize(new java.awt.Dimension(100, 30));
        painelGeral.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 120, 20));

        iptEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        iptEmail.setAlignmentX(0.0F);
        iptEmail.setAlignmentY(0.0F);
        painelGeral.add(iptEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, 260, 30));

        iptComplemento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        iptComplemento.setAlignmentX(0.0F);
        iptComplemento.setAlignmentY(0.0F);
        iptComplemento.setMargin(null);
        iptComplemento.setMaximumSize(null);
        painelGeral.add(iptComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 120, 30));

        try {
            iptFoneFixo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        iptFoneFixo.setAlignmentX(0.0F);
        iptFoneFixo.setAlignmentY(0.0F);
        iptFoneFixo.setCaretPosition(0);
        iptFoneFixo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        iptFoneFixo.setMargin(null);
        iptFoneFixo.setMaximumSize(null);
        iptFoneFixo.setPreferredSize(new java.awt.Dimension(150, 30));
        iptFoneFixo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iptFoneFixoActionPerformed(evt);
            }
        });
        painelGeral.add(iptFoneFixo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 140, -1));

        try {
            iptCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        iptCpf.setAlignmentX(0.0F);
        iptCpf.setAlignmentY(0.0F);
        iptCpf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        iptCpf.setMargin(null);
        iptCpf.setMaximumSize(null);
        painelGeral.add(iptCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 120, 30));

        txtObservacoes.setColumns(15);
        txtObservacoes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtObservacoes.setRows(5);
        txtObservacoes.setTabSize(5);
        txtObservacoes.setAlignmentX(0.0F);
        txtObservacoes.setAlignmentY(0.0F);
        txtObservacoes.setMargin(null);
        txtObservacoes.setMaximumSize(null);
        txtObservacoes.setMinimumSize(null);
        txtObservacoes.setPreferredSize(new java.awt.Dimension(150, 85));
        jScrollPane1.setViewportView(txtObservacoes);

        painelGeral.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 710, 190));

        lblRg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRg.setText("RG:");
        lblRg.setAlignmentY(0.0F);
        lblRg.setPreferredSize(new java.awt.Dimension(100, 30));
        painelGeral.add(lblRg, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 30, 20));

        lblComplemento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblComplemento.setText("Complemento:");
        lblComplemento.setAlignmentY(0.0F);
        painelGeral.add(lblComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 120, 20));

        iptIe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        iptIe.setAlignmentX(0.0F);
        iptIe.setAlignmentY(0.0F);
        iptIe.setEnabled(false);
        iptIe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iptIeActionPerformed(evt);
            }
        });
        painelGeral.add(iptIe, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 140, 30));

        lblFoneCelular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFoneCelular.setText("*Celular:");
        lblFoneCelular.setPreferredSize(new java.awt.Dimension(150, 30));
        painelGeral.add(lblFoneCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 100, 20));

        lblEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEmail.setText("Email:");
        lblEmail.setAlignmentY(0.0F);
        lblEmail.setPreferredSize(new java.awt.Dimension(100, 30));
        painelGeral.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, -1, 20));

        iptNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        iptNome.setAlignmentX(0.0F);
        iptNome.setAlignmentY(0.0F);
        iptNome.setMargin(null);
        iptNome.setMaximumSize(null);
        painelGeral.add(iptNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 300, 30));

        btnSair.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconSairPeq.png"))); // NOI18N
        btnSair.setText("SAIR");
        btnSair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSair.setMargin(null);
        btnSair.setPreferredSize(new java.awt.Dimension(100, 30));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        painelGeral.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 510, 140, 30));

        btnIncluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconAdd.png"))); // NOI18N
        btnIncluir.setText("INCLUIR");
        btnIncluir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnIncluir.setMargin(null);
        btnIncluir.setPreferredSize(new java.awt.Dimension(100, 30));
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });
        painelGeral.add(btnIncluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 350, 140, 30));

        grpPessoa.add(rdPessoaFisica);
        rdPessoaFisica.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdPessoaFisica.setSelected(true);
        rdPessoaFisica.setText("Pessoa Física");
        rdPessoaFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdPessoaFisicaActionPerformed(evt);
            }
        });
        painelGeral.add(rdPessoaFisica, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 120, 20));

        grpPessoa.add(rdPessoaJuridica);
        rdPessoaJuridica.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdPessoaJuridica.setText("Pessoa Jurídica");
        rdPessoaJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdPessoaJuridicaActionPerformed(evt);
            }
        });
        painelGeral.add(rdPessoaJuridica, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 120, 20));

        lblRazaoSocial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRazaoSocial.setText("*Razão Social");
        painelGeral.add(lblRazaoSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 90, 20));

        iptRazaoSocial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        iptRazaoSocial.setEnabled(false);
        painelGeral.add(iptRazaoSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 400, 30));

        iptNomeFantasia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        iptNomeFantasia.setEnabled(false);
        painelGeral.add(iptNomeFantasia, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 450, 30));

        lblNomeFantasia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNomeFantasia.setText("Nome Fantasia");
        painelGeral.add(lblNomeFantasia, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 150, 20));

        jSeparator1.setAlignmentX(0.0F);
        jSeparator1.setAlignmentY(0.0F);
        painelGeral.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 930, 10));

        btnConsultar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconLupaPeq.png"))); // NOI18N
        btnConsultar.setText("CONSULTAR");
        btnConsultar.setAlignmentY(0.0F);
        btnConsultar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConsultar.setDisplayedMnemonicIndex(0);
        btnConsultar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnConsultar.setIconTextGap(5);
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        painelGeral.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 390, 140, 30));

        btnAlterar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconOk.png"))); // NOI18N
        btnAlterar.setText("SALVAR");
        btnAlterar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        painelGeral.add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 430, 140, 30));

        btnDesativar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDesativar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconDesativarPeq.png"))); // NOI18N
        btnDesativar.setText("DESATIVAR");
        btnDesativar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDesativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesativarActionPerformed(evt);
            }
        });
        painelGeral.add(btnDesativar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 470, 140, 30));

        lblOrgaoEmissor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblOrgaoEmissor.setText("Órgão Emissor:");
        painelGeral.add(lblOrgaoEmissor, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, 100, 20));

        iptOrgaoEmissor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        painelGeral.add(iptOrgaoEmissor, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, 150, 30));

        cbbStatus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo" }));
        cbbStatus.setEnabled(false);
        painelGeral.add(cbbStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 120, 30));

        lblStatus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblStatus.setText("STATUS:");
        painelGeral.add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 60, 30));

        iptCodigoCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        iptCodigoCliente.setAlignmentX(0.0F);
        iptCodigoCliente.setAlignmentY(0.0F);
        painelGeral.add(iptCodigoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, 80, 30));

        cbbCidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbbCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "APARECIDA DE GOIÂNIA", "ARAGOIÂNIA", "BELA VISTA DE GOIÁS", "CALDAZINHA", "GOIÂNIA", "GOIANIRA", "GUAPÓ", "HIDROLÂNDIA", "NOVA FÁTIMA", "NERÓPOLIS", "SENADOR CANEDO", "TRINDADE" }));
        cbbCidade.setAlignmentX(0.0F);
        cbbCidade.setAlignmentY(0.0F);
        cbbCidade.setNextFocusableComponent(btnIncluir);
        painelGeral.add(cbbCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 290, 170, 30));

        iptNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        iptNumero.setText("0");
        iptNumero.setAlignmentX(0.0F);
        iptNumero.setAlignmentY(0.0F);
        iptNumero.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        painelGeral.add(iptNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 70, 30));

        iptRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("############"))));
        iptRg.setAlignmentX(0.0F);
        iptRg.setAlignmentY(0.0F);
        iptRg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        painelGeral.add(iptRg, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 140, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Código:");
        painelGeral.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 70, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("* Campos Obrigatórios");
        jLabel2.setAlignmentY(0.0F);
        painelGeral.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 240, 140, -1));

        btnConsultarCodigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnConsultarCodigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconLupaPeq.png"))); // NOI18N
        btnConsultarCodigo.setAlignmentY(0.0F);
        btnConsultarCodigo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConsultarCodigo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnConsultarCodigo.setIconTextGap(5);
        btnConsultarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarCodigoActionPerformed(evt);
            }
        });
        painelGeral.add(btnConsultarCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, 30, 30));

        getContentPane().add(painelGeral, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 570));

        setSize(new java.awt.Dimension(1005, 665));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void iptCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iptCnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iptCnpjActionPerformed

    private void iptLogradouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iptLogradouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iptLogradouroActionPerformed

    private void iptCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iptCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iptCepActionPerformed

    private void iptFoneFixoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iptFoneFixoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iptFoneFixoActionPerformed

    private void iptIeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iptIeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iptIeActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        int sair = JOptionPane.showConfirmDialog(null, "Sair da Tela de Cliente? ", "Atenção", JOptionPane.YES_NO_OPTION);// exibe uma caixa de dialogo
        if (sair == JOptionPane.YES_OPTION) {
            this.dispose();//fecha o formulário cliente
        }
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        if (rdPessoaFisica.isSelected()) {
            if (iptNome.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha o campo 'Nome'");
            }
            if (iptFoneCelular.getText().isEmpty() || iptFoneCelular.getText().equals("(  )     -    ")) {
                JOptionPane.showMessageDialog(null, "Preencha o campo 'Celular'");
            }
            if (iptCpf.getText().isEmpty() || iptCpf.getText().equals("   .   .   -  ")) {
                JOptionPane.showMessageDialog(null, "Preencha o campo 'CPF'");
            } else {
                try {
                    ClienteCtrl.incluirClienteCtrl();
                } catch (SQLException ex) {
                    Logger.getLogger(ClienteFrm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else if (rdPessoaJuridica.isSelected()) {
            if (iptRazaoSocial.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha o campo 'Razão Social'");
            } else if (iptCnpj.getText().isEmpty() || iptCnpj.getText().equals("  .   .   /    -  ")) {
                JOptionPane.showMessageDialog(null, "Preencha o campo 'CNPJ'");
            } else if (iptFoneFixo.getText().isEmpty() || iptFoneFixo.getText().equals("(  )    -    ")) {
                JOptionPane.showMessageDialog(null, "Preencha o campo 'Telefone'");
            } else {
                try {
                    ClienteCtrl.incluirClienteCtrl();
                } catch (SQLException ex) {
                    Logger.getLogger(ClienteFrm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        limparCampos();
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void rdPessoaFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdPessoaFisicaActionPerformed
        if (rdPessoaFisica.isSelected()) {
            iptRazaoSocial.setEnabled(false);
            iptRazaoSocial.setText("");
            iptNomeFantasia.setEnabled(false);
            iptNomeFantasia.setText("");
            iptCnpj.setEnabled(false);
            iptCnpj.setText("");
            iptIe.setEnabled(false);
            iptIe.setText("");
            iptNome.setEnabled(true);
            iptCpf.setEnabled(true);
            iptRg.setEnabled(true);
            iptOrgaoEmissor.setEnabled(true);
            iptDataNascimento.setEnabled(true);
        }
    }//GEN-LAST:event_rdPessoaFisicaActionPerformed

    private void rdPessoaJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdPessoaJuridicaActionPerformed
        if (rdPessoaJuridica.isSelected()) {
            iptRazaoSocial.setEnabled(true);
            iptNomeFantasia.setEnabled(true);
            iptCnpj.setEnabled(true);
            iptIe.setEnabled(true);
            iptNome.setEnabled(false);
            iptNome.setText("");
            iptCpf.setEnabled(false);
            iptCpf.setText("");
            iptRg.setEnabled(false);
            iptRg.setText("");
            iptOrgaoEmissor.setEnabled(false);
            iptOrgaoEmissor.setText("");
            iptDataNascimento.setEnabled(false);
            iptDataNascimento.setText(null);
        }
    }//GEN-LAST:event_rdPessoaJuridicaActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        Cliente cliente = new Cliente();
        cliente.setCpf(iptCpf.getText());
        cliente.setCnpj(iptCnpj.getText());
        cliente.setCodigo(iptCodigoCliente.getSelectedText() != null ? Integer.parseInt(iptCodigoCliente.getSelectedText() ) : 0 );
        try {
            ClienteCtrl.buscarClienteCtrl(cliente);

        } catch (SQLException ex) {
            Logger.getLogger(ClienteFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        String codCliente = Integer.toString(cliente.getIdCliente());
        cbbStatus.setSelectedItem(cliente.getStatus());
        iptCodigoCliente.setText(codCliente);
        int tipoPessoa = cliente.getTipoPessoa();
        if (tipoPessoa == 1) {
            rdPessoaFisica.setSelected(true);
            iptRazaoSocial.setEnabled(false);
            iptRazaoSocial.setText("");
            iptNomeFantasia.setEnabled(false);
            iptNomeFantasia.setText("");
            iptCnpj.setEnabled(false);
            iptCnpj.setText("");
            iptIe.setEnabled(false);
            iptIe.setText("");
            iptNome.setEnabled(true);
            iptCpf.setEnabled(true);
            iptRg.setEnabled(true);
            iptOrgaoEmissor.setEnabled(true);
            iptDataNascimento.setEnabled(true);
        } else if (tipoPessoa == 2) {
            rdPessoaJuridica.setSelected(true);
            iptRazaoSocial.setEnabled(true);
            iptNomeFantasia.setEnabled(true);
            iptCnpj.setEnabled(true);
            iptIe.setEnabled(true);
            iptNome.setEnabled(false);
            iptNome.setText("");
            iptCpf.setEnabled(false);
            iptCpf.setText("");
            iptRg.setEnabled(false);
            iptRg.setText("");
            iptOrgaoEmissor.setEnabled(false);
            iptOrgaoEmissor.setText("");
            iptDataNascimento.setEnabled(false);
            iptDataNascimento.setText(null);
        }
        iptNome.setText(cliente.getNome());
        iptCpf.setText(cliente.getCpf());
        iptRazaoSocial.setText(cliente.getRazaoSocial());
        iptNomeFantasia.setText(cliente.getNomeFantasia());
        iptCnpj.setText(cliente.getCnpj());
        iptIe.setText(cliente.getIe());
        iptDataNascimento.setText(cliente.getDataNascimento());
        iptFoneFixo.setText(cliente.getFoneFixo());
        iptFoneCelular.setText(cliente.getFoneCelular());
        iptEmail.setText(cliente.getEmail());
        iptRg.setText(cliente.getRg());
        iptOrgaoEmissor.setText(cliente.getOrgaoEmissorRg());
        txtObservacoes.setText(cliente.getObservacoes());
        iptCep.setText(cliente.getCep());
        iptLogradouro.setText(cliente.getLogradouro());
        iptComplemento.setText(cliente.getComplemento());
        iptBairro.setText(cliente.getBairro());
        iptNumero.setText(Integer.toString(cliente.getNumero()));
        if (!iptCodigoCliente.getText().equals(null) && !iptCodigoCliente.getText().equals(0)) {
            ClienteFrm.btnAlterar.setEnabled(true);
            cbbCidade.setSelectedItem(cliente.getCidade());
            cbbEstado.setSelectedItem(cliente.getEstado());

        } else {
            cbbCidade.setSelectedItem(0);
            cbbEstado.setSelectedItem(0);
            String status = cliente.getStatus();
            int sts = 0;
            if (status.equals(1)) {
                cbbStatus.setSelectedItem("Ativo");
            } else if (status.equals(2)) {
                cbbStatus.setSelectedItem("Inativo");
            }
        }
        String status = cliente.getStatus();
        /*String sts = null;
        if (status.equals("1")) {
            cbbStatus.setSelectedIndex(0);
        } else if (status.equals("2")) {
            cbbStatus.setSelectedIndex(1);

            rdPessoaFisica.setEnabled(false);
            iptRazaoSocial.setEnabled(false);
            iptNomeFantasia.setEnabled(false);
            iptCnpj.setEnabled(false);
            iptIe.setEnabled(false);
            iptNome.setEnabled(false);
            iptCpf.setEnabled(false);
            iptRg.setEnabled(false);
            iptOrgaoEmissor.setEnabled(false);
            iptDataNascimento.setEnabled(false);
            rdPessoaJuridica.setEnabled(false);
            iptFoneFixo.setEnabled(false);
            iptFoneCelular.setEnabled(false);
            iptEmail.setEnabled(false);
            iptCep.setEnabled(false);
            iptLogradouro.setEnabled(false);
            iptBairro.setEnabled(false);
            iptComplemento.setEnabled(false);
            iptNumero.setEnabled(false);
            cbbCidade.setEnabled(false);
            cbbEstado.setEnabled(false);
            cbbStatus.setEnabled(false);
            txtObservacoes.setEnabled(false);

        }*/
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        try {
            ClienteCtrl.alterarClienteCtrl();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnDesativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesativarActionPerformed
        Cliente cliente = new Cliente();
        cbbStatus.setSelectedItem("Inativo");
        Object sts = cbbStatus.getSelectedItem();
        String status = sts.toString();

        if (sts.equals("Inativo")) {
            try {
                cliente.setStatus(status);
                ClienteCtrl.alterarClienteCtrl();
            } catch (SQLException ex) {
                Logger.getLogger(ClienteFrm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnDesativarActionPerformed

    private void btnConsultarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarCodigoActionPerformed
        Cliente cliente = new Cliente();
        try {
            cliente.setCodigo(Integer.parseInt(iptCodigoCliente.getText()));
            ClienteCtrl.buscarClienteCodigoCtrl(cliente);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteFrm.class.getName()).log(Level.SEVERE, null, ex);
        }

        String codCliente = Integer.toString(cliente.getIdCliente());
        cbbStatus.setSelectedItem(cliente.getStatus());
        iptCodigoCliente.setText(codCliente);
        int tipoPessoa = cliente.getTipoPessoa();
        if (tipoPessoa == 1) {
            rdPessoaFisica.setSelected(true);
            iptRazaoSocial.setEnabled(false);
            iptRazaoSocial.setText("");
            iptNomeFantasia.setEnabled(false);
            iptNomeFantasia.setText("");
            iptCnpj.setEnabled(false);
            iptCnpj.setText("");
            iptIe.setEnabled(false);
            iptIe.setText("");
            iptNome.setEnabled(true);
            iptCpf.setEnabled(true);
            iptRg.setEnabled(true);
            iptOrgaoEmissor.setEnabled(true);
            iptDataNascimento.setEnabled(true);
        } else if (tipoPessoa == 2) {
            rdPessoaJuridica.setSelected(true);
            iptRazaoSocial.setEnabled(true);
            iptNomeFantasia.setEnabled(true);
            iptCnpj.setEnabled(true);
            iptIe.setEnabled(true);
            iptNome.setEnabled(false);
            iptNome.setText("");
            iptCpf.setEnabled(false);
            iptCpf.setText("");
            iptRg.setEnabled(false);
            iptRg.setText("");
            iptOrgaoEmissor.setEnabled(false);
            iptOrgaoEmissor.setText("");
            iptDataNascimento.setEnabled(false);
            iptDataNascimento.setText(null);
        }
        iptNome.setText(cliente.getNome());
        iptCpf.setText(cliente.getCpf());
        iptRazaoSocial.setText(cliente.getRazaoSocial());
        iptNomeFantasia.setText(cliente.getNomeFantasia());
        iptCnpj.setText(cliente.getCnpj());
        iptIe.setText(cliente.getIe());
        iptDataNascimento.setText(cliente.getDataNascimento());
        iptFoneFixo.setText(cliente.getFoneFixo());
        iptFoneCelular.setText(cliente.getFoneCelular());
        iptEmail.setText(cliente.getEmail());
        iptRg.setText(cliente.getRg());
        iptOrgaoEmissor.setText(cliente.getOrgaoEmissorRg());
        txtObservacoes.setText(cliente.getObservacoes());
        iptCep.setText(cliente.getCep());
        iptLogradouro.setText(cliente.getLogradouro());
        iptComplemento.setText(cliente.getComplemento());
        iptBairro.setText(cliente.getBairro());
        iptNumero.setText(Integer.toString(cliente.getNumero()));
        if (!iptCodigoCliente.getText().equals(null) && !iptCodigoCliente.getText().equals(0)) {
            ClienteFrm.btnAlterar.setEnabled(true);
            cbbCidade.setSelectedItem(cliente.getCidade());
            cbbEstado.setSelectedItem(cliente.getEstado());

        } else {
            cbbCidade.setSelectedItem(0);
            cbbEstado.setSelectedItem(0);
            String status = cliente.getStatus();
            int sts = 0;
            if (status.equals(1)) {
                cbbStatus.setSelectedItem("Ativo");
            } else if (status.equals(2)) {
                cbbStatus.setSelectedItem("Inativo");
            }
        }
        String status = cliente.getStatus();
        /*String sts = null;
        if (status.equals("1")) {
            cbbStatus.setSelectedIndex(0);
            
            //rdPessoaFisica.setEnabled(true);
            //iptRazaoSocial.setEnabled(true);
            //iptNomeFantasia.setEnabled(true);
            //iptCnpj.setEnabled(false);
            //iptIe.setEnabled(true);
            //iptNome.setEnabled(true);
            //iptCpf.setEnabled(false);
            //iptRg.setEnabled(true);
            //iptOrgaoEmissor.setEnabled(false);
            iptDataNascimento.setEnabled(true);
            //rdPessoaJuridica.setEnabled(false);
            iptFoneFixo.setEnabled(true);
            iptFoneCelular.setEnabled(true);
            iptEmail.setEnabled(true);
            iptCep.setEnabled(true);
            iptLogradouro.setEnabled(true);
            iptBairro.setEnabled(true);
            iptComplemento.setEnabled(true);
            iptNumero.setEnabled(true);
            cbbCidade.setEnabled(true);
            cbbEstado.setEnabled(true);
            txtObservacoes.setEnabled(true);

        } else if (status.equals("2")) {
            cbbStatus.setSelectedIndex(1);

            rdPessoaFisica.setEnabled(false);
            iptRazaoSocial.setEnabled(false);
            iptNomeFantasia.setEnabled(false);
            iptCnpj.setEnabled(false);
            iptIe.setEnabled(false);
            iptNome.setEnabled(false);
            iptCpf.setEnabled(false);
            iptRg.setEnabled(false);
            iptOrgaoEmissor.setEnabled(false);
            iptDataNascimento.setEnabled(false);
            rdPessoaJuridica.setEnabled(false);
            iptFoneFixo.setEnabled(false);
            iptFoneCelular.setEnabled(false);
            iptEmail.setEnabled(false);
            iptCep.setEnabled(false);
            iptLogradouro.setEnabled(false);
            iptBairro.setEnabled(false);
            iptComplemento.setEnabled(false);
            iptNumero.setEnabled(false);
            cbbCidade.setEnabled(false);
            cbbEstado.setEnabled(false);
            cbbStatus.setEnabled(false);
            txtObservacoes.setEnabled(false);

        }*/
    }//GEN-LAST:event_btnConsultarCodigoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblBairro;
    private javax.swing.JLabel LblNumero;
    public static javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnConsultarCodigo;
    private javax.swing.JButton btnDesativar;
    public static javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnSair;
    public static javax.swing.JComboBox<String> cbbCidade;
    public static javax.swing.JComboBox<String> cbbEstado;
    public static javax.swing.JComboBox<String> cbbStatus;
    private javax.swing.ButtonGroup grpPessoa;
    public static javax.swing.JTextField iptBairro;
    public static javax.swing.JFormattedTextField iptCep;
    public static javax.swing.JFormattedTextField iptCnpj;
    public static javax.swing.JTextField iptCodigoCliente;
    public static javax.swing.JTextField iptComplemento;
    public static javax.swing.JFormattedTextField iptCpf;
    public static javax.swing.JFormattedTextField iptDataNascimento;
    public static javax.swing.JTextField iptEmail;
    public static javax.swing.JFormattedTextField iptFoneCelular;
    public static javax.swing.JFormattedTextField iptFoneFixo;
    public static javax.swing.JTextField iptIe;
    public static javax.swing.JTextField iptLogradouro;
    public static javax.swing.JTextField iptNome;
    public static javax.swing.JTextField iptNomeFantasia;
    public static javax.swing.JFormattedTextField iptNumero;
    public static javax.swing.JTextField iptOrgaoEmissor;
    public static javax.swing.JTextField iptRazaoSocial;
    public static javax.swing.JFormattedTextField iptRg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblCnpj;
    private javax.swing.JLabel lblComplemento;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblDataNascimento;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFoneCelular;
    private javax.swing.JLabel lblFoneFixo;
    private javax.swing.JLabel lblIe;
    private javax.swing.JLabel lblLogradouro;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomeFantasia;
    private javax.swing.JLabel lblObservacoes;
    private javax.swing.JLabel lblOrgaoEmissor;
    private javax.swing.JLabel lblRazaoSocial;
    private javax.swing.JLabel lblRg;
    private javax.swing.JLabel lblStatus;
    public static javax.swing.JPanel painelGeral;
    public static javax.swing.JRadioButton rdPessoaFisica;
    public static javax.swing.JRadioButton rdPessoaJuridica;
    public static javax.swing.JTextArea txtObservacoes;
    // End of variables declaration//GEN-END:variables

    public static void limparCampos() {
        iptCodigoCliente.setText("");
        iptNome.setText("");
        iptCpf.setText("");
        iptRazaoSocial.setText("");
        iptNomeFantasia.setText("");
        iptCnpj.setText("");
        iptIe.setText("");
        iptDataNascimento.setText("");
        iptFoneFixo.setText("");
        iptFoneCelular.setText("");
        iptEmail.setText("");
        iptRg.setText("");
        iptOrgaoEmissor.setText("");
        txtObservacoes.setText("");
        iptCep.setText("");
        iptLogradouro.setText("");
        iptComplemento.setText("");
        iptBairro.setText("");
        iptNumero.setText("");
        cbbCidade.setSelectedIndex(-1);
        cbbEstado.setSelectedIndex(-1);
    }
}
