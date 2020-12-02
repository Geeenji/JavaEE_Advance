package com.itTeng.VarArguments;

public class Var01 {
    public static void main(String[] args) {
        int sum = getSum(1,2,3,4,5,6);
        System.out.println(sum);
    }

    private static int getSum(int...arr) {
        int sum=0;
        for (int i:arr){
            sum+=i;
        }
        return sum;
    }
}
