package com.shiju.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @Author 时距
 * @PackageName:com.shiju.work
 * @ClassName : LiveTime
 * @Date 2021/3/27 19:03
 * @Description: 计算你出生到现在过了多少天?
 * 1.键盘录入你出生的日期(1995-10-08)
 * 2.字符串转Date对象,得到你出生的Date对象
 * 3.得到你出生的毫秒值
 * 4.得到当前时间的毫秒值
 * 5.现在毫秒值 - 出生毫秒值 = 你活了多少毫秒
 * 6.毫秒转天
 */
public class LiveTime {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        //1.键盘录入你出生的日期(1995-10-08)
        System.out.println("请输入你的生日:");
        String s = sc.nextLine();
        //2.字符串转Date对象,得到你出生的Date对象
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        Date date1 = sdf.parse(s);
        //3.得到你出生的毫秒值
        long birthday = date1.getTime();
        //4.得到当前时间的毫秒值
        Date date2 = new Date();
        long now = date2.getTime();
        //5.现在毫秒值 - 出生毫秒值 = 你活了多少毫秒
        long life = now - birthday;
        //6.毫秒转天
        long day = life / 3600 / 24;
        System.out.println("黄桂田已经活了: " + day + "天");

        String str=null;
        System.out.println(str.length());
    }
}
