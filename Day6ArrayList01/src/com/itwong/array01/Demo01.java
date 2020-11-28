package com.itwong.array01;

public class Demo01 {
    public static void main(String[] args) {
        Person[] persons={new Person("lisa",20),new Person("rose",22)};
        for (int i = 0; i < persons.length; i++) {
            Person p=persons[i];
            System.out.println(p);
        }
    }
}
