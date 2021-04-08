package com.shiju.date;

import java.time.*;

/**
 * @Author 时距
 * @PackageName:com.shiju.date
 * @ClassName : PeriodDemo
 * @Date 2021/3/27 15:23
 * @Description:
 */
public class PeriodDemo {
    public static void main(String[] args) {
        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = LocalDate.of(2021,3,31);
        LocalDateTime localDateTime1 = LocalDateTime.of(2021, 3, 27, 15, 23, 24);
        LocalDateTime localDateTime2 = LocalDateTime.of(2021, 3, 29, 23, 25, 24);
        Period between = Period.between(localDate1, localDate2);
        System.out.println(between);
        System.out.println(between.getYears());
        System.out.println(between.getMonths());
        System.out.println(between.getDays());

        Duration duration = Duration.between(localDateTime1,localDateTime2);
        System.out.println(duration);
    }
}
