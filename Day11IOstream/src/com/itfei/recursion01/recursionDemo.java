package com.itfei.recursion01;
/*方法的递归调用
* 功能的计算主体确定，计算中的参数时每次变化的
* 方法不停进栈 */
public class recursionDemo {
    public static void main(String[] args) {
        int rec = rec(5);
        int fib = fibanacii(10);
        System.out.println(rec+"..."+fib);
    }
    public static int rec(int n){
        if(n==1) return 1;
        return n*rec(n-1);
    }
    public  static int fibanacii(int n){
        if (n==1||n==2) return 1;
        return fibanacii(n-1)+fibanacii(n-2);
    }

}
