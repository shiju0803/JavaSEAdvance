package com.shiju.executors;

import java.util.concurrent.*;

/**
 * @author shiju
 * @date 2021/04/07 10:50
 **/
public class NewCachedThreadPoolDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //1,创建一个默认的线程池对象.池子中默认是空的.默认最多可以容纳int类型的最大值.
        ExecutorService executorService = Executors.newCachedThreadPool();
        //Executors --- 可以帮助我们创建线程池对象
        //ExecutorService --- 可以帮助我们控制线程池
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + "..." + i);
                }
            }
        });
        Thread.sleep(3000);
        Future<String> future = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + "..." + i);
                }
                return "黄桂田...";
            }
        });
        String s = future.get();
        System.out.println(s);
    }
}
