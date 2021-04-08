package com.shiju.exception;

import java.util.Scanner;

/**
 * @Author 时距
 * @PackageName:com.shiju.exception
 * @ClassName : ExceptionDemo
 * @Date 2021/3/27 20:29
 * @Description:
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        //键盘录入学生的姓名和年龄,其中年龄为18-25岁,
        //超出这个范围是异常数据不能赋值,需要重新录入,一直录到正确为止.
        Student s = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名:");
        String name = sc.nextLine();
        s.setName(name);
        while (true){
            System.out.println("请输入年龄:");
            String ageStr = sc.nextLine();
            try {
                int age = Integer.parseInt(ageStr);
                s.setAge(age);
                break;
            } catch (NumberFormatException e) {
                System.out.println("请输入一个整数");
                continue;
            }catch (AgeOutOfBoundsException e) {

                System.out.println("请输入一个符合范围的年龄");
                continue;
            }
        }
        System.out.println(s);
    }
}
