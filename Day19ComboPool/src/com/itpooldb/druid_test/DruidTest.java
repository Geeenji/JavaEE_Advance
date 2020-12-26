package com.itpooldb.druid_test;

import java.sql.Connection;
import java.sql.SQLException;

public class DruidTest {
    public static void main(String[] args) throws SQLException {
        Connection connection = DruidUtils.getConnection();
        System.out.println(connection);

        connection.close();
    }
}
