package com.shuiju.thread;

/**
 * 死锁
 *
 * @author shiju
 * @date 2021/04/06 18:27
 **/
public class DeadLook {
    public static void main(String[] args) {
        Object objA = new Object();
        Object objB = new Object();

        new Thread(() -> {

            for (int i = 0; i < 10; i++) {
                synchronized (objA) {
                    //线程一
                    synchronized (objB) {
                        System.out.println("小康同学正在走路");
                    }
                }
            }

        }).start();

        new Thread(() -> {

            for (int i = 0; i < 10; i++) {
                synchronized (objB) {
                    //线程二
                    synchronized (objA) {
                        System.out.println("小薇同学正在走路");
                    }
                }
            }

        }).start();
    }
}
