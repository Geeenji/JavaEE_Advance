package com.itTeng.PokerCase02;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        List<Integer> list = new ArrayList<Integer>();
        int count1 = 0;
        String[] colours = {"♥", "♠", "♣", "♦"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        for (String number : numbers)
            for (String colour : colours) {
                map.put(count1, colour + number);
                list.add(count1);
//                System.out.println(colour + number);
                count1++;
            }
        map.put(53, "大王");
        map.put(54, "小王");
        list.add(53);
        list.add(54);
        Collections.shuffle(list);

        List<Integer> p1=new ArrayList<Integer>();
        List<Integer> p2=new ArrayList<Integer>();
        List<Integer> p3=new ArrayList<Integer>();
        List<Integer> bottom=new ArrayList<Integer>();

        for (int i = 0; i < list.size(); i++) {
            if (i>list.size()-4){
                bottom.add(list.get(i));
            }
            else if(i%3==0){
                p1.add(list.get(i));
            }else if(i%3==1){
                p2.add(list.get(i));
            }else{
                p3.add(list.get(i));
            }
        }
        Collections.sort(p1);
        Collections.sort(p2);
        Collections.sort(p3);

        look("lisa",p1,map);
        look("jinso",p2,map);
        look("rose",p3,map);
        look("底牌",bottom,map);
    }

    private static void look(String s, List<Integer> p, Map<Integer, String> map) {
        System.out.println("name:"+s);
        for (Integer integer:p){
            String value=map.get(integer);
            System.out.print(value+" ");
        }
        System.out.println();
    }
}
