package com.shiju.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author 时距
 * @PackageName:com.shiju.exception
 * @ClassName : DemoException
 * @Date 2021/3/27 16:30
 * @Description:
 */
public class DemoException {
    public static void main(String[] args) throws ParseException{
        method();
    }
    public static void method() throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse("2001-10-10");
        System.out.println(d);
        System.out.println("=====method()结束============");
    }
}
