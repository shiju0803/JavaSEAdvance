package com.shiju.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @Author 时距
 * @PackageName:com.shiju.date
 * @ClassName : SimpleDateFormatDemo
 * @Date 2021/3/27 8:28
 * @Description:
 * 肯德基蛋挞秒杀时间:2020年11月11日 0:0:0 - 2020年11月11日 10:0:0
 * 小贾下单并付款时间为:2020年11月11日 0:3:47
 * 小皮下单并付款时间为:2020年11月11日 10:10:11
 * 用代码说明这两位同学有没有参加上秒杀活动
 */
public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        String start = "2020年11月11日 0:0:0";
        String end = "2020年11月11日 10:0:0";
        String jia = "2020年11月11日 0:3:47";
        String pi = "2020年11月11日 10:10:11";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        long startTime = sdf.parse(start).getTime();
        long endTime = sdf.parse(end).getTime();
        long jiaTime = sdf.parse(jia).getTime();
        long piTime = sdf.parse(pi).getTime();

        if(jiaTime >= startTime && jiaTime <= endTime){
            System.out.println("小贾成功秒杀!");
        }else{
            System.out.println("小贾秒杀失败~");
        }
        System.out.println("------------------");
        if(piTime >= startTime && piTime <= endTime){
            System.out.println("小皮成功秒杀!");
        }else{
            System.out.println("小皮秒杀失败~");
        }
    }
}
