package com.annotationMyjunit;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws Exception{
        Class c=Class.forName("com.annotationMyjunit.OurTest");
        Object object = c.newInstance();
        Method[] methods=c.getMethods();
        for(Method method:methods){
            boolean b=method.isAnnotationPresent(MyTest.class);
            if (b) method.invoke(object);

        }
    }
}
