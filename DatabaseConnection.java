package pharmacy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String JDBC_URL="jdbc:mysql://localhost:3306/pharmacy_solvdinternproject";
    private static final String USERNAME="root";
    private static final String PASSWORD="Emaya@0912";

    private DatabaseConnection(){

    }
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL,USERNAME,PASSWORD);
    }
}
