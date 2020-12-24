package com.itmysql.jdbcUtilsCase;

import com.itmysql.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Utildemo {
    public static void main(String[] args) throws SQLException {
//        update();
        select();
    }
    public static void select(){
        Connection con=null;
        PreparedStatement pst=null;
        ResultSet rs=null;
        try{
            con=JdbcUtils.getConnection();
            String sql="select * from products";
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString("pname")+"\t"+rs.getInt("price"));
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public static void update() throws SQLException {
        Connection con=null;
        PreparedStatement stat=null;
        try{
             con= JdbcUtils.getConnection();
             String sql="update products set pname=?,flag=?,price=?,category_id=? where pid=?";
             stat=con.prepareStatement(sql);
             stat.setObject(1,"macbook");
             stat.setObject(2,1);
             stat.setObject(3,11000);
             stat.setObject(4,"c001");
             stat.setObject(5,"p009");

        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            con.close();
            stat.close();
        }
    }
}
