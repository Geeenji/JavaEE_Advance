package com.itset.generic03;
//实现接口，但是不明确泛型
//将泛型实现权给调用者
public class IFimpl<T> implements IF<T>{
    public void show(T t){
        System.out.println(t);
    }
}
