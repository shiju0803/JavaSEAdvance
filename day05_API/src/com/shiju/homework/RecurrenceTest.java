package com.shiju.homework;

import java.math.BigDecimal;

/*
 * @Author 时距
 * @PackageName:com.shiju.work
 * @ClassName : RecurrenceTest
 * @Date 2021/3/26 18:34
 * @Description:
 **/
public class RecurrenceTest {
    public static void main(String[] args) {
        System.out.println(getJc(50));
    }
    public static BigDecimal getJc(int n){
        if(n == 1){
            return BigDecimal.valueOf(1);
        }
        return BigDecimal.valueOf(n).multiply(getJc(n - 1));
    }
}
