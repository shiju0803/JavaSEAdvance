package com.shiju.work;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author 时距
 * @PackageName:com.shiju.work
 * @ClassName : SimpleDateFormatTest
 * @Date 2021/3/27 18:04
 * @Description:
 * 练习：DateFormat类方法的使用
 * 、使用SimpleDateFormat类,把2018-03-04转换为2018年03月04日。
 */
public class SimpleDateFormatTest {
    public static void main(String[] args) throws ParseException {
        String s = "2018-03-04";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf1.parse(s);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        String format = sdf2.format(date);
        System.out.println(format);
    }
}
