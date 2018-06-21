package util;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConectaBanco {

    public static Connection getConexao() {
        Connection conexao = null;
        try {
            Class.forName("org.postgresql.Driver");
            conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dbcliente", "postgres", "postgres");
        
        } catch (Exception erro2) {
            throw new RuntimeException(erro2);
        }
        return conexao;
    }

}
