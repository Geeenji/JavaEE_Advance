package com.itfei.ThreadPool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService ex= Executors.newFixedThreadPool(2);
        Future<Integer> sumFuture=ex.submit(new gaosiCallable());
        System.out.println(sumFuture.get());

        Future<String[]> splitFuture=ex.submit(new SplitCallable());
        String[] strings=splitFuture.get();
        for (String s:strings){
            System.out.println(s);
            System.out.println(s);
            System.out.println(s);
        }
    }
}
