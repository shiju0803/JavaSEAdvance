package com.shiju.homework;

import java.util.ArrayList;

/**
 * @Author 时距
 * @PackageName:com.shiju.work
 * @ClassName : ContainsTest
 * @Date 2021/3/28 20:24
 * @Description:
 * 定义一个方法listTest(ArrayList<String> al, String s),要求使用contains()方法判断al集合里面是否包含s。
 */
public class ContainsTest {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("aaa");
        al.add("bbb");
        al.add("rrrr");
        al.add("s");
        al.add("acbdbdj");
        System.out.println(listTest(al, "s"));
    }

    private static String listTest(ArrayList<String> al, String s) {
        if(al.contains(s)){
            return "包含s";
        }else {
            return "没有s";
        }
    }
}
