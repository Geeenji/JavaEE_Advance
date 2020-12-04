package com.itsong.thread01;

public class thread01Demo {
    public static void main(String[] args) {
        MyThread mt=new MyThread();
        //可能重写和主方法会交错
        mt.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("main..."+i);
        }
    }
}
