package com.itheima.Polymorphism04CasePC;

public class mouse implements USB{
    @Override
    public void open(){
        System.out.println("turn on mouse");
    }

    @Override
    public void close() {
        System.out.println("turn off mouse");
    }
}
