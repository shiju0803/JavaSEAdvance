package com.shiju.homework;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;

/**
 * 请定义一个Collection类型的集合，存储以下分数信息：
 * 88.5,39.2,77.1,56.8,89,99,59.5
 * 请编程实现以下功能：
 *  使用增强for遍历所有元素，并打印
 *  使用增强for遍历所有元素，打印不及格的分数；
 *  使用增强for遍历所有元素，计算不及格的分数的数量，和平均分，并打印计算结果。
 *  使用增强for遍历所有元素，求出最高分，并打印；
 * (注意：以上所有功能写在一个main()方法中，但请单独实现)
 *
 * @author shiju
 * @date 2021/03/30 16:14
 **/
public class ForPlusTest {
    public static void main(String[] args) {
        //定义一个Collection类型的集合
        Collection<Double> c = new ArrayList<>();
        c.add(88.5);
        c.add(39.2);
        c.add(77.1);
        c.add(56.8);
        c.add(89.0);
        c.add(99.0);
        c.add(59.5);
        //使用增强for遍历所有元素，并打印
        for (Double d : c) {
            System.out.println(d);
        }
        System.out.println("-----------------");
        //使用增强for遍历所有元素，打印不及格的分数
        System.out.println("以下是不及格的分数:");
        for (Double d : c) {
            if(d < 60){
                System.out.println(d);
            }
        }

        System.out.println("-----------------");
        //使用增强for遍历所有元素，计算不及格的分数的数量，和平均分，并打印计算结果
        double sum = 0;
        int count = 0;
        for (Double d : c) {
            sum += d;
            if(d < 60){
                count++;
            }
        }
        BigDecimal avg = BigDecimal.valueOf(sum).divide(BigDecimal.valueOf(c.size()),1, RoundingMode.HALF_UP);
        System.out.println("不及格的分数的数量为:" + count + ", 平均分是: " + avg);
        System.out.println("-----------------");
        //使用增强for遍历所有元素，求出最高分，并打印；
        double max = 0;
        for (Double d : c) {
            max = Math.max(max,d);
        }
        System.out.println("最高分是:" + max);
    }
}
