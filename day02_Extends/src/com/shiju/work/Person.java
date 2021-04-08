package com.shiju.work;

/*
 * @Author 时距
 * @PackageName:com.shiju.work
 * @ClassName : Person
 * @Date 2021/3/21 19:53
 * @Description:
 * 定义Person类,包含空参、满参构造和以下成员变量:
			姓名name
			年龄age
		生成所有成员变量set/get方法
		定义方法：void printPerson(),打印出"我是山顶洞人"
 **/
public class Person {
    String name;
    int age;

    public Person() {   }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void printPerson() {
        System.out.println("我是山顶洞人");
    }
}
