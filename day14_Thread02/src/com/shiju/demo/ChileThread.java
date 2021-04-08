package com.shiju.demo;

import java.util.concurrent.CountDownLatch;

/**
 * @author shiju
 * @date 2021/04/07 19:16
 **/
public class ChileThread extends Thread{
    private CountDownLatch countDownLatch;

    public ChileThread(CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        //1.吃饺子
        for (int i = 1; i <= 10; i++) {
            System.out.println(getName() + "在吃第" + i + "个饺子");
        }
        //2.吃完说一声
        //每一次countDown方法的时候，就让计数器-1
        countDownLatch.countDown();
    }
}
