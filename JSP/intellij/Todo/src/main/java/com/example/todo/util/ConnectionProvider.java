package com.example.todo.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Drivers");

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "scott", "Test!!!!");

        return conn;
    }

}
