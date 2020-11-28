package com.itwong.collectiondemo;

import java.util.ArrayList;
import java.util.Collection;

public class Demo01 {
    public static void main(String[] args) {
        //创建集合对象，多态性
        Collection<String> co=new ArrayList<String>();
        co.add("lisa");

        boolean b = co.contains("lisa");
        System.out.println(b);
        //clear the set
        co.clear();
        System.out.println(co);

        boolean e = co.isEmpty();
        System.out.println(e);

        co.add("lisa");
        co.add("rose");
        Object[] obj = co.toArray();
        for (int so = 0; so < obj.length; so++) {
            System.out.println(obj[so]);
        }
    }
}
