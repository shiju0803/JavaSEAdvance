package com.shiju.reflect;

/**
 * @author shiju
 * @date 2021/04/10 11:31
 **/
public class Student {
    private String name;
    private int age;
    private Student(String name){
        //System.out.println("私有有参构造");
    }
    public Student(){
        //System.out.println("共有无参构造");
    }
    public Student(String name,int age){
        //System.out.println("共有带参构造");
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
    private void show(String name){
        System.out.println(name);
    }
    public int function(int a,int b){
        return a + b;
    }
    private static String function2(String name){
        System.out.println("function2被调用");
        return name;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
