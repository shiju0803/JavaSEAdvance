package com.shiju.homework;

import java.util.Scanner;

/*
 * @Author 时距
 * @PackageName:com.shiju.work
 * @ClassName : CheckFileName
 * @Date 2021/3/26 20:14
 * @Description:
 * 请用户从控制台输入一个java文件的名字，例如：Test.java，请编程实现以下功能：
    判断此文件名是否以“.java”结尾，并打印结果
    获取此文件中.符号的索引位置，并打印结果
 **/
public class CheckFileName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入文件名:" );
        String name = sc.nextLine();
        //获取文件名中最后一个'.'的位置索引
        boolean result = name.endsWith(".java");
        if(result){
            System.out.println("该文件名符合规范");
        }else {
            System.out.println("非法文件名");
        }
        //将字符串转换成字符数组
        char[] arr = name.toCharArray();
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            //查询'.'所在位置索引
            if(arr[i] == '.'){
                System.out.println(i);
            }
        }
    }
}
