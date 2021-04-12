package com.shiju.homework;

import java.util.ArrayList;

/**
 * 有以下类结构：
 * 人员类(Person)：
 *   |--学生类(Student)
 *      |--Java学生类(JavaStudent)
 *      |--UI学生类(UIStudent)
 *  |--教师类(Teacher)
 *      |--Java教师类(JavaTeacher)
 *      |--UI教师类(UITeacher)
 * 要求： 	请按上述要求定义类，并实现继承关系即可(不需要定义类成员)
 * 	请按以下格式和要求定义测试类和方法：
 *
 * @author shiju
 * @date 2021/03/30 19:18
 **/
public class Test4 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Person> list2 = new ArrayList<>();
        ArrayList<Student> list3 = new ArrayList<>();
        ArrayList<JavaStudent> list4 = new ArrayList<>();
        ArrayList<UIStudent> list5 = new ArrayList<>();
        ArrayList<Teacher> list6 = new ArrayList<>();
        ArrayList<JavaTeacher> list7 = new ArrayList<>();
        ArrayList<UITeacher> list8 = new ArrayList<>();

        //请测试哪些集合可以调用print1()方法
        print1(list1);
        print1(list2);
        print1(list3);
        print1(list4);
        print1(list5);
        print1(list6);
        print1(list7);
        print1(list8);
        //请测试哪些集合可以调用print2()方法
        print2(list2);
        print2(list3);
        print2(list6);
        print2(list7);
        print2(list8);
        //请测试哪些集合可以调用print3()方法
        print3(list3);
        //请测试哪些集合可以调用print4()方法
        print4(list4);

    }
    //要求：参数可以接收任何泛型的ArrayList参数
    public static void print1(ArrayList<?> list){
    }
    //要求：参数可以接收任何Person及其子类泛型的ArrayList参数
    public static void print2(ArrayList<? extends Person> list){
    }
    //要求：参数可以接收任何Student及其子类泛型的ArrayList参数
    public static void print3(ArrayList<? extends Student> list){
    }
    //要求：参数可以接收任何Java学员，及其父类泛型的ArrayList参数
    public static void print4(ArrayList<? super JavaStudent> list){
    }

}
class Person{}
class Student extends Person{}
class JavaStudent {}
class UIStudent {}
class Teacher extends Person{}
class JavaTeacher extends Teacher{}
class UITeacher extends Teacher{}