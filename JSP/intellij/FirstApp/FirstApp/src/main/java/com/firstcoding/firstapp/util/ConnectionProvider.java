package com.firstcoding.firstapp.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {


//    private Connection conn;
//
//    private static ConnectionProvider instance = new ConnectionProvider();
//
//    private ConnectionProvider() {
//
//    }
//
//    public ConnectionProvider getInstance() {
//        return instance;
//    }

    public static Connection getConnection() throws Exception {

        Class.forName("com.mysql.cj.jdbc.Drivers");

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "scott", "Test!!!!");
        
        return conn;
    }

}
