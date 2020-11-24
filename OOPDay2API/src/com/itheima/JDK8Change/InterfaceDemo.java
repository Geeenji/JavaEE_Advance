package com.itheima.JDK8Change;

public class InterfaceDemo {
    public static void main(String[] args) {
        MyInterfaceImpl mi=new MyInterfaceImpl();
        mi.show();
        MyInterface.function();
    }
}
