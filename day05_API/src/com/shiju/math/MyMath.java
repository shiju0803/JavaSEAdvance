package com.shiju.math;

/*
 * @Author 时距
 * @PackageName:com.shiju.math
 * @ClassName : MyMath
 * @Date 2021/3/24 16:34
 * @Description:
 *  public static int abs(int a)	      返回参数绝对值
    public static double ceil(double a)    向上取整
    public static double floor(double a)   向下取整
    public static int round(float a)	   四舍五入
    public static int max(int a,int b)     返回两个int值中的较大值
    public static int min(int a,int b)     返回两个int值中的较小值
    public static double pow(double a,double b) 返回a的b次幂的值
    public static double random()          返回值为double的正值,[0.0,1.0]
 **/
public class MyMath {
    public static void main(String[] args) {
//        public static int abs(int a)	      返回参数绝对值
//        public static double ceil(double a)    向上取整
//        public static double floor(double a)   向下取整
//        public static int round(float a)	   四舍五入
//        public static int max(int a,int b)     返回两个int值中的较大值
//        public static int min(int a,int b)     返回两个int值中的较小值
//        public static double pow(double a,double b) 返回a的b次幂的值
//        public static double random()          返回值为double的正值,[0.0,1.0]
        int[] arr = {1,3,2,4,11,43,31,22};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max,arr[i]);
        }
        System.out.println(max);
    }
}
