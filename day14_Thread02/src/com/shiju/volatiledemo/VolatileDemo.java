package com.shiju.volatiledemo;

/**
 * @author shiju
 * @date 2021/04/07 14:58
 **/
public class VolatileDemo {
    public static void main(String[] args) {

        Boy t1 = new Boy();
        t1.setName("小路同学");
        t1.start();

        Girl t2 = new Girl();
        t2.setName("小皮同学");
        t2.start();
    }
}

class Money {
    public static volatile int money = 100000;
}

class Girl extends Thread {
    @Override
    public void run() {
        while (Money.money == 100000) {

        }

        System.out.println("结婚基金已经不是十万了");
    }
}

class Boy extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Money.money = 90000;
    }
}
