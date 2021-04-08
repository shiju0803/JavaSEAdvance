package com.shiju.test;

import java.math.BigDecimal;

/*
 * @Author 时距
 * @PackageName:com.shiju.test
 * @ClassName : Test
 * @Date 2021/3/26 16:15
 * @Description:
 **/
public class Test {
    public static void main(String[] args) {
        //print(1);
        System.out.println(getJc(50));
    }
    public static void print(int i){
        //写出口
        if(i > 100){
            return;
        }
        System.out.println("黄桂田杀了黄桂田" + i + "次");
        i++;
        print(i);
    }
    public static BigDecimal getJc(int n){
        if(n == 1){
            return BigDecimal.valueOf(n);
        }else {
            return BigDecimal.valueOf(n).multiply(getJc(n - 1));
        }
    }
}
