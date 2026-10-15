package model;

public class Contato_Tipo {
    private int codigo_contato_tipo;
    private String descricao_contato_tipo;

    public Contato_Tipo(int codigo_contato_tipo, String descricao_contato_tipo) {
        this.codigo_contato_tipo = codigo_contato_tipo;
        this.descricao_contato_tipo = descricao_contato_tipo;
    }

    public int getCodigo_contato_tipo() {
        return codigo_contato_tipo;
    }

    public void setCodigo_contato_tipo(int codigo_contato_tipo) {
        this.codigo_contato_tipo = codigo_contato_tipo;
    }

    public String getDescricao_contato_tipo() {
        return descricao_contato_tipo;
    }

    public void setDescricao_contato_tipo(String descricao_contato_tipo) {
        this.descricao_contato_tipo = descricao_contato_tipo;
    }
    
    
}
