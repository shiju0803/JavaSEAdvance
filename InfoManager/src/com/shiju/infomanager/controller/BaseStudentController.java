package com.shiju.infomanager.controller;

import com.shiju.infomanager.domain.Student;
import com.shiju.infomanager.service.StudentService;

import java.util.Scanner;

/*
 * @Author 时距
 * @PackageName:com.shiju.infomanager.controller
 * @ClassName : StudentController
 * @Date 2021/3/20 11:47
 * @Description:
 **/
public abstract class BaseStudentController {
    private StudentService studentService = new StudentService();

    //1.键盘接收学生信息
    Scanner sc = new Scanner(System.in);

    //开启学生管理系统,并展示学生管理系统菜单
    public final void start() {
        Scanner sc = new Scanner(System.in);
        lo:
        while (true) {
            System.out.println("-------欢迎来到<学生>管理系统------");
            System.out.println("请输入您的选择:1.添加学生 2.删除学生 3.修改学生 4.查看学生 5.退出");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    //System.out.println("添加学生");
                    //开启学生管理系统
                    addStudent();
                    break;
                case "2":
                    //System.out.println("删除学生");
                    deleteStudentById();
                    break;
                case "3":
                    //System.out.println("修改学生");
                    updateStudent();
                    break;
                case "4":
                    //System.out.println("查看学生");
                    findAllStudent();
                    break;
                case "5":
                    System.out.println("感谢您的使用,拜拜了您勒~");
                    break lo;
                default:
                    System.out.println("你的输入有误,请重新输入");
                    break;
            }
        }
    }
    //添加学生信息
    public final void addStudent() {
        String id;
        while (true) {
            System.out.println("请输入学生id:");
            id = sc.next();
            boolean flag = studentService.isExists(id);
            if (flag) {
                System.out.println("学号已被占用,请重新输入!");
            } else {
                break;
            }
        }
        //3.将学生对象,传递给StudentService中的addStudent方法
        Student stu = inputInfo(id);
        boolean result = studentService.addStudent(stu);
        //4.根据返回的boolean类型结果,在控制台打印成功/失败
        if (result) {
            System.out.println("添加成功!");
        } else {
            System.out.println("添加失败!");
        }
    }
    //删除学生信息
    public final void deleteStudentById() {
        String id = inputStudentId();
        studentService.deleteStudentByid(id);
        System.out.println("删除成功");
    }
    //修改学生信息
    public final void updateStudent() {
        String id = inputStudentId();
        Student newStu = inputInfo(id);
        //3.调用业务员中的updateStudentById(id)
        studentService.updateStudent(id, newStu);
        //4.提示修改出成功
        System.out.println("修改成功!");
    }
    //查询所有学生信息
    public final void findAllStudent() {
        //1.调用业务员中的获取方法,得到学生对象数组
        Student[] stus = studentService.findAllStudent();
        //2.判断数组内存地址,是否为Null
        if (stus == null) {
            System.out.println("查无信息,添加后重试!");
            return;
        }
        //3.遍历数组,获取学生信息,并打印
        System.out.println("学号\t\t\t姓名\t\t年龄\t\t生日");
        for (int i = 0; i < stus.length; i++) {
            Student stu = stus[i];
            if (stu != null) {
                System.out.println(stu.getId() + "\t" + stu.getName() + "\t\t" + stu.getAge() + "\t\t" + stu.getBirthday());
            }
        }
    }
    //键盘录入学生id
    public final String inputStudentId() {
        String id;
        while (true) {
            //1.键盘录入要删除的学生id
            System.out.println("请输入您要删除的学生id:");
            id = sc.next();
            boolean exists = studentService.isExists(id);
            if (!exists) {
                System.out.println("学号不存在,请重新输入");
            } else {
                break;
            }
        }
        return id;
    }
    //键盘录入学生信息
    //开闭原则:对扩展内容开放,对修改内容关闭
    public abstract Student inputInfo(String id);
}
