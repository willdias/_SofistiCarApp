package conexoes;

import java.sql.Connection; // Classe responsável por tratar as conexoes com o SGBD
import java.sql.DriverManager; //Classe responsável por gerenciar o driver do MySql
import java.sql.SQLException; //Classe responsável por tratar exceções

public class ConexoesMySql {

    private static Connection conexao = null;

        private static Connection conectar() {
        // a linha abaixo chama o driver 
        String driver = "com.mysql.cj.jdbc.Driver";
        
        String url = System.getenv("DB_URL");
        String user = System.getenv("DB_USER");
        String password = System.getenv("DB_PASSWORD");

        if (url == null || url.trim().isEmpty()) {
            url = "jdbc:mysql://localhost:3306/soberano";
        }
        if (user == null || user.trim().isEmpty()
                || password == null || password.isEmpty()) {
            throw new IllegalStateException(
                    "Configure as variáveis de ambiente DB_USER e DB_PASSWORD.");
        }

        // Estabelecendo a conexão com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;

        } catch (ClassNotFoundException | SQLException e) {

            // a linha abaixo esclarece o erro de conexão
            System.out.println("Erro ao conectar ao Banco de Dados: " + e);
            
            return null;
        }

    }

    public static Connection base() {
        return conectar();
    }
    
    public static boolean bancoAtivo() {
    	Boolean status;
    	if(conectar() == null) {
    		status = false;
    	}
    	else {
    		status = true;
    	}
    	return status;
    }

}   
