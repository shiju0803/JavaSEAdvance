package com.shiju.work;

/*
 * @Author 时距
 * @PackageName:com.shiju.work
 * @ClassName : LambdaDemo
 * @Date 2021/3/24 20:40
 * @Description:
 **/
public class LambdaDemo {
    public static void main(String[] args) {
        invokeDirect(() ->  System.out.println("我要做导演..."));
    }
    private static void invokeDirect(Director director) {
        director.makeMovie();
    }
}
interface Director{
    void makeMovie();
}
