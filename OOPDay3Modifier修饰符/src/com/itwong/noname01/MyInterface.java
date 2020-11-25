package com.itwong.noname01;

public interface MyInterface {
    public abstract void inter();

}

class MyInterfaceImpl implements MyInterface{ //同一文件下不能加public
    public void inter(){
        System.out.println("Override in implement");
    }
}
