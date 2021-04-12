package com.shiju.homework;

import java.util.Scanner;

/*
 * @Author 时距
 * @PackageName:com.shiju.work
 * @ClassName : EmailCheck
 * @Date 2021/3/26 19:48
 * @Description:
 * 请用户从控制台输入一个“Email地址”，程序接收后判断此Email地址中是否包含@符号和.符号，
 * 如果全部包含，打印：合法，否则打印：不合法的Email地址。
 **/
public class EmailCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入邮箱地址:");
        String email = sc.nextLine();
        checkEmail(email);
    }
    public static void checkEmail(String str){
        int c1 = -1;
        int c2 = -1;
        c1 = str.lastIndexOf('@');
        c2 = str.lastIndexOf('.');
        if(c1 == -1 || c2 == -1){
            System.out.println("不合法的Email地址");
        }else{
            System.out.println("合法");
        }
    }
}
