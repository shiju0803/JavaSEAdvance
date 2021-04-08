package com.shiju.abstractdemo;

/**
 * @Author 时距
 * @PackageName:com.shiju.abstractdemo
 * @ClassName : FinalDemo
 * @Date 2021/3/21 18:28
 * @Description:
 **/
public class FinalDemo {
    public static void main(String[] args) {
        final int NUM = 10; //常量
        //NUM = 10;//错误
        final Student stu = new Student("黄桂田");
        stu.setName("小黄");//可以
        //stu = new Student();//地址值不能改....stu不能再保存其他地址值.
    }
}

class Person {
    {
        System.out.println("我是静态代码块,我执行了...");
    }
    public void work() {
        System.out.println("work hard.......");
    }
}

class Student extends Person {
    private String name;
    //final int age;
    final int age = 18;

    public Student() {
       //age = 18;
    }

    public Student(String name) {
        this.name = name;
        //age = 18;
    }

    @Override
    public void work() {
        System.out.println("得过且过.......");
    }

    public void setName(String name) {
        this.name = name;
    }
}