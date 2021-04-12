package com.shiju.homework;

/*
 * @Author 时距
 * @PackageName:com.shiju.work
 * @ClassName : Text1
 * @Date 2021/3/23 17:50
 * @Description:
 * 1.定义一个飞行(Flyable)的接口,内有一个飞行(fly)的抽象方法
    2.定义一个实现类蝙蝠(Bat),实现飞行的接口,蝙蝠自带雷达飞....
    3.定义一个实现类蜻蜓(Dragonfly),实现飞行的接口,蜻蜓可以倒着飞,
    4.在测试类中,定义一个方法,参数类型是飞行接口类型,
    5.在main方法中,调用方法,传入不同的实现类对象
 **/
public class Text1 {
    public static void main(String[] args) {
        useFlyable(new Bat());
        useFlyable(new Dragonfly());
    }
    public static void useFlyable(Flyable f){
        f.fly();
    }
}
interface Flyable{
    public  abstract void fly();
}
class Bat implements Flyable{
    @Override
    public void fly(){
        System.out.println("蝙蝠自带雷达飞....");
    }
}
class Dragonfly implements Flyable{
    @Override
    public void fly(){
        System.out.println("蜻蜓可以倒着飞....");
    }
}