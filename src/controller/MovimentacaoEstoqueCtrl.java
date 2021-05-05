package controller;

import dao.MovimentoEstoqueDao;
import java.sql.SQLException;
import model.Movimento_Estoque;
import static view.ClienteFrm.limparCampos;

public class MovimentacaoEstoqueCtrl {

    public MovimentacaoEstoqueCtrl() {

    }

    public static Movimento_Estoque incluirEstoqueCtrl() throws SQLException {
        Movimento_Estoque estoque = new Movimento_Estoque();

        MovimentoEstoqueDao.incluirEstoqueDao(estoque.capturarMovimentacaoEstoque(estoque));
        return estoque;
    }

    public static Movimento_Estoque alterarEstoqueCtrl(Movimento_Estoque Estoque) throws SQLException {
        Movimento_Estoque estoque = new Movimento_Estoque();
        
        if (MovimentoEstoqueDao.alterarEstoqueDao(estoque.capturarMovimentacaoEstoque(estoque))) {
            limparCampos();
        }
        return estoque;
    }

}
