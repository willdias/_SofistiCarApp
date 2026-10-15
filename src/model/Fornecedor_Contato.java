package model;

public class Fornecedor_Contato {
    private int codigo_contato_fornecedor;
    private String descricao_fornecedor_contato;
    private int id_fornecedor;
    private int id_contato_tipo;

    public Fornecedor_Contato(int codigo_contato_fornecedor, String descricao_fornecedor_contato, int id_fornecedor, int id_contato_tipo) {
        this.codigo_contato_fornecedor = codigo_contato_fornecedor;
        this.descricao_fornecedor_contato = descricao_fornecedor_contato;
        this.id_fornecedor = id_fornecedor;
        this.id_contato_tipo = id_contato_tipo;
    }

    public int getCodigo_contato_fornecedor() {
        return codigo_contato_fornecedor;
    }

    public void setCodigo_contato_fornecedor(int codigo_contato_fornecedor) {
        this.codigo_contato_fornecedor = codigo_contato_fornecedor;
    }

    public String getDescricao_fornecedor_contato() {
        return descricao_fornecedor_contato;
    }

    public void setDescricao_fornecedor_contato(String descricao_fornecedor_contato) {
        this.descricao_fornecedor_contato = descricao_fornecedor_contato;
    }

    public int getId_fornecedor() {
        return id_fornecedor;
    }

    public void setId_fornecedor(int id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
    }

    public int getId_contato_tipo() {
        return id_contato_tipo;
    }

    public void setId_contato_tipo(int id_contato_tipo) {
        this.id_contato_tipo = id_contato_tipo;
    }
    
    
    
}
