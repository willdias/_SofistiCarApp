package controller;

import dao.ItemProdutoDao;
import dao.VeiculoDao;
import java.sql.SQLException;
import model.Itens_Produto;
import model.Veiculo;

public class ItemProdutoCtrl {

    public ItemProdutoCtrl() {

    }

    public static Itens_Produto addItemCtrl(Itens_Produto item) throws SQLException {
        if (ItemProdutoDao.addItemDao(item));
        return item;
    }

    public static Itens_Produto alterarItensCtrl(Itens_Produto item) throws SQLException {
        if (ItemProdutoDao.alterarItemDao(item));
        return item;
    }

    public static Veiculo buscarVeiculoCtrl(Veiculo veiculo) throws SQLException {
        VeiculoDao vei = new VeiculoDao();
        vei.buscarVeiculoDao(veiculo);
        return veiculo;

    }
}
