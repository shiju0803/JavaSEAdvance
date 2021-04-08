package com.shiju.work;

import java.util.concurrent.CountDownLatch;

/**
 * 请使用CountDownLatch编写一个程序，实现以下效果：
 * 	线程A打印：”开始计算”
 * 	线程B：计算1--100所有数的累加和，并打印结果。
 * 	线程A打印：”计算完毕”
 * @author shiju
 * @date 2021/04/07 20:23
 **/
public class PrintCount {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        new ThreadA(countDownLatch).start();
        new ThreadB(countDownLatch).start();
    }
}
class ThreadA extends Thread{
    private CountDownLatch countDownLatch;
    public ThreadA(CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
    }
    @Override
    public void run() {
        System.out.println("开始计算");
        countDownLatch.countDown();
        //让线程睡眠一会,等待线程B计算完成
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("计算完毕");
    }
}
class ThreadB extends Thread{
    private CountDownLatch countDownLatch;
    public ThreadB(CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
    }
    @Override
    public void run() {
        try {
            //等待线程A打印开始计算时开始计算并打印结果
            countDownLatch.await();
            int sum = 0;
            for (int i = 1; i <= 100 ; i++) {
                sum += i;
            }
            System.out.println("1--100所有数的累加和 = " + sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}