package com.itproperties.design.simple02;

public class DogFactory implements Factory{
        public Animal createAnimal(){
            return new Dog();
        }
}
