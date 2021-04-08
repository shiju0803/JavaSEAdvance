package com.shiju.abstractdemo;

/**
 * @Author 时距
 * @PackageName:com.shiju.abstractdemo
 * @ClassName : Cat
 * @Date 2021/3/21 16:38
 * @Description:
 **/
public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("罗小黑爱吃鱼~");
    }
    @Override
    public void drink(){
        System.out.println("七七喝椰奶~~");
    }

    public static void main(String[] args) {
        Cat c = new Cat();
        c.drink();
        c.eat();
    }
}
