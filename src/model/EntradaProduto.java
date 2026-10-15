
package model;

import javax.swing.JTextField;

public class EntradaProduto {
    private String descricao;
    private String data;
    private String quantidade;
    
    public EntradaProduto(){
    
}

    public EntradaProduto(String descricao, String data, String quantidade ) {
        this.data = data;
        this.quantidade = quantidade;
        this.descricao = descricao;
    }

    public EntradaProduto(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return this.data;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getQuantidade() {
        return this.quantidade;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }
    
    public String getTextData(JTextField iptData) {
        return iptData.getText().trim();
    }
    
    public String getTextDescricao(JTextField iptDescricao) {
        return iptDescricao.getText().trim();
    }

    public String getTextQuantidade(JTextField iptQuantidade) {
        return iptQuantidade.getText().trim();
    }
    
    public EntradaProduto capturarEntrada(EntradaProduto entrada, JTextField iptDescricao, JTextField iptData,JTextField iptQuantidade){
        entrada.setDescricao(getTextDescricao(iptDescricao));
        entrada.setData(getTextData(iptData));
        entrada.setDescricao(getTextDescricao(iptDescricao));
        entrada.setQuantidade(getTextQuantidade(iptQuantidade));
        
        return entrada;
    }
}