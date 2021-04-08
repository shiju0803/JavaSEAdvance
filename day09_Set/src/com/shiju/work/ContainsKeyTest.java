package com.shiju.work;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 利用Map，完成下面的功能：
 * 从命令行读入一个字符串，表示一个年份，输出该年的世界杯冠军是哪支球队。
 * 如果该 年没有举办世界杯，则输出：没有举办世界杯。
 * //tips:参阅Map接口containsKey(Object key)方法
 *
 * @author shiju
 * @date 2021/04/01 22:54
 **/
public class ContainsKeyTest {
    public static void main(String[] args) {
        //定义Map集合存入世界杯夺冠信息
        Map<Integer, String> map = new HashMap<>();
        map.put(1930, "乌拉圭");
        map.put(1934, "意大利");
        map.put(1938, "意大利");
        map.put(1950, "乌拉圭");
        map.put(1954, "西德");
        map.put(1958, "巴西");
        map.put(1962, "巴西");
        map.put(1966, "英格兰");
        map.put(1970, "巴西");
        map.put(1974, "西德");
        map.put(1978, "阿根廷");
        map.put(1982, "意大利");
        map.put(1986, "阿根廷");
        map.put(1990, "西德");
        map.put(1994, "巴西");
        map.put(1998, "法国");
        map.put(2002, "巴西");
        map.put(2006, "意大利");
        map.put(2010, "西班牙");
        map.put(2014, "德国");
        //从命令行读入一个字符串，表示一个年份，
        Scanner sc = new Scanner(System.in);
        /*System.out.println("请输入一个年份:");
        int year = sc.nextInt();
        if (map.containsKey(year)) {
            // 输出该年的世界杯冠军是哪支球队。
            System.out.println(year + "年,获得世界杯冠军的是:" + map.get(year));
        } else {
            // 如果该 年没有举办世界杯，则输出：没有举办世界杯。
            System.out.println("没有举办世界杯");
        }*/
        //输入一支球队的名字，输出该球队夺冠的年份列表
        System.out.println("请输入一个国家名称:");
        String country = sc.nextLine();
        if(map.containsValue(country)){
            for (Integer i : map.keySet()) {
                if(map.get(i).equals(country)){
                    System.out.println(i + "、");
                }
            }
        }else{
            System.out.println("没有获得过世界杯冠军");
        }
    }
}
