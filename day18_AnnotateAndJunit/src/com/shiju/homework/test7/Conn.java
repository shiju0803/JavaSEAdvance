package com.shiju.homework.test7;

import com.shiju.homework.test2.MysqlInfo;

import java.sql.Connection;

/**
 * @author shiju
 * @date 2021/04/13 19:52
 **/
public class Conn {
    @MysqlInfo(driverClass = "com.mysql.jdbc.Driver",url = "jdbc:mysql://localhost:3306",username = "root",password = "123456")
    public Connection getConnection(){
        System.out.println("获取到连接");
        return null;
    }
}
