package com.itwong.static02;

public class StaticDemo {
    public static void main(String[] args) {
        //静态方法 类名.调用
        //在同一类中，类名可以不写
    int sum=getSum(1,2);
    new Student();
    new Student();
    //先调用了static代码块，加载一次
    }
    public static int getSum(int a,int b){
        return (a+b);
    }

}
