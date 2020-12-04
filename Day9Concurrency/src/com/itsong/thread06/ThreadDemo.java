package com.itsong.thread06;
//DeadLock的方法，Synchronized嵌套
public class ThreadDemo {
    public static void main(String[] args) {
        DeadLock d1=new DeadLock(true);
        DeadLock d2=new DeadLock(false);

        Thread t0=new Thread(d1);
        Thread t1=new Thread(d2);

        t0.start();;
        t1.start();
    }
}
