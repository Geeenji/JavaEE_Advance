package com.itproperties.design.single01;
//单例子设计模式：饿汉式
public class singleDemo {
    private singleDemo(){}
    private static singleDemo s=new singleDemo();
    //静态修饰，可在类里面直接调用
    public static singleDemo getInstance(){
        return s;
    }
}
