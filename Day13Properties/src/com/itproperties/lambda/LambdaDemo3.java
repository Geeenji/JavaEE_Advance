package com.itproperties.lambda;

import com.itproperties.domain.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaDemo3 {
    public static void main(String[] args) {
        List<Person> list=new ArrayList<Person>();
        list.add(new Person("lisa",20));
        list.add(new Person("tom",12));

        Collections.sort(list, new Comparator<Person>() {
            @Override
            //升序，从小到大
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });

        list.add(new Person("rose",17));
        list.add(new Person("Jenny",11));
        //使用Lambda语句，()中传递参数对象，{}中传递方法体中的语句
        Collections.sort(list,(Person p1,Person p2)->{return p1.getAge()-p2.getAge();});
        System.out.println(list);
    }
}
