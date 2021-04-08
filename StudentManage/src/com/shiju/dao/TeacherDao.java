package com.shiju.dao;

import com.shiju.domain.Student;
import com.shiju.domain.Teacher;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author 时距
 * @PackageName:com.shiju.dao
 * @ClassName : TeacherDao
 * @Date 2021/3/17 19:35
 * @Description:
 **/
public class TeacherDao {
    //创建键盘输入对象,提至最前面,后边不用再重复创建
    Scanner sc = new Scanner(System.in);

    //添加教师方法
    public void addTeacher(ArrayList<Teacher> list) {
        String id;
        while (true) {
            System.out.println("请输入教师编号:");
            id = sc.next();
            if (getIndex(list, id) == -1) {
                break;
            } else {
                System.out.println("该教师编号已存在,请重新输入!");
            }
        }
        System.out.println("请输入教师姓名:");
        String name = sc.next();
        System.out.println("请输入教师性别:");
        String sex = sc.next();
        System.out.println("请输入教师职务:");
        String duties = sc.next();
        System.out.println("请输入教师薪资:");
        int salary = sc.nextInt();
        //将键盘输入的数据封装成教师对象
        Teacher t = new Teacher(id, name, sex, duties, salary);
        //将教师对象添加到集合中
        list.add(t);
        System.out.println("添加成功!");
    }

    //删除教师方法
    public void deleteTeacher(ArrayList<Teacher> list) {
        //输出提示信息
        System.out.println("请输入要删除的教师编号:");
        String id = sc.next();
        int index = getIndex(list, id);
        if (index == -1) {
            System.out.println("该教师编号不存在,请重新输入!");
        } else {
            list.remove(index);
            System.out.println("删除成功!");
        }
    }

    public void updateTeacher(ArrayList<Teacher> list) {
        System.out.println("请输入要修改教师的编号:");
        String id = sc.next();
        int index = getIndex(list, id);
        if (getIndex(list, id) == -1) {
            System.out.println("该教师编号不存在,请重新输入!");
        } else {
            System.out.println("请输入新的教师姓名:");
            String name = sc.next();
            System.out.println("请输入新的教师性别:");
            String sex = sc.next();
            System.out.println("请输入新的教师职务:");
            String duties = sc.next();
            System.out.println("请输入新的教师薪资:");
            int salary = sc.nextInt();
            /*Teacher t = list.get(index);
            t.setId(id);
            t.setName(name);
            t.setSex(sex);
            t.setDuties(duties);
            t.setSalary(salary);*/
            Teacher t = new Teacher(id,name,sex,duties,salary);
            list.set(index,t);
            System.out.println("修改成功!");
        }
    }

    public void queryTeacher(ArrayList<Teacher> list) {
        if (list.isEmpty()) {
            System.out.println("没有查询到信息,请先添加后再查询!");
        } else {
            //打印表头
            System.out.println("编号\t\t姓名\t\t性别\t\t职务\t\t薪资");
            //遍历集合打印教师信息
            for (int i = 0; i < list.size(); i++) {
                Teacher t = list.get(i);
                System.out.println(t.getId() + "\t\t" + t.getName() + "\t\t" + t.getSex() + "\t\t" + t.getDuties() + "\t\t" + t.getDuties());
            }
        }
    }

    //按教师编号查找教师是否存在
    public int getIndex(ArrayList<Teacher> list, String id) {
        //假设教师不存在
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            Teacher t = list.get(i);
            if (id.equals(t.getId())) {
                index = i;
            }
        }
        //存在,则返回该教师对象在集合中的位置
        return index;
    }
}
