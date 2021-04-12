package com.shiju.homework;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * @Author 时距
 * @PackageName:com.shiju.work
 * @ClassName : LocalDateTimeTest
 * @Date 2021/3/27 18:13
 * @Description:
 * 用程序判断2018年2月14日是星期几?  (键盘录入日期字符串)
 */
public class LocalDateTimeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入日期:");
        String s = sc.nextLine().trim() ;
        String str = s + " 0:0:0";
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy年M月d日 H:m:s");
        LocalDateTime parse = LocalDateTime.parse(str, pattern);
        DayOfWeek week = parse.getDayOfWeek();
        System.out.print(s + "是: " );
        switch (week) {
            case MONDAY:
                System.out.println("星期一");
                break;
            case TUESDAY:
                System.out.println("星期二");
                break;
            case WEDNESDAY:
                System.out.println("星期三");
                break;
            case THURSDAY:
                System.out.println("星期四");
                break;
            case FRIDAY:
                System.out.println("星期五");
                break;
            case SATURDAY:
                System.out.println("星期六");
                break;
            default:
                System.out.println("星期日");
                break;
        }
    }
}
