package com.itclassLoader.Reflect01;

import java.lang.reflect.Constructor;
//反射
//有参构造
public class ReflectDemo03 {
    public static void main(String[] args) throws Exception{
        Class cl = Class.forName("com.itclassLoader.Reflect01.Student");
        Constructor constructor = cl.getConstructor();;
        System.out.println(constructor);
        //运行构造方法new对象
        //等同于new Student（”lisa“，22）
        Object obj=constructor.newInstance("lisa",22);
    }
}
