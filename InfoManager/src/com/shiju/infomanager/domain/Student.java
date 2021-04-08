package com.shiju.infomanager.domain;

/*
 * @Author 时距
 * @PackageName:com.shiju.infomanager.domain
 * @ClassName : Student
 * @Date 2021/3/20 11:48
 * @Description:
 **/
public class Student extends Person{
    public Student() {
    }

    public Student(String id, String name, String age, String birthday) {
        super(id, name, age, birthday);
    }
}
