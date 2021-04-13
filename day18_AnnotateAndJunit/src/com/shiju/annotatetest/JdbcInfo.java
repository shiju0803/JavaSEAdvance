package com.shiju.annotatetest;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author shiju
 * @date 2021/04/13 11:44
 **/
//@Test注解存活时间，在运行时期有效
@Retention(RetentionPolicy.RUNTIME)
public @interface JdbcInfo {
    //定义几个属性信息
    //驱动类driverClass ,连接地址url ,用户名 username ,密码 password
    String driverClass();
    String url();
    String username();
    String password();
}
