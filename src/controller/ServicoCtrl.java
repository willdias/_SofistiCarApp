package controller;

import dao.ServicoDao;
import java.sql.SQLException;
import model.Servico;
import view.ServicoFrm;

public class ServicoCtrl {

    public ServicoCtrl() {

    }

    public static Servico incluirServicoCtrl() throws SQLException {
        Servico servico = new Servico();

        ServicoDao.incluirServicoDao(servico.capturarServico(servico));
        return servico;
    }

    public static Servico alterarServicoCtrl() throws SQLException {
        Servico servico = new Servico();
        ServicoDao.alterarServicoDao(servico);
        return servico;
    }

    public static Servico buscarServicoCtrl(Servico servico) throws SQLException {
        
        ServicoDao.buscarServicoDao(servico);
            
        return servico;

    }
    
    public static Servico buscarTodosServicosCtrl(Servico servico) throws SQLException {
        
        //ServicoDao.buscarTodosServicosDao(servico);
            
        return servico;

    }
}
