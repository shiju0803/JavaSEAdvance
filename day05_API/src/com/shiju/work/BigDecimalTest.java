package com.shiju.work;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*
 * @Author 时距
 * @PackageName:com.shiju.work
 * @ClassName : BigDecimalTest
 * @Date 2021/3/26 18:41
 * @Description:
 * 题目一
	有以下double数组：
		double[] arr = {0.1,0.2,2.1,3.2,5.56,7.21};
	请编程计算它们的总值及平均值(四舍五入保留小数点后2位)
 **/
public class BigDecimalTest {
    public static void main(String[] args) {
        double[] arr = {0.1,0.2,2.1,3.2,5.56,7.21};
        getSum(arr);
    }
    public static void getSum(double[] arr){
        BigDecimal sum = BigDecimal.valueOf(0);
        for (int i = 0; i < arr.length; i++) {
           sum = sum.add(BigDecimal.valueOf(arr[i]));
        }
        BigDecimal avg = sum.divide(BigDecimal.valueOf(arr.length),2, RoundingMode.HALF_UP);
        System.out.println("和为: " + sum +", 平均数为: " + avg);
    }
}
