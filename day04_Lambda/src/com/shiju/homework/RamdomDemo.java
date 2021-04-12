package com.shiju.homework;

import java.util.Random;

/*
 * @Author 时距
 * @PackageName:com.shiju.work
 * @ClassName : RamdomDemo
 * @Date 2021/3/24 20:12
 * @Description:
 * 生成随机数,分别使用Random类 和 Math.random()方法实现
            // 0-100
            // 0 - 101
            // 1- 100
            // 1 - 101
 **/
public class RamdomDemo {
    public static void main(String[] args) {
        //使用Random类
        Random r = new Random();
        //0-100
        int a = r.nextInt(101) ;
        System.out.println(a);
        //0-101
        int b = r.nextInt(102);
        System.out.println(a);
        //1-100
        int c = r.nextInt(100) + 1;
        System.out.println(a);
        //1-101
        int d = r.nextInt(101) + 1;
        System.out.println(a);

        //使用Math类
        //0-100
        int num1 =(int) (Math.random() * 100);
        System.out.println(num1);
        //0-101
        int num2 = (int) (Math.random() * 101);
        System.out.println(num2);
        //1-100
        int num3 = (int) (Math.random() * 99 + 1);
        System.out.println(num3);
        //1-101
        int num4 = (int) (Math.random() * 100) + 1;
        System.out.println(num4);
    }
}
