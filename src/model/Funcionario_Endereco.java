package model;

import java.util.ArrayList;
import java.util.List;

public class Funcionario_Endereco {

    private int codigo_endereco_funcionario;
    private String cep_endereco_funcionario;
    private String logradouro_endereco_funcionario;
    private String complemento_endereco_funcionario;
    private String numero_endereco_funcionario;
    private String bairro_endereco_funcionario;
    private String cidade_endereco_funcionario;
    private String estado_endereco_funcionario;
    private int id_funcionario;
    private int endereco_id_tipo;

    private List<Funcionario> funcionarios = new ArrayList<Funcionario>();

    public Funcionario_Endereco(int codigo_endereco_funcionario, String cep_endereco_funcionario, String logradouro_endereco_funcionario, String complemento_endereco_funcionario, String numero_endereco_funcionario, String bairro_endereco_funcionario, String cidade_endereco_funcionario, String estado_endereco_funcionario, int id_funcionario, int endereco_id_tipo) {
        this.codigo_endereco_funcionario = codigo_endereco_funcionario;
        this.cep_endereco_funcionario = cep_endereco_funcionario;
        this.logradouro_endereco_funcionario = logradouro_endereco_funcionario;
        this.complemento_endereco_funcionario = complemento_endereco_funcionario;
        this.numero_endereco_funcionario = numero_endereco_funcionario;
        this.bairro_endereco_funcionario = bairro_endereco_funcionario;
        this.cidade_endereco_funcionario = cidade_endereco_funcionario;
        this.estado_endereco_funcionario = estado_endereco_funcionario;
        this.id_funcionario = id_funcionario;
        this.endereco_id_tipo = endereco_id_tipo;
    }

    public Funcionario_Endereco() {
    }

    public String getCep_endereco_funcionario() {
        return cep_endereco_funcionario;
    }

    public void setCep_endereco_funcionario(String cep_endereco_funcionario) {
        this.cep_endereco_funcionario = cep_endereco_funcionario;
    }

    public String getLogradouro_endereco_funcionario() {
        return logradouro_endereco_funcionario;
    }

    public void setLogradouro_endereco_funcionario(String logradouro_endereco_funcionario) {
        this.logradouro_endereco_funcionario = logradouro_endereco_funcionario;
    }

    public String getComplemento_endereco_funcionario() {
        return complemento_endereco_funcionario;
    }

    public void setComplemento_endereco_funcionario(String complemento_endereco_funcionario) {
        this.complemento_endereco_funcionario = complemento_endereco_funcionario;
    }

    public String getNumero_endereco_funcionario() {
        return numero_endereco_funcionario;
    }

    public void setNumero_endereco_funcionario(String numero_endereco_funcionario) {
        this.numero_endereco_funcionario = numero_endereco_funcionario;
    }

    public String getBairro_endereco_funcionario() {
        return bairro_endereco_funcionario;
    }

    public void setBairro_endereco_funcionario(String bairro_endereco_funcionario) {
        this.bairro_endereco_funcionario = bairro_endereco_funcionario;
    }

    public String getCidade_endereco_funcionario() {
        return cidade_endereco_funcionario;
    }

    public void setCidade_endereco_funcionario(String cidade_endereco_funcionario) {
        this.cidade_endereco_funcionario = cidade_endereco_funcionario;
    }

    public String getEstado_endereco_funcionario() {
        return estado_endereco_funcionario;
    }

    public void setEstado_endereco_funcionario(String estado_endereco_funcionario) {
        this.estado_endereco_funcionario = estado_endereco_funcionario;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public int getCodigo_endereco_funcionario() {
        return codigo_endereco_funcionario;
    }

    public int getId_funcionario() {
        return id_funcionario;
    }

    public int getEndereco_id_tipo() {
        return endereco_id_tipo;
    }

}
