package com.shiju.homework;

import java.util.Arrays;

/*
 * @Author 时距
 * @PackageName:com.shiju.work
 * @ClassName : ArraysTest
 * @Date 2021/3/26 19:10
 * @Description:
 * 2.1 题目一
	有以下数组定义：
		int[] arr = {1,332,43,25,3324,34,335,4,45,2,43,52,54};
        要求：
        请打印数组所有元素
        请对数组元素进行“升序”排序
        请对排序后的数组再次打印。
 **/
public class ArraysTest {
    public static void main(String[] args) {
        int[] arr = {1,332,43,25,3324,34,335,4,45,2,43,52,54};
        System.out.println("排序前的数组:");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("升序排序后的数组:");
        System.out.println(Arrays.toString(arr));
    }
}
