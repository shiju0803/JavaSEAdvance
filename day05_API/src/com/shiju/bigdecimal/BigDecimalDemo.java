package com.shiju.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*
 * @Author 时距
 * @PackageName:com.shiju.bigdecimal
 * @ClassName : BigDecimalDemo
 * @Date 2021/3/26 10:18
 * @Description:
 * BigDecimal的加减乘除方法
 **/
public class BigDecimalDemo {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("0.1");
        BigDecimal bd2 = new BigDecimal("3");

        BigDecimal add = bd1.add(bd2);
        System.out.println("和为:" + add);

        BigDecimal subtract = bd1.subtract(bd2);
        System.out.println("差为:" + subtract);

        BigDecimal multiply = bd1.multiply(bd2);
        System.out.println("积为:" + multiply);

        BigDecimal divide = bd1.divide(bd2,29, RoundingMode.HALF_UP);
        System.out.println("商为:" + divide);
    }
}
