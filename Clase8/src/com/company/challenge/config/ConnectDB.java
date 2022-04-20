package com.company.challenge.config;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectDB {
    private LogInConnect logIn;
    private Connection connect;
    private static ConnectDB instance;

    public ConnectDB(){
        logIn = new LogInConnect();
        connect = logIn.getConnection();
    }

    public static ConnectDB getInstance(){
        if (instance==null){
            instance = new ConnectDB();
        }
        return instance;
    }

    public ResultSet query(String statement){
        ResultSet rs = null;
        try {
            rs = connect.createStatement().executeQuery(statement);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public Connection getConnection() {
        return connect;
    }

}