package com.shiju.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Set集合的基本使用
 * @author shiju
 * @date 2021/03/30 14:25
 **/
public class MySet1 {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("黄老狗");
        set.add("黄老狗");
        set.add("黄小狗");
        set.add("黄狗狗");
        set.add("黄勾勾能有什么坏心思呢");

        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("-----------");
        for (String s : set) {
            System.out.println(s);
        }
    }
}
