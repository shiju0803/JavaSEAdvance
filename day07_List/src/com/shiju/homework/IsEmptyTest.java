package com.shiju.homework;

import java.util.ArrayList;

/**
 * @Author 时距
 * @PackageName:com.shiju.work
 * @ClassName : IsEmptyTest
 * @Date 2021/3/28 20:37
 * @Description:
 * 定义一个方法listTest(ArrayList<String> al), 要求使用isEmpty()判断al里面是否有元素。
 */
public class IsEmptyTest {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        //al.add("11");
        String result = checkArrayList(al);
        System.out.println(result);
    }

    private static String checkArrayList(ArrayList<String> al) {
        if(al.isEmpty()){
            return "集合为空";
        }else{
            return "集合不为空";
        }
    }
}
