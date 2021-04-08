package com.shiju.demo;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author shiju
 * @date 2021/04/07 16:07
 **/
public class AutoDemo {
    public static void main(String[] args) {
        MyAtomThread atom = new MyAtomThread();

        for (int i = 0; i < 500; i++) {
            new Thread(atom).start();
        }
    }
}

class MyAtomThread implements Runnable {
    //使用原子的方式更新基本类型
    private AtomicInteger  count = new AtomicInteger(0); //送冰淇淋的数量
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            //1,从共享数据中读取数据到本线程栈中.
            //2,修改本线程栈中变量副本的值
            //3,会把本线程栈中变量副本的值赋值给共享数据.
            //synchronized (this){
                //count++;
                System.out.println("已经送了" + count.incrementAndGet() + "个冰淇淋");
            //}
        }
    }
}
