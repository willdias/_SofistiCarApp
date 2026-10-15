package model;

public class Tipo_Movimentacao {
    private int codigo_tipo_movimentacao;
    private String descricao_tipo_movimentacao;

    public Tipo_Movimentacao(int codigo_tipo_movimentacao, String descricao_tipo_movimentacao) {
        this.codigo_tipo_movimentacao = codigo_tipo_movimentacao;
        this.descricao_tipo_movimentacao = descricao_tipo_movimentacao;
    }

    public int getCodigo_tipo_movimentacao() {
        return codigo_tipo_movimentacao;
    }

    public void setCodigo_tipo_movimentacao(int codigo_tipo_movimentacao) {
        this.codigo_tipo_movimentacao = codigo_tipo_movimentacao;
    }

    public String getDescricao_tipo_movimentacao() {
        return descricao_tipo_movimentacao;
    }

    public void setDescricao_tipo_movimentacao(String descricao_tipo_movimentacao) {
        this.descricao_tipo_movimentacao = descricao_tipo_movimentacao;
    }
    
    
}
