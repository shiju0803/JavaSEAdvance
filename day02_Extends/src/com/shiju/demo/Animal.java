package com.shiju.demo;

import java.sql.SQLOutput;

/**
 * @Author 时距
 * @PackageName:com.shiju.demo
 * @ClassName : Animel
 * @Date 2021/3/21 10:03
 * @Description:
 **/
public class Animal {
    private String name;
    private String breed;
    private String sex;

    public Animal() {
    }

    public Animal(String name, String breed, String sex) {
        this.name = name;
        this.breed = breed;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public void eat(){
        System.out.println(name + "吃鱼啦~");
    }
}
