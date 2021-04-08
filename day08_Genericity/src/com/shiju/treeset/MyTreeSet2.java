package com.shiju.treeset;

import com.shiju.set.Student;

import java.util.TreeSet;

/**
 * TreeSet集合来存储Student类型
 * 按照年龄从小到大排序,如果年龄一样,则按照姓名首字母排序,
 * 如果年龄和姓名一样,才认为是同一个学生对象
 * @author shiju
 * @date 2021/03/30 14:42
 **/
public class MyTreeSet2 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>();
        ts.add(new Student("小美",21));
        ts.add(new Student("小花",17));
        ts.add(new Student("小慧",19));
        ts.add(new Student("小强",19));
        ts.add(new Student("小强",19));
        for (Student t : ts) {
            System.out.println(t);
        }
    }
}
