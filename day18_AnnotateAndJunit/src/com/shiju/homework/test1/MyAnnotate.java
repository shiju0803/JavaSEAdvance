package com.shiju.homework.test1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解
 * @author shiju
 * @date 2021/04/13 16:31
 **/
//注解可以使用在类上和方法上
@Target(ElementType.TYPE)
//注解在运行时生效
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotate {
    public String name() default "Tiga";
    public int age() default 23;
}
