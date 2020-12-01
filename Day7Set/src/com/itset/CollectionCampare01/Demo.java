package com.itset.CollectionCampare01;


import com.itset.domain.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("I");
        list.add("like");
        list.add("java");
        System.out.println(list);

        method2();
    }
    private static void method2() {
        List<Person> ls=new ArrayList<Person>();
        ls.add(new Person("this",1));
        ls.add(new Person("is",2));
        ls.add(new Person("comparator",3));
        ls.add(new Person("test",4));
        Collections.sort(ls,new MyComparator());

        for (int i = 0; i < ls.size(); i++) {
            Person person = ls.get(i);
            System.out.println(person.getName());
        }
    }
}
