package com.itclassLoader.Reflect01;

public class ReflectDemo04 {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("com.itclassLoader.Reflect01.Student");
        Object obj=c.newInstance();
        System.out.println(obj);
    }
}
