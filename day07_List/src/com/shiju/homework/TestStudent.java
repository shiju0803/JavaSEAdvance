package com.shiju.homework;

import java.util.ArrayList;

/**
 * @Author 时距
 * @PackageName:com.shiju.work
 * @ClassName : TestStudent
 * @Date 2021/3/28 20:54
 * @Description:
 */
public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("张三",23,"男");
        Student s2 = new Student("赵四",13,"女");
        Student s3 = new Student("黄老五",34,"男");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        int max = 0;
        for (Student student : list) {
            System.out.println(student.toString());
            max = Math.max(max,student.getAge());
        }
        for (Student student : list) {
            if(student.getAge() == max){
                System.out.println("其中年龄最大的学生是:" + student.getName());
                student.setName("小猪佩奇");
                System.out.println(student.toString());
            }
        }
    }
}
