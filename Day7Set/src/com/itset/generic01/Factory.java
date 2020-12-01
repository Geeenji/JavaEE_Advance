package com.itset.generic01;
//定义泛型Q
//在new对象的时候，才能指定
public class Factory<Q> {
    public void add(Q q){
        System.out.println(q);
    }
}
