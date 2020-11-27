package com.itwong.Exception04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExDemo {
    public static void main(String[] args) throws Exception{
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            Date date=sdf.parse("201a9-1-1");
    }
}
