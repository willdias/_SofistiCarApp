package controller;

import dao.OrdemServicoDao;
import java.sql.SQLException;
import model.Ordem_Servico;


public class OrdemServicoCtrl {

    public OrdemServicoCtrl() {

    }

    public static Ordem_Servico incluirOrdemServicoCtrl(Ordem_Servico os) throws SQLException {
        
        if (OrdemServicoDao.addOrdemServicoDao(os)) {
            //limparCampos();
        }
        return os;
    }

    public static Ordem_Servico buscarOrdemServicoCtrl(Ordem_Servico os) throws SQLException {

        OrdemServicoDao OrdemServicoDao = new OrdemServicoDao();

        OrdemServicoDao.buscarOrdemServicoDao(os);
        
        return os;

    }

    public static Ordem_Servico alterarOrdemServicoCtrl(Ordem_Servico os) throws SQLException {
        
        if (OrdemServicoDao.alterarOrdemServicoDao(os)) {
            //limparCampos();
        }
        return os;
    }
}
