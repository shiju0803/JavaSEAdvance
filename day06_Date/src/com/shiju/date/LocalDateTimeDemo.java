package com.shiju.date;

import java.time.LocalDateTime;

/**
 * @Author 时距
 * @PackageName:com.shiju.date
 * @ClassName : LocalDateTimeDemo
 * @Date 2021/3/27 11:40
 * @Description:
 */
public class LocalDateTimeDemo {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime localDateTime = LocalDateTime.of(2021,3,27,11,41,0);
        System.out.println(localDateTime);
    }
}
