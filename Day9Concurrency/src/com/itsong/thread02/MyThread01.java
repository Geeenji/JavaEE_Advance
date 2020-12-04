package com.itsong.thread02;

public class MyThread01 extends Thread{
    public void run(){
        System.out.println("线程名字::"+getName());
    }
}
