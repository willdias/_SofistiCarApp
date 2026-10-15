package model;

public class Nivel_Acesso {
    private int codigo_nivel_acesso;
    private String descricao_nivel_acesso;

    public Nivel_Acesso(int codigo_nivel_acesso, String descricao_nivel_acesso) {
        this.codigo_nivel_acesso = codigo_nivel_acesso;
        this.descricao_nivel_acesso = descricao_nivel_acesso;
    }

    public int getCodigo_nivel_acesso() {
        return codigo_nivel_acesso;
    }

    public void setCodigo_nivel_acesso(int codigo_nivel_acesso) {
        this.codigo_nivel_acesso = codigo_nivel_acesso;
    }

    public String getDescricao_nivel_acesso() {
        return descricao_nivel_acesso;
    }

    public void setDescricao_nivel_acesso(String descricao_nivel_acesso) {
        this.descricao_nivel_acesso = descricao_nivel_acesso;
    }
    
    
}
