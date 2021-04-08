package com.shiju.domain;

import java.util.Date;

/**
 * @Author 时距
 * @PackageName:com.shiju.domain
 * @ClassName : Student
 * @Date 2021/3/13 20:25
 * @Description:学生类
 */
public class Student {
    //成员变量
    private String sid;
    private String name;
    private int age;
    private String sex;
    private String  birthday;

    //构造参数
    public Student() {
    }

    public Student(String sid, String name, int age, String sex, String  birthday) {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.birthday = birthday;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String  getBirthday() {
        return birthday;
    }

    public void setBirthday(String  birthday) {
        this.birthday = birthday;
    }
}
