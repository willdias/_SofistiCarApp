package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import view.FornecedorFrm;

public class Fornecedor {

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
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String observacoes;
    private String texto = "16/08/2004";
    private String formato = "dd/MM/yyyy";

    public Fornecedor() {
    }

    public Fornecedor(int codigo, String nome, String cpf, String rg, String orgaoEmissorRg, String dataNascimento,
            int tipoPessoa, String status, String razaoSocial, String nomeFantasia, String cnpj, String ie,
            String foneFixo, String foneCelular, String email, String cep, String logradouro, String complemento,
            String numero, String bairro, String cidade, String estado, String observacoes) {
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
    public int getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getRg() {
        return this.rg;
    }

    public String getOrgaoEmissorRg() {
        return this.orgaoEmissorRg;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public int getTipoPessoa() {
        return this.tipoPessoa;
    }

    public String getStatus() {
        return this.status;
    }

    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    public String getNomeFantasia() {
        return this.nomeFantasia;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public String getIe() {
        return this.ie;
    }

    public String getFoneFixo() {
        return this.foneFixo;
    }

    public String getFoneCelular() {
        return this.foneCelular;
    }

    public String getEmail() {
        return this.email;
    }

    public String getCep() {
        return this.cep;
    }

    public String getLogradouro() {
        return this.logradouro;
    }

    public String getComplemento() {
        return this.complemento;
    }

    public String getNumero() {
        return this.numero;
    }

    public String getBairro() {
        return this.bairro;
    }

    public String getCidade() {
        return this.cidade;
    }

    public String getEstado() {
        return this.estado;
    }

    public String getObservacoes() {
        return this.observacoes;
    }

    public String getTexto() {
        return this.texto;
    }

    //fim dos métodos get
    //inicio dos métodos set
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setOrgaoEmissorRg(String orgaoEmissorRg) {
        this.orgaoEmissorRg = orgaoEmissorRg;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setTipoPessoa(int tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public void setFoneFixo(String foneFixo) {
        this.foneFixo = foneFixo;
    }

    public void setFoneCelular(String foneCelular) {
        this.foneCelular = foneCelular;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    // fim dos métodos set
    public String getTextNome(JTextField iptNome) {
        return iptNome.getText().trim();
    }

    public String getTextCpf(JFormattedTextField iptCpf) {
        return iptCpf.getText().trim();
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
        return iptCnpj.getText().trim();
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

    public String getTextNumero(JTextField iptNumero) {
        return iptNumero.getText().trim();
    }

    public String getComboCidade(JComboBox<String> cbbCidade) {
        return cbbCidade.getSelectedItem().toString();
    }

    public String getComboEstado(JComboBox<String> cbbEstado) {
        return cbbEstado.getSelectedItem().toString();
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


    public String getComboStatus(JComboBox<String> cbbStatus) {
        return cbbStatus.getSelectedItem().toString();
    }

    public Fornecedor capturarFornecedor(Fornecedor fornecedor) {

        fornecedor.setNome(getTextNome(FornecedorFrm.iptNome));
        fornecedor.setCpf(getTextCpf(FornecedorFrm.iptCpf));
        fornecedor.setFoneFixo(getTextFoneFixo(FornecedorFrm.iptFoneFixo));
        fornecedor.setFoneCelular(getTextFoneCelular(FornecedorFrm.iptFoneCelular));
        fornecedor.setEmail(getTextEmail(FornecedorFrm.iptEmail));
        fornecedor.setRg(getTextRg(FornecedorFrm.iptRg));
        fornecedor.setOrgaoEmissorRg(getTextOrgaoEmissorRg(FornecedorFrm.iptOrgaoEmissor));
        fornecedor.setRazaoSocial(getTextRg(FornecedorFrm.iptRazaoSocial));
        fornecedor.setNomeFantasia(getTextRg(FornecedorFrm.iptNomeFantasia));
        fornecedor.setCnpj(getTextCnpj(FornecedorFrm.iptCnpj));
        fornecedor.setIe(getTextIe(FornecedorFrm.iptIe));
        fornecedor.setDataNascimento(getTextDataNascimento(FornecedorFrm.iptDataNascimento));
        fornecedor.setObservacoes(getTextObservacoes(FornecedorFrm.txtObservacoes));
        fornecedor.setCep(getTextCep(FornecedorFrm.iptCep));
        fornecedor.setLogradouro(getTextLogradouro(FornecedorFrm.iptLogradouro));
        fornecedor.setComplemento(getTextComplemento(FornecedorFrm.iptComplemento));
        fornecedor.setBairro(getTextBairro(FornecedorFrm.iptBairro));
        fornecedor.setNumero(getTextNumero(FornecedorFrm.iptNumero));
        fornecedor.setCidade(getComboCidade(FornecedorFrm.cbbCidade));
        fornecedor.setEstado(getComboEstado(FornecedorFrm.cbbEstado));
        fornecedor.setStatus(getComboStatus(FornecedorFrm.cbbStatus));
        fornecedor.setTipoPessoa(getTipoPessoa(FornecedorFrm.rdPessoaFisica, FornecedorFrm.rdPessoaJuridica));

        return fornecedor;
    }
}
