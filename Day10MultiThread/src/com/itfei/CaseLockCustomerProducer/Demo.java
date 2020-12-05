package com.itfei.CaseLockCustomerProducer;
/*- 程序出现无效的监视器状态异常。
- wait()或者notify()方法会抛出此异常。
  - 程序中，wait()或者notify()方法的调用者是this对象。
  - 而this对象在同步中并不是锁对象，只有作为锁的对象才能调用wait()或者notify()方法。
  - 而锁对象是生产者和消费者共享的包子铺对象。*/
public class Demo {
    public static void main(String[] args) {
        Baozipu baozipu=new Baozipu();
        Producer producer=new Producer(baozipu);
        Costumer costumer=new Costumer(baozipu);

        new Thread(producer).start();
        new Thread(costumer).start();
    }
}
