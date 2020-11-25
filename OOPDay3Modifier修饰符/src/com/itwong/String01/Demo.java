package com.itwong.String01;

public class Demo {
    public static void main(String[] args) {
        compareTo();
    }
    public static void compareTo(){
        String s1="abcd";
        String s2="abbc";
        int i = s1.compareTo(s2);
        //正数：调用者对象大于参数
        //负数：调用者对象小于参数
        //零：相等
        System.out.println(i);
    }
}
