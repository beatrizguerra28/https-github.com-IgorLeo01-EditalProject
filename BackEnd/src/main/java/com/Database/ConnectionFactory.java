import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/meuBancoDeDados";
        String user = "meuUsuario";
        String password = "minhaSenha";
        return DriverManager.getConnection(url, user, password);
    }
}
