package com.itmysql.jdbc03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Demo {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/day18_2","root","root");
        String sql="update products set pname=?,flag=?,category_id=? where pid=?";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setObject(1,"huaweimate30");
        ps.setObject(2,1);
        ps.setObject(3,"c001");
        ps.setObject(4,"p009");


        int row=ps.executeUpdate();
        System.out.println(row);

        ps.close();
        con.close();

    }
}
