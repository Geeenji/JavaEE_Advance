package com.itproperties.design.simple02;
//工厂方法设计模式，没必要传参数
//好处：不需要改源码
public class demo {
    public static void main(String[] args) {
        Factory factory=new CatFactory();
        Animal a=factory.createAnimal();
        a.eat();

        Factory factory1=new DogFactory();
        Animal animal=factory1.createAnimal();
        animal.eat();
    }
}
