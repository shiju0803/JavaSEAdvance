package com.shiju.homework.test7;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author shiju
 * @date 2021/04/13 19:51
 **/

//自定义MysqlInfo注解
//定义注解在方法上使用
@Target(ElementType.METHOD)
//定义注解在运行时存活
@Retention(RetentionPolicy.RUNTIME)
public @interface ConnInfo {
    //定义数据库连接信息属性
    //驱动名
    String driverClass();
    //连接地址url
    String url();
    //用户名
    String username();
    //密码
    String password();
}
