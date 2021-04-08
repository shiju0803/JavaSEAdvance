package com.shiju.test03;

/*
 * @Author 时距
 * @PackageName:com.shiju.test03
 * @ClassName : Test
 * @Date 2021/3/23 16:21
 * @Description:
 **/
public class Test {
    public static void main(String[] args) {
        Ma m = new Ma();
        userAnimal(m);
        userAnimal(new Dog());
    }

    public static  void userAnimal(Animal a){//多态:父类引用 接收 子类对象 扩展性强
        a.eat();
    }
}
abstract class Animal{
    public abstract void eat();
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("🐕吃骨头");
    }

    public void lookHome() {
        System.out.println("🐕看家");
    }
}
class Ma extends Animal{
    @Override
    public void eat(){
        System.out.println("🐎吃草");
    }
    public void run(){
        System.out.println("🐎跑了");
    }
}