package com.itwong.inner01;

public class Outer {
    //Inner是outer的内部类
    private int a=1;
    class Inner{
        public void inner(){
            int a=2;
            System.out.println(a);
            System.out.println(Outer.this.a);
        }
    }
}
