package model;

public class Cliente_Contato {
    private int codigo_cliente_contato;
    private String descricao_cliente_contato;
    private int id_cliente;
    private int id_contato_tipo;

    public Cliente_Contato(int codigo_cliente_contato, String descricao_cliente_contato, int id_cliente, int id_contato_tipo) {
        this.codigo_cliente_contato = codigo_cliente_contato;
        this.descricao_cliente_contato = descricao_cliente_contato;
        this.id_cliente = id_cliente;
        this.id_contato_tipo = id_contato_tipo;
    }

    public int getCodigo_cliente_contato() {
        return codigo_cliente_contato;
    }

    public void setCodigo_cliente_contato(int codigo_cliente_contato) {
        this.codigo_cliente_contato = codigo_cliente_contato;
    }

    public String getDescricao_cliente_contato() {
        return descricao_cliente_contato;
    }

    public void setDescricao_cliente_contato(String descricao_cliente_contato) {
        this.descricao_cliente_contato = descricao_cliente_contato;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_contato_tipo() {
        return id_contato_tipo;
    }

    public void setId_contato_tipo(int id_contato_tipo) {
        this.id_contato_tipo = id_contato_tipo;
    }
    
    
}
