package com.shiju.work;

import java.util.Scanner;

/*
 * @Author 时距
 * @PackageName:com.shiju.work
 * @ClassName : CharReplace
 * @Date 2021/3/26 20:29
 * @Description:
 * 	程序模拟一个论坛发帖的过程，请用户输入一个发帖内容，例如：
	“积分看电视了几分我特朗普将反恐文件风IE哦特朗普积分哦忘记特朗普”
	请将字符串中所有的”特朗普”替换为”*”符号。
 **/
public class CharReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入发帖内容:");
        String str = sc.nextLine();
        String newStr = str.replaceAll("特朗普","*");
        System.out.println(newStr);
    }
}
