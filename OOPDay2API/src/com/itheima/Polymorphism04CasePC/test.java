package com.itheima.Polymorphism04CasePC;

public class test {
    public static void main(String[] args) {
        Computer cp=new Computer();
        cp.powerOff();
        cp.powerOn();
//传递参数，方法中的参数是USB接口，接口没有对象，只能传递实现类的对象
//        mouse ms=new mouse();
        cp.useUSB(new mouse());//和上面一样
    }
}
