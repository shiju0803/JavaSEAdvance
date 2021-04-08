package com.shiju.comparable;

import java.math.BigDecimal;

/**
 * 学生类
 * @author shiju
 * @date 2021/03/30 20:19
 **/
public class Student{
    private String name;
    private int age;
    private float score;

    public Student() {
    }

    public Student(String name, int age, float score) {
        this.name = name;
        this.age = age;
        this.score = score;
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

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

//    @Override
//    public int compareTo(Student o) {
//         int result = 0;
//                BigDecimal bigDecimal = new BigDecimal(Float.toString(o.score)).subtract(new BigDecimal(Float.toString(this.score)));
//                if(bigDecimal.doubleValue() > 0 && bigDecimal.doubleValue() < 1){
//                    result = 1;
//                }else if(bigDecimal.doubleValue() < 0 && bigDecimal.doubleValue() > -1){
//                    result = -1;
//                }else {
//                    result = bigDecimal.intValue();
//                    result = result == 0 ? (this.age - o.age) : result;
//                }
//            return result;
//    }
}
