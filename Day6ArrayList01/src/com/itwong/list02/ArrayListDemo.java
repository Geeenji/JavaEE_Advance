package com.itwong.list02;

import com.itwong.array01.Person;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Person> list=new ArrayList<Person>();
        list.add(new Person("Lisa",22));
        list.add(new Person("rose",21));

    }

}
