package com.shuiju.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author shiju
 * @date 2021/04/06 11:15
 **/
public class Demo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //线程开启之后需要执行里面的call方法
        MyCallable mc = new MyCallable();

        //可以获取线程执行完毕之后的结果.也可以作为参数传递给Thread对象
        FutureTask<String> ft = new FutureTask<>(mc);

        //创建线程对象
        Thread t1 = new Thread(ft);
        //开启线程
        t1.start();

        String s = ft.get();//注意:此方法会阻塞.....要先start(),再get()
        System.out.println(s);
    }
}
