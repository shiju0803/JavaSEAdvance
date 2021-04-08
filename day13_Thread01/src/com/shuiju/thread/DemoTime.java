package com.shuiju.thread;

import java.util.Date;

/**
 * @author shiju
 * @date 2021/04/06 14:45
 **/
public class DemoTime {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 60; i++) {
            for (int j = 0; j < 60; j++) {
                Thread.sleep(1000);
                System.out.println(i + "分 : " + j + "秒");
            }
        }
    }
}
