package com.itclassLoader.Reflect01;

import java.lang.reflect.Constructor;

public class ReflectDemo02 {
    public static void main(String[] args) throws Exception {
        Class cl = Class.forName("com.itclassLoader.Reflect01.Student");
        //获取Student类中的构造方法 Class类的方法
        //getConstructors()获取类中所有public的constructor
//        Constructor[] cons = cl.getConstructors();
//        for (Constructor con:cons){
//            System.out.println(con);
//        }
         Constructor con=cl.getConstructor();
         Object obj=con.newInstance();
        System.out.println(obj);//扩展性

        new Student(); //死写
    }
}
