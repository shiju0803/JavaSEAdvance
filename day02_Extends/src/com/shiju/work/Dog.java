package com.shiju.work;

/*
 * @Author 时距
 * @PackageName:com.shiju.work
 * @ClassName : Dog
 * @Date 2021/3/21 19:42
 * @Description:
 **/
public class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("狗要吃那啥");
    }
    @Override
    public void run(){
        System.out.println("狗跑的如脱缰的野狗");
    }
    public void cry(){
        System.out.println("狗会汪汪叫");
    }
}
