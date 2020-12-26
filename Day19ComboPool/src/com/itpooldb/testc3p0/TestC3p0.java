package com.itpooldb.testc3p0;

import com.itpooldb.utils.C3p0Utils;
import java.sql.Connection;
import java.sql.SQLException;

public class TestC3p0 {
    public static void main(String[] args) throws SQLException {
        Connection con=C3p0Utils.getConnection();
        System.out.println(con);

        con.close();
    }
}
