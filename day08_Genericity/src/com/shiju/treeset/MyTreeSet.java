package com.shiju.treeset;

import java.util.TreeSet;

/**
 * 存储Integer类型数据
 *
 * @author shiju
 * @date 2021/03/30 14:40
 **/
public class MyTreeSet {
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<Integer> ts = new TreeSet<Integer>();

        //添加元素
        ts.add(10);
        ts.add(40);
        ts.add(30);
        ts.add(50);
        ts.add(20);

        ts.add(30);

        //遍历集合
        for(Integer i : ts) {
            System.out.println(i);
        }
    }
}
