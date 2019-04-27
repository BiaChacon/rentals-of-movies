package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDatabase {

    private String user;
    private String password;
    private String url;
    private String driverjdbc;
    private Connection connection;

    /*public ConnectionDatabase() {
    	this.url = "jdbc:postgresql://ec2-50-17-227-28.compute-1.amazonaws.com:5432/d5v64elkj0rv9h?ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory";
    	this.user = "flbvrihzhjwsck";
        this.password = "fdf136d6a6d43a12a9f2c0f41508776e02f1578a0d73b1a0aef60c382527a1bf";
        this.driverjdbc = "org.postgresql.Driver";
    }*/
    
    public ConnectionDatabase() {
    	this.url =  "jdbc:postgresql://localhost:5432/market-of-4";
    	this.user = "postgres";
    	this.password = "1234";
    	this.driverjdbc = "org.postgresql.Driver";
    }
    
    public void dbConnection() {
        try {
            Class.forName(driverjdbc);
            connection = DriverManager.getConnection(url, user, password); 
        } catch (Exception e) {
            System.err.println(e);
            e.printStackTrace();
        }
    }

    public void dbConnectionClose() {
        try {
            connection.close();
        } catch (SQLException ex) {
            System.err.println(ex);
            ex.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }
     
}
