package com.shiju.homework;

import java.util.concurrent.Semaphore;

/**
 * 请使用Semaphore编写一个程序，实现以下效果：有10名游客要参观展览室，而“展览室”同时只允许最多“三个游客”参观，每个游客参观时间2秒。
 * @author shiju
 * @date 2021/04/07 20:10
 **/
public class SemaphoreTest {
    public static void main(String[] args) {
        //定义数组存放10个游客名字
        String[] name = {"贾乃亮","皮几万","李小璐","马蓉","王宝强","白百何","秦羽","胡海泉","马苏","迪丽热巴"};
        //创建游客实现类
        Visitor v = new Visitor();
        for (int i = 0; i < name.length; i++) {
            new Thread(v,name[i]).start();
        }
    }
}
class Visitor implements Runnable{
    //获取管理员对象
    private Semaphore semaphore = new Semaphore(3);
    @Override
    public void run() {
        try {
            //获取权限
            semaphore.acquire();
            //进行参观
            System.out.println(Thread.currentThread().getName() + "正在进行参观");
            //每个游客参观时间2秒
            Thread.sleep(2000);
            //结束参观
            System.out.println(Thread.currentThread().getName() + "参观完成");
            //归还权限
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}