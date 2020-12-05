package com.itfei.CaseLockCustomerProducer;

public class Producer implements Runnable{
    private Baozipu baozipu;
    public Producer(Baozipu baozipu){
        this.baozipu=baozipu;
    }
    public void run(){
        while(true){
            synchronized (baozipu) {
                if (baozipu.isFlag() == true) {
                    try {
                        baozipu.wait();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
                baozipu.setBaozicount();
                baozipu.setFlag(true);
                baozipu.notify();
            }
        }
    }
}
