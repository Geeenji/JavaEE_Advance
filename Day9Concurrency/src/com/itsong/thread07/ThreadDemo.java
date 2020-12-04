package com.itsong.thread07;
//调用方法进行同步 Lock new ReentrantLock()
public class ThreadDemo {
    public static void main(String[] args) {
        Ticket t=new Ticket();

        new Thread(t).start();
        new Thread(t).start();
        new Thread(t).start();
    }
}
