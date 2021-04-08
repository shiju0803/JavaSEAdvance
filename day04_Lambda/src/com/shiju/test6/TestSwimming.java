package com.shiju.test6;

/*
 * @Author 时距
 * @PackageName:com.shiju.test6
 * @ClassName : TestSwimming
 * @Date 2021/3/23 21:28
 * @Description:
 **/
public class TestSwimming {
    public static void main(String[] args) {
       goSwimming(() -> System.out.println("桂田,游泳吧..."));
       //理解:对于Lambda表达式,对匿名内部类进行了优化
       goSwimming(()->{System.out.println("桂田,游泳吧...");});
       goSwimming(new Swimming() {
           @Override
           public void swim() {
               System.out.println("桂田怕水...");
           }
       });
    }
    //使用接口的方法
    public static void goSwimming(Swimming swimming){
        swimming.swim();
    }
}
//游泳接口
interface Swimming{
    void swim();
}