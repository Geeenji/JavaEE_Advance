package com.itTeng.MapMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class demo {
    public static void main(String[] args) {
        Map<String,String> m1=new HashMap<String,String>();
        Map<String,String> m2=new HashMap<String,String>();
        m1.put("01","lisa");
        m1.put("02","rose");
        m1.put("03","shaorsa");

        m2.put("01","Prince");
        m2.put("02","King");
        m2.put("03","Queen");

        Map<String,Map<String,String>> Info=new HashMap<String,Map<String,String>>();
        Info.put("class1",m1);
        Info.put("class2",m2);

//        entrySet1(Info); //Map不能foreach
//        entrySet2(Info); //进行while hasNext循环
        entrySet3(Info);
    }

    private static void entrySet3(Map<String, Map<String, String>> info) {
        Set<String> classname=info.keySet();
        Iterator<String> it=classname.iterator();
        while(it.hasNext()){
            String csname1 = it.next();
            Map<String,String> mp1=info.get(csname1);
            Set<String> setnum=mp1.keySet();
            Iterator<String> itt=setnum.iterator();
            System.out.println(csname1+": ");
            while(itt.hasNext()){
                String Id = itt.next();
                String value = mp1.get(Id);
                System.out.println(Id+value);
            }
        }
    }

    private static void entrySet2(Map<String,Map<String,String>> map) {
        Set<Map.Entry<String, Map<String, String>>> entries = map.entrySet();
        Iterator<Map.Entry<String, Map<String, String>>> it=entries.iterator();
        while(it.hasNext()){
            Map.Entry<String, Map<String, String>> next= it.next();
            String classname= next.getKey();
            Map<String,String> hmp=next.getValue();
            Set<Map.Entry<String,String>> set2=hmp.entrySet();
            Iterator<Map.Entry<String,String>> itt=set2.iterator();
            System.out.println(classname+": ");
            while (itt.hasNext()){
                Map.Entry<String, String> next1 = itt.next();
                System.out.print(next1.getKey()+"..."+next1.getValue()+" ");
            }
            System.out.println();
        }
    }

    public static void entrySet1(Map<String,Map<String,String>> map){
        Set<Map.Entry<String, Map<String, String>>> entries = map.entrySet();
        for (Map.Entry<String, Map<String, String>> entry:entries){
            Object value = entry.getValue();

        }

    }
}
