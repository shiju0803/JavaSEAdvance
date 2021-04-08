package com.shuiju.work;

import java.util.Iterator;

/**
 * 继承Thread类实现多线程
 * @author shiju
 * @date 2021/04/06 19:52
 **/
public class ThreadTest {
    public static void main(String[] args) {
        IThread t1 = new IThread();
        IThread t2 = new IThread();
        t1.start();
        t2.start();
    }
}
class IThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("线程启动~");
        }
    }
}