package com.shiju.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author 时距
 * @PackageName:com.shiju.collection
 * @ClassName : Demo05Collection
 * @Date 2021/3/28 15:07
 * @Description:
 * 创建一个Collection集合存储学生对象的集合,存储3个学生对象,使用程序实现在控制台遍历该集合
 */
public class Demo05Collection {
    public static void main(String[] args) {
        Collection<Student> list = new ArrayList<>();
        Student s1 = new Student("黄桂田",23);
        Student s2 = new Student("张桂田",24);
        Student s3 = new Student("赵桂田",25);
        Student s4 = new Student("杨桂田",26);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        for (Student student : list) {
            //student.setAge(38);
            System.out.println(student);
        }
    }
}
class Student{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}