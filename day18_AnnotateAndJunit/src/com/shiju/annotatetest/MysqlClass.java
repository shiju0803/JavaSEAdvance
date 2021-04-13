package com.shiju.annotatetest;

import java.sql.Connection;

/**
 * @author shiju
 * @date 2021/04/13 11:49
 **/
public class MysqlClass {
    //前提:getConnection()是否能被调用,要看这个getConnection()方法上的注解信息是否存在
    //并且能够拿到注解@JdbcInfo中的四个属性值

    @JdbcInfo(driverClass = "com.mysql.jdbc.Driver",
            url = "jdbc:mysql:localhost:3306", username = "root", password = "123456")
    public static Connection getConnection() {
        System.out.println("getConnection()执行了,获取到了连接");
        return null;
    }

}
