package com.itwong.object02;

import com.itwong.object001.Person;

public class Demo {
    public static void main(String[] args) {
        Person p1=new Person("lisa",22);
        Person p2=new Person("rose",22);
        //p1对象调用父类方法equals（）和p2比较
        boolean equals = p1.equals(p2);
        System.out.println(equals);

    }
}
