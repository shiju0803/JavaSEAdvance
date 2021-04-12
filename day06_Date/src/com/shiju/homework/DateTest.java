package com.shiju.homework;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author 时距
 * @PackageName:com.shiju.work
 * @ClassName : DateTest
 * @Date 2021/3/27 17:57
 * @Description:
 * Date类的使用
 *    请用代码实现:获取当前的日期,并把这个日期转换为指定格式的字符串,如2088-08-08 08:08:08。
 */
public class DateTest {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = sdf.format(date);
        System.out.println(dateStr);
    }
}
