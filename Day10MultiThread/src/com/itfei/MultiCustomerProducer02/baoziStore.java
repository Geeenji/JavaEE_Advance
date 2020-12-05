package com.itfei.MultiCustomerProducer02;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class baoziStore {
    private boolean flag;
    private int baoziCount;
    private Lock lock=new ReentrantLock();
    private Condition producer=lock.newCondition();
    private Condition customer=lock.newCondition();

    public void get(){
        lock.lock();
        while(flag==false){
            //等待，释放锁，进入阻塞队列
            try{
                customer.await();
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
        System.out.println("正在消费第"+baoziCount+"个包子");
        flag=false;
        producer.signal();
        lock.unlock();
    }
    public void set(){
        lock.lock();
        while(flag==true){
            try {
                producer.await();
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
        baoziCount++;
        System.out.println("正在生产第"+baoziCount+"个包子");
        flag=true;
        customer.signal();
        lock.unlock();
    }
}
