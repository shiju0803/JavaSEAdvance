package com.shiju.work;

/*
 * @Author 时距
 * @PackageName:com.shiju.work
 * @ClassName : Student
 * @Date 2021/3/26 18:57
 * @Description:
 * 	请定义学员类，属性：姓名、性别、年龄、分数
 **/
public class Student {
    protected String name;
    protected String sex;
    protected int age;
    protected double score;

    public Student() {
    }

    public Student(String name, String sex, int age, double score) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
