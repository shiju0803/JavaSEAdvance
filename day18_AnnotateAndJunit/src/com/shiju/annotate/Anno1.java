package com.shiju.annotate;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author shiju
 * @date 2021/04/13 10:32
 **/
//注解在运行时有效
@Retention(RetentionPolicy.RUNTIME)
//注解可以使用在类上
@Target(ElementType.TYPE)
public @interface Anno1 {
    //1.定义一个基本类型的属性
    int a() default 12;
    //2.定义一个String类型的属性
    public String name() default "黄田田";
    //3.定义一个Class类型的属性
    public Class clazz() default Demo.class;
    //4.定义一个注解类型的属性
    public Anno2 anno() default @Anno2;
    //5.定义一个枚举类型的属性
    public Season season() default Season.SPRING;
    //6.定义一个数组类型的属性
    public int[] arr() default {1,2,3,4};
    //7.枚举数组类型
    public Season[] seasons() default {Season.AUTUMN,Season.SUMMER};

}
