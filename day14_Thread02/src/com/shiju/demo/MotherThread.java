package com.shiju.demo;

import java.util.concurrent.CountDownLatch;

/**
 * @author shiju
 * @date 2021/04/07 19:15
 **/
public class MotherThread extends Thread{
    private CountDownLatch countDownLatch;

    public MotherThread(CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
    }
    @Override
    public void run() {
        //1.等待
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //2.收拾碗筷
        System.out.println("妈妈在收拾碗筷");
    }
}
