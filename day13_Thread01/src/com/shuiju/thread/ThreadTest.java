package com.shuiju.thread;

import com.sun.jdi.PathSearchingVirtualMachine;

/**
 * @author shiju
 * @date 2021/04/06 09:02
 **/
public class ThreadTest {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("小黄");
        MyThread t2 = new MyThread("大黄");
        MyThread t3 = new MyThread("阿黄");
        //设置为守护线程
        t1.setDaemon(true);
        t3.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
    }
}
class MyThread extends Thread{
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + "线程启动了....." + i);
        }
    }
}
