package com.shiju.test6;

import java.util.Random;

/*
 * @Author 时距
 * @PackageName:com.shiju.test6
 * @ClassName : RandomNumHandlerDemo
 * @Date 2021/3/24 14:28
 * @Description:
 * 1.首先存在一个接口(RandomNumHandler)
 * 2.在该接口中存在一个抽象方法(getNumber),该方法是无参数但是有返回值
 * 3.在该测试类(RandomNumHandler)中存在一个方法(useRandomNumHandler)
 *      方法的参数是RandomNumHandler类型的
 *      在方法内部调用了RandomNumHandler的getNumber方法
 **/
public class RandomNumHandlerDemo {
    public static void main(String[] args) {
        //匿名内部类实现
        useRandomNumHandler(new RandomNumHandler() {
            @Override
            public int getNumber() {
                Random r = new Random();
                int result = r.nextInt(9) + 1;
                return result;
            }
        });
        //Lambda表达式实现
        useRandomNumHandler(() -> {
            Random r = new Random();
            int result = r.nextInt(9) + 1;
            //注意:如果Lambda所操作的接口中的方法,有返回值,一定要通过return语句,将结果返回
            //否则会出现编译错误
            return result;
        });
    }
    public static void useRandomNumHandler(RandomNumHandler rnh){
        int result = rnh.getNumber();
        System.out.println(result);
    }
}
interface RandomNumHandler {
    int getNumber();
}