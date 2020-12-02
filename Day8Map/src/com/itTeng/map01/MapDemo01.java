package com.itTeng.map01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//两种map的遍历方式
public class MapDemo01 {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<String,Integer>();
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        Set<String> set=map.keySet(); //获取键值set
        for (String key : set) {
            System.out.println(key+"::"+map.get(key));
        }
        System.out.println("===================");
        //for间接遍历Map

        Set<Map.Entry<String,Integer>> sT=map.entrySet();
        for (Map.Entry<String,Integer> entry:sT){
            System.out.println(entry.getKey()+"::"+entry.getValue());
        }
        System.out.println("===================");
    }
}
