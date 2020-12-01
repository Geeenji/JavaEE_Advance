package com.itset.generic02;
//静态方法的泛型，不能和类上相同
public class Factory<Q> {
    public <T> void show(T t){
        System.out.println(t);
    }
    public void add(Q q){

    }
}
