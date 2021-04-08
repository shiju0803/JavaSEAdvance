package com.shiju.hashset;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author shiju
 * @date 2021/03/31 11:31
 **/
public class hashset {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("hello");
        hs.add("world");
        hs.add("java");
        hs.add("java");
        hs.add("java");
        hs.add("java");
        hs.add("java");
        Iterator<String> it = hs.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("-------------");
        for (String h : hs) {
            System.out.println(h);
        }
    }
}
