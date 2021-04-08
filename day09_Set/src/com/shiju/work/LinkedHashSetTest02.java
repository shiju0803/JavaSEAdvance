package com.shiju.work;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * 四、键盘录入一个字符串，去掉其中重复字符，打印出不同的那些字符，必须保证顺序。
 * 例如输入：aaaabbbcccddd，打印结果为：abcd。
 * @author shiju
 * @date 2021/03/31 21:14
 **/
public class LinkedHashSetTest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.nextLine();
        LinkedHashSet<String> list = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(Character.toString(str.charAt(i)));
        }
        System.out.println(list);
    }
}
