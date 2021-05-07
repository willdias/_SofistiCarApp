package model;

import dao.ClienteDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import view.ClienteFrm;

public class Cliente implements controller.ClienteCtrl{

    private int codigo;
    private String nome;
    private String cpf;
    private String rg;
    private String orgaoEmissorRg;
    private String dataNascimento;
    private int tipoPessoa;
    private String status;
    private String razaoSocial;
    private String nomeFantasia;
    private String cnpj;
    private String ie;
    private String foneFixo;
    private String foneCelular;
    private String email;
    private String cep;
    private String logradouro;
    private String complemento;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String observacoes;
    private String texto = "16/08/2004";
    private String formato = "dd/MM/yyyy";

    public Cliente() {
    }

    public Cliente(int codigo, String nome, String cpf, String rg, String orgaoEmissorRg, String dataNascimento,
            int tipoPessoa, String status, String razaoSocial, String nomeFantasia, String cnpj, String ie,
            String foneFixo, String foneCelular, String email, String cep, String logradouro, String complemento,
            int numero, String bairro, String cidade, String estado, String observacoes) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.orgaoEmissorRg = orgaoEmissorRg;
        this.dataNascimento = dataNascimento;
        this.tipoPessoa = tipoPessoa;
        this.status = status;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.ie = ie;
        this.foneFixo = foneFixo;
        this.foneCelular = foneCelular;
        this.email = email;
        this.cep = cep;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.observacoes = observacoes;
    }

    //inicio dos métodos get
    
    private int getCodigo() {
        return this.codigo;
    }

    private String getNome() {
        return this.nome;
    }

    private String getCpf() {
        return this.cpf;
    }

    private String getRg() {
        return this.rg;
    }

    private String getOrgaoEmissorRg() {
        return this.orgaoEmissorRg;
    }

    private String getDataNascimento() {
        return this.dataNascimento;
    }

    private int getTipoPessoa() {
        return this.tipoPessoa;
    }
    
    private String getStatus() {
        return this.status;
    }
    
    private String getRazaoSocial() {
        return this.razaoSocial;
    }

    private String getNomeFantasia() {
        return this.nomeFantasia;
    }
    
    private String getCnpj() {
        return this.cnpj;
    }

    private String getIe() {
        return this.ie;
    }

    private String getFoneFixo() {
        return this.foneFixo;
    }
    
    private String getFoneCelular() {
        return this.foneCelular;
    }
    
    private String getEmail() {
        return this.email;
    }

    private String getCep() {
        return this.cep;
    }

    private String getLogradouro() {
        return this.logradouro;
    }

    private String getComplemento() {
        return this.complemento;
    }
    
    private int getNumero() {
        return this.numero;
    }
    
    private String getBairro() {
        return this.bairro;
    }
    
    private String getCidade() {
        return this.cidade;
    }
    
    private String getEstado() {
        return this.estado;
    }
    
    private String getObservacoes() {
        return this.observacoes;
    }
    
    private String getTexto() {
        return this.texto;
    }
    //fim dos métodos get

    //inicio dos métodos set
    private void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private void setCpf(String cpf) {
        this.cpf = cpf;
    }

    private void setRg(String rg) {
        this.rg = rg;
    }

    private void setOrgaoEmissorRg(String orgaoEmissorRg) {
        this.orgaoEmissorRg = orgaoEmissorRg;
    }

    private void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    private void setTipoPessoa(int tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }
    
    private void setStatus(String status) {
        this.status = status;
    }
    
    private void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    
    private void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
    
    private void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    private void setIe(String ie) {
        this.ie = ie;
    }
    
    private void setFoneFixo(String foneFixo) {
        this.foneFixo = foneFixo;
    }
    
    private void setFoneCelular(String foneCelular) {
        this.foneCelular = foneCelular;
    }
    
    private void setEmail(String email) {
        this.email = email;
    }
    
    private void setCep(String cep) {
        this.cep = cep;
    }
    
    private void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    
    private void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    private void setNumero(int numero) {
        this.numero = numero;
    }

    private void setBairro(String bairro) {
        this.bairro = bairro;
    }

    private void setCidade(String cidade) {
        this.cidade = cidade;
    }

    private void setEstado(String estado) {
        this.estado = estado;
    }

    private void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    private void setTexto(String texto) {
        this.texto = texto;
    }

    private void setFormato(String formato) {
        this.formato = formato;
    }

    // fim dos métodos set
    public int getIntCodigo(JTextField iptCodigoCliente) {
        return codigo;
    }

    public String getTextNome(JTextField iptNome) {
        return iptNome.getText().trim();
    }

    public String getTextCpf(JFormattedTextField iptCpf) {
        String cpf = iptCpf.getText().trim();
        if (cpf.equals("   .   .   -  ")) {
            return cpf = null;
        } else {
            return cpf = cpf;
        }
    }

    public String getTextFoneFixo(JFormattedTextField iptFoneFixo) {
        return iptFoneFixo.getText().trim();
    }

    public String getTextFoneCelular(JFormattedTextField iptFoneCelular) {
        return iptFoneCelular.getText().trim();
    }

    public String getTextEmail(JTextField iptEmail) {
        return iptEmail.getText().trim();
    }

    public String getTextRg(JTextField iptRg) {
        return iptRg.getText().trim();
    }

    public String getTextOrgaoEmissorRg(JTextField iptOrgaoEmissorRg) {
        return iptOrgaoEmissorRg.getText().trim();
    }

    public String getTextRazaoSocial(JTextField iptRazaoSocial) {
        return iptRazaoSocial.getText().trim();
    }

    public String getTextNomeFantasia(JTextField iptNomeFantasia) {
        return iptNomeFantasia.getText().trim();
    }

    public String getTextCnpj(JTextField iptCnpj) {
        String cnpj = iptCnpj.getText().trim();
        if (cnpj.equals("  .   .   /    -  ")) {
            return cnpj = null;
        } else {
            return cnpj = cnpj;
        }
    }

    public String getTextIe(JTextField iptIe) {
        return iptIe.getText().trim();
    }

    public String getTextDataNascimento(JFormattedTextField iptDataNascimento) {
        return iptDataNascimento.getText().trim();
    }

    public String getTextObservacoes(JTextArea txtObservacoes) {
        return txtObservacoes.getText().trim();
    }

    public String getTextCep(JFormattedTextField iptCep) {
        return iptCep.getText().trim();
    }

    public String getTextLogradouro(JTextField iptLogradouro) {
        return iptLogradouro.getText().trim();
    }

    public String getTextComplemento(JTextField iptComplemento) {
        return iptComplemento.getText().trim();
    }

    public String getTextBairro(JTextField iptBairro) {
        return iptBairro.getText().trim();
    }

    public int getIntNumero(JTextField iptNumero) {
        return numero;
    }

    public String getComboCidade(JComboBox<String> cbbCidade) {
        return cbbCidade.getSelectedItem().toString();
    }

    public String getComboEstado(JComboBox<String> cbbEstado) {
        return cbbEstado.getSelectedItem().toString();
    }

    public String getComboStatus(JComboBox<String> cbbStatus) {
        return cbbStatus.getSelectedItem().toString();
    }

    /**
     *
     * @param rdPessoaJuridica
     * @param rdPessoaFisica
     * @return
     */
    public int getTipoPessoa(JRadioButton rdPessoaFisica, JRadioButton rdPessoaJuridica) {
        if (rdPessoaFisica.isSelected()) {
            return 1;
        } else {
            return 2;
        }
    }

    public String getTextObservacoes(JTextField txtObservacoes) {
        return txtObservacoes.getText().trim();
    }

    public Cliente capturarCliente(Cliente cliente) {
        //cliente.setCodigo(getIntCodigo(ClienteFrm.iptCodigoCliente));
        cliente.setNome(getTextNome(ClienteFrm.iptNome).toUpperCase());
        cliente.setCpf(getTextCpf(ClienteFrm.iptCpf));
        cliente.setFoneFixo(getTextFoneFixo(ClienteFrm.iptFoneFixo));
        cliente.setFoneCelular(getTextFoneCelular(ClienteFrm.iptFoneCelular));
        cliente.setEmail(getTextEmail(ClienteFrm.iptEmail));
        cliente.setRg(getTextRg(ClienteFrm.iptRg));
        cliente.setOrgaoEmissorRg(getTextOrgaoEmissorRg(ClienteFrm.iptOrgaoEmissor).toUpperCase());
        cliente.setRazaoSocial(getTextRg(ClienteFrm.iptRazaoSocial).toUpperCase());
        cliente.setNomeFantasia(getTextRg(ClienteFrm.iptNomeFantasia).toUpperCase());
        cliente.setCnpj(getTextCnpj(ClienteFrm.iptCnpj));
        cliente.setIe(getTextIe(ClienteFrm.iptIe));
        cliente.setDataNascimento(getTextDataNascimento(ClienteFrm.iptDataNascimento));
        cliente.setObservacoes(getTextObservacoes(ClienteFrm.txtObservacoes).toUpperCase());
        cliente.setCep(getTextCep(ClienteFrm.iptCep));
        cliente.setLogradouro(getTextLogradouro(ClienteFrm.iptLogradouro).toUpperCase());
        cliente.setComplemento(getTextComplemento(ClienteFrm.iptComplemento).toUpperCase());
        cliente.setBairro(getTextBairro(ClienteFrm.iptBairro).toUpperCase());
        cliente.setNumero(getIntNumero(ClienteFrm.iptNumero));
        cliente.setCidade(getComboCidade(ClienteFrm.cbbCidade).toUpperCase());
        cliente.setEstado(getComboEstado(ClienteFrm.cbbEstado).toUpperCase());
        cliente.setStatus(getComboStatus(ClienteFrm.cbbStatus));
        cliente.setTipoPessoa(getTipoPessoa(ClienteFrm.rdPessoaFisica, ClienteFrm.rdPessoaJuridica));

        return cliente;
    }
    
   /* public abstract Cliente incluirClienteCtrl() throws SQLException {
        Cliente cliente = new Cliente();
        if (ClienteDao.addCliente(cliente.capturarCliente(cliente))) {
            //limparCampos();
            
        }
        return cliente;
    }

    public static Cliente buscarClienteCtrl(Cliente cliente) throws SQLException {

        ClienteDao cli = new ClienteDao();
        cli.buscarCliente(cliente);
        return cliente;
    }

    public static Cliente buscarClienteCodigoCtrl(Cliente cliente) throws SQLException {

        ClienteDao cli = new ClienteDao();
        cli.buscarClienteCodigo(cliente);
        return cliente;
    }
    
    public static Cliente alterarClienteCtrl() throws SQLException {
        Cliente cliente = new Cliente();

        if (ClienteDao.alterarCliente(cliente.capturarCliente(cliente))) {
            limparCampos();
        }
        return cliente;
    }
    public static Cliente buscarClienteVeiCtrl() throws SQLException {
        Cliente cliente = new Cliente();
        ClienteDao clienteDao = new ClienteDao();
        clienteDao.buscarClienteVeiDao();
        return cliente;
    }*/

    /**
     *
     */
    @Override
    public Cliente incluirClienteCtrl() {
        Cliente cliente = new Cliente();
        try {
            if (ClienteDao.addCliente(cliente.capturarCliente(cliente))) {
                //limparCampos();
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cliente;
    }

    @Override
    public void buscarClienteCtrl() {
    }

    @Override
    public void buscarClienteCodigoCtrl() {
    }

    @Override
    public void alterarClienteCtrl() {
    }

    @Override
    public void buscarClienteVeiCtrl() {
    }

}
