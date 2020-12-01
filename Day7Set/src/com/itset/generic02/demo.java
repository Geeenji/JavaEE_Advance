package com.itset.generic02;

public class demo {
    public static void main(String[] args) {
        Factory<String> factory=new Factory<String>();
        factory.add("aaa");
        factory.show("Tt");
        factory.show(true);
    }
}
