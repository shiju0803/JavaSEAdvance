package com.shiju.work;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author 时距
 * @PackageName:com.shiju.work
 * @ClassName : CollectionToArray
 * @Date 2021/3/28 19:42
 * @Description:
 * 定义一个方法，要求此方法把int数组转成存有相同元素的集合(集合里面的元素是Integer)，并返回。
 */
public class ArrayToCollection {
    public static void main(String[] args) {
        //定义一个int数组
        int[] arr = {1,2,3,4,5,6,7,8,9};
        //调用方法,并接收返回的集合对象
        Collection<Integer> list = toCollection(arr);
        //打印集合
        System.out.println(list);
    }
    public static Collection<Integer> toCollection(int[] arr){
        //创建集合对象
        Collection<Integer> list = new ArrayList<>();
        //遍历数组,将数组元素存入集合
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        //返回集合对象
        return list;
    }
}
