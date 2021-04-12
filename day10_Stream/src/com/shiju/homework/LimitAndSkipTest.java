package com.shiju.homework;

import java.util.ArrayList;
import java.util.List;

/**
 * 已知ArrayList集合中有如下元素{陈玄风、梅超风、陆乘风、曲灵风、武眠风、冯默风、罗玉风}，
 * 使用Stream
 * 1、取出前2个元素并在控制台打印输出。
 * 2、取出后2个元素并在控制台打印输出
 * @author shiju
 * @date 2021/04/02 20:08
 **/
public class LimitAndSkipTest {
    public static void main(String[] args) {
        //已知ArrayList集合中有如下元素{陈玄风、梅超风、陆乘风、曲灵风、武眠风、冯默风、罗玉风}
        ArrayList<String> list = new ArrayList<>(List.of("陈玄风", "梅超风", "陆乘风", "曲灵风", "武眠风", "冯默风", "罗玉风"));
        list.stream().limit(2).forEach(s -> System.out.println(s));
        System.out.println("----------------");
        list.stream().skip(5).forEach(s -> System.out.println(s));
    }
}
