package com.shiju.exception;

/**
 * @Author 时距
 * @PackageName:com.shiju.exception
 * @ClassName : Student
 * @Date 2021/3/27 20:25
 * @Description:
 * 需求:
 *      键盘录入学生的姓名和年龄,其中年龄为18-25岁,
 *      超出这个范围是异常数据不能赋值,需要重新录入,一直录到正确为止.
 */
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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
        if(age >= 18 && age <= 25){
            this.age = age;
        }else {
            throw new AgeOutOfBoundsException("年龄超出范围");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
