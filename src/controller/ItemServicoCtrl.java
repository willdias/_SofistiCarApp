package controller;

import dao.ItemProdutoDao;
import dao.ItemServicoDao;
import dao.VeiculoDao;
import java.sql.SQLException;
import model.Itens_Produto;
import model.Itens_Servico;
import model.Veiculo;

public class ItemServicoCtrl {

    public ItemServicoCtrl() {

    }

    public static Itens_Servico addItemCtrl(Itens_Servico item) throws SQLException {
        Itens_Servico servico = new Itens_Servico();

        if (ItemServicoDao.addItemDao(servico)) {
            //VeiculoFrm.limparCampos();
        }
        return servico;
    }

    public static Itens_Produto alterarItensCtrl() throws SQLException {
        Itens_Produto produto = new Itens_Produto();

        if (ItemProdutoDao.alterarItemDao(produto.capturarItens_produto(produto))) {
            //VeiculoFrm.limparCampos();
        }
        return produto;
    }

    public static Veiculo buscarItensCtrl(Veiculo veiculo) throws SQLException {
        VeiculoDao vei = new VeiculoDao();
        vei.buscarVeiculoDao(veiculo);
        return veiculo;

    }
}
