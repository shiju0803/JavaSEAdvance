package com.shiju.binarysearch;

import java.util.Scanner;

/*
 * @Author 时距
 * @PackageName:com.shiju.binarysearch
 * @ClassName : MyBinarySearchDemo
 * @Date 2021/3/26 14:49
 * @Description:二分法查找
 **/
public class MyBinarySearchDemo {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        //键盘输入查找值
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找的元素:");
        int num = sc.nextInt();
        //调用方法查找元素在数组中位置索引
        int index = binarySearch(num,arr);
        System.out.println("您所要查找的元素是数组中的第" + (index + 1) +"个");
    }

    private static int binarySearch(int num, int[] arr) {
        //定义最小索引
        int min = 0;
        //定义最大索引
        int max = arr.length - 1;
        //循环查找元素
        while(min <= max){
            //计算索引中间值
            int mid = (min + max) >> 1;
            if(arr[mid] < num){
                min = mid + 1;
            }else if(arr[mid] > num){
                max = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
