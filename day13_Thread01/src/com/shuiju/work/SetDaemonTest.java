package com.shuiju.work;

/**
 * 编写程序，在主线程中，循环输出“主线程执行”；在一条新线程中，循环输出“子线
 * 程执行”
 * @author shiju
 * @date 2021/04/06 20:28
 **/
public class SetDaemonTest {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        //线程守护
        t2.setDaemon(true);
        t1.start();
        t2.start();
    }
}
class Thread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程执行");
        }
    }
}
class Thread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("子线程执行");
        }
    }
}
