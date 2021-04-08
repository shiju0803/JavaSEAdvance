package com.shiju.test3;

/*
 * @Author 时距
 * @PackageName:com.shiju.test3
 * @ClassName : Test3InnerClass
 * @Date 2021/3/23 19:14
 * @Description:
 * 私有成员内部类演示
 **/
public class Test3InnerClass {
    public static void main(String[] args) {
        //Outer.Inner oi = new Outer().new Inner();
        Outer o = new Outer();
        o.method();
    }
}
class Outer{
    private class Inner{
        public void show(){
            System.out.println("inner...show");
        }
    }
    public void method(){
        Inner i = new Inner();
        i.show();
    }
}