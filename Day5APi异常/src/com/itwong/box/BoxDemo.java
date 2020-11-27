package com.itwong.box;

import java.util.ArrayList;

public class BoxDemo {
    public static void main(String[] args) {

    }
    public static void show(){
        ArrayList<Integer> arraylist=new ArrayList<Integer>();
        arraylist.add(1); //自动装箱

        int i=arraylist.get(0); //取出，返回基本类型，拆箱

    }
}
