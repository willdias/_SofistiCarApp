package model;

public class Pessoa_Tipo {
    private int codigo_pessoa_tipo;
    private String descricao_pessoa_tipo;

    public Pessoa_Tipo(int codigo_pessoa_tipo, String descricao_pessoa_tipo) {
        this.codigo_pessoa_tipo = codigo_pessoa_tipo;
        this.descricao_pessoa_tipo = descricao_pessoa_tipo;
    }

    public int getCodigo_pessoa_tipo() {
        return codigo_pessoa_tipo;
    }

    public void setCodigo_pessoa_tipo(int codigo_pessoa_tipo) {
        this.codigo_pessoa_tipo = codigo_pessoa_tipo;
    }

    public String getDescricao_pessoa_tipo() {
        return descricao_pessoa_tipo;
    }

    public void setDescricao_pessoa_tipo(String descricao_pessoa_tipo) {
        this.descricao_pessoa_tipo = descricao_pessoa_tipo;
    }
    
    
}
