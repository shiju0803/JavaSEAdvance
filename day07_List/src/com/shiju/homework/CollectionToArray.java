package com.shiju.homework;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author 时距
 * @PackageName:com.shiju.work
 * @ClassName : ArrayToColliection
 * @Date 2021/3/28 19:53
 * @Description:
 * 定义一个集合，并把集合(集合里面的元素是Integer)转成存有相同元素的数组，并将结果输出在控制台。
 * （可以使用Object[]数组类型接收转换的数组）
 */
public class CollectionToArray {
    public static void main(String[] args) {
        //定义集合对象并添加元素
        Collection<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        //将集合转换成Integer数组
        Integer[] integer_list = list.toArray(new Integer[list.size()]);
        int[] arr = new int[integer_list.length];
        //遍历数组,将元素存入新的int型数组中
        for (int i = 0;i < arr.length;i++) {
            arr[i] = integer_list[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
