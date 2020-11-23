package com.itheima.oop.extends06Construstor;

public class Father {
    private String surname;
    public Father(String surname){
        this.surname=surname;
        System.out.println("父类"+this.surname);
    }
}
