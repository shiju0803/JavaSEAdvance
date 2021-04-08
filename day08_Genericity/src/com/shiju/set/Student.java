package com.shiju.set;

import java.util.Collection;

/**
 * 学生类
 *
 * @author shiju
 * @date 2021/03/30 14:46
 **/
public class Student implements Comparable<Student> {
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

    /**
     * @author shiju
     * @date 2021/03/30 14:55
     * @param o
     * @return int
     * 返回正数:this较大
     * 返回负数:o较大
     * 返回0: 相等
     */
    @Override
    public int compareTo(Student o) {
        //按照对象的年龄进行排序
        //主要判断条件
        int result = this.age - o.age; //this就是要添加的元素,o就是集合中已存在的元素
        //次要判断条件
        result = result == 0 ? this.name.compareTo(o.getName()) : result;
        return result;
    }
}