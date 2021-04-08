package com.shuiju.cook;

import java.util.Date;

/**
 * 吃货
 * @author shiju
 * @date 2021/04/06 18:57
 **/
public class Foodie extends Thread{
    @Override
    public void run() {
        while (true){
            //线程之间通信必须先同步
            synchronized (Desk.look){
                //判断汉堡包是否吃够数了
                if(Desk.count == 0){
                    break;
                }else {
                    if(Desk.isHaving){
                        //有汉堡包
                        //开吃....
                        System.out.println("吃货在吃汉堡包~~");
                        //修改状态为false
                        Desk.isHaving = false;
                        //汉堡包总数减一
                        Desk.count--;
                        //唤醒厨师...
                        Desk.look.notifyAll();
                    }else {
                        //没有汉堡包
                        //等待
                        try {
                            Desk.look.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
