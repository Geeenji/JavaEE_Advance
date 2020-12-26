package com.itpooldb.BeanHandler_01;

import com.itpooldb.domain.Product;
import com.itpooldb.druid_test.DruidUtils;
import com.itpooldb.utils.C3p0Utils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

public class test01{
    @Test
    public void beanHandler01() throws SQLException {
        // 通过id查询详情，将查询结果封装到JavaBean product

        //1核心类
        QueryRunner queryRunner = new QueryRunner(C3p0Utils.getDataSource());
        //2 sql语句
        String sql = "select * from product where pid = ?";
        //3 实际参数
        Object[] params = {6};
        //4 查询并封装
        Product product = queryRunner.query(sql, new BeanHandler<Product>(Product.class), params);

        System.out.println(product);
    }

    @Test
    public void beanListHandler01() throws SQLException{
        QueryRunner queryRunner=new QueryRunner(C3p0Utils.getDataSource());
        String sql="select * from product";
        //方法query之星sql语句 传递结果集处理对象 BeanListHandler(java bean类的class对象)
        List<Product> productList=queryRunner.query(sql, new BeanListHandler<Product>(Product.class));
        for (Product product:productList){
            System.out.println(product.toString());
        }
    }

    @Test
    public void columnListHandler01() throws SQLException{
        QueryRunner queryRunner=new QueryRunner(DruidUtils.getDataSource());
        String sql="select * from product";
        // ColumnListHandler(String columnName) 返回一个列的数据
        List<Object> list=queryRunner.query(sql,new ColumnListHandler<Object>("pname"));
        for (Object o:list){
            System.out.println(o);
        }
    }

    @Test
    public void ScalarHandler01() throws SQLException{ //结果集只有一个值，传聚合函数等
        //QueryRunner传递
        QueryRunner queryRunner=new QueryRunner(DruidUtils.getDataSource());
        String sql="select distinct count(pname) from product";
        Long query = queryRunner.query(sql, new ScalarHandler<Long>());
        System.out.println(query);
    }
}