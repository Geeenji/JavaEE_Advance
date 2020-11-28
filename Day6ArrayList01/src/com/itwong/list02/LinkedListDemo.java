package com.itwong.list02;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<String>();
        ll.add("lisa");
        ll.addLast("jeny");
        ll.addFirst("rose");
        ll.add("love");
        System.out.println(ll);

        String rs = ll.remove(0);
        System.out.println(ll+rs);

    }
}
