package com.itsong.thread07;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ticket implements Runnable{
    private int tickets=100;
    private Lock lock=new ReentrantLock();

    public void run(){
        while(true){
            lock.lock();
            if(tickets>0){
                try{
                    Thread.sleep(10);
                }catch(Exception ex){

                }finally {
                    System.out.println(Thread.currentThread().getName()+"ticket num::"+tickets--);
                    lock.unlock();
                }
            }
        }
    }
}
