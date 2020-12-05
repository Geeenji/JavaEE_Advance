package com.itfei.ThreadPool;

import java.util.concurrent.Callable;

public class SplitCallable implements Callable<String[]> {
    public String[] call(){
        String str="aa  bbb ccc    ddd";
        return str.split(" +");
    }
}
