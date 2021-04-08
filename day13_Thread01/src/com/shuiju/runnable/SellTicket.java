package com.shuiju.runnable;

/**
 * @author shiju
 * @date 2021/04/06 15:45
 **/
public class SellTicket implements Runnable{
    //定义一百张票
    private int tickets = 100;
    private Object obj = new Object();
    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                if (tickets == 0) {
                    //票没了,结束线程
                    System.out.println(Thread.currentThread().getName() + "票卖完了~");
                    break;
                } else {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    tickets--;
                    System.out.println(Thread.currentThread().getName() + "卖了一张,还剩" + tickets + "票");
                }
            }
        }
    }
}
