package com.shiju.infomanager.entry;

import com.shiju.infomanager.controller.OtherStudentController;
import com.shiju.infomanager.controller.StudentController;
import java.util.Scanner;

/*
 * @Author 时距
 * @PackageName:com.shiju.infomanager.entry
 * @ClassName : Main
 * @Date 2021/3/20 11:47
 * @Description:系统主入口
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            //主菜单搭建
            System.out.println("------欢迎使用信息管理系统------");
            System.out.println("请输入你的选择:1.学生管理 2.教师管理 3.退出");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    //System.out.println("学生管理");
                    //开启学生管理系统
                    OtherStudentController studentController = new OtherStudentController();
                    studentController.start();
                    break;
                case "2":
                    System.out.println("教师管理");
                    break;
                case "3":
                    System.out.println("感谢您的使用");
                    //退出当前正在运行的虚拟机
                    System.exit(0);
                    break;
                default:
                    System.out.println("你的输入有误,请重新输入");
                    break;
            }
        }
    }
}
