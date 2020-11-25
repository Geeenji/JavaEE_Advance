package com.itwong.inner01;

public class Demo {
    public static void main(String[] args) {
        //类描述：对生活中一类事物的抽象描述
        //这个事物内部可能存在其他具体事物
        Outer.Inner in=new Outer().new Inner();
        in.inner();
    }
}
