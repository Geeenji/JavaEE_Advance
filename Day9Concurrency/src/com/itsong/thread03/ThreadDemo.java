package com.itsong.thread03;

public class ThreadDemo {
    public static void main(String[] args) {
        MyRunnable mr=new MyRunnable();
        Thread t=new Thread(mr);
        t.start();
    }
}
