package com.itfei.CaseLockCustomerProducer02;

public class Customer implements Runnable{
    private Baozipu baozipu;
    public Customer(Baozipu baozipu){
        this.baozipu=baozipu;
    }
    public void run(){
        while(true){
            baozipu.get();
        }
    }
}
