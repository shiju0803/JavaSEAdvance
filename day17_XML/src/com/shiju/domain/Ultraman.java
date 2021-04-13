package com.shiju.domain;

/**
 * @author shiju
 * @date 2021/04/12 19:45
 **/
public class Ultraman {
    private String name;
    private String desc;

    public Ultraman() {
    }

    public Ultraman(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    public void show(){
        System.out.println("平成三杰");
    }
    public void function(){
        System.out.println("aaa");
    }
    @Override
    public String toString() {
        return "Ultraman{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
