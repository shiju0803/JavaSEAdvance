package com.shiju.polymorphic;

/*
 * @Author 时距
 * @PackageName:com.shiju.polymorphic
 * @ClassName : TestPolymorphic2
 * @Date 2021/3/22 15:53
 * @Description:
 **/
public class TestPolymorphic2 {
    public static void main(String[] args) {
        Fu f = new Zi();
        System.out.println(f.num);
        f.method();
    }
}
class Fu{
    int num = 10;
    public void method(){
        System.out.println("Fu....method");
    }
}
class Zi extends Fu {
    int num = 20;

    @Override
    public void method() {
        System.out.println("Zi....method");
    }
}