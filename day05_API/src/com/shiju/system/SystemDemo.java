package com.shiju.system;

import java.util.ArrayList;

/*
 * @Author 时距
 * @PackageName:com.shiju.system
 * @ClassName : SystemDemo
 * @Date 2021/3/24 16:49
 * @Description:
 **/
public class SystemDemo {
    public static void main(String[] args) {
        /*//public static void exit(int status)		终止当前运行的Java虚拟机,非零表示异常终止
        System.out.println("111");
        System.exit(0);//当代码执行到这个方法时,表示虚拟机已经停止
        System.out.println("2222");*/

        //public static long cuerrentTimeMillis() 返回当前时间(以毫秒为单位)
        long l = System.currentTimeMillis();
        System.out.println(l);
        //arrycopy(数据源数组,起始索引,目的地数组,起始索引,拷贝个数)  数组copy
        int[] arr = {11,22,33,44,55,66,77};
        int[] arr2 = new int[5];
        System.arraycopy(arr,1,arr2,1,4);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
