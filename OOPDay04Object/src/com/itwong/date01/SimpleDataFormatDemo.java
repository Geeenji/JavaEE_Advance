package com.itwong.date01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDataFormatDemo {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH点mm分ss秒");
        String date= sdf.format(new Date());
        System.out.println(date);

        String str="2020-10-31";
        SimpleDateFormat sdd=new SimpleDateFormat("yyyy-MM-dd");
        Date ps = sdd.parse(str);
        System.out.println(ps);
    }
}
