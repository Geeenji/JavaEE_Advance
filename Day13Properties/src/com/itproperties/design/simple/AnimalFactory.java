package com.itproperties.design.simple;

public class AnimalFactory {
    public static Animal creatAnimal(String name){
        if ("Cat".equals(name))
            return new Dog();
        if("Dog".equals(name))
            return new Cat();
        return null;
    }
}
