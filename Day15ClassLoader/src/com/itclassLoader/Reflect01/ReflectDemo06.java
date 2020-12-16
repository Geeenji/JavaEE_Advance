package com.itclassLoader.Reflect01;

import java.lang.reflect.Method;

public class ReflectDemo06 {
    public static void main(String[] args) throws Exception{
        Class c=Class.forName("com.itclassLoader.Reflect01.Student");
        Object obj=c.newInstance();
        Method m=c.getMethod("study");
        m.invoke(obj);
    }
}
