package controller;

import dao.ProdutoDao;
import java.sql.SQLException;
import model.Produto;
import view.ProdutoFrm;

public class ProdutoCtrl {

    public ProdutoCtrl() {

    }

    public static Produto incluirProdutoCtrl() throws SQLException {
        Produto produto = new Produto();

        if (ProdutoDao.incluirProdutoDao(produto.capturarProduto(produto))) {
            ProdutoFrm.limparCampos();
        }
        return produto;
    }

    public static Produto alterarProdutoCtrl() throws SQLException {
        Produto produto = new Produto();
        if (ProdutoDao.alterarProdutoDao(produto.capturarProduto(produto))) {
            ProdutoFrm.limparCampos();
        }
        return produto;
    }

    public static Produto buscarProdutoCtrl(Produto produto) throws SQLException {
        
        ProdutoDao.buscarProdutoDao(produto);
            
        return produto;

    }
    
    public static Produto alterarSaldoCtrl(Produto produto) throws SQLException {
        //ProdutoDao.alterarSaldoDao(produto);
        return produto;
    }
    
    public static Produto buscarTodosProdutosCtrl(Produto produto) throws SQLException {
        
        //ProdutoDao.buscarTodosProdutosDao(produto);
            
        return produto;

    }
}
