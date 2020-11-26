package com.itwong.date01;

import java.util.Date;

public class DateDemo {{
    Date date=new Date();
    System.out.println(date);
}
    public static void main(String[] args) {
        method();
    }

    private static void method(){
        Date date =new Date(0);
        System.out.println(date);
        long time = date.getTime();
        System.out.println(time);
    }
}
