package com.itsong.thread05;
/*售票案例，引出线程的安全问题
* 前提：多个线程控制一个资源*/
public class Demo {
    public static void main(String[] args) {
        Ticket tk=new Ticket();
        Thread t0=new Thread(tk);
        Thread t1=new Thread(tk);
        Thread t2=new Thread(tk);

        t0.start();
        t1.start();
        t2.start();
    }
}
