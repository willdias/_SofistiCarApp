package controller;

import dao.FornecedorDao;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Fornecedor;
import static view.FornecedorFrm.iptCnpj;
import static view.FornecedorFrm.iptCpf;
import static view.FornecedorFrm.iptNome;
import static view.FornecedorFrm.iptRazaoSocial;
import static view.FornecedorFrm.limparCampos;

public class FornecedorCtrl {

    public FornecedorCtrl() {

    }

    public static Fornecedor incluirFornecedorCtrl() throws SQLException {
        Fornecedor fornecedor = new Fornecedor();

        if (FornecedorDao.addFornecedorDao(fornecedor.capturarFornecedor(fornecedor))) {
            limparCampos();
        }
        return fornecedor;
    }

    public static Fornecedor buscarFornecedorCtrl() throws SQLException {

        Fornecedor fornecedor = new Fornecedor();
        FornecedorDao fornecedorDao = new FornecedorDao();

        String cpf = iptCpf.getText();
        String nome = iptNome.getText();
        String cnpj = iptCnpj.getText();
        String razaoSocial = iptRazaoSocial.getText();
        String tipoBusca = "Fornecedor";

        if (cpf.equals("   .   .   -  ")) {
            cpf = null;
        }
        if (cnpj.equals("  .   .   /    -  ")) {
            cnpj = null;
        }

        if (cpf != null) {
            nome = null;
            cnpj = null;
            razaoSocial = null;
        } else if (cnpj != null) {
            nome = null;
            cpf = null;
            razaoSocial = null;
        }
        
        fornecedorDao.buscarFornecedorDao(cpf, nome, cnpj, razaoSocial, tipoBusca);

        return fornecedor;

    }

    public static Fornecedor alterarFornecedorCtrl() throws SQLException {
        Fornecedor fornecedor = new Fornecedor();

        if (FornecedorDao.alterarFornecedorDao(fornecedor.capturarFornecedor(fornecedor))) {
            limparCampos();
        }
        return fornecedor;
    }

    public static Fornecedor buscarFornecedorProdCtrl() throws SQLException {
        Fornecedor fornecedor = new Fornecedor();
        FornecedorDao fornecedorDao = new FornecedorDao();
        fornecedorDao.buscarFornecedorProdDao();

        return fornecedor;
    }
}
