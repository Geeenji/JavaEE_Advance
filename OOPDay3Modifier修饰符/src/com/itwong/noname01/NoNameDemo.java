package com.itwong.noname01;

public class NoNameDemo {
    public static void main(String[] args) {
        //匿名内部类,也有.class文件
        new MyInterface(){
            //重写接口抽象方法
            public void inter(){
                System.out.println("Override in noname");
            }
        }.inter();
        new MyInterface(){
            //重写接口抽象方法
            public void inter(){
                System.out.println("Override in noname");
            }
        }.inter();
        MyInterface my=new MyInterface() {
            public void inter() {
                System.out.println("对象多态性");
            }
//            public void show(){
//                System.out.println("show in Polymorphism");
//            } //不行
        };
        my.inter();
//        my.show();
    }
}
