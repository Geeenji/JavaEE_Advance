package com.itheima.JDK8Change;

public interface MyInterface {
    //可以定义默认方法
    public default void show(){
        System.out.println("this is default method of interface after jdk8");
    }
    public static void function(){
        System.out.println("static method of interface after jdk8");
    }
}
