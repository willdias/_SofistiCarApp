package model;

import javax.swing.JTextField;
import view.BuscarProdutoFrm;

public class Itens_Produto {
    private int codigo_itens_produtos;
    private String descricao;
    private int codigo_os;
    private int codigo_produto;
    private String preco_unit;
    private String preco_total;
    private int quantidade;

    public Itens_Produto() {
    }

    public Itens_Produto(int codigo_itens_produtos, String descricao, int codigo_os, int codigo_produto, String preco_unit, String preco_total, int quantidade) {
        this.codigo_itens_produtos = codigo_itens_produtos;
        this.descricao = descricao;
        this.codigo_os = codigo_os;
        this.codigo_produto = codigo_produto;
        this.preco_unit = preco_unit;
        this.preco_total = preco_total;
        this.quantidade = quantidade;
    }

    public int getCodigo_itens_produtos() {
        return codigo_itens_produtos;
    }

    public void setCodigo_itens_produtos(int codigo_itens_produtos) {
        this.codigo_itens_produtos = codigo_itens_produtos;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodigo_os() {
        return codigo_os;
    }

    public void setCodigo_os(int codigo_os) {
        this.codigo_os = codigo_os;
    }

    public int getCodigo_produto() {
        return codigo_produto;
    }

    public void setCodigo_produto(int codigo_produto) {
        this.codigo_produto = codigo_produto;
    }

    public String getPreco_unit() {
        return preco_unit;
    }

    public void setPreco_unit(String preco_unit) {
        this.preco_unit = preco_unit;
    }

    public String getPreco_total() {
        return preco_total;
    }

    public void setPreco_total(String preco_total) {
        this.preco_total = preco_total;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    private int getIntCodigoProduto(JTextField iptCodigo) {
        return codigo_produto;
    }
    
    private String getTextDescricao(JTextField iptDescricao) {
        return iptDescricao.getText().trim();
    }

    private String getTextPrecoTotal(JTextField iptPrecoTotal) {
        return iptPrecoTotal.getText().trim();
    }

    private String getTextPrecoUnit(JTextField iptPrecoUnit) {
        return iptPrecoUnit.getText().trim();
    }

    private int getIntDescricao(JTextField iptQuantidade) {
        return quantidade;
    }
    
     private int getIntCodigoOs(JTextField iptCodigoOs) {
        return codigo_os;
    }
     
    public Itens_Produto capturarItens_produto(Itens_Produto produto){
        //produto.setCodigo_itens_produtos(getTextDescricaoVeiculo(BuscarProdutoFrm.).toUpperCase());
        produto.setCodigo_produto(getIntCodigoProduto(BuscarProdutoFrm.iptCodigoProd));
        produto.setCodigo_os(getIntCodigoOs(BuscarProdutoFrm.iptCodigoOs));
        produto.setDescricao(getTextDescricao(BuscarProdutoFrm.iptDescricao));
        produto.setPreco_total(getTextPrecoTotal(BuscarProdutoFrm.iptPrecoTotal));
        produto.setPreco_unit(getTextPrecoUnit(BuscarProdutoFrm.iptPrecoUnit));
        produto.setQuantidade(getIntDescricao(BuscarProdutoFrm.iptQuantidade));
        
        return produto;
    }

}
