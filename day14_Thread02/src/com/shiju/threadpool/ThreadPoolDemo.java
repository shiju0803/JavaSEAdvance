package com.shiju.threadpool;

import java.util.concurrent.*;

/**
 * @author shiju
 * @date 2021/04/07 14:13
 **/
public class ThreadPoolDemo {
    //corePoolSize：   核心线程的最大值，不能小于0
    //maximumPoolSize：最大线程数，不能小于等于0，maximumPoolSize >= corePoolSize
    //keepAliveTime：  空闲线程最大存活时间,不能小于0
    //unit：           时间单位
    //workQueue：      任务队列，不能为null
    //threadFactory：  创建线程工厂,不能为null
    //handler：        任务的拒绝策略,不能为null
    public static void main(String[] args) {
        TimeUnit unit;
        BlockingQueue workQueue;
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                2,
                5,
                2,
                TimeUnit.HOURS,
                new ArrayBlockingQueue<>(10),
                Executors.defaultThreadFactory(),
                //new ThreadPoolExecutor.AbortPolicy()//默认策略,丢弃任务并抛出异常
                //new ThreadPoolExecutor.DiscardPolicy()//丢弃任务,不抛出异常
                // new ThreadPoolExecutor.DiscardOldestPolicy()//丢弃等待最久的任务,把当前任务加入队列
                 new ThreadPoolExecutor.CallerRunsPolicy());//调用任务的run()方法绕过线程池直接用main线程执行
        for (int i = 0; i < 16; i++) {
            int j = i;
            pool.submit(() -> System.out.println(Thread.currentThread().getName() + "线程启动" + j));
        }
        pool.shutdown();
    }
}
