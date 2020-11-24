package com.itheima.Polymorphism02;
//接口是额外内容，抽象类是共性内容
public class Demo {
    public static void main(String[] args) {
        Father father=new Child();
        System.out.println(father.s); //变量father
        father.show();//方法child
    }
}
