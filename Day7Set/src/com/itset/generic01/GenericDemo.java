package com.itset.generic01;

public class GenericDemo {
    public static void main(String[] args) {
        Factory<String> factory=new Factory<String>(); //由用户决定类型
        factory.add("thisis");
    }
}
