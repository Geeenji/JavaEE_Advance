package com.itclassLoader.Reflect01;

import java.lang.reflect.Constructor;

//暴力方法
public class ReflectDemo05 {
    public static void main(String[] args) throws Exception{
        Class c=Class.forName("com.itclassLoader.Reflect01.Student");
        Object obj=c.getDeclaredConstructor(String.class).newInstance();//新方法
//        con.setAccessible(true);
//        Object o=c.newInstance();
//        System.out.println(o);
    }
}
