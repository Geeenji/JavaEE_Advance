package com.itset.CollectionCampare01;

import com.itset.domain.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyComparator implements Comparator<Person> {
    /*重写接口中的抽象方法
    * 返回值是int，方法的参数是Person o1,o1*/
    public int compare(Person o1,Person o2){
        return o2.getAge()-o1.getAge();
    }


}
