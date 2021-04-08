package com.shuiju.cook;

/**
 * 厨师
 * @author shiju
 * @date 2021/04/06 18:54
 **/
public class Cooker extends Thread{
    @Override
    public void run() {
        while (true){
            //线程之间通信必须先同步
            synchronized (Desk.look){
                //判断汉堡包是否做够数了
                if(Desk.count == 0){
                    break;
                }else{
                    //没有汉堡包
                    if(!Desk.isHaving){
                        //生产汉堡包
                        System.out.println("厨师正在生产汉堡包~~~");
                        //修改状态为true
                        Desk.isHaving = true;
                        //唤醒吃货...
                        Desk.look.notifyAll();
                    }else{
                        //有汉堡包
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
