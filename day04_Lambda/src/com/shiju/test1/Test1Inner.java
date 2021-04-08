package com.shiju.test1;

/*
 * @Author 时距
 * @PackageName:com.shiju.test
 * @ClassName : Test1Inner
 * @Date 2021/3/23 18:48
 * @Description:
 * 按照内部类在类中定义的位置不同,可以分为如下两种形式
	在类的成员位置:成员内部类
	在类的局部位置:局部内部类
	*
    成员内部类创建内部类对象格式:
        外部类名.内部类名 对象名 = new 外部类对象().new 内部类对象();
            范例: Outer.Inner i = new Outer().new Inner();
    成员内部类创建外部类对象格式:
         外部类名.内部类名 对象名 = new 外部类对象().new 内部类对象();
             范例: Outer.inner oi = new Outer().new Inner();
	*
 **/
public class Test1Inner {
    public static void main(String[] args) {
        //成员内部类创建内部类对象格式:
        //外部类名.内部类名 对象名 = new 外部类对象().new 内部类对象();
        Outer.Inner i = new Outer().new Inner();
        System.out.println(i.num);
        i.show();

        //成员内部类创建外部类对象格式:
        //   外部类名.内部类名 对象名 = new 外部类对象().new 内部类对象();
        //    范例: Outer.inner oi = new Outer().new Inner();
        Outer.Inner oi = new Outer().new Inner();
    }
}
class Outer{
    private int a = 10;
    class Inner{
        int num = 10;
        public void show(){
            System.out.println("Inner...show");
            //内部类访问外部类成员,可以直接访问,包括私有
            System.out.println(a);
        }
    }
}