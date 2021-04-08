package com.shiju.template;

/*
 * @Author 时距
 * @PackageName:com.shiju.Template
 * @ClassName : Eat
 * @Date 2021/3/21 20:33
 * @Description:
 **/
public abstract class Eat {
    public void eat(){
        System.out.println("今天中午吃饭点了很多东西,比如:");
        food();
        System.out.println("吃的好撑啊~~");
    }
    public abstract void food();
}
