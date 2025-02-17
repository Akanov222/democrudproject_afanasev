package dao;

import config.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UserDaoImpl {

    public UserDaoImpl() {
    }

    private Connection getConnection() throws SQLException {
        Connection con = DriverManager.getConnection(Config.getProperty("db.url"), Config.getProperty("db.login"), Config.getProperty("db.password"));
        System.out.println("Connection successful");
        return con;
    }
}
