package com.shiju.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author 时距
 * @PackageName:com.shiju.date
 * @ClassName : TimeTest
 * @Date 2021/3/27 10:03
 * @Description:
 */
public class DateDemo2 {
    public static void main(String[] args) throws ParseException {
        //把当前时间封装成一个date对象
        Date date1 = new Date();
        //设置时间
        date1.setTime(1000L);
        System.out.println(date1);
        System.out.println("-----------------------------");
        //日期解析
        String str = "2021年3月27日 10:35:20";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date = sdf.parse(str);
        System.out.println(date);
        System.out.println("-----------------------------");
        //日期格式化
        Date date2 = new Date(103287457675L);
        String Str = sdf.format(date2);
        System.out.println(Str);
    }
}
