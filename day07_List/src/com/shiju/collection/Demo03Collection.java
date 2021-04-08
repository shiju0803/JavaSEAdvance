package com.shiju.collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author 时距
 * @PackageName:com.shiju.collection
 * @ClassName : Demo03Collection
 * @Date 2021/3/28 11:41
 * @Description:
 */
public class Demo03Collection {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("d");
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            if("b".equals(s)){
                it.remove();
            }
        }
        System.out.println(list);
    }
}
