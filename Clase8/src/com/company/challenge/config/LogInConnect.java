package com.company.challenge.config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LogInConnect {
    private static final String urlServer="jdbc:mysql://localhost:3306/dbShopping";
    private static final String userDB ="root";
    private static final String passDB="";
    Connection connect = null;

    public LogInConnect(){
        try {
            this.connect = DriverManager.getConnection(urlServer, userDB, passDB);
        } catch(Exception e) {
                System.out.println("Error: \n" + e.getMessage());
        }
    }

    public Connection getConnection() {
        return this.connect;
    }

    public void close() {
        if (this.connect != null) {
            try {
                this.connect.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
