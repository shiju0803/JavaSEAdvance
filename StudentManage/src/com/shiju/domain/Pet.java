package com.shiju.domain;

/**
 * @Author 时距
 * @PackageName:com.shiju.domain
 * @ClassName : Pet
 * @Date 2021/3/17 21:18
 * @Description:
 **/
public class Pet {
    //宠物属性
    private String no;
    private String name;
    private String breed;
    //无参构造
    public Pet() { }
    //有参构造
    public Pet(String no, String name, String breed) {
        this.no = no;
        this.name = name;
        this.breed = breed;
    }
    //get/set

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
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
}
