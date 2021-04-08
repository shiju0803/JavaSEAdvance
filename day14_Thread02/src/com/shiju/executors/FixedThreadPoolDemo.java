package com.shiju.executors;

import java.util.concurrent.*;

/**
 * @author shiju
 * @date 2021/04/07 11:24
 **/
public class FixedThreadPoolDemo {
    public static void main(String[] args) {
        //1.创建池
        //参数是最大值,不是初始值!
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        //ThreadPoolExecutor pool = (ThreadPoolExecutor)executorService;
        //2.提交任务到池
        for (int i = 0; i < 20; i++) {
            //匿名内部类访问局部变量,需要是常量
            int j = i;
            executorService.submit(() -> System.out.println(Thread.currentThread().getName() + "执行了" + j));
        }
        //关闭线程池
        executorService.shutdown();
    }
}
