package com.shiju.homework;

import java.util.HashSet;

/**
 * 定义人类，包含姓名和年龄属性。创建4个人存储到HashSet中，
 * 姓名和年龄相同的人看做同一人不存储。
 * @author shiju
 * @date 2021/03/31 20:54
 **/
public class HashSetTest {
    public static void main(String[] args) {
        Person p1 = new Person("张三",23);
        Person p2 = new Person("李四",13);
        Person p3 = new Person("李四",13);
        Person p4 = new Person("张三",23);
        HashSet<Person> hs = new HashSet<>();
        hs.add(p1);
        hs.add(p2);
        hs.add(p3);
        hs.add(p4);
        System.out.println(hs);
    }
}
class Person{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}