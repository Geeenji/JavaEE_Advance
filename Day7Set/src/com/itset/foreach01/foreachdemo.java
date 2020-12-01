package com.itset.foreach01;
import com.itset.domain.Person;
import java.util.ArrayList;
import java.util.List;

public class foreachdemo {
    public static void main(String[] args) {
        method1();
        method2();
    }

    private static void method2() {
        List<Person> pl=new ArrayList<Person>();
        pl.add(new Person("lisa",3));
        pl.add(new Person("rose",21));
        for (Person p:pl){
            System.out.println(p.getName()+"'''"+p.getAge());
        }
    }

    private static void method1() {
        int[] arr={1,3,5,7,9};
        for (int i:arr){
            System.out.println(i);
        }
    }
}
