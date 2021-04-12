package com.shiju.homework;

import java.util.Scanner;

/*
 * @Author 时距
 * @PackageName:com.shiju.work
 * @ClassName : StringTest
 * @Date 2021/3/26 19:17
 * @Description:
 * 请从控制台接收一个整数的“分数”值，要求用String类型的变量存储，程序可以将这个String类型的分数值转换为int值，并将分数 + 5分后打印到控制台。
 **/
public class StringTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        String str = sc.nextLine();
        int num = Integer.parseInt(str) + 5;
        System.out.println(num);
    }
}
