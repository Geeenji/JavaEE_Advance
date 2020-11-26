package com.itwong.date01;

import java.time.Year;
import java.util.Calendar;

public class CalenderDemo {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        System.out.println(instance);

//        int year=instance.get(Calendar.YEAR);

        System.out.println(instance.get(Calendar.YEAR)+"年"+instance.get(Calendar.MONTH)+
                "月"+instance.get(Calendar.DAY_OF_MONTH)+"日");
    }
}
