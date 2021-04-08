package com.shiju.semaphore;

import java.util.concurrent.Semaphore;

/**
 * @author shiju
 * @date 2021/04/07 19:54
 **/
public class SemaphoreDemo {
    public static void main(String[] args) {
        Drive d = new Drive();
        System.out.println("秋名山大舞台,有命你就来");
        for (int i = 1; i <= 10; i++) {
            new Thread(d,"黄桂田" + i + "号").start();
        }
    }
}
class Drive implements Runnable{
    //1.获取管理员对象
    private Semaphore semaphore = new Semaphore(2);

    @Override
    public void run() {
        try {
            //授予权限
            semaphore.acquire();
            //开始开车
            System.out.println(Thread.currentThread().getName() + "获取了老司机证开始飙车");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + "酒驾,被吊销驾照");
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}