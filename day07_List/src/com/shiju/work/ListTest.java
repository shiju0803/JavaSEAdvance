package com.shiju.work;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Author 时距
 * @PackageName:com.shiju.work
 * @ClassName : ListTest
 * @Date 2021/3/28 21:06
 * @Description:
 * 九、产生10个1-100的随机数，并放到一个数组中，
 * 把数组中大于等于10的数字放到一个list集合中，并打印到控制台。
 */
public class ListTest {
    public static void main(String[] args) {
        int[] arr = new int[10];
        List<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
            if(arr[i] >= 10){
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }

}
