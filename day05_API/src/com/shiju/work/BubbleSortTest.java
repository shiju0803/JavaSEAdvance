package com.shiju.work;

/*
 * @Author 时距
 * @PackageName:com.shiju.work
 * @ClassName : BubbleSortTest
 * @Date 2021/3/26 18:26
 * @Description:
 **/
public class BubbleSortTest {
    public static void main(String[] args) {
        int[] arr = {9,2,3,1,5,7,4,8,6};
        prnt(getSort(arr));
    }
    public static int[] getSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    public static void prnt(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i == arr.length - 1){
                System.out.print("]");
            }else{
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
