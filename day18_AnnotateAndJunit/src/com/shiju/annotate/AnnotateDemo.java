package com.shiju.annotate;

import jdk.jfr.StackTrace;

/**
 * @author shiju
 * @date 2021/04/13 10:14
 **/
public class AnnotateDemo {
    public static void main(String[] args) {
        myThread t = new myThread();
        t.bbb();

    }
}
//@SuppressWarnings(value = "all")： 压制警告

class myThread extends Thread{
    //@Override:  描述一个方法是复写的父类方法
    @Override
    public void run() {
        super.run();
    }
    //@Deprecated: 描述一个方法是过时的方法，调用过时的方法会有一个横线
    @Deprecated
    public void bbb(){

    }
    public void method(){

    }
}
