package com.shiju.homework;

import java.util.concurrent.*;

/**
 * 定义一个线程类，实现Callable接口。此线程可以计算1--100的所有数字的累加和。
 * 定义测试类，和main()方法，使用线程池启动线程，并获取计算结果，并将结果打印到控制台
 * @author shiju
 * @date 2021/04/07 20:55
 **/
public class CallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                1,
                1,
                2,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(2),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
         String s= pool.submit(() -> {
            int sum = 0;
            for (int i = 1; i <= 100; i++) {
                sum += i;
            }
            return "1--100的所有数字的累加和 = " + sum;
        }).get();
        System.out.println(s);

        pool.shutdown();
    }
}
