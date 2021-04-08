package com.shiju.test02;

public interface InterA {
    public static final int NUM = 20;
    public abstract void methodAbs();

    default void methDefault(){
        System.out.println("接口默认方法:解决接口升级问题,让已存在的实现类不报错,实现类也可以重写默认方法");
    }

    public static void methodStatic(){
        System.out.println("接口的静态方法:接口已经写好的现成的功能,和实现类无关,只能接口名调用");
    }

    private void methodPrivate(){
        System.out.println("接口的私有方法,抽取多个default方法的通用代码,不让实现类访问");
    }

    private static void methodPrivateStatic(){
        System.out.println("接口的私有静态方法,抽取多个static方法的通用代码");
    }

    public abstract void show();

    public static void method1(){
        System.out.println("黄桂田真是爹的好大儿~~");
    }
}
