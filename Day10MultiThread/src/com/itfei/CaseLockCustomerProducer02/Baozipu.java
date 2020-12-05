package com.itfei.CaseLockCustomerProducer02;

public class Baozipu {
    private int BaoziCount;
    //包子没有为false，消费者wait；包子有时为true，通知notify
    private boolean flag;

    public synchronized void get(){
        //判断==false，没有产包子，等待
        if(flag==false){
            try{
                this.wait();
            }catch(InterruptedException ex){
                ex.getStackTrace();
            }
        }
        System.out.println("消费第"+BaoziCount+" 个包子");
        flag=false;
        this.notify();
    }
    public synchronized void set(){
        //如果flag==true，已经生产了包子，wait消费者吃
        if(flag==true){
            try{
                this.wait();
            }catch(InterruptedException ex){
                ex.getStackTrace();
            }
        }
        BaoziCount++;
        System.out.println("生产第"+BaoziCount+" 个包子");
        flag=true;
        this.notify();
    }

}
