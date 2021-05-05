package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pessoa {
    private int codigo_pessoa;
    private String nome_pessoa;
    private String cpf_pessoa;
    private String rg_pessoa;
    private String orgaoemissor_pessoa;
    private String dtnasc_pessoa;
    private String razaosocial_pessoa;
    private String nomefantasia_pessoa;
    private String cnpj_pessoa;
    private String ie_pessoa;
    private String observacoes_pessoa;
    private int tipo_pessoa;
    
    private List<Pessoa> funcionarios = new ArrayList<Pessoa>();
    
   

    public Pessoa() {
      
    }

    public Pessoa(int codigo_pessoa, String nome_pessoa, String cpf_pessoa, String rg_pessoa, String orgaoemissor_pessoa, String dtnasc_pessoa, String razaosocial_pessoa, String nomefantasia_pessoa, String cnpj_pessoa, String ie_pessoa, String observacoes_pessoa, int tipo_pessoa) {
        this.codigo_pessoa = codigo_pessoa;
        this.nome_pessoa = nome_pessoa;
        this.cpf_pessoa = cpf_pessoa;
        this.rg_pessoa = rg_pessoa;
        this.orgaoemissor_pessoa = orgaoemissor_pessoa;
        this.dtnasc_pessoa = dtnasc_pessoa;
        this.razaosocial_pessoa = razaosocial_pessoa;
        this.nomefantasia_pessoa = nomefantasia_pessoa;
        this.cnpj_pessoa = cnpj_pessoa;
        this.ie_pessoa = ie_pessoa;
        this.observacoes_pessoa = observacoes_pessoa;
        this.tipo_pessoa = tipo_pessoa;
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

    public String getRazaosocial_pessoa() {
        return razaosocial_pessoa;
    }

    public void setRazaosocial_pessoa(String razaosocial_pessoa) {
        this.razaosocial_pessoa = razaosocial_pessoa;
    }

    public String getNomefantasia_pessoa() {
        return nomefantasia_pessoa;
    }

    public void setNomefantasia_pessoa(String nomefantasia_pessoa) {
        this.nomefantasia_pessoa = nomefantasia_pessoa;
    }

    public String getCnpj_pessoa() {
        return cnpj_pessoa;
    }

    public void setCnpj_pessoa(String cnpj_pessoa) {
        this.cnpj_pessoa = cnpj_pessoa;
    }

    public String getIe_pessoa() {
        return ie_pessoa;
    }

    public void setIe_pessoa(String ie_pessoa) {
        this.ie_pessoa = ie_pessoa;
    }

    public String getObservacoes_pessoa() {
        return observacoes_pessoa;
    }

    public void setObservacoes_pessoa(String observacoes_pessoa) {
        this.observacoes_pessoa = observacoes_pessoa;
    }

    public List<Pessoa> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Pessoa> funcionarios) {
        this.funcionarios = funcionarios;
    }
}