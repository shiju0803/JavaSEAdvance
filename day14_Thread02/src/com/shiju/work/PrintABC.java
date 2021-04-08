package com.shiju.work;

import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;

/**
 * 3个线程分别打印"A,B,C",要求按照顺序打印ABC
 * @author shiju
 * @date 2021/04/07 19:36
 **/
public class PrintABC {
    public static void main(String[] args) {
        //1.创建两个CountDownLatch对象
        CountDownLatch countDownLatch1 = new CountDownLatch(1);
        CountDownLatch countDownLatch2 = new CountDownLatch(1);
        PrintA printA = new PrintA(countDownLatch1);
        PrintB printB = new PrintB(countDownLatch1,countDownLatch2);
        PrintC printC = new PrintC(countDownLatch2);

        printA.start();
        printB.start();
        printC.start();
    }
}
class PrintA extends Thread{
    private CountDownLatch countDownLatch;
    public PrintA(CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println("A");

        //打印完A说一下
        countDownLatch.countDown();
    }
}
class PrintB extends Thread{
    private CountDownLatch countDownLatch1;
    private CountDownLatch countDownLatch2;
    public PrintB(CountDownLatch countDownLatch1,CountDownLatch countDownLatch2){
        this.countDownLatch1 = countDownLatch1;
        this.countDownLatch2 = countDownLatch2;
    }

    @Override
    public void run() {
        try {
            countDownLatch1.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("B");

        //打印完A说一下
        countDownLatch2.countDown();
    }
}
class PrintC extends Thread{
    private CountDownLatch countDownLatch;
    public PrintC(CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("C");
    }
}