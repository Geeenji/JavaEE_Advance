package com.itset.generic03;
/*
* 1.实现类实现接口，但是不明确泛型
* 2.*/
public class demo {
    public static void main(String[] args) {
        IFimpl<String> ipl=new IFimpl<String>();
        ipl.show("this ");
    }
}
