package com.shiju.demo;

import java.util.concurrent.CountDownLatch;

/**
 * @author shiju
 * @date 2021/04/07 19:15
 **/
public class MyCountDownLatchDemo {
    public static void main(String[] args) {
        //CountDownLatch使用场景:
        //让某一条线程等待其他一个或多个线程执行完毕之后再执行
        //使用步骤:
        //1.创建CountDownLatch(3);
        CountDownLatch countDownLatch = new CountDownLatch(3);
        //2.创建妈妈线程和3个孩子线程,传入CountDownLatch对象
        MotherThread motherThread = new MotherThread(countDownLatch);
        motherThread.start();

        for (int i = 1; i <= 3; i++) {
            ChileThread thread = new ChileThread(countDownLatch);
            thread.setName("线程" + i);
            thread.start();
        }
        //3. 3个孩子线程,完毕后调用countDown()
        // 4. 妈妈线程await() ,然后开始工作
    }
}
