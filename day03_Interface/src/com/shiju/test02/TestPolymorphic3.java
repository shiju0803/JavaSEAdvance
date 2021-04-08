package com.shiju.test02;

/*
 * @Author 时距
 * @PackageName:com.shiju.polymorphic
 * @ClassName : TestPolymorphic3
 * @Date 2021/3/22 16:33
 * @Description:
 **/
public class TestPolymorphic3 {
    public static void main(String[] args) {
        //1.向上转型:父类引用对象
        Fu f = new Zi();
        f.show();
        //多态的弊端:不能调用子类特有的成员
        //f.method();
        //2.向下转型:子类引用对象
        Zi z = (Zi) f;
        z.method();
    }
}
class Fu{
    public void show(){
        System.out.println("Fu.....show....");
    }
}
class Zi extends Fu{
    @Override
    public void show() {
        System.out.println("黄桂田汪汪汪~~~~");
    }
    public void method(){
        System.out.println("黄桂田喵喵喵~~");
    }
}