package com.itproperties.lambda;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread t1=new Thread(new MyRunnable());
        t1.start();
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类运行");
            }
        });
        t2.start();
        Thread t3=new Thread(()-> System.out.println("lambda"));
        t3.start();
    }
}
class MyRunnable implements Runnable{
    public void run(){
        System.out.println("run thread");
    }
}
