package com.shiju.homework;
/*
 * @Author 时距
 * @PackageName:com.shiju.work
 * @ClassName : Test10InvokeCalc
 * @Date 2021/3/24 20:46
 * @Description:
 **/
public class Test10InvokeCalc {
    public static void main(String[] args) {
        invokeCalc( (a,b) ->  a - b ,12,1);
    }
    private static void invokeCalc(Calculator calculator,int a, int b) {
        int result = calculator.calc(a, b);
        System.out.println("结果是：" + result);
    }
}
interface Calculator {
    int calc(int a, int b);
}
