package com.shiju.homework.test6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * @author shiju
 * @date 2021/04/13 19:23
 *
 *
 * test5:
 * log4j中 三个核心 各自是什么?
 *    Loggers(记录器):   日志级别
 *    Apatterns(输出源): 日式的 输出目录地
 *    Layouts(布局):     日志的输出格式
 **/

//日志练习
public class Log4jTest {
    //获取日志对象
    private static final Logger LOGGER = LoggerFactory.getLogger(Log4jTest.class);
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");

        try {
            int number = Integer.parseInt(sc.nextLine());
            LOGGER.info("类型转换成功" + number);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            LOGGER.info("类型转换失败,请输入一个整数");
        }
    }
}
