package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
//    private static final String USERNAME = "dexautomation";
//    private static final String PASSWORD ="dexautomation";
//    private static final  String URL ="jdbc:mysql://db4free.net:3306/dexautomation";
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://db4free.net:3306/dexautomation","dexautomation","dexautomation")) {
            if (conn != null) {
                System.out.println("Подключение успешно");
            } else {
                System.out.println("Ошибка подключения");
            }

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}