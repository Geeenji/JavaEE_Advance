package com.itwong.Exception01;

public class DEmo {
    public static void main(String[] args) {
        int[] a={1,2,3};
        int g = getArray(a);
        System.out.println(g);
    }
    public static int getArray(int[] arr){
//        return arr[5]; //JVM 为异常new了对象
        return arr[0];
    }
}
