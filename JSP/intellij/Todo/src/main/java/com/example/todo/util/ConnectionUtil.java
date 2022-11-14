package com.example.todo.util;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;

public class ConnectionUtil {


    private HikariDataSource ds;
    private static ConnectionUtil instance = new ConnectionUtil();

    private ConnectionUtil() {
        HikariConfig config = new HikariConfig();
        config.setDriverClassName("com.mysql.cj.jdbc.Driver");
        config.setJdbcUrl("jdbc:mysql://localhost:3306/project");
        config.setUsername("scott");
        config.setPassword("Test!!!!");

        config.addDataSourceProperty("cachePrepStmts", true);
        config.addDataSourceProperty("prepStmtCacheSize", 250);
        config.addDataSourceProperty("prepStmtCacheSqlLimit", 2048);

        ds = new HikariDataSource(config);
    }

    public static ConnectionUtil getInstance() {
        return instance;
    }

    public Connection getConnection() throws Exception {
        return ds.getConnection();
    }

}
