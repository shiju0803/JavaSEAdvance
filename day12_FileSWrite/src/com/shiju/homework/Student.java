package com.shiju.homework;

import java.io.Serializable;

/**
 * 定义学生类,包含姓名(String name),性别(String gender),年龄(int age)三个属性,生成空参有参构造,set和get方法,toString方法
 * @author shiju
 * @date 2021/04/05 20:40
 **/
public class Student implements Serializable{
    private static final long serialVersionUID = 2L;
    private String name;
    private String gender;
    private int age;

    public Student() {  }

    public Student(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        return gender != null ? gender.equals(student.gender) : student.gender == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }
}
