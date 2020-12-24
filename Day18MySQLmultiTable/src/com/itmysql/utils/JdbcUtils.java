package com.itmysql.utils;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JdbcUtils {
    private static String driverClass;
    private static String url;
    private static String user;
    private static String password;
    //使用property配置文件
    static{
        try{
            Properties properties=new Properties();//创建集合键值对
            InputStream in=JdbcUtils.class.getClassLoader().getResourceAsStream("com/db.properties");
            properties.load(in);
            driverClass=properties.getProperty("driverClass");
            url=properties.getProperty("url");
            user=properties.getProperty("user");
            password=properties.getProperty("password");

            Class.forName(driverClass);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//
//    static{
//        try{
//            Class.forName("com.mysql.jdbc.Driver");
//        }catch (Exception ex){
//            ex.printStackTrace();
//        }
//    }
    public static Connection getConnection() throws SQLException {
        Connection con = DriverManager.getConnection(url,user,password);
        return con;
    }

    public static void close(ResultSet rs, Statement stat,Connection con){
        if (rs!=null)
            try{
                rs.close();
            }catch (Exception ex){
                ex.printStackTrace();
            }

        if (stat!=null)
            try{
                stat.close();
            }catch (Exception ex){
                ex.printStackTrace();
            }

        if (con!=null)
            try{
                con.close();
            }catch (Exception ex){
                ex.printStackTrace();
            }


    }
}
