package com.shiju.linklist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author 时距
 * @PackageName:com.shiju.linklist
 * @ClassName : Demo01LinkList
 * @Date 2021/3/28 18:13
 * @Description:
 */
public class Demo01LinkList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("黄桂田");
        linkedList.add("桂田");
        linkedList.add("田");

        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList);
    }
}
