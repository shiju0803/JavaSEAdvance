package com.shiju.homework;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * 三、使用LinkedHashSet存储以下元素："王昭君","王昭君","西施","杨玉环","貂蝉"。
 * 使用迭代器和增强for循环遍历LinkedHashSet。
 * @author shiju
 * @date 2021/03/31 21:06
 **/
public class LinkedHashSetTest01 {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("王昭君");
        lhs.add("王昭君");
        lhs.add("西施");
        lhs.add("杨玉环");
        lhs.add("貂蝉");
        Iterator<String> it = lhs.iterator();
        //迭代器
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("------------------------");
        //增强for
        for (String s : lhs) {
            System.out.println(s);
        }
    }
}
