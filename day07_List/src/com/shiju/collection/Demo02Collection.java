package com.shiju.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author 时距
 * @PackageName:com.shiju.collection
 * @ClassName : Demo01Collection
 * @Date 2021/3/27 21:29
 * @Description:
 */
public class Demo02Collection {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
//        boolean add(E e)           添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
    }
}