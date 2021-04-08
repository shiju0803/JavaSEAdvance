package com.shiju.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @Author 时距
 * @PackageName:com.shiju.date
 * @ClassName : LocalDateTimeDemo2
 * @Date 2021/3/27 14:13
 * @Description:
 */
public class LocalDateTimeDemo2 {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        LocalDate day = date.toLocalDate();
        LocalTime time = date.toLocalTime();
        System.out.println(day);
        System.out.println(time);
        LocalDateTime newDate = date.of(day, time);
        System.out.println(newDate);
        System.out.println("-----------------");

        method1(newDate);

        String s = "2020年12月31日 12:23:45";
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse(s,pattern);
        System.out.println("parse: " + localDateTime);
    }

    private static void method1(LocalDateTime newDate) {
        //public String format(指定格式)  把一个LocalDateTime格式化为一个字符串
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        String str = newDate.format(pattern);
        System.out.println("format: " + str);
        System.out.println("-------------------------");
    }
}
