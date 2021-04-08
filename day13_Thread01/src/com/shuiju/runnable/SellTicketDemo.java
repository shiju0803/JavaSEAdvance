package com.shuiju.runnable;

/**
 * @author shiju
 * @date 2021/04/06 15:50
 **/
public class SellTicketDemo {
    public static void main(String[] args) {
        //创建SellTicket类的对象
        SellTicket impl = new SellTicket();
        //创建三个Thread类的对象，把SellTicket对象作为构造方法的参数，并给出对应的窗口名称
        Thread t1 = new Thread(impl,"窗口1");
        Thread t2 = new Thread(impl,"窗口2");
        Thread t3 = new Thread(impl,"窗口3");
        //启动线程
        t1.start();
        t2.start();
        t3.start();
    }
}
