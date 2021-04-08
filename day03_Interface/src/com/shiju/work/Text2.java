package com.shiju.work;

/*
 * @Author 时距
 * @PackageName:com.shiju.work
 * @ClassName : Text2
 * @Date 2021/3/23 17:59
 * @Description:
      1.定义驾驶(Driveable)的接口,内有抽象的驾驶(drive)方法

      2.定义歌唱(Singable)的接口,内有会歌唱(sing)的抽象方法.

      3.定义动物(Animal)抽象类,定义抽象的吃和睡方法

      4.定义具体类猴子(Monkey)继承动物,重写吃和睡方法,实现驾驶的接口

      5.定义具体类鹦鹉(Parrot)继承动物,重写吃和睡,实现歌唱的接口

      6.在测试类中, 定义三个方法,一个方法的参数类型是动物,一个方法的参数类型是驾驶接口,一个方法的参数类型是歌唱接口.
      7.在main方法中,调用刚才创建的3个方法进行测试
 **/
public class Text2 {
    public static void main(String[] args) {
        //在main方法中,调用刚才创建的3个方法进行测试
        useAnimal(new Monkey());
        useAnimal(new Parrot());

        useDriveable(new Monkey());
        useSingable(new Parrot());
    }
    //方法的参数类型是动物
    public static void useAnimal(Animal a){
        a.eat();
        a.sleep();
    }
    //方法的参数类型是驾驶接口
    public static void useDriveable(Driveable d){
        d.drive();
    }
    //方法的参数类型是歌唱接口
    public static void useSingable(Singable s){
        s.sing();
    }
}
//定义驾驶(Driveable)的接口
interface Driveable{
    //抽象的驾驶(drive)方法
    public abstract void drive();
}

//定义歌唱(Singable)的接口
interface Singable{
    //歌唱(sing)的抽象方法
    public abstract void sing();
}

//定义动物(Animal)抽象类
abstract class Animal{
    //抽象的吃和睡方法
    public abstract void eat();
    public abstract void sleep();
}

//定义具体类猴子(Monkey)继承动物
class Monkey extends Animal implements Driveable{
    //重写吃和睡方法
    @Override
    public void eat(){
        System.out.println("🐒爱吃香蕉...");
    }
    @Override
    public void sleep(){
        System.out.println("🐒在树上睡觉...");
    }
    //实现驾驶的接口
    @Override
    public void drive(){
        System.out.println("🐒腾云驾雾...");
    }
}

//定义具体类鹦鹉(Parrot)继承动物,重写吃和睡,实现歌唱的接口
class Parrot extends Animal implements Singable{
    @Override
    public void eat(){
        System.out.println("🦅爱吃虫子...");
    }
    @Override
    public void sleep(){
        System.out.println("🦅在鸟笼里睡觉...");
    }
    @Override
    public void sing(){
        System.out.println("🦅歌声优美...");
    }
}


