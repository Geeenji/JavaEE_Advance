package com.itheima.oop.extends03;

public class Child extends father{
    int a=2;
    public void show(){
        int a=3;
        System.out.println(a);// 3
        System.out.println(this.a);// 2
        System.out.println(super.a);// 1
    }
}
