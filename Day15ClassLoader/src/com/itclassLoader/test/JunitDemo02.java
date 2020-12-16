package com.itclassLoader.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

public class JunitDemo02 {
    private FileWriter fw;
    @Test
    public void test() throws IOException {
        fw.write("test Junit");
//        System.out.println("测试方法2");
    }
    @Before
    public void tt() throws IOException {
        fw=new FileWriter("E:\\f.txt");
//        System.out.println("test1");
    }
    @After
    public void dd() throws IOException {
        fw.close();
//        System.out.println("test3");
    }
}
