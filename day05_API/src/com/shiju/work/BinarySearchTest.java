package com.shiju.work;

/*
 * @Author 时距
 * @PackageName:com.shiju.work
 * @ClassName : BinarySearchTest
 * @Date 2021/3/26 18:14
 * @Description:
 **/
public class BinarySearchTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(getIndex(arr,8));
    }
    public static int getIndex(int[] arr,int num){
        int max = arr.length -1;
        int min = 0;
        while(min <= max){
            int mid = (max + min) / 2;
            if(arr[mid] > num){
                max = mid - 1;
            }else if(arr[mid] < num){
                min = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
