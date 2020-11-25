package com.itwong.static02;

public class Student {
    public Student(){
        System.out.println("构造代码块");
    }


    static{
        System.out.println("静态代码块");
    }
}
