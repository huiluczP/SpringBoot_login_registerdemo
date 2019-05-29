package com.example.logindemo.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {

    private static String dbUrl = "jdbc:h2:/tmp/salary";
    private static String dbUser = "sa";
    private static String dbPwd = "sa";

    public static Connection getConnection() throws SQLException{
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return  DriverManager.getConnection(dbUrl,dbUser,dbPwd);
    }
}
