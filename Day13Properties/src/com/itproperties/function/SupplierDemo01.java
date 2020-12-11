package com.itproperties.function;

import java.util.function.Supplier;

public class SupplierDemo01 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,5};
        int arrayMax = getArrayMax(() -> {
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) max = arr[i];
            }
            return max;
        });
    }
    public static int getArrayMax(Supplier<Integer> supplier){
        return supplier.get();
    }

}
