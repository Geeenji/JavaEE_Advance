package com.itheima.oop.abstract04Case;

public class AbstractDemon {
    public static void main(String[] args) {
        Javaee jv=new Javaee();
        jv.setId("001");
        jv.setName("Lisa");
        jv.work();

        Android android=new Android();
        android.setId("002");
        android.setName("rose");
        android.work();
    }
}
