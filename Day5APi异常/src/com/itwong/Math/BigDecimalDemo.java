package com.itwong.Math;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {
        BigDecimal b1=new BigDecimal("3.125");
        BigDecimal b2=new BigDecimal("1.582");
        BigDecimal b=b1.divide(b2,3,BigDecimal.ROUND_UP);
        System.out.println(b);

    }
}
