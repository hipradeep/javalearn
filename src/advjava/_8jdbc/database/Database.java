package advjava._8jdbc.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    public Connection conn;
    public Statement stmt;

    public Database() {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver"); // load driver
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdbs", "root", "1234");

            stmt = conn.createStatement();

        }

        catch (ClassNotFoundException d) {
            System.out.println("*****" + d.getMessage());
        } catch (SQLException e) {
            System.out.println("******" + e.getMessage());
        }
    }

    public Connection getConnection() {
        return conn;
    }

    public Statement getStatements() {
        return stmt;
    }

}
