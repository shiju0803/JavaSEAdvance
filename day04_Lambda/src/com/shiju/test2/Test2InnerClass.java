package com.shiju.test2;

/*
 * @Author 时距
 * @PackageName:com.shiju.test2
 * @ClassName : Test2InnerClass
 * @Date 2021/3/23 19:14
 * @Description:
 * 静态内部类演示
 **/
public class Test2InnerClass {
    public static void main(String[] args) {
        //外部类名.内部类名 对象名 = new 外部类名.内部类名();
        Outer.Inner oi = new Outer.Inner();
        oi.show();
        Outer.Inner.method();
    }
}
class Outer{
    static class Inner{
        public void show(){
            System.out.println("inner...show");
        }
        public static void method(){
            System.out.println("inner...method");
        }
    }
}