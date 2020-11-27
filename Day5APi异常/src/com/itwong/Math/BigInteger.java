package com.itwong.Math;

public class BigInteger {
    public static void main(String[] args) {
        java.math.BigInteger b1=new java.math.BigInteger("123456423423423423422342342");
        java.math.BigInteger b2=new java.math.BigInteger("324234234234234234234234234");
        java.math.BigInteger subtract = b2.subtract(b1);
        System.out.println(subtract);
    }
}
