package com.shiju.blocking;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author shiju
 * @date 2021/04/07 09:48
 **/
public class Demo01 {
    public static void main(String[] args) throws Exception {
        // 创建阻塞队列的对象,容量为 1
        ArrayBlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<>(1);

        // 存储元素
        arrayBlockingQueue.put("汉堡包");

        // 取元素
        System.out.println(arrayBlockingQueue.take());
        System.out.println(arrayBlockingQueue.take()); // 取不到会阻塞

        System.out.println("程序结束了");
    }
}
