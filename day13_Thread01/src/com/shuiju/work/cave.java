package com.shuiju.work;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.locks.Lock;

/**
 * 请按要求编写多线程应用程序，模拟多个人通过一个山洞：
 * 1.这个山洞每次只能通过一个人，每个人通过山洞的时间为5秒；
 * 2.随机生成10个人，同时准备过此山洞，并且定义一个变量用于记录通过隧道的人数。显示每次通过山洞人的姓名，和通过顺序；
 *
 * @author shiju
 * @date 2021/04/06 21:15
 **/
public class cave {
    public static void main(String[] args) {
        String[] name = new String[10];
        Object lock = new Object();
        //随机生成10个人名
        getName(name);
        //创建实现类
        Pass p = new Pass();
        //遍历数组,将数组中的人名赋予十个线程
        for (String s : name) {
            new Thread(p, s).start();
        }
    }

    private static void getName(String[] name) {
        String[] xing = {"赵", "钱", "孙", "李", "周", "吴"};
        String[] ming = {"炎", "燕", "梅", "轩", "淼", "岩"};
        Random r = new Random();
        for (int i = 0; i < name.length; i++) {
            int a = r.nextInt(xing.length);
            int b = r.nextInt(ming.length);
            name[i] = xing[a] + ming[b];
        }
        System.out.println(Arrays.toString(name));
    }
}

class Pass implements Runnable {
    //锁对象
    //Object lock = new Object();
    //计数器,用来记录通过山洞的人数
    int count = 1;

    @Override
    public void run() {
        //每次只能通过一个人
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + "第" + count + "个通过山洞");
            //每个人通过山洞需要5秒
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count++;
        }
    }
}
