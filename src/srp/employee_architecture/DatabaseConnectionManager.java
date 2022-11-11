package srp.employee_architecture;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {
    private Connection connection;

    private static DatabaseConnectionManager connectionInstance = new DatabaseConnectionManager();

    private DatabaseConnectionManager(){

    }

    public static DatabaseConnectionManager getManagerInstance(){
        return connectionInstance;
    }

    public void connect() throws SQLException {
        connection = DriverManager.getConnection("Database URL");
        System.out.println("Connection to DB established");
    }

    public Connection getConnection(){
        return connection;
    }

    public void disconnect() throws SQLException {
        connection.close();
        System.out.println("Disconnected from DB");
    }
}
