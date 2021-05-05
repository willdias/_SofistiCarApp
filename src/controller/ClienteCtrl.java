package controller;

import dao.ClienteDao;
import java.sql.SQLException;
import model.Cliente;
import static view.ClienteFrm.limparCampos;
//import static view.ClienteFrm.limparCampos;

public class ClienteCtrl {

    public ClienteCtrl() {

    }

    public static Cliente incluirClienteCtrl() throws SQLException {
        Cliente cliente = new Cliente();
        if (ClienteDao.addCliente(cliente.capturarCliente(cliente))) {
            //limparCampos();
            
        }
        return cliente;
    }

    public static Cliente buscarClienteCtrl(Cliente cliente) throws SQLException {

        ClienteDao cli = new ClienteDao();
        cli.buscarCliente(cliente);
        return cliente;
    }

    public static Cliente buscarClienteCodigoCtrl(Cliente cliente) throws SQLException {

        ClienteDao cli = new ClienteDao();
        cli.buscarClienteCodigo(cliente);
        return cliente;
    }
    
    public static Cliente alterarClienteCtrl() throws SQLException {
        Cliente cliente = new Cliente();

        if (ClienteDao.alterarCliente(cliente.capturarCliente(cliente))) {
            limparCampos();
        }
        return cliente;
    }
    public static Cliente buscarClienteVeiCtrl() throws SQLException {
        Cliente cliente = new Cliente();
        ClienteDao clienteDao = new ClienteDao();
        clienteDao.buscarClienteVeiDao();
        return cliente;
    }
}
