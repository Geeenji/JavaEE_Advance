package com.itTeng.Properties01;

import java.util.Properties;

public class Property01 {
    public static void main(String[] args) {
        method01();
    }

    private static void method01() {
        Properties pro=new Properties();
        pro.setProperty("lisa","01");
        pro.setProperty("rose","02");
        String lisa = pro.getProperty("lisa");
        System.out.println(lisa);
    }

}
