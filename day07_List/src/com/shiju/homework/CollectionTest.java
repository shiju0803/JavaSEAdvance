package com.shiju.homework;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author 时距
 * @PackageName:com.shiju.work
 * @ClassName : CollectionTest
 * @Date 2021/3/28 19:34
 * @Description:
 * 二、给定以下代码，请定义方法public static int listTest(Collection<String> list,String s)
 * 统计集合中指定元素出现的次数，如"a":2,"b": 2,"c" :1, "xxx":0。
 * Collection<String> list = new ArrayList<>();
 * 			list.add("a");
 * 			list.add("a");
 * 			list.add("b");
 * 			list.add("b");
 * 			list.add("c");
 * 			System.out.println("a:"+listTest(list, "a"));
 * 			System.out.println("b:"+listTest(list, "b"));
 * 			System.out.println("c:"+listTest(list, "c"));
 * 			System.out.println("xxx:"+listTest(list, "xxx"));
 */
public class CollectionTest {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        System.out.println("a:"+listTest(list, "a"));
        System.out.println("b:"+listTest(list, "b"));
        System.out.println("c:"+listTest(list, "c"));
        System.out.println("xxx:"+listTest(list, "xxx"));
    }

    private static String listTest(Collection<String> list, String s) {
        int count = 0;
        for (String s1 : list) {
           if(s1.equals(s)){
               count++;
           }
        }
        return s + "出现了" + count + "次";
    }
}
