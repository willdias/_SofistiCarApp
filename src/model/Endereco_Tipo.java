package model;

public class Endereco_Tipo {
    private int codigo_endereco_tipo;
    private String descricao_endereco_tipo;

    public Endereco_Tipo(int codigo_endereco_tipo, String descricao_endereco_tipo) {
        this.codigo_endereco_tipo = codigo_endereco_tipo;
        this.descricao_endereco_tipo = descricao_endereco_tipo;
    }

    public int getCodigo_endereco_tipo() {
        return codigo_endereco_tipo;
    }

    public void setCodigo_endereco_tipo(int codigo_endereco_tipo) {
        this.codigo_endereco_tipo = codigo_endereco_tipo;
    }

    public String getDescricao_endereco_tipo() {
        return descricao_endereco_tipo;
    }

    public void setDescricao_endereco_tipo(String descricao_endereco_tipo) {
        this.descricao_endereco_tipo = descricao_endereco_tipo;
    }
    
    
}
