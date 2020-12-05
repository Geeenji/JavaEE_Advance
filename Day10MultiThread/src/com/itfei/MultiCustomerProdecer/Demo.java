package com.itfei.MultiCustomerProdecer;

public class Demo {
    public static void main(String[] args) {
        Baozipu baozi=new Baozipu();
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
