package com.itwong.list01;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("i");
        list.add("love");
        list.add("java");
        System.out.println(list);
        list.add(3,"very");
        list.set(1,"like");
        System.out.println(list);
    }
}
