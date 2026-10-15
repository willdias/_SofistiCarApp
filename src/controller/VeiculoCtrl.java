package controller;

import dao.VeiculoDao;
import java.sql.SQLException;
import model.Veiculo;
import view.VeiculoFrm;

public class VeiculoCtrl {

    public VeiculoCtrl() {

    }

    public static Veiculo incluirVeiculoCtrl(Veiculo veiculo) throws SQLException {
        if (VeiculoDao.addVeiculoDao(veiculo)) {
            VeiculoFrm.limparCampos();
        }
        return veiculo;
    }

    public static Veiculo alterarVeiculoCtrl() throws SQLException {
        Veiculo veiculo = new Veiculo();
        if (VeiculoDao.alterarVeiculoDao(veiculo.capturarVeiculo(veiculo))) {
            VeiculoFrm.limparCampos();
        }
        return veiculo;
    }

    public static Veiculo buscarVeiculoCtrl(Veiculo veiculo) throws SQLException {
        VeiculoDao vei = new VeiculoDao();
        vei.buscarVeiculoDao(veiculo);
        return veiculo;

    }
}
