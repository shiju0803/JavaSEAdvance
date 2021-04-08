package com.shiju.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @Author 时距
 * @PackageName:com.shiju.date
 * @ClassName : JDK8DateDemo
 * @Date 2021/3/27 11:13
 * @Description:
 */
public class Jdk8DateDemo {
    public static void main(String[] args) throws ParseException {
        jdkMethod();
        //JDK8新特性
        String s = "2020年03月27日 11:15:24";
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse(s,pattern);
        LocalDateTime newLocalDateTime = localDateTime.plusDays(1);
        String result = newLocalDateTime.format(pattern);
        System.out.println(result);
    }

    private static void jdkMethod() throws ParseException {
        String s = "2020年3月27日 11:15:24";
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date = sdf.parse(s);
        long time = date.getTime();
        time = time + (1000 * 60 * 60 *24);
        Date newDate = new Date(time);
        String result = sdf.format(newDate);
        System.out.println(result);
    }
}
