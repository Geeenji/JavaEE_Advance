package com.itwong.box;

public class BoxDemo2 {
    public static void main(String[] args) {
        method();
    }

    private static void method() {
        Integer a=new Integer(10);
        Integer b=new Integer(10);
        System.out.println(a==b);
        System.out.println(a.equals(b));

        Integer aa=300;
        Integer bb=300;
        System.out.println(aa==bb);//false,比较地址
    }
}
