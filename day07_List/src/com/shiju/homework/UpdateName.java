package com.shiju.homework;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 时距
 * @PackageName:com.shiju.work
 * @ClassName : UpdateName
 * @Date 2021/3/28 21:34
 * @Description:
 */
public class UpdateName {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("二丫");
        list.add("钱六");
        list.add("孙七");
        System.out.println(list);
        list.set(3,"王小丫");
        System.out.println(list);

    }
}
