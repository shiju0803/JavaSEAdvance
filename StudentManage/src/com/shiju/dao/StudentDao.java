package com.shiju.dao;

import com.shiju.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * @Author 时距
 * @PackageName:com.shiju.dao
 * @ClassName : StudentDao
 * @Date 2021/3/14 8:24
 * @Description:
 **/
public class StudentDao {
    Scanner sc = new Scanner(System.in);
    //添加学生方法
    public void addStudent(ArrayList<Student> list){
        //给出提示信息
        String sid;
        while (true){
            System.out.println("请输入学号:");
            sid = sc.next();
            int index = getIndex(list, sid);
            if(index == -1){
                //学号不存在,可以使用
                break;
            }else{
                System.out.println("该学号已存在,请重新输入!");
            }
        }
        System.out.println("请输入学生姓名:");
        String name = sc.next();
        System.out.println("请输入学生年龄:");
        int age = sc.nextInt();
        System.out.println("请输入学生性别:");
        String sex = sc.next();
        System.out.println("请输入学生出生日期:");
        String birthday = sc.next();
        //将键盘录入的信息封装成学生对象
        Student s = new Student(sid,name,age,sex,birthday);
        //将封装好的学生对象,添加到集合容器中
        list.add(s);
        //给出添加成功提示信息
        System.out.println("学生添加成功");
    }

    //删除学生方法
    public void deleteStudent(ArrayList<Student> list) {
        //给出提示信息
        System.out.println("请输入要删除学生的学号:");
        String sid = sc.next();
        int index = getIndex(list, sid);
        //根据索引判断该学号是否存在
        if (index == -1) {
            System.out.println("该学号不存在,请重新输入!");
        } else {
            list.remove(index);
            System.out.println("删除成功!");
        }
    }

    //修改学生方法
    public void updateStudent(ArrayList<Student> list) {
        //给出提示信息
        System.out.println("请输入要修改学生的学号:");
        String updateSid = sc.next();
        int index = getIndex(list, updateSid);
        if (index == -1) {
            System.out.println("该学号不存在,请重新输入!");
        } else {
            System.out.println("请修改学生姓名:");
            String name = sc.next();
            System.out.println("请修改学生年龄:");
            int age = sc.nextInt();
            System.out.println("请修改学生性别:");
            String sex = sc.next();
            System.out.println("请修改生出生日期:");
            String birthday = sc.next();
            //将键盘录入的信息封装成学生对象
            Student stu = new Student(updateSid,name,age,sex,birthday);
            list.set(index,stu);
            //给出添加成功提示信息
            System.out.println("学生修改成功");
        }
    }

    //查询学生方法
    public void showStudent(ArrayList<Student> list) {
        //1.判断集合中是否存在数据,不存在直接给出提示
        if (list.size() == 0) {
            System.out.println("未查询到学生信息,请先添加信息后再查询!");
            return;
        } else {
            //2.存在:展示表头
            System.out.println("学号\t\t姓名\t\t年龄\t\t性别\t\t出生日期");
            //3.遍历集合,获取每一个学生对象信息,并打印在控制台
            for (int i = 0; i < list.size(); i++) {
                Student s = list.get(i);
                System.out.println(s.getSid() + "\t\t" + s.getName() + "\t\t" + s.getAge() + "\t\t" + s.getSex() + "\t\t" + s.getBirthday());
            }
        }
    }
    //验证学号是否已存在方法
    public int getIndex(ArrayList<Student> list,String sid){
        //假设传入的学号不存在
        int index = -1;
        //遍历集合,获取每一个学生对象
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            //获取每一个学生对象的学号
            String id = stu.getSid();
            //对比输入的和查询到的是否相同
            if (id.equals(sid)) {
                //存在:让index变量记录正确的索引位置
                index = i;
                break;
            }
        }
        return index;
    }
}
