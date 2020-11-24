package com.itheima.Polymorphism04CasePC;
//设备都会满足USB接口的规则，方法的参数可以是USB的接口
//接口没有对象，实现类对象
//接口是额外内容，抽象类是共性内容
public class Computer {
    public void powerOn(){
        System.out.println("turn on the computer");
    }
    public void powerOff(){
        System.out.println("turn off the computer");
    }
    public void useUSB(USB usb){ //实现多态
//        System.out.println("using usb");
        usb.open();
        usb.close();
    }
}
