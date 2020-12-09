package com.itIo.serializable;

import java.io.*;

public class SerializedDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        write();
        read();
    }

    private static void write() throws IOException {
        //对象的序列化
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("E:\\case.txt"));
        Person person = new Person("lisa",22);//静态的age不能被序列化
        oos.writeObject(person);
        oos.close();
    }

    public static void read() throws IOException, ClassNotFoundException {
        //读就是反序列化
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("E:\\case.txt"));
        Object obj=ois.readObject();
        System.out.println(obj);
    }
}
