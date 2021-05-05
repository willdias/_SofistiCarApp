package model;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import view.ProdutoFrm;

public class Produto {

    private int codigo_produto;
    private String tipo_produto;
    private String descricao_produto;
    private String aplicacao_produto;
    private Double valor_compra_produto;
    private Double valor_venda_produto;
    private int produto_id_fornecedor;
    private int id_status_produto;
    private String produto_marca;
    
    public Produto() {

    }

    public Produto(int codigo_produto, String tipo_produto, String descricao_produto, String aplicacao_produto, Double valor_compra_produto, Double valor_venda_produto, int produto_id_fornecedor, int id_status_produto, String produto_marca) {
        this.codigo_produto = codigo_produto;
        this.tipo_produto = tipo_produto;
        this.descricao_produto = descricao_produto;
        this.aplicacao_produto = aplicacao_produto;
        this.valor_compra_produto = valor_compra_produto;
        this.valor_venda_produto = valor_venda_produto;
        this.produto_id_fornecedor = produto_id_fornecedor;
        this.id_status_produto = id_status_produto;
        this.produto_marca = produto_marca;
    }

    public int getCodigo_produto() {
        return codigo_produto;
    }

    public void setCodigo_produto(int codigo_produto) {
        this.codigo_produto = codigo_produto;
    }

    public String getTipo_produto() {
        return tipo_produto;
    }

    public void setTipo_produto(String tipo_produto) {
        this.tipo_produto = tipo_produto;
    }

    public String getDescricao_produto() {
        return descricao_produto;
    }

    public void setDescricao_produto(String descricao_produto) {
        this.descricao_produto = descricao_produto;
    }

    public String getAplicacao_produto() {
        return aplicacao_produto;
    }

    public void setAplicacao_produto(String aplicacao_produto) {
        this.aplicacao_produto = aplicacao_produto;
    }

    public Double getValor_compra_produto() {
        return valor_compra_produto;
    }

    public void setValor_compra_produto(Double valor_compra_produto) {
        this.valor_compra_produto = valor_compra_produto;
    }

    public Double getValor_venda_produto() {
        return valor_venda_produto;
    }

    public void setValor_venda_produto(Double valor_venda_produto) {
        this.valor_venda_produto = valor_venda_produto;
    }

    public int getProduto_id_fornecedor() {
        return produto_id_fornecedor;
    }

    public void setProduto_id_fornecedor(int produto_id_fornecedor) {
        this.produto_id_fornecedor = produto_id_fornecedor;
    }

    public int getId_status_produto() {
        return id_status_produto;
    }

    public void setId_status_produto(int id_status_produto) {
        this.id_status_produto = id_status_produto;
    }

    public String getProduto_marca() {
        return produto_marca;
    }

    public void setProduto_marca(String produto_marca) {
        this.produto_marca = produto_marca;
    }

    
    public String getTextDescricao(JTextField iptDescricaoProduto) {
        return iptDescricaoProduto.getText().trim();
    }

    public String getComboTipo(JComboBox<String> cbbTipo) {
        return cbbTipo.getSelectedItem().toString();
    }

    public String getTextAplicacao(JTextField iptAplicacao) {
        return iptAplicacao.getText().trim();
    }

    public String getTextValorCompra(JTextField iptValorCompra) {
        return iptValorCompra.getText().trim();
    }

    public String getTextValorVenda(JTextField iptValorVenda) {
        return iptValorVenda.getText().trim();
    }

    public String getTextMarca(JTextField iptFabricante) {
        return iptFabricante.getText().trim();
    }

    public String getTextFornecedor(JTextField iptFornecedor) {
        return iptFornecedor.getText().trim();
    }

    public String getTextCategoria(JTextField iptCategoria) {
        return iptCategoria.getText().trim();
    }

    public String getComboStatus(JComboBox<String> cbbStatus) {
        return cbbStatus.getSelectedItem().toString();
    }

    public Produto capturarProduto(Produto produto) {
//        produto.setCodigo_produto(Integer.parseInt(getTextFornecedor(ProdutoFrm.iptCodigo)));
        produto.setTipo_produto(getComboTipo(ProdutoFrm.cbbTipo));
        produto.setDescricao_produto(getTextDescricao(ProdutoFrm.iptDescricaoProd));
        produto.setAplicacao_produto(getTextAplicacao(ProdutoFrm.iptAplicacao));
        produto.setValor_compra_produto(Double.parseDouble(getTextValorCompra(ProdutoFrm.iptValorCompra)));
        produto.setValor_venda_produto(Double.parseDouble(getTextValorVenda(ProdutoFrm.iptValorVenda)));
        produto.setProduto_id_fornecedor(Integer.parseInt(getTextFornecedor(ProdutoFrm.iptFornecedor)));
        String sts = null;
        sts = ProdutoFrm.cbbStatus.getSelectedItem().toString();
        int status = 0;
        if (sts.equals("Ativo")) {
            status = 1;
        } else if (sts.equals("Inativo")){
            status = 2;
        }
        produto.setId_status_produto(status);
        //produto.setId_status_produto(Integer.parseInt(getComboStatus(ProdutoFrm.cbbStatus)));
        produto.setProduto_marca(getTextMarca(ProdutoFrm.iptFabricante));
        
        return produto;
    }
}
