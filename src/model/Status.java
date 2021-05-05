package model;

public class Status {
    private int codigo_status;
    private String descricao_status;

    public Status(int codigo_status, String descricao_status) {
        this.codigo_status = codigo_status;
        this.descricao_status = descricao_status;
    }

    public int getCodigo_status() {
        return codigo_status;
    }

    public void setCodigo_status(int codigo_status) {
        this.codigo_status = codigo_status;
    }

    public String getDescricao_status() {
        return descricao_status;
    }

    public void setDescricao_status(String descricao_status) {
        this.descricao_status = descricao_status;
    }
    
    
}
