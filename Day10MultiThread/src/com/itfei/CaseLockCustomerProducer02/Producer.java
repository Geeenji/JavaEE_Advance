package com.itfei.CaseLockCustomerProducer02;

public class Producer implements Runnable{
    private Baozipu baozipu;
    public Producer(Baozipu baozipu){
        this.baozipu=baozipu;
    }
    public void run(){
        while(true){
            baozipu.set();
        }
    }
}
