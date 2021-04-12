package com.shiju.homework;

import java.util.ArrayList;

/**
 * @Author 时距
 * @PackageName:com.shiju.work
 * @ClassName : GetIndex
 * @Date 2021/3/28 20:46
 * @Description:
 * 定义一个方法listTest(ArrayList<Integer> al, Integer s)，
 * 要求返回s在al里面第一次出现的索引，如果s没出现过返回-1。
 */
public class GetIndex {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        int index = listTest(al,2);
        System.out.println("第一次出现的索引为:" + index);
    }

    private static int listTest(ArrayList<Integer> al, int i) {
        int index = -1;
        for (Integer integer : al) {
            index++;
            if(integer.equals(i)){
                return index;
            }
        }
        return -1;
    }
}
