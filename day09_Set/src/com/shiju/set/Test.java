package com.shiju.set;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 将学生信息按照总分从低到高输出到控制台
 * @author shiju
 * @date 2021/03/31 11:07
 **/
public class Test {
    public static void main(String[] args) {
        //创建TreeSet集合对象，通过比较器排序进行排序
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //比较总分
                int result = o1.getSum() - o2.getSum();
                //总分一样比较语文分数
                result = result == 0 ? o1.getChinese() - o2.getChinese() : result;
                //语文分数一样比较数学分数
                result = result == 0 ? o1.getMath() - o2.getMath() : result;
                //数学分数一样比较姓名
                result = result == 0 ? o1.getName().compareTo(o2.getName()): result;
                return result;
            }
        });
        //创建学生对象
        Student s1 = new Student("Jack", 98, 100, 95);
        Student s2 = new Student("Rose", 95, 95, 95);
        Student s3 = new Student("Sam", 100, 93, 98);
        Student s4 = new Student("James", 100, 93, 98);
        //把学生对象添加到集合
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);

        //遍历集合
        for (Student s : ts) {
            System.out.println(s.getName() + "--" + s.getChinese() + "--" + s.getMath() + "--" + s.getEnglish() + "--" + s.getSum());
        }
    }
}

class Student {
    //姓名
    private String name;
    //语文
    private int chinese;
    //数学
    private int math;
    //英文
    private int english;

    public Student() {
    }

    public Student(String name, int chinese, int math, int english) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getSum() {
        return this.chinese + this.math + this.english;
    }


}
