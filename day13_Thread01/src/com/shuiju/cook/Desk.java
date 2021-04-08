package com.shuiju.cook;

/**
 * 共享资源
 * @author shiju
 * @date 2021/04/06 18:55
 **/
public class Desk {
    //是否有汉堡包.true表示有,false表示没有,默认false
    public static boolean isHaving = false;
    //只做10个
    public static int count = 10;
    //锁对象
    public static  final Object look = new Object();
}
