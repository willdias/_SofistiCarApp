package view;

import conexoes.ConexoesMySql;
import controller.ControleLookAndFeel;
import dao.LoginDao;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class TelaPrincipalFrm extends javax.swing.JFrame {

    Connection conexao = null;

    public TelaPrincipalFrm() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        conexao = ConexoesMySql.base();
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

        desktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblDataAcesso = new javax.swing.JLabel();
        lblAcesso = new javax.swing.JLabel();
        brFerramentas = new javax.swing.JToolBar();
        btnIncluirCliente = new javax.swing.JButton();
        btnIncluirVeículo = new javax.swing.JButton();
        btnIncluirOs = new javax.swing.JButton();
        MenuPrincipal = new javax.swing.JMenuBar();
        MenCadastros = new javax.swing.JMenu();
        menCadastrar = new javax.swing.JMenuItem();
        MenRelatorio = new javax.swing.JMenu();
        MenRelatorios = new javax.swing.JMenuItem();
        MenEstoque = new javax.swing.JMenu();
        MenMovimentacaoEstoque = new javax.swing.JMenuItem();
        MenAjuda = new javax.swing.JMenu();
        MenSobre = new javax.swing.JMenuItem();
        MenSair = new javax.swing.JMenu();
        MenuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("SOFISTICAR");
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        setLocation(new java.awt.Point(0, 0));
        setName("TelaPrincipal"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        desktop.setAlignmentX(0.0F);
        desktop.setAlignmentY(0.0F);
        desktop.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        desktop.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        desktop.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        desktop.setNextFocusableComponent(MenCadastros);
        desktop.setPreferredSize(new java.awt.Dimension(1420, 920));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconSofisticarSistema.png"))); // NOI18N
        jLabel1.setAlignmentY(0.0F);

        desktop.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopLayout.createSequentialGroup()
                .addContainerGap(491, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(490, 490, 490))
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopLayout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(266, Short.MAX_VALUE))
        );

        getContentPane().add(desktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1340, 620));

        lblUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblUsuario.setText("Usuário");
        lblUsuario.setAlignmentY(0.0F);
        getContentPane().add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, 110, 20));

        lblDataAcesso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDataAcesso.setAlignmentY(0.0F);
        getContentPane().add(lblDataAcesso, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 660, 130, 20));

        lblAcesso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblAcesso.setText("Último Acesso em:");
        lblAcesso.setAlignmentY(0.0F);
        getContentPane().add(lblAcesso, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 660, -1, 20));

        brFerramentas.setRollover(true);
        brFerramentas.setAlignmentX(0.0F);

        btnIncluirCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnIncluirCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconAdd.png"))); // NOI18N
        btnIncluirCliente.setText("Cliente");
        btnIncluirCliente.setToolTipText("Adicionar Cliente");
        btnIncluirCliente.setAlignmentY(0.0F);
        btnIncluirCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnIncluirCliente.setDisabledIcon(null);
        btnIncluirCliente.setDisabledSelectedIcon(null);
        btnIncluirCliente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnIncluirCliente.setIconTextGap(10);
        btnIncluirCliente.setMaximumSize(new java.awt.Dimension(150, 40));
        btnIncluirCliente.setMinimumSize(new java.awt.Dimension(150, 40));
        btnIncluirCliente.setPreferredSize(new java.awt.Dimension(150, 40));
        btnIncluirCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnIncluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirClienteActionPerformed(evt);
            }
        });
        brFerramentas.add(btnIncluirCliente);

        btnIncluirVeículo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnIncluirVeículo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconAdd.png"))); // NOI18N
        btnIncluirVeículo.setText("Veículo");
        btnIncluirVeículo.setToolTipText("Adicionar Veículo");
        btnIncluirVeículo.setAlignmentY(0.0F);
        btnIncluirVeículo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnIncluirVeículo.setDisabledIcon(null);
        btnIncluirVeículo.setDisabledSelectedIcon(null);
        btnIncluirVeículo.setFocusable(false);
        btnIncluirVeículo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnIncluirVeículo.setIconTextGap(10);
        btnIncluirVeículo.setMaximumSize(new java.awt.Dimension(150, 40));
        btnIncluirVeículo.setMinimumSize(new java.awt.Dimension(150, 40));
        btnIncluirVeículo.setPreferredSize(new java.awt.Dimension(150, 40));
        btnIncluirVeículo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirVeículoActionPerformed(evt);
            }
        });
        brFerramentas.add(btnIncluirVeículo);
        btnIncluirVeículo.getAccessibleContext().setAccessibleDescription("Adicionar Novo Veículo");

        btnIncluirOs.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnIncluirOs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/iconAdd.png"))); // NOI18N
        btnIncluirOs.setText("O.S");
        btnIncluirOs.setToolTipText("Adicionar OS");
        btnIncluirOs.setAlignmentY(0.0F);
        btnIncluirOs.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnIncluirOs.setDisabledIcon(null);
        btnIncluirOs.setDisabledSelectedIcon(null);
        btnIncluirOs.setFocusable(false);
        btnIncluirOs.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnIncluirOs.setIconTextGap(10);
        btnIncluirOs.setMaximumSize(new java.awt.Dimension(150, 40));
        btnIncluirOs.setMinimumSize(new java.awt.Dimension(150, 40));
        btnIncluirOs.setPreferredSize(new java.awt.Dimension(150, 40));
        btnIncluirOs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirOsActionPerformed(evt);
            }
        });
        brFerramentas.add(btnIncluirOs);

        getContentPane().add(brFerramentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 40));

        MenuPrincipal.setAlignmentX(0.0F);

        MenCadastros.setText("Cadastros");
        MenCadastros.setAlignmentX(0.0F);
        MenCadastros.setAlignmentY(0.0F);
        MenCadastros.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        MenCadastros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenCadastrosActionPerformed(evt);
            }
        });

        menCadastrar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        menCadastrar.setText("Menu de Cadastros");
        menCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCadastrarActionPerformed(evt);
            }
        });
        MenCadastros.add(menCadastrar);

        MenuPrincipal.add(MenCadastros);

        MenRelatorio.setText("Relatório");
        MenRelatorio.setAlignmentX(0.0F);
        MenRelatorio.setAlignmentY(0.0F);
        MenRelatorio.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        MenRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenRelatorioActionPerformed(evt);
            }
        });

        MenRelatorios.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        MenRelatorios.setText("Menu de Relatórios");
        MenRelatorios.setAlignmentX(0.0F);
        MenRelatorios.setAlignmentY(0.0F);
        MenRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenRelatoriosActionPerformed(evt);
            }
        });
        MenRelatorio.add(MenRelatorios);

        MenuPrincipal.add(MenRelatorio);

        MenEstoque.setText("Estoque");
        MenEstoque.setAlignmentX(0.0F);
        MenEstoque.setAlignmentY(0.0F);
        MenEstoque.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        MenMovimentacaoEstoque.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        MenMovimentacaoEstoque.setText("Movimentação de Estoque");
        MenMovimentacaoEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenMovimentacaoEstoqueActionPerformed(evt);
            }
        });
        MenEstoque.add(MenMovimentacaoEstoque);

        MenuPrincipal.add(MenEstoque);

        MenAjuda.setText("Ajuda");
        MenAjuda.setAlignmentX(0.0F);
        MenAjuda.setAlignmentY(0.0F);
        MenAjuda.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        MenSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.ALT_MASK));
        MenSobre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        MenSobre.setText("Sobre");
        MenSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenSobreActionPerformed(evt);
            }
        });
        MenAjuda.add(MenSobre);

        MenuPrincipal.add(MenAjuda);

        MenSair.setText("Sair");
        MenSair.setAlignmentX(0.0F);
        MenSair.setAlignmentY(0.0F);
        MenSair.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        MenSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenSairActionPerformed(evt);
            }
        });

        MenuSair.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        MenuSair.setText("Sair");
        MenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSairActionPerformed(evt);
            }
        });
        MenSair.add(MenuSair);

        MenuPrincipal.add(MenSair);

        setJMenuBar(MenuPrincipal);

        setSize(new java.awt.Dimension(1356, 739));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // as linhas abaixo substituem a label lblData pela data atual do sistema ao iniciar o form
        Date data = new Date();
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);
        lblDataAcesso.setText(formatador.format(data));
    }//GEN-LAST:event_formWindowActivated

    private void MenSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenSobreActionPerformed
        // chamando a tela sobre
        telaSobre sobre = null;
        try {
            sobre = new telaSobre();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TelaPrincipalFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        sobre.setVisible(true);
    }//GEN-LAST:event_MenSobreActionPerformed

    private void MenCadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenCadastrosActionPerformed

    }//GEN-LAST:event_MenCadastrosActionPerformed

    private void MenSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenSairActionPerformed

    }//GEN-LAST:event_MenSairActionPerformed

    private void MenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSairActionPerformed
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair? ", "Atenção", JOptionPane.YES_NO_OPTION);
        LoginFrm login = null;
        try {
            login = new LoginFrm(); // instancia a tela principal
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TelaPrincipalFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        login.setVisible(true); //chama a tela principal
        this.dispose();
    }//GEN-LAST:event_MenuSairActionPerformed

    private void MenRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenRelatoriosActionPerformed
        MenuRelatoriosFrm menuRelatorio = null;
        try {
            menuRelatorio = new MenuRelatoriosFrm();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TelaPrincipalFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        menuRelatorio.setVisible(true);
    }//GEN-LAST:event_MenRelatoriosActionPerformed

    private void MenRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenRelatorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenRelatorioActionPerformed

    private void menCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCadastrarActionPerformed
        MenuCadastroFrm menuCadastro = null;
        try {
            menuCadastro = new MenuCadastroFrm();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaPrincipalFrm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(TelaPrincipalFrm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TelaPrincipalFrm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TelaPrincipalFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        menuCadastro.setVisible(true);
        
    }//GEN-LAST:event_menCadastrarActionPerformed

    private void btnIncluirVeículoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirVeículoActionPerformed
        VeiculoFrm veiculo = null;
        try {
            veiculo = new VeiculoFrm();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TelaPrincipalFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        veiculo.setVisible(true);
       
    }//GEN-LAST:event_btnIncluirVeículoActionPerformed

    private void btnIncluirOsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirOsActionPerformed
        OrdemServicoFrm ordemServico = null;
        try {
            ordemServico = new OrdemServicoFrm();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TelaPrincipalFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        ordemServico.setVisible(true);
        
    }//GEN-LAST:event_btnIncluirOsActionPerformed

    private void btnIncluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirClienteActionPerformed
        ClienteFrm cliente = null;
        try {
            cliente = new ClienteFrm();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TelaPrincipalFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        cliente.setVisible(true);
        //desktop.add(cliente);
    }//GEN-LAST:event_btnIncluirClienteActionPerformed

    private void MenMovimentacaoEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenMovimentacaoEstoqueActionPerformed
        MovimentoEstoqueFrm estoque = null;
        try {
            estoque = new MovimentoEstoqueFrm();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TelaPrincipalFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        estoque.setVisible(true);
        
    }//GEN-LAST:event_MenMovimentacaoEstoqueActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenAjuda;
    private javax.swing.JMenu MenCadastros;
    private javax.swing.JMenu MenEstoque;
    private javax.swing.JMenuItem MenMovimentacaoEstoque;
    public static javax.swing.JMenu MenRelatorio;
    public static javax.swing.JMenuItem MenRelatorios;
    private javax.swing.JMenu MenSair;
    private javax.swing.JMenuItem MenSobre;
    private javax.swing.JMenuBar MenuPrincipal;
    private javax.swing.JMenuItem MenuSair;
    private javax.swing.JToolBar brFerramentas;
    private javax.swing.JButton btnIncluirCliente;
    private javax.swing.JButton btnIncluirOs;
    private javax.swing.JButton btnIncluirVeículo;
    public static javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAcesso;
    private javax.swing.JLabel lblDataAcesso;
    public static javax.swing.JLabel lblUsuario;
    private javax.swing.JMenuItem menCadastrar;
    // End of variables declaration//GEN-END:variables
public void fechaLogin() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        if (LoginDao.result != null) {
            LoginFrm login = new LoginFrm();
            login.dispose();
        }
    }

}
