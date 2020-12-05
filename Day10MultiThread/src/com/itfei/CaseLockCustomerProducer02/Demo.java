package com.itfei.CaseLockCustomerProducer02;

public class Demo {
    public static void main(String[] args) {
        Baozipu baozipu=new Baozipu();
        Customer customer=new Customer(baozipu);
        Producer producer=new Producer(baozipu);
        new Thread(customer).start();
        new Thread(producer).start();
    }
}
