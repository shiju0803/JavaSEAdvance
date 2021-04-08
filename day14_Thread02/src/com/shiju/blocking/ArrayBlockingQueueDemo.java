package com.shiju.blocking;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author shiju
 * @date 2021/04/07 09:49
 **/
public class ArrayBlockingQueueDemo {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> list = new ArrayBlockingQueue<>(1);

        Foodie f = new Foodie(list);
        Cooker c = new Cooker(list);

        f.start();
        c.start();
    }
}

class Cooker extends Thread {

    private ArrayBlockingQueue<String> list;

    public Cooker(ArrayBlockingQueue<String> list) {
        this.list = list;
    }

    @Override
    public void run() {

        while (true) {

            try {
                list.put("汉堡包");
                System.out.println("厨师放入一个汉堡包");
                //添加睡眠,可以让打印符合逻辑
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Foodie extends Thread {

    private ArrayBlockingQueue<String> list;

    public Foodie(ArrayBlockingQueue<String> list) {
        this.list = list;
    }

    @Override
    public void run() {

        while (true) {
            try {
                String take = list.take();
                System.out.println("吃货将" + take + "拿出来吃了");
                //添加睡眠,可以让打印符合逻辑
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
