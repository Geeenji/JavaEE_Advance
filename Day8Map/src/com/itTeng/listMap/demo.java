package com.itTeng.listMap;

import java.util.*;

/*两个班有不同的同学
Map集合存储在List集合中*/
public class demo {
    public static void main(String[] args) {
        Map<String,String> class1=new HashMap<String,String>();
        Map<String,String> class2=new HashMap<String,String>();
        class1.put("001","lisa");
        class1.put("002","rose");

        class2.put("001","拉拉");
        class2.put("002","肉哦如");

        List<Map<String,String>> list=new ArrayList<Map<String,String>>();
        list.add(class1);
        list.add(class2);
        keySet(list);
        entrySet(list);
    }
    public static void keySet(List<Map<String,String>> list){
        Iterator<Map<String,String>> it=list.iterator();
        while(it.hasNext()){
            Map<String, String> ns = it.next();
            Set<String> set=ns.keySet();
            Iterator<String> itt=set.iterator();
            while(itt.hasNext()){
                String next = itt.next();
                System.out.println(next+"..."+ns.get(next));
            }
        }
    }
    public static void entrySet(List<Map<String,String>> list){
        Iterator<Map<String,String>> it=list.iterator();
        while(it.hasNext()){
            Map<String, String> map = it.next();
            Set<Map.Entry<String, String>> set= map.entrySet();
            Iterator<Map.Entry<String, String>> itt = set.iterator();
            while (itt.hasNext()){
                Map.Entry<String,String> entry=itt.next();
                System.out.println(entry.getKey()+"..."+entry.getValue());
            }
        }
    }

}
