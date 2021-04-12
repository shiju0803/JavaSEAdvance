package com.shiju.homework;

import java.util.Scanner;

/*
 * @Author 时距
 * @PackageName:com.shiju.work
 * @ClassName : StudentInfoChange
 * @Date 2021/3/26 19:23
 * @Description:
 * 请定义学员类，有以下成员属性：
		姓名：String类型
		年龄：int
		身高：double
		婚否：boolean
		性别：char

请从控制台接收以下数据：
		姓名：王哈哈
		年龄：24     Integer.parseInt("24");
		身高：1.82   Double.parseDouble("1.82");
		婚否：false
		性别："男"--->charAt(0)
		以上数据要求全部使用String类型接收
请创建“学员对象”，并将所有数据转换后，存储到这个对象中，最后打印此对象的所有属性。
 **/
public class StudentInfoChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学员姓名:");
        String s1 = sc.nextLine();
        System.out.println("请输入学员年龄:");
        String s2 = sc.nextLine();
        System.out.println("请输入学员身高:");
        String s3 = sc.nextLine();
        System.out.println("请输入学员婚否:");
        String s4 = sc.nextLine();
        System.out.println("请输入学员性别:");
        String s5 = sc.nextLine();
        int age = Integer.parseInt(s2);
        double height = Double.parseDouble(s3);
        boolean marry = Boolean.parseBoolean(s4);
        char sex = s5.charAt(0);
        Trainee t = new Trainee(s1,age,height,marry,sex);
        System.out.println(t.toString());
    }
}
class Trainee{
    protected String name;
    protected int age;
    protected double height;
    protected boolean marry;
    protected char sex;

    public Trainee() {
    }

    public Trainee(String name, int age, double height, boolean marry, char sex) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.marry = marry;
        this.sex = sex;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isMarry() {
        return marry;
    }

    public void setMarry(boolean marry) {
        this.marry = marry;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", marry=" + marry +
                ", sex=" + sex +
                '}';
    }
}