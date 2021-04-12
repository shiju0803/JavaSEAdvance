package com.shiju.homework;

import java.util.LinkedList;

/**
 * @Author 时距
 * @PackageName:com.shiju.work
 * @ClassName : LinkedListDemo
 * @Date 2021/3/29 10:37
 * @Description:
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.set(0,"aaa");
        list.get(0);
        list.remove(2);
        list.size();
        list.addFirst("ddd");
        list.addLast("eee");
        list.getFirst();
        list.getLast();
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        list.push("eee");
        System.out.println(list);
        list.pop();
        System.out.println(list);
        list.clear();
    }
}
