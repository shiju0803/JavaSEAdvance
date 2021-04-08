package com.shiju.bubblesort;

/*
 * @Author 时距
 * @PackageName:com.shiju.bubblesort
 * @ClassName : MyBubbleSortDemo
 * @Date 2021/3/26 15:12
 * @Description:冒泡排序
 **/
public class MyBubbleSortDemo {
    public static void main(String[] args) {
        int[] arr = {3,1,9,7,8,6,4,5};
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    /*public static void bubbleSort(int[] arr){
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 -i; j++) {
                if(arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }*/
    public static void bubbleSort(int[] arr){
        int temp = 0;
        for (int i = 0; i < arr.length - 1 ; i++) {
            for (int j = 0; j < arr.length - 1 -i ; j++) {
                if(arr[j] < arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
