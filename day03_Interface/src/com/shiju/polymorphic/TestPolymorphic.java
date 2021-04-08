package com.shiju.polymorphic;

/*
 * @Author 时距
 * @PackageName:com.shiju.polymorphic
 * @ClassName : TestPolymorphic
 * @Date 2021/3/22 15:34
 * @Description:
 * 多态的前提和体现
        有继承或实现关系
        有方法重写
        有父类引用指向子类对象
 **/
public class TestPolymorphic {
    public static void main(String[] args) {
        //当前事物,是一只动物
        Animal a = new Cat();
        a.eat();
        //当前事物,是一只猫
        Cat c = new Cat();
        c.eat();
        c.catchMouse();
    }
}
class Animal{
    public void eat(){
        System.out.println("动物吃饭");
    }
}
class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("🐱吃🐟");
    }
    public void catchMouse(){
        System.out.println("🐱抓🐀");
    }
}