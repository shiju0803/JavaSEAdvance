package com.shiju.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author 时距
 * @PackageName:com.shiju.collection
 * @ClassName : Demo04ForPlus
 * @Date 2021/3/28 14:25
 * @Description:for增强
 * 基本格式:
 * 	for(集合/数组中数据类型 变量 : 集合名/数组名){
 *         //变量就是遍历出来的数据
 *     }
 */
public class Demo04ForPlus {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        //使用增强for循环遍历
        for(String s : list){
            System.out.println(s);
        }
    }
}
