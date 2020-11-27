package com.itwong.Exception02;

public class trycatch {
    public static void main(String[] args) {
        int[] a={1,2,3};
        try {
            int g = getArray(a);
            System.out.println(g);
        }catch (Exception ex){
            System.out.println("Exception solved");
            String message=ex.getMessage();
            System.out.println("Message"+message);

            String str=ex.toString();
            System.out.println("str"+str);

            ex.printStackTrace();
        }
        System.out.println("程序结束");


    }
    public static int getArray(int[] arr){
        return arr[5]; //JVM 为异常new了对象
//        return arr[0];
    }
}
