package com.itwong.iteraor01;

public class iteratorDemo {
    public static void main(String[] args) {
        Iterator it=new B();
        it.show();
    }
}
interface Iterator{
    public abstract void show();
}
class B implements Iterator{
    public void show(){
        System.out.println("实现类的重写");
    }
}