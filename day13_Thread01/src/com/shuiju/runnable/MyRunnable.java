package com.shuiju.runnable;

/**
 * @author shiju
 * @date 2021/04/06 10:46
 **/
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "第二种方式实现多线程" + i);
        }
    }
}
