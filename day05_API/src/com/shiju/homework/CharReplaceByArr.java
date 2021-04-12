package com.shiju.homework;

import java.util.Scanner;

/*
 * @Author 时距
 * @PackageName:com.shiju.work
 * @ClassName : CharReplaceByArr
 * @Date 2021/3/26 20:32
 * @Description:
 * 	程序模拟一个论坛发帖的过程，请用户输入一个发帖内容，例如：
		“积分看电视普京了几分我特朗普将反恐文件风IE哦特朗普积分哦忘记普京”
	请定义一个关键字数组：
		String[] keyArray = {“特朗普”,”普京”};
	请将字符串中包含的数组中的关键字替换为*符号。
 **/
public class CharReplaceByArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入发帖内容:");
        String str = sc.nextLine();
        //请定义一个关键字数组
        String[] keyArray = {"特朗普","普京"};
        for (int i = 0; i < keyArray.length; i++) {
            str = str.replaceAll(keyArray[i],"*");
        }
        System.out.println(str);
    }
}
