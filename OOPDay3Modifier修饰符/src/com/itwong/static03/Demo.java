package com.itwong.static03;

public class Demo {
    public static void main(String[] args) {
        Father fa=new Child();
        fa.show(); //在编译时，静态方法被直接改为 类名.show（）
    }
}
