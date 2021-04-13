package com.shiju.homework;

/**
 * 1) 定义一个Week枚举类，写上一个星期的七天 表示枚举项
 * <p>
 * 2) 写一个测试类，在测试类中写一个switch语句，根据枚举项做出选择执行不同的代码
 *
 * @author shiju
 * @date 2021/04/12 21:47
 **/
public class EnumTest {

    public static void main(String[] args) {
        Week week = Week.FRIDAY;
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
                System.out.println("星期天");
                break;
        }
    }
}
//定义一个Week枚举类
enum Week {
    //写上一个星期的七天 表示枚举项
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
}