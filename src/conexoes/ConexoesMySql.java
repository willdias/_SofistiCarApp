package conexoes;

import java.sql.Connection; // Classe responsável por tratar as conexoes com o SGBD
import java.sql.DriverManager; //Classe responsável por gerenciar o driver do MySql
import java.sql.SQLException; //Classe responsável por tratar exceções

public class ConexoesMySql {

    private static Connection conexao = null;

    static boolean banco = false;

    public static Connection conectar() {
        // a linha abaixo chama o driver 
        String driver = "com.mysql.jdbc.Driver";

        //Armazenando informações referente ao banco
        String url = "jdbc:mysql://localhost:3306/soberano";
        String user = "root";
        String password = "";

        // Estabelecendo a conexão com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);

            banco = true;
            return conexao;

        } catch (ClassNotFoundException | SQLException e) {

            // a linha abaixo esclarece o erro de conexão
            System.out.println("Erro ao conectar ao Banco de Dados: " + e);
            banco = false;
            return null;
        }

    }

    public static boolean bancoAtivo() {
        return banco;
    }

}   
