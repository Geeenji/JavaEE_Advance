package com.itheima.oop.abstract04Case;

public class Android extends Employee{
    public void work(){
        System.out.println(super.getId()+"::"+super.getName()+" develop apps on mobile phone");
    }
}
