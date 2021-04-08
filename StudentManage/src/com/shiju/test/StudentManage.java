package com.shiju.test;
import com.shiju.dao.StudentDao;
import com.shiju.domain.Student;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author 时距
 * @PackageName:com.shiju.test
 * @ClassName : StudentManage
 * @Date 2021/3/13 20:35
 * @Description:
 **/
public class StudentManage {
    public static void main(String[] args) {
        //键盘输入
        Scanner sc = new Scanner(System.in);
        //创建集合容器对象
        ArrayList<Student> list = new ArrayList<>();
        //创建StudentDao对象
        StudentDao dao = new StudentDao();
        lo:
        while (true) {
            //搭建主界面菜单
            System.out.println("------欢迎使用学生管理系统-----");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看学生");
            System.out.println("5.退出");
            System.out.println("请输入你的选择:");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("添加学生");
                    dao.addStudent(list);
                    break;
                case 2:
                    System.out.println("删除学生");
                    dao.deleteStudent(list);
                    break;
                case 3:
                    System.out.println("修改学生");
                    dao.updateStudent(list);
                    break;
                case 4:
                    System.out.println("查看学生");
                    dao.showStudent(list);
                    break;
                case 5:
                    System.out.println("感谢您的使用!");
                    break lo;
                default:
                    System.out.println("您的输入有误");
                    break;
            }
        }
    }
}
