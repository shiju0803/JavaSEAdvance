package com.shuiju.work;

/**
 * 多线程匿名内部类练习
 * 编写程序，创建两个线程对象，一根线程循环输出“播放背景音乐”，
 * 另一根线程循环输出“显示画面”，要求线程实现Runnable接口，且使用匿名内部类实现
 * @author shiju
 * @date 2021/04/06 20:41
 **/
public class RunnableTest02 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("播放背景音乐");
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("显示画面");
            }
        }).start();
    }
}