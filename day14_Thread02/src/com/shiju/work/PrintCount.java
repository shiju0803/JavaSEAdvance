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
        CountDownLatch countDownLatch1 = new CountDownLatch(1);
        CountDownLatch countDownLatch2 = new CountDownLatch(1);
        new ThreadA(countDownLatch1,countDownLatch2).start();
        new ThreadB(countDownLatch1,countDownLatch2).start();
    }
}
class ThreadA extends Thread{
    private CountDownLatch countDownLatch1;
    private CountDownLatch countDownLatch2;

    public ThreadA(CountDownLatch countDownLatch1,CountDownLatch countDownLatch2){
        this.countDownLatch1 = countDownLatch1;
        this.countDownLatch2 = countDownLatch2;
    }
    @Override
    public void run() {
        System.out.println("开始计算");
        countDownLatch1.countDown();
        //等待线程B计算完成
        try {
            countDownLatch2.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("计算完毕");
    }
}
class ThreadB extends Thread{
    private CountDownLatch countDownLatch1;
    private CountDownLatch countDownLatch2;

    public ThreadB(CountDownLatch countDownLatch1,CountDownLatch countDownLatch2){
        this.countDownLatch1 = countDownLatch1;
        this.countDownLatch2 = countDownLatch2;
    }
    @Override
    public void run() {
        try {
            //等待线程A打印开始计算时开始计算并打印结果
            countDownLatch1.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int sum = 0;
        for (int i = 1; i <= 100 ; i++) {
            sum += i;
        }
        System.out.println("1--100所有数的累加和 = " + sum);
        countDownLatch2.countDown();
    }
}