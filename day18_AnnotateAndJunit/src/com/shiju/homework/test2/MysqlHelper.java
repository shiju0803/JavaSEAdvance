package com.shiju.homework.test2;

import java.sql.Connection;

/**
 * 数据库帮助类,编写getConnection方法,并获取注解属性值
 * @author shiju
 * @date 2021/04/13 18:38
 **/
public class MysqlHelper {
    @MysqlInfo(driverClass = "com.mysql.jdbc.Driver",url = "jdbc:mysql://localhost:3306",username = "root",password = "123456")
    public static Connection getConnection(){
        System.out.println("成功获取连接");
        return null;
    }
}
