package com.itTeng.map01;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedList001 {
    public static void main(String[] args) {
        Map<String,String> mp=new LinkedHashMap<String,String>();
        mp.put("a","lisa");
        mp.put("b","jenny");
        mp.put("c","rose");

        System.out.println(mp.toString());
    }
}
