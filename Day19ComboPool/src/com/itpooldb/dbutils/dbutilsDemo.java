package com.itpooldb.dbutils;

import com.itpooldb.druid_test.DruidUtils;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;

//apache 开发的简化 JDBC步骤的 工具类：源码依然为固定6步
public class dbutilsDemo {
    public static void main(String[] args) throws SQLException {
//        insetP();
//        update();
        delete0();
    }
    private static void delete0() throws SQLException{
        QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());
        String sql="delete from product where pid=?";
        int line=queryRunner.update(sql,15);
        System.out.println(line);
    }
    private static void update() throws SQLException{
        QueryRunner queryRunner=new QueryRunner();
        String sql="update product set pname=?,price=? where pid=?";
        Object[] params={"huaweimate30",2999,14};
        int line=queryRunner.update(DruidUtils.getConnection(),sql,params);
        System.out.println(line);

    }
    private static void insetP() throws SQLException {
        QueryRunner queryRunner=new QueryRunner();
        String sql="insert into product values(?,?,?,?)";
        Object[] params={15,"huaweimate40",3000,"c001"};
        int line=queryRunner.update(DruidUtils.getConnection(),sql,params);
//        int line=queryRunner.update(DruidUtils.getConnection(),sql,14,"huaweimate",3000,"c001");
        System.out.println(line);
    }
}
