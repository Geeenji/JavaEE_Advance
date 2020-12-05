package com.itfei.CaseLockCustomerProducer;

public class Costumer implements Runnable{
    private Baozipu baozipu;
    public Costumer(Baozipu baozipu){
        this.baozipu=baozipu;
    }
    public void run(){
        while (true){
            synchronized (baozipu){
                if(baozipu.isFlag()==false){
                    try{
                        baozipu.wait();
                    }catch(Exception ex){
                        ex.printStackTrace();
                    }
                }
                baozipu.getBaozicount();
                baozipu.setFlag(false);
                baozipu.notify();
            }
        }
    }
}
