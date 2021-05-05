package model;

import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import view.MovimentoEstoqueFrm;

public class Movimento_Estoque {
    private int codigo_movimento_estoque;
    private String data_movimentacao_estoque;
    private int qtd_produto;
    private int id_produto_movimentacao_estoque;
    private int id_tipo_movimentacao;
    private int codigo_ordem_servico;

    public Movimento_Estoque() {
    }

    public Movimento_Estoque(int codigo_movimento_estoque, String data_movimentacao_estoque, int qtd_produto, int id_produto_movimentacao_estoque, int id_tipo_movimentacao, int codigo_ordem_servico) {
        this.codigo_movimento_estoque = codigo_movimento_estoque;
        this.data_movimentacao_estoque = data_movimentacao_estoque;
        this.qtd_produto = qtd_produto;
        this.id_produto_movimentacao_estoque = id_produto_movimentacao_estoque;
        this.id_tipo_movimentacao = id_tipo_movimentacao;
        this.codigo_ordem_servico = codigo_ordem_servico;
    }

    public int getCodigo_movimento_estoque() {
        return codigo_movimento_estoque;
    }

    public void setCodigo_movimento_estoque(int codigo_movimento_estoque) {
        this.codigo_movimento_estoque = codigo_movimento_estoque;
    }

    public String getData_movimentacao_estoque() {
        return data_movimentacao_estoque;
    }

    public void setData_movimentacao_estoque(String data_movimentacao_estoque) {
        this.data_movimentacao_estoque = data_movimentacao_estoque;
    }

    public int getQtd_produto() {
        return qtd_produto;
    }

    public void setQtd_produto(int qtd_produto) {
        this.qtd_produto = qtd_produto;
    }

    public int getId_produto_movimentacao_estoque() {
        return id_produto_movimentacao_estoque;
    }

    public void setId_produto_movimentacao_estoque(int id_produto_movimentacao_estoque) {
        this.id_produto_movimentacao_estoque = id_produto_movimentacao_estoque;
    }

    public int getId_tipo_movimentacao() {
        return id_tipo_movimentacao;
    }

    public void setId_tipo_movimentacao(int id_tipo_movimentacao) {
        this.id_tipo_movimentacao = id_tipo_movimentacao;
    }

    public int getCodigo_ordem_servico() {
        return codigo_ordem_servico;
    }

    public void setCodigo_ordem_servico(int codigo_ordem_servico) {
        this.codigo_ordem_servico = codigo_ordem_servico;
    }

    public String getTextCodigoProduto(JTextField iptCodigoProduto) {
        return iptCodigoProduto.getText().trim();
    }
    public String getTextQtdProduto(JTextField iptQtdeMovimento){
        return iptQtdeMovimento.getText().trim();
    }
    
    public String getTextDescricaoProduto(JTextField iptDescricaoProduto) {
        return iptDescricaoProduto.getText().trim();
    }
    
    public String getTextDataMovimento(JFormattedTextField iptDataMovimento) {
        return iptDataMovimento.getText().trim();
    }
    
    public String getTextDataSaida(JFormattedTextField iptDataSaida) {
        return iptDataSaida.getText().trim();
    }
     
    public String getTextQtdeMovimento(JTextField iptQtdeMovimento) {
        return iptQtdeMovimento.getText().trim();
    }
    
    public int getTipoMovimento(JRadioButton rdEntrada, JRadioButton rdSaida) {
        if (rdEntrada.isSelected()) {
            return 1;
        } else {
            return 2;
        }
    }

    public Movimento_Estoque capturarMovimentacaoEstoque(Movimento_Estoque movimento){
        movimento.setQtd_produto(Integer.parseInt(getTextQtdProduto(MovimentoEstoqueFrm.iptQtdeMovimento)));
        movimento.setId_produto_movimentacao_estoque(Integer.parseInt(getTextCodigoProduto(MovimentoEstoqueFrm.iptCodigoProduto)));
        movimento.setData_movimentacao_estoque(getTextDataMovimento(MovimentoEstoqueFrm.iptDataMovimento));
        movimento.setId_tipo_movimentacao(getTipoMovimento(MovimentoEstoqueFrm.rdEntrada, MovimentoEstoqueFrm.rdSaida));
        
        return movimento;
    }
    
}
