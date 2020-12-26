package com.itheima.jdbc_transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTransaction {
    public static void main(String[] args) throws SQLException{
        Connection connection = null;
        Statement stat=null;
        try {
            //注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //获取连接对象
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/day19", "root", "root");
            //阻止事物自动提交，开启事务
            connection.setAutoCommit(false);

            String sql1 = "update account set money=money+1000 where name='lisa'";
            String sql2 = "update account set money=money-1000 where name='rose'";
            stat = connection.createStatement();

            stat.execute(sql1);
//            int a=1/0;
            stat.execute(sql2);
            //提交事务
            connection.commit();
        }catch (Exception ex){
            try {
                connection.rollback();
            }catch (Exception e){
                e.printStackTrace();
            }
            ex.printStackTrace();
        }finally {
            try {
                connection.close();
                stat.close();
            }catch (Exception exception){
                exception.printStackTrace();
            }
        }
    }
}
