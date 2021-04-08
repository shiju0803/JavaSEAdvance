package com.shiju.domain;

/*
 * @Author 时距
 * @PackageName:com.shiju.domain
 * @ClassName : Student02
 * @Date 2021/3/17 18:23
 * @Description:
 **/
public class Teacher {
    private String id;
    private String name;
    private String sex;
    private String duties;
    private int salary;

    //无参构造
    public Teacher() {
    }

    //有参构造
    public Teacher(String id, String name, String sex, String duties, int salary) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.duties = duties;
        this.salary = salary;
    }

    //set/get方法

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDuties() {
        return duties;
    }

    public void setDuties(String duties) {
        this.duties = duties;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
