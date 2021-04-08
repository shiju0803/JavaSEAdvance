package com.shiju.test5;

/*
 * @Author 时距
 * @PackageName:com.shiju.test5
 * @ClassName : Test5InnerClass
 * @Date 2021/3/23 20:23
 * @Description:
 **/
public class Test5InnerClass {
    public static void main(String[] args) {
        InterImpl ii = new InterImpl();
        ii.show();

        new Inter(){
            @Override
            public void show(){
                System.out.println("匿名内部类的show方法");
            }
        }.show();

        Inter2 i = new Inter2(){
            @Override
            public void show1() {
                System.out.println("show1");
            }
            @Override
            public void show2() {
                System.out.println("show2");
            }
        };
        i.show1();
        i.show2();
    }
}
interface Inter{
    void show();
}
interface Inter2{
    void show1();
    void show2();
}
class InterImpl implements Inter{
    @Override
    public void show(){
        System.out.println("InterImpl 重写的show方法");
    }
}