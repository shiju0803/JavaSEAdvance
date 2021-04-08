package com.shiju.comparable;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * 学生测试类
 *
 * @author shiju
 * @date 2021/03/30 20:21
 **/
public class TestStudent {
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = 0;
                float temp = o2.getScore() - o1.getScore();
                if(temp > 0){
                    result = 1;
                }else if(temp < 0){
                    result = -1;
                }else {
                    result = 0;
                }
                result = result == 0 ? (o1.getAge() - o2.getAge()) : result;
                return result;
            }
        });
        //创建学生对象
        Student s1 = new Student("liusan",20,90.60F);
        Student s2 = new Student("lisi",22,90.10F);
        Student s3 = new Student("wangwu",20,99.80F);
        Student s4 = new Student("sunliu",22,100.00F);
        Student s5 = new Student("zhaoqi",23,100.00F);
        //把学生添加到集合
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        //遍历集合
        for (Student student : ts) {
            System.out.println(student);
        }
    }

}
