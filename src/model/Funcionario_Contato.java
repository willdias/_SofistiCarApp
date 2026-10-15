package model;

public class Funcionario_Contato {
    private int codigo_funcionario_contato;
    private String descricao_funcionario_contato;
    private int id_funcionario_tipo;
    private int id_contato_funcionario_tipo;

    public Funcionario_Contato(int codigo_funcionario_contato, String descricao_funcionario_contato, int id_funcionario_tipo, int id_contato_funcionario_tipo) {
        this.codigo_funcionario_contato = codigo_funcionario_contato;
        this.descricao_funcionario_contato = descricao_funcionario_contato;
        this.id_funcionario_tipo = id_funcionario_tipo;
        this.id_contato_funcionario_tipo = id_contato_funcionario_tipo;
    }

    public int getCodigo_funcionario_contato() {
        return codigo_funcionario_contato;
    }

    public void setCodigo_funcionario_contato(int codigo_funcionario_contato) {
        this.codigo_funcionario_contato = codigo_funcionario_contato;
    }

    public String getDescricao_funcionario_contato() {
        return descricao_funcionario_contato;
    }

    public void setDescricao_funcionario_contato(String descricao_funcionario_contato) {
        this.descricao_funcionario_contato = descricao_funcionario_contato;
    }

    public int getId_funcionario_tipo() {
        return id_funcionario_tipo;
    }

    public void setId_funcionario_tipo(int id_funcionario_tipo) {
        this.id_funcionario_tipo = id_funcionario_tipo;
    }

    public int getId_contato_funcionario_tipo() {
        return id_contato_funcionario_tipo;
    }

    public void setId_contato_funcionario_tipo(int id_contato_funcionario_tipo) {
        this.id_contato_funcionario_tipo = id_contato_funcionario_tipo;
    }
    
    
}
