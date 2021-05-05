package controller;

import dao.FuncionarioDao;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Funcionario;
import model.Pessoa;
import static view.ClienteFrm.limparCampos;
import view.FuncionarioFrm;

public class FuncionarioCtrl {

    public FuncionarioCtrl() {

    }

    public static Funcionario addFuncionarioCtrl() throws SQLException {
        Funcionario funcionario = new Funcionario();
        Pessoa pessoa = new Pessoa();
        pessoa.setNome_pessoa(FuncionarioFrm.iptNome.getText());
        pessoa.setCpf_pessoa(FuncionarioFrm.iptCpf.getText());
        pessoa.setRg_pessoa(FuncionarioFrm.iptRg.getText());
        pessoa.setOrgaoemissor_pessoa(FuncionarioFrm.iptOrgaoEmissorRg.getText());
        pessoa.setDtnasc_pessoa(FuncionarioFrm.iptDataNascimento.getText());
        pessoa.setObservacoes_pessoa(FuncionarioFrm.txtObservacoes.getText());
        FuncionarioDao.addFuncionarioDao(pessoa);
        FuncionarioDao.addFuncionarioDao(funcionario);
        return funcionario;
    }

    public static Funcionario buscarFuncionarioCtrl(Pessoa pessoa) throws SQLException {
        FuncionarioDao cli = new FuncionarioDao();
        Funcionario funcionario = new Funcionario();
        cli.buscarFuncionarioDao(pessoa);

        return funcionario;
    }

    public static Funcionario alterarFuncionarioCtrl() throws SQLException {
        Funcionario funcionario = new Funcionario();

        if (FuncionarioDao.alterarFuncionarioDao(funcionario.capturarFuncionario(funcionario))) {
            limparCampos();
        }
        return funcionario;
    }
}
