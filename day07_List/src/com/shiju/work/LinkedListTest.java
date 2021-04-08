package com.shiju.work;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @Author 时距
 * @PackageName:com.shiju.work
 * @ClassName : LinkedListTest
 * @Date 2021/3/28 21:38
 * @Description:
 * 五、已知数组存放一批QQ号码，QQ号码最长为11位，最短为5位
 * String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"}。
 * 将该数组里面的所有qq号都存放在LinkedList中，将list中重复元素删除，
 * 将list中所有元素分别用迭代器和增强for循环打印出来。
 */
public class LinkedListTest {
    public static void main(String[] args) {
        //定义数组存放QQ号
        String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"};
        //定义LinkedList对象
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < strs.length; i++) {
            if(strs[i].length() >= 5 && strs[i].length() <= 11){
                list.add(strs[i]);
            }
        }
        System.out.println(list);
        System.out.println("------------------------");
        LinkedList<String> list1 = new LinkedList<>();
        for (String s : list) {
            if(!list1.contains(s)){
                list1.add(s);
            }
        }
        //迭代器遍历打印
        Iterator<String> it = list1.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("-----------------------");
        //增强for遍历打印
        for (String s : list1) {
            System.out.println(s);
        }
    }
}
