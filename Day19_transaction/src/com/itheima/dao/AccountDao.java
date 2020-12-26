package com.itheima.dao;

import com.itheima.domain.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.Connection;
import java.sql.SQLException;

public class AccountDao {
    /*
    *定义方法，实现转账
    * 更新用户数据
    * 传递参数，用户名金额 */
    public void updateAccount(String name,double money,Connection con) throws SQLException{
        QueryRunner queryRunner=new QueryRunner();
        String sql="update account set money=? where name=?";
        queryRunner.update(con, sql, money, name);
    }

    /*定义方法：查账户信息
    * 传递参数，账户名，用户输入
    * 查询后的结果，BeanHandler封装，结果集就是Account对象*/
    public Account queryAccount(String name, Connection con) throws SQLException {
        QueryRunner queryRunner=new QueryRunner();
        String sql="select * from account where name=?";
        return queryRunner.query(con,sql,new BeanHandler<Account>(Account.class),name);
    }
}
