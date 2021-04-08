package com.shuiju.work;

/**
 * 第二种方法：实现Runnable接口。
 * @author shiju
 * @date 2021/04/06 19:58
 **/
public class RunnableTest {
    public static void main(String[] args) {
        IThread2 impl = new IThread2();
        Thread t1 = new Thread(impl);
        Thread t2 = new Thread(impl);
        t1.start();
        t2.start();
    }
}
class IThread2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("线程启动了" + i);
        }
    }
}