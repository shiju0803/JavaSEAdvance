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
public class StudentController extends BaseStudentController{
    //键盘录入学生信息
    //开闭原则:对扩展内容开放,对修改内容关闭
    @Override
    public Student inputInfo(String id){
        System.out.println("请输入学生姓名:");
        String name = sc.next();
        System.out.println("请输入学生年龄:");
        String age = sc.next();
        System.out.println("请输入学生生日:");
        String birthday = sc.next();
        //2.将学生信息封装为学生对象
        Student stu = new Student();
        stu.setId(id);
        stu.setName(name);
        stu.setAge(age);
        stu.setBirthday(birthday);
        return stu;
    }
}
