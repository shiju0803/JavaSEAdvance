package com.shiju.homework;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 请用“等待唤醒”机制编写一个程序，要求：
 * 第一个线程：遍历1--1000所有的数字，在遍历过程中，如果发现这个数字能同时被
 * 2,3,5,7整除，立即wait()退出等待，让第二个线程进入。
 * 第二个线程：运行后，将一个计数器 + 1，之后再唤醒等待的线程。
 * <p>
 * 主线程中：休息2秒，让两个线程全部执行完毕，打印“计数器”的结果。
 * <p>
 * 注意：第二个线程使用的计数器，要定义在线程外部。
 *
 * @author shiju
 * @date 2021/04/07 21:28
 **/
public class Test {
    public static void main(String[] args) {
        //创建锁对象
        Lock lock = new Lock();

        WaitThread t1 = new WaitThread(lock);
        t1.start();

        NotifyThread t2 = new NotifyThread(lock);
        t2.start();


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("计数器结果是：" + lock.count.get());
    }

}

/**
 * 锁对象，在线程中传递，但它的属性值可以发生变化
 * 而基本类型不能做为锁，它的包装类如果做为锁的话，值不能发生变化，不然锁会失效
 * 所以定义了一个类做为锁对象，锁对象可以修改它的属性值，因为锁本身的引用没有变化
 */
class Lock {
    //标记：是否需要唤醒
    boolean needNofity = false;
    AtomicInteger count = new AtomicInteger();
}

/**
 * 第一个线程：遍历1--1000所有的数字，在遍历过程中，如果发现这个数字能同时被
 * 2,3,5,7整除，立即wait()退出等待，让第二个线程进入。
 */
class WaitThread extends Thread {

    private Lock lock;

    public WaitThread(Lock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 1; i <= 1000; i++) {
                if (i % 210 == 0) {
                    try {
                        System.out.println(i + "=> 进入等待状态");
                        //设置标记告诉另一个线程我需要唤醒，另一个线程如果通知就加1，否则不加
                        lock.needNofity = true;
                        //等待自己
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //唤醒别人
                lock.notify();
            }
        }
    }
}

/**
 * 第二个线程：运行后，将一个计数器 + 1，之后再唤醒等待的线程。
 */
class NotifyThread extends Thread {
    private Lock lock;

    public NotifyThread(Lock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                //判断是否需要唤醒
                if (lock.needNofity) {
                    //唤醒
                    lock.notify();
                    //计数器加1
                    System.out.println("唤醒" + lock.count.incrementAndGet() + "次");
                    //将唤醒的标记设置为false
                    lock.needNofity = false;
                }
                try {
                    //自己等待
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}