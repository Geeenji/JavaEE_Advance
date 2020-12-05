package com.itfei.MultiCustomerProducer02;

public class Demo {
    public static void main(String[] args) {
        baoziStore baozi=new baoziStore();
        Customer customer=new Customer(baozi);
        Producer producer=new Producer(baozi);

        new Thread(customer).start();
        new Thread(customer).start();
        new Thread(customer).start();

        new Thread(producer).start();
        new Thread(producer).start();
        new Thread(producer).start();


    }
}
