package com.shiju.polymorphic;

/*
 * @Author 时距
 * @PackageName:com.shiju.polymorphic
 * @ClassName : TestPolymorphic2
 * @Date 2021/3/22 15:53
 * @Description:
 **/
public class TestPolymorphic4 {
    public static void main(String[] args) {
        Father f = new Son();
        System.out.println(f.age);
        f.read();
    }
}

class Father{
    int age = 40;
    public void read(){
        System.out.println("读历史");
    }
}

class Son extends Father {
    int age = 20;

    @Override
    public void read(){
        System.out.println("读小说");
    }
}