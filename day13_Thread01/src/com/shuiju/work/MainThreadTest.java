package com.shuiju.work;

/**
 * 编写一个Java程序，要求在同一个类中除main线程外，再开启一个线程，2个线程都循环执行20次。
 * @author shiju
 * @date 2021/04/06 20:51
 **/
public class MainThreadTest {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "执行了" + i + "次");
                }
            }
        },"普通线程").start();
        //main线程
        for (int i = 1; i <= 20 ; i++) {
            System.out.println(Thread.currentThread().getName() + "执行了" + i + "次");
        }
    }
}
