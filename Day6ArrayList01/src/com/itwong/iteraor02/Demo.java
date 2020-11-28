package com.itwong.iteraor02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        Collection<String> c=new ArrayList<String>();
        c.add("lisa");
        c.add("rose");
        c.add("jene");
        c.add("tf");

        Iterator<String> it=c.iterator();
        boolean b = it.hasNext();
        System.out.println(b);
        String next = it.next();
        System.out.println(next);
        //以下为模板,next()只走一遍
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
    }
}
