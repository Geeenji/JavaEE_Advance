package com.itheima.view;

import com.itheima.service.AccountService;

import java.sql.SQLException;

/*简历入口点*/
public class AccountView {
    public static void main(String[] args) throws SQLException {
        String payer="lisa";
        String payee="rose";
        double money=500;
        new AccountService().transfer(payer,payee,money);
    }
}
