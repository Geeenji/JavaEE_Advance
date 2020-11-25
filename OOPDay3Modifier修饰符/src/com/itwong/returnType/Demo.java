package com.itwong.returnType;

import com.itwong.arguments.Animal;
import com.itwong.arguments.Cat;

public class Demo {
    public static void main(String[] args) {
        Person person = getPerson();
        person.eat();
        //抽象类型一定返回子类对象
        Animal an=getAnimal();//父类类型，用父类接受
        an.eat();

    }

    public static Person getPerson(){
        return new Person();
    }
    public static Animal getAnimal(){
        return new Cat();
    }
}
