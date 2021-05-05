package model;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import view.FuncionarioFrm;

public class Funcionario extends Pessoa {

    private int codigo;
    /*private String nome;
    private String cpf;
    private String rg;
    private String orgaoEmissorRg;
    private String dataNascimento;*/
    private String localNascimento;
    private int tipoPessoa;
    public String status;
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
    private String cargo;
    private String departamento;
    private String salario;
    private String ctps;
    private String serieCtps;
    private String pisPasep;
    private String ufCtps;
    private String dataContratacao;
    private String dataSaida;
    private String tituloEleitor;
    private String zona;
    private String secao;
    private String nomePai;
    private String nomeMae;
    private String estadoCivil;
    private String qtdeFilhos;

    private Funcionario_Endereco endereco = new Funcionario_Endereco();
    private PessoaFuncionario pessoa = new PessoaFuncionario();
    
    public Funcionario(){
        
    }

    public Funcionario(int codigo, String nome, String cpf, String rg, String orgaoEmissorRg, String dataNascimento, String localNascimento, int tipoPessoa, String status, String razaoSocial, String nomeFantasia, String cnpj, String ie, String foneFixo, String foneCelular, String email, String cep, String logradouro, String complemento, String numero, String bairro, String cidade, String estado, String observacoes, String cargo, String departamento, String salario, String ctps, String serieCtps, String pisPasep, String ufCtps, String dataContratacao, String dataSaida, String tituloEleitor, String zona, String secao, String nomePai, String nomeMae, String estadoCivil, String qtdeFilhos) {
        this.codigo = codigo;
        /*this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.orgaoEmissorRg = orgaoEmissorRg;
        this.dataNascimento = dataNascimento;*/
        this.localNascimento = localNascimento;
        this.tipoPessoa = tipoPessoa;
        this.status = status;
        /*this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.ie = ie;*/
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
        this.cargo = cargo;
        this.departamento = departamento;
        this.salario = salario;
        this.ctps = ctps;
        this.serieCtps = serieCtps;
        this.pisPasep = pisPasep;
        this.ufCtps = ufCtps;
        this.dataContratacao = dataContratacao;
        this.dataSaida = dataSaida;
        this.tituloEleitor = tituloEleitor;
        this.zona = zona;
        this.secao = secao;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
        this.estadoCivil = estadoCivil;
        this.qtdeFilhos = qtdeFilhos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /*public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getOrgaoEmissorRg() {
        return orgaoEmissorRg;
    }

    public void setOrgaoEmissorRg(String orgaoEmissorRg) {
        this.orgaoEmissorRg = orgaoEmissorRg;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
*/
    public String getLocalNascimento() {
        return localNascimento;
    }

    public void setLocalNascimento(String localNascimento) {
        this.localNascimento = localNascimento;
    }

    public int getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(int tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFoneFixo() {
        return foneFixo;
    }

    public void setFoneFixo(String foneFixo) {
        this.foneFixo = foneFixo;
    }

    public String getFoneCelular() {
        return foneCelular;
    }

    public void setFoneCelular(String foneCelular) {
        this.foneCelular = foneCelular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public String getSerieCtps() {
        return serieCtps;
    }

    public void setSerieCtps(String serieCtps) {
        this.serieCtps = serieCtps;
    }

    public String getPisPasep() {
        return pisPasep;
    }

    public void setPisPasep(String pisPasep) {
        this.pisPasep = pisPasep;
    }

    public String getUfCtps() {
        return ufCtps;
    }

    public void setUfCtps(String ufCtps) {
        this.ufCtps = ufCtps;
    }

    public String getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(String dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getTituloEleitor() {
        return tituloEleitor;
    }

    public void setTituloEleitor(String tituloEleitor) {
        this.tituloEleitor = tituloEleitor;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getSecao() {
        return secao;
    }

    public void setSecao(String secao) {
        this.secao = secao;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getQtdeFilhos() {
        return qtdeFilhos;
    }

    public void setQtdeFilhos(String qtdeFilhos) {
        this.qtdeFilhos = qtdeFilhos;
    }

    public Funcionario_Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Funcionario_Endereco endereco) {
        this.endereco = endereco;
    }

    public PessoaFuncionario getPessoa() {
        return pessoa;
    }

    public void setPessoa(PessoaFuncionario pessoa) {
        this.pessoa = pessoa;
    }

    

    // fim dos métodos set
    /*public int getIntCodigo(JTextField iptCodigo) {
        return Integer.parseInt(iptCodigo.getText());
    }
*/
    public String getTextNome(JTextField iptNome) {
        return iptNome.getText().trim();
    }

    public String getTextNomeMae(JTextField iptNomeMae) {
        return iptNomeMae.getText().trim();
    }

    public String getTextNomePai(JTextField iptNomePai) {
        return iptNomePai.getText().trim();
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

    public String getTextNomeFantasia(JTextField iptNomeFantasia) {
        return iptNomeFantasia.getText().trim();
    }

    public String getTextIe(JTextField iptIe) {
        return iptIe.getText().trim();
    }

    public String getTextDataNascimento(JFormattedTextField iptDataNascimento) {
        return iptDataNascimento.getText().trim();
    }

    public String getTextDataContratacao(JFormattedTextField iptDataContratacao) {
        return iptDataContratacao.getText().trim();
    }

    public String getTextDataSaida(JFormattedTextField iptDataSaida) {
        return iptDataSaida.getText().trim();
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

    public String getTextLocalNascimento(JTextField iptLocalNascimento) {
        return iptLocalNascimento.getText().trim();
    }

    public String getTextComplemento(JTextField iptComplemento) {
        return iptComplemento.getText().trim();
    }

    public String getTextBairro(JTextField iptBairro) {
        return iptBairro.getText().trim();
    }

    public String getTextCargo(JTextField iptCargo) {
        return iptCargo.getText().trim();
    }

    public String getTextCtps(JTextField iptCtps) {
        return iptCtps.getText().trim();
    }

    public String getTextDepartamento(JTextField iptDepartamento) {
        return iptDepartamento.getText().trim();
    }

    public String getTextNumero(JTextField iptNumero) {
        return iptNumero.getText().trim();
    }

    public String getTextPisPasep(JTextField iptPisPasep) {
        return iptPisPasep.getText().trim();
    }

    public String getComboCidade(JComboBox<String> cbbCidade) {
        return cbbCidade.getSelectedItem().toString();
    }

    public String getComboEstado(JComboBox<String> cbbEstado) {
        return cbbEstado.getSelectedItem().toString();
    }

    public String getComboEstadoCivil(JComboBox<String> cbbEstadoCivil) {
        return cbbEstadoCivil.getSelectedItem().toString();
    }

    public String getComboUfCtps(JComboBox<String> cbbUfCtps) {
        return cbbUfCtps.getSelectedItem().toString();
    }

    public String getComboStatus(JComboBox<String> cbbStatus) {
        return cbbStatus.getSelectedItem().toString();
    }

    public String getTextObservacoes(JTextField txtObservacoes) {
        return txtObservacoes.getText().trim();
    }

    public String getTextQtdeFilhos(JTextField iptQtdFilhos) {
        return iptQtdFilhos.getText().trim();
    }

    public String getTextSalario(JTextField iptSalario) {
        return iptSalario.getText().trim();
    }

    public String getTextSecao(JTextField iptSecao) {
        return iptSecao.getText().trim();
    }

    public String getTextSerieCtps(JTextField iptSerieCtps) {
        return iptSerieCtps.getText().trim();
    }

    public String getTextTituloEleitor(JTextField iptTituloEleitor) {
        return iptTituloEleitor.getText().trim();
    }

    public String getTextZona(JTextField iptZona) {
        return iptZona.getText().trim();
    }

    public Funcionario capturarFuncionario(Funcionario funcionario) {
        funcionario.setCidade(getComboCidade(FuncionarioFrm.cbbCidade));
        funcionario.setEstado(getComboEstado(FuncionarioFrm.cbbEstado));
        funcionario.setEstadoCivil(getComboEstadoCivil(FuncionarioFrm.cbbEstadoCivil));
        funcionario.setUfCtps(getComboUfCtps(FuncionarioFrm.cbbUfCtps));
        funcionario.setBairro(getTextBairro(FuncionarioFrm.iptBairro));
        funcionario.setCargo(getTextCargo(FuncionarioFrm.iptCargo));
        funcionario.setCep(getTextCep(FuncionarioFrm.iptCep));
        funcionario.setComplemento(getTextComplemento(FuncionarioFrm.iptComplemento));
        funcionario.setCtps(getTextCtps(FuncionarioFrm.iptCtps));
        funcionario.setDataContratacao(getTextDataContratacao(FuncionarioFrm.iptDataContratacao));
        funcionario.setDataSaida(getTextDataSaida(FuncionarioFrm.iptDataSaida));
        funcionario.setDepartamento(getTextDepartamento(FuncionarioFrm.iptDepartamento));
        funcionario.setEmail(getTextEmail(FuncionarioFrm.iptEmail));
        funcionario.setFoneCelular(getTextFoneCelular(FuncionarioFrm.iptFoneCelular));
        funcionario.setFoneFixo(getTextFoneFixo(FuncionarioFrm.iptFoneFixo));
        //funcionario.setCodigo(getIntCodigo(FuncionarioFrm.iptCodigo));
        funcionario.setLocalNascimento(getTextLocalNascimento(FuncionarioFrm.iptLocalNascimento));
        funcionario.setLogradouro(getTextLogradouro(FuncionarioFrm.iptLogradouro));
        funcionario.setNomeMae(getTextNomeMae(FuncionarioFrm.iptNomeMae));
        funcionario.setNomePai(getTextNomePai(FuncionarioFrm.iptNomePai));
        funcionario.setNumero(getTextNumero(FuncionarioFrm.iptNumero));
        funcionario.setPisPasep(getTextPisPasep(FuncionarioFrm.iptPisPasep));
        funcionario.setQtdeFilhos(getTextQtdeFilhos(FuncionarioFrm.iptQtdeFilhos));
        funcionario.setSalario(getTextSalario(FuncionarioFrm.iptSalario));
        funcionario.setSecao(getTextSecao(FuncionarioFrm.iptSecao));
        funcionario.setSerieCtps(getTextSerieCtps(FuncionarioFrm.iptSerieCtps));
        funcionario.setTituloEleitor(getTextTituloEleitor(FuncionarioFrm.iptTituloEleitor));
        funcionario.setZona(getTextZona(FuncionarioFrm.iptZona));

        return funcionario;
    }
}
