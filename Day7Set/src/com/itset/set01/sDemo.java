package com.itset.set01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class sDemo {
    public static void main(String[] args) {
        Set<String> slist=new HashSet<String>();
         slist.add("lisa");
         slist.add("rose");
        "lisa".hashCode();
        Iterator<String> it=slist.iterator();
        while (it.hasNext()){
            String next = it.next();
            System.out.println(next);
        }

        for (String i:slist) {
            System.out.println(i);
        }
    }
}
