package com.shiju.work;

/*
 * @Author 时距
 * @PackageName:com.shiju.work
 * @ClassName : OuterDemo2
 * @Date 2021/3/24 19:48
 * @Description:
 **/
public class OuterDemo2 {
    public static void main(String[] args) {
        Outer2.method().show();
    }
}
interface Inter{
    void show();
}
/*class Outer2 {
   public static Inter method(){
       class Inner implements Inter{
           @Override
           public void show() {
               System.out.println("HelloWorld");
           }
       }
       Inner i = new Inner();
       return i;
   }
}*/

/*
class Outer2 {
    public static Inter method(){
       return new Inter(){
            @Override
            public void show() {
                System.out.println("HelloWorld");
            }
        };
    }
}*/
class Outer2 {
    public static Inner method(){
        return new Inner();
    }
    static class Inner implements Inter{
        @Override
        public void show() {
            System.out.println("HelloWorld");
        }
    }
}