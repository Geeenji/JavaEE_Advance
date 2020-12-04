package com.itsong.thread04;

import java.sql.SQLOutput;

public class ThreadDemo {
    public static void main(String[] args) {
        //匿名内部类取代Thread子类
        //创建他的子类对象
        new Thread(){
            public void run(){
                System.out.println("匿名内部类实现线程");
            }
        };
        //匿名内部类，取代Runnable实现类
        Runnable r=new Runnable(){
            public void run(){
                System.out.println("匿名内部类实现线程——接口方式");
            }
        };
        new Thread(r).start();
        //也可以写作
        new Thread(()-> System.out.println("启动线程")).start();
    }
}
