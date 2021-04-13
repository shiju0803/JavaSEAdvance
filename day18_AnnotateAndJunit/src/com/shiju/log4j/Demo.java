package com.shiju.log4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * @author shiju
 * @date 2021/04/13 16:13
 **/
public class Demo {
    //获取日志对象
    private static final Logger LOGGER = LoggerFactory.getLogger(Demo.class);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //键盘录入一个数字
        String number = sc.nextLine();
        //类型转换
        try {
            int result = Integer.parseInt(number);
            LOGGER.info("类型转换成功" + result);
        }catch (NumberFormatException e){
            LOGGER.info("类型转换失败,请录入一个整数");
        }
    }
}
