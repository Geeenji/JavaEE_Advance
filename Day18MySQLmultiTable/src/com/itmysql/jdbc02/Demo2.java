package com.itmysql.jdbc02;

import com.mysql.jdbc.Driver;

import java.sql.*;

public class Demo2 {
    public static void main(String[] args) throws SQLException {
        DriverManager.registerDriver(new Driver());
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/day18", "root", "root");
        Statement statement=con.createStatement();
        String sql="select * from product";
        ResultSet rs=statement.executeQuery(sql);
        System.out.println(rs);

        while(rs.next()){
            System.out.println(rs.getInt("pid")+" "+rs.getString("pname")
            +rs.getInt("price"));
        }
        con.close();
        statement.close();
        rs.close();
    }
}
