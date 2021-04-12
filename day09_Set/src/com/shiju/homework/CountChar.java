package com.shiju.homework;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 定义一个泛型为String类型的List集合，统计该集合中每个字符（注意，不是字符串）出现的次数。
 * 例如：集合中有”abc”、”bcd”两个元素，
 * 程序最终输出结果为：“a = 1,b = 2,c = 2,d = 1”。
 * @author shiju
 * @date 2021/04/01 22:26
 **/
public class CountChar {
    public static void main(String[] args) {
        //定义一个泛型为String类型的List集合
        ArrayList<String> list = new ArrayList<>();
        //定义一个Map集合存放统计结果
        HashMap<Character,Integer> map = new HashMap<>();
        list.add("abc");
        list.add("bcd");
        for (String s : list) {
            //将集合转换成字符数组
            char[] chars = s.toCharArray();
            //遍历数组,取出数组中的元素进行判断
            for (char c : chars) {
                if(!map.containsKey(c)){
                    map.put(c,1);
                }else{
                    //获取map中每个字符对应的value值
                    int count = map.get(c);
                    count++;
                    map.put(c,count);
                }
            }
        }
        //打印结果
        System.out.println(map);
    }
}
