package com.itheima.Polymorphism;
//三种多态调用方式
//接口是额外内容，抽象类是共性内容
public class PolymorphismDemo {
    public static void main(String[] args) {
        //实现子类和父类的多态
        Person person=new Student();
        person.eat();
        //父类是抽象类，调用多态
        Animal animal=new Cat();
        animal.eat();

        //实现接口和实现类的多态程序
        MyInterface my=new MyInterfaceImpl();//接口中没有方法
        my.inter();

    }
}
