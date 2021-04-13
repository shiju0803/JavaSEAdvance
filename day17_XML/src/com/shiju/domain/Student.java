package com.shiju.domain;

/**
 * @author shiju
 * @date 2021/04/10 11:31
 **/
public class Student {
    private String id;
    private String name;
    private int age;
    private String province;

    public Student() {
    }

    public Student(String id, String name, int age, String province) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.province = province;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
    public void show(){
        System.out.println("这是一个成员方法");
    }
    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", province='" + province + '\'' +
                '}';
    }
}
