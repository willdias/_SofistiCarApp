package model;

public class Cliente_Endereco {
    private int codigo_endereco_cliente;
    private String cep_endereco_cliente;
    private String logradouro_endereco_cliente;
    private String complemento_endereco_cliente;
    private String numero_endereco_cliente;
    private String bairro_endereco_cliente;
    private String cidade_endereco_cliente;
    private String estado_endereco_cliente;
    private int endereco_id_tipo;
    private int id_cliente;

    public Cliente_Endereco(int codigo_endereco_cliente, String cep_endereco_cliente, String logradouro_endereco_cliente, String complemento_endereco_cliente, String numero_endereco_cliente, String bairro_endereco_cliente, String cidade_endereco_cliente, String estado_endereco_cliente, int endereco_id_tipo, int id_cliente) {
        this.codigo_endereco_cliente = codigo_endereco_cliente;
        this.cep_endereco_cliente = cep_endereco_cliente;
        this.logradouro_endereco_cliente = logradouro_endereco_cliente;
        this.complemento_endereco_cliente = complemento_endereco_cliente;
        this.numero_endereco_cliente = numero_endereco_cliente;
        this.bairro_endereco_cliente = bairro_endereco_cliente;
        this.cidade_endereco_cliente = cidade_endereco_cliente;
        this.estado_endereco_cliente = estado_endereco_cliente;
        this.endereco_id_tipo = endereco_id_tipo;
        this.id_cliente = id_cliente;
    }

    public int getCodigo_endereco_cliente() {
        return codigo_endereco_cliente;
    }

    public void setCodigo_endereco_cliente(int codigo_endereco_cliente) {
        this.codigo_endereco_cliente = codigo_endereco_cliente;
    }

    public String getCep_endereco_cliente() {
        return cep_endereco_cliente;
    }

    public void setCep_endereco_cliente(String cep_endereco_cliente) {
        this.cep_endereco_cliente = cep_endereco_cliente;
    }

    public String getLogradouro_endereco_cliente() {
        return logradouro_endereco_cliente;
    }

    public void setLogradouro_endereco_cliente(String logradouro_endereco_cliente) {
        this.logradouro_endereco_cliente = logradouro_endereco_cliente;
    }

    public String getComplemento_endereco_cliente() {
        return complemento_endereco_cliente;
    }

    public void setComplemento_endereco_cliente(String complemento_endereco_cliente) {
        this.complemento_endereco_cliente = complemento_endereco_cliente;
    }

    public String getNumero_endereco_cliente() {
        return numero_endereco_cliente;
    }

    public void setNumero_endereco_cliente(String numero_endereco_cliente) {
        this.numero_endereco_cliente = numero_endereco_cliente;
    }

    public String getBairro_endereco_cliente() {
        return bairro_endereco_cliente;
    }

    public void setBairro_endereco_cliente(String bairro_endereco_cliente) {
        this.bairro_endereco_cliente = bairro_endereco_cliente;
    }

    public String getCidade_endereco_cliente() {
        return cidade_endereco_cliente;
    }

    public void setCidade_endereco_cliente(String cidade_endereco_cliente) {
        this.cidade_endereco_cliente = cidade_endereco_cliente;
    }

    public String getEstado_endereco_cliente() {
        return estado_endereco_cliente;
    }

    public void setEstado_endereco_cliente(String estado_endereco_cliente) {
        this.estado_endereco_cliente = estado_endereco_cliente;
    }

    public int getEndereco_id_tipo() {
        return endereco_id_tipo;
    }

    public void setEndereco_id_tipo(int endereco_id_tipo) {
        this.endereco_id_tipo = endereco_id_tipo;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
    
    
}
