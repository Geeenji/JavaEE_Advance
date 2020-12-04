package com.itsong.thread05;

public class Ticket implements Runnable{
    private int num=300;
//    private Object obj=new Object();
    //在run方法中售票
    //休眠10毫秒，出现安全问题
    //同步代码块处理线程安全问题
    public void run(){
        pay();
    }
    private synchronized void pay(){
        while(true) {
//            synchronized (obj){
                if (num > 0) {
                    try{
                        Thread.sleep(10);
                    }catch(Exception ex){

                    }
                    System.out.println(Thread.currentThread().getName()+"selling ticket number::" + num--);
//                }
            }
        }
    }
}
