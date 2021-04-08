package com.shiju.test6;

/*
 * @Author 时距
 * @PackageName:com.shiju.test6
 * @ClassName : CalculatorDemo
 * @Date 2021/3/24 14:44
 * @Description:
 * 1.首先存在一个接口(Calculator)
 * 2.在该接口中存在一个抽象方法(calc),该方法是有参数但是有返回值
 * 3.在该测试类(CalculatorDemodler)中存在一个方法(useCalculator)
 *      方法的参数是Calculator类型的
 *      在方法内部调用了Calculator的calc方法
 **/
public class CalculatorDemo {
    public static void main(String[] args) {
        //匿名内部类实现方法
        useCalculator(new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        },12,11);
        //Lambda表达式实现
        useCalculator((int a, int b) -> {
            return a + b;
        },12,13);
        //省略格式
        //useCalculator((a, b) -> a + b);
    }
    public static int useCalculator(Calculator c, int a, int b) {
        int result = c.calc(a, b);
        return result;
    }
}

interface Calculator {
    int calc(int a, int b);
}