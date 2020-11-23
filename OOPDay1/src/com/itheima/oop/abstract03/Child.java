package com.itheima.oop.abstract03;

public class Child extends Father{
    public void show(){//如果子类只有一部分重写，子类还是抽象类
        System.out.println("重写方法");

    }
    public void function(){
        System.out.println("function 重写");
    }
}
