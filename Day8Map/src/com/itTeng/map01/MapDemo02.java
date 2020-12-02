package com.itTeng.map01;

import com.itTeng.domain01.Person;

import java.util.HashMap;
import java.util.Map;
//基本数据类型包装类和String，已经全部Override hashCode() equals()
//Person 为Key，需hashCode() equals()
public class MapDemo02 {
    public static void main(String[] args) {
        Map<String,Person> map1=new HashMap<String,Person>();
        map1.put("first",new Person("lisa",1));
        map1.put("second",new Person("rose",2));
        map1.put("Third",new Person("valentina",3));
        map1.put("Fourth",new Person("flandrie",4));
        map1.put("Fourth",new Person("flandrie",4));


        for (Map.Entry<String,Person> entry:map1.entrySet()){
            System.out.println(entry.getKey()+"::"+entry.getValue().getName());
        }

    }
}
