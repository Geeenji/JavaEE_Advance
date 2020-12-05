package com.itfei.MultiCustomerProducer02;

public class Customer implements Runnable{
    private baoziStore baozi=new baoziStore();

    public Customer(baoziStore baozi) {
        this.baozi = baozi;
    }

    public void run(){
        while(true){
            baozi.get();
        }

    }
}
