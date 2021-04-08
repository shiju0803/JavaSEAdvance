package com.shuiju.runnable;

/**
 * @author shiju
 * @date 2021/04/06 10:48
 **/
public class TestRunnable {
    public static void main(String[] args) {
        MyRunnable imp = new MyRunnable();
        Thread t1 = new Thread(imp,"大黄");
        Thread t2 = new Thread(imp,"小黄");
        t1.start();
        t2.start();
    }
}
