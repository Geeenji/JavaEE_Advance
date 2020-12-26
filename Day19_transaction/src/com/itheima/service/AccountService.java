package com.itheima.service;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import com.itheima.utils.DruidUtils;
import org.apache.commons.dbutils.DbUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

/*转账的业务层
* 从表现层调入参数，再调用dao层，更新数据*/
public class AccountService {
    public void transfer(String payer,String payee,double money){
        Connection connection=null;
        try {
            AccountDao accountDao = new AccountDao();
            connection = DruidUtils.getConnection();
            connection.setAutoCommit(false);

            Account accountPayer = accountDao.queryAccount(payer, connection);
            Account accountPayee = accountDao.queryAccount(payee, connection);
            //必须先set，改变dao层中的值
            accountPayer.setMoney(accountPayer.getMoney() - money);
            accountPayee.setMoney(accountPayee.getMoney() + money);

            accountDao.updateAccount(payer, accountPayer.getMoney(), connection);
            accountDao.updateAccount(payee, accountPayee.getMoney(), connection);
            //用DbUtils中的静态方法，帮助处理异常，简化
            DbUtils.commitAndCloseQuietly(connection);
        }catch (Exception ex){
            DbUtils.rollbackAndCloseQuietly(connection);
        }finally {
            DbUtils.closeQuietly(connection);
        }
    }
}
