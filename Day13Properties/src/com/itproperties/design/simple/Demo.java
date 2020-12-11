package com.itproperties.design.simple;

public class Demo {
    //简单工厂simple，传什么造什么
    public static void main(String[] args) {
        AnimalFactory.creatAnimal("Cat").eat();
        AnimalFactory.creatAnimal("Dog").eat();
    }
}
