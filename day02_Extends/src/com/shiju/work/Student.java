package com.shiju.work;

/*
 * @Author 时距
 * @PackageName:com.shiju.work
 * @ClassName : Student
 * @Date 2021/3/21 19:55
 * @Description:
 * 定义Student继承于Person类,新增如下属性
			学校 school
		生成空参、满参构造和set/get方法
		定义方法:void printStudent(),
		先输出"我叫XXX,我今年YYY岁,我现在的学校是:ZZZ"
		再调用printPerson()方法
 **/
public class Student extends Person {
    String school;

    public Student() {
    }

    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    public void printStudent() {
        System.out.println("我叫" + name + ",我今年" + age + "岁,我现在的学校是:" + school);
        printPerson();
    }
}
