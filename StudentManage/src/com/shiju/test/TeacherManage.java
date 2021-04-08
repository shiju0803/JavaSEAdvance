package com.shiju.test;

import com.shiju.dao.TeacherDao;
import com.shiju.domain.Teacher;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author 时距
 * @PackageName:com.shiju.test
 * @ClassName : TeacherManage
 * @Date 2021/3/17 18:34
 * @Description:
 **/
public class TeacherManage {
    public static void main(String[] args) {
        //定义教师集合,用于存放数据
        ArrayList<Teacher> list = new ArrayList<>();
        //TeacherDao对象
        TeacherDao dao = new TeacherDao();
        Scanner sc = new Scanner(System.in);
        lo:
        while (true) {
            System.out.println("--------欢迎来到教师管理系统--------");
            System.out.println("1.添加教师");
            System.out.println("2.删除教师");
            System.out.println("3.修改教师");
            System.out.println("4.查看所有教师");
            System.out.println("5.退出");
            System.out.println("请输入你的选择:");
            //键盘输入选择
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("添加教师");
                    dao.addTeacher(list);
                    break;
                case 2:
                    System.out.println("删除教师");
                    dao.deleteTeacher(list);
                    break;
                case 3:
                    System.out.println("修改教师");
                    dao.updateTeacher(list);
                    break;
                case 4:
                    System.out.println("查看所有教师");
                    dao.queryTeacher(list);
                    break;
                case 5:
                    System.out.println("感谢您的使用!");
                    break;
                default:
                    System.out.println("你的输入有误,亲重新输入!");
                    break lo;
            }
        }
    }
}
