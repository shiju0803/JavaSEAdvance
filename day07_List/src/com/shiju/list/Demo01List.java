package com.shiju.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author 时距
 * @PackageName:com.shiju.list
 * @ClassName : Demo01List
 * @Date 2021/3/28 15:24
 * @Description:
 */
public class Demo01List {
    public static void main(String[] args) {
        //list接口:1.有序,2.可重复,3.有索引
        List<String> list = new ArrayList<>();
        list.add("喜羊羊");
        list.add("美羊羊");
        list.add("懒洋洋");

        System.out.println(list.set(0, "黑太🐺"));
        System.out.println(list.remove(2));
        System.out.println(list.get(0));

        Iterator<String> it = list.iterator();

        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println();
        System.out.println("----------------------------");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
