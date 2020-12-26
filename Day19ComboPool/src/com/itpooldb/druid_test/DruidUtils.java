package com.itpooldb.druid_test;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class DruidUtils {
    private static DataSource dataSource=null;
    static {
        try {
            InputStream inputStream = DruidUtils.class.getClassLoader().getResourceAsStream("druid.properties");
            Properties properties = new Properties();
            properties.load(inputStream);

            dataSource = DruidDataSourceFactory.createDataSource(properties);
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
    public static DataSource getDataSource() throws SQLException{
        return dataSource;
    }
}
