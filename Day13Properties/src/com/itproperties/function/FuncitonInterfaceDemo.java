package com.itproperties.function;

import java.util.function.Function;

public class FuncitonInterfaceDemo {
    public static void main(String[] args) {
         int i=getInteger(s->Integer.parseInt(s),"888");
        System.out.println(i);
    }
    //传递字符串，转成基本类型int
    public static Integer getInteger(Function<String,Integer> function, String str){
        Integer integer=function.apply(str);
        return integer;
    }
}
