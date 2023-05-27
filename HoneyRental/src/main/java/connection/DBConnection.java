package connection;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

public class DBConnection {

    Connection connection;
    static String bd = "prestamo_lectoras";
    static String port = "8085";
    static String login = "root";
    static String password = "";

    public DBConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:" + this.port + "/" + this.bd;
            connection = (Connection) DriverManager.getConnection(url, this.login, this.password);
            System.out.println("Exito");
        } catch (Exception ex) {
            System.out.println("Errorcito");
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void desconectar() {
        connection = null;
    }
}
