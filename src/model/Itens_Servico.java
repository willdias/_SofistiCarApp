package model;

public class Itens_Servico {
    private int codigo_itens_servico;
    private String descricao_itens_servico;
    private int codigo_ordem_servico;
    private int codigo_servico;
    private String preco_unit;
    private String preco_total;
    private int quantidade;

    public Itens_Servico() {
    }

    public Itens_Servico(int codigo_itens_servico, String descricao_itens_servico, int codigo_ordem_servico, int codigo_servico, String preco_unit, String preco_total, int quantidade) {
        this.codigo_itens_servico = codigo_itens_servico;
        this.descricao_itens_servico = descricao_itens_servico;
        this.codigo_ordem_servico = codigo_ordem_servico;
        this.codigo_servico = codigo_servico;
        this.preco_unit = preco_unit;
        this.preco_total = preco_total;
        this.quantidade = quantidade;
    }

    public int getCodigo_itens_servico() {
        return codigo_itens_servico;
    }

    public void setCodigo_itens_servico(int codigo_itens_servico) {
        this.codigo_itens_servico = codigo_itens_servico;
    }

    public String getDescricao_itens_servico() {
        return descricao_itens_servico;
    }

    public void setDescricao_itens_servico(String descricao_itens_servico) {
        this.descricao_itens_servico = descricao_itens_servico;
    }

    public int getCodigo_ordem_servico() {
        return codigo_ordem_servico;
    }

    public void setCodigo_ordem_servico(int codigo_ordem_servico) {
        this.codigo_ordem_servico = codigo_ordem_servico;
    }

    public int getCodigo_servico() {
        return codigo_servico;
    }

    public void setCodigo_servico(int codigo_servico) {
        this.codigo_servico = codigo_servico;
    }

    public String getPreco_unit() {
        return preco_unit;
    }

    public void setPreco_unit(String preco_unit) {
        this.preco_unit = preco_unit;
    }

    public String getPreco_total() {
        return preco_total;
    }

    public void setPreco_total(String preco_total) {
        this.preco_total = preco_total;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    
    
}
