package model;

import java.util.ArrayList;
import java.util.List;

public class PessoaFuncionario {

    private int codigo_pessoa;
    private String nome_pessoa;
    private String cpf_pessoa;
    private String rg_pessoa;
    private String orgaoemissor_pessoa;
    private String dtnasc_pessoa;
    private String email_pessoa;
    private String local_nascimento;

    private List<Funcionario> funcionarios = new ArrayList<Funcionario>();

    public PessoaFuncionario(int codigo_pessoa, String nome_pessoa, String cpf_pessoa, String rg_pessoa, String orgaoemissor_pessoa, String dtnasc_pessoa, String email_pessoa) {
        this.codigo_pessoa = codigo_pessoa;
        this.nome_pessoa = nome_pessoa;
        this.cpf_pessoa = cpf_pessoa;
        this.rg_pessoa = rg_pessoa;
        this.orgaoemissor_pessoa = orgaoemissor_pessoa;
        this.dtnasc_pessoa = dtnasc_pessoa;
        this.email_pessoa = email_pessoa;
    }

    public PessoaFuncionario() {

    }

    public int getCodigo_pessoa() {
        return codigo_pessoa;
    }

    public void setCodigo_pessoa(int codigo_pessoa) {
        this.codigo_pessoa = codigo_pessoa;
    }

    public String getNome_pessoa() {
        return nome_pessoa;
    }

    public void setNome_pessoa(String nome_pessoa) {
        this.nome_pessoa = nome_pessoa;
    }

    public String getCpf_pessoa() {
        return cpf_pessoa;
    }

    public void setCpf_pessoa(String cpf_pessoa) {
        this.cpf_pessoa = cpf_pessoa;
    }

    public String getRg_pessoa() {
        return rg_pessoa;
    }

    public void setRg_pessoa(String rg_pessoa) {
        this.rg_pessoa = rg_pessoa;
    }

    public String getOrgaoemissor_pessoa() {
        return orgaoemissor_pessoa;
    }

    public void setOrgaoemissor_pessoa(String orgaoemissor_pessoa) {
        this.orgaoemissor_pessoa = orgaoemissor_pessoa;
    }

    public String getDtnasc_pessoa() {
        return dtnasc_pessoa;
    }

    public void setDtnasc_pessoa(String dtnasc_pessoa) {
        this.dtnasc_pessoa = dtnasc_pessoa;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public String getEmail_pessoa() {
        return email_pessoa;
    }

    public void setEmail_pessoa(String email_pessoa) {
        this.email_pessoa = email_pessoa;
    }
    
    public String getLocal_nascimento() {
        return local_nascimento;
    }

    public void setLocal_nascimento(String local_nascimento) {
        this.local_nascimento = local_nascimento;
    }
}
