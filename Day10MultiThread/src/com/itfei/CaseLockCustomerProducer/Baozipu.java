package com.itfei.CaseLockCustomerProducer;

public class Baozipu {
    private boolean flag;
    private int baozicount;

    public Baozipu() {
    }

    public Baozipu(boolean flag, int baozicount) {
        this.flag = flag;
        this.baozicount = baozicount;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public void getBaozicount() {
        System.out.println("消费第："+baozicount+"个包子");
    }

    public void setBaozicount() {
        baozicount++;
        System.out.println("生产第："+baozicount+" 个包子");
    }
}
