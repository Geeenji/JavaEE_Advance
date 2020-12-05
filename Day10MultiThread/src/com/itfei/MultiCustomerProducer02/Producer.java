package com.itfei.MultiCustomerProducer02;

public class Producer implements Runnable{
    private baoziStore baozi=new baoziStore();

    public Producer(baoziStore baozi) {
        this.baozi = baozi;
    }

    public void run(){
        while(true){
            baozi.set();
        }
    }
}
