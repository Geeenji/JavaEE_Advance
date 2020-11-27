package com.itwong.Exception03;

public class Demo {
    public static void main(String[] args) {
        //计算正方形面积
        //使用异常技术，手动抛出异常
        //关键字 throw
        try {
            int area = getAea(-2);
            System.out.println("面积"+area);
        }catch(Exception ex){
            System.out.println("边长不存在");
            ex.printStackTrace();
        }
    }
    public static int getAea(int a) throws Exception{
        if (a<=0){
            throw new Exception();
        }
        return a*a;
    }
}
