package com.itproperties.design.simple02;

public class CatFactory implements Factory{
    public Animal createAnimal(){
        return new Cat();
    }
}
