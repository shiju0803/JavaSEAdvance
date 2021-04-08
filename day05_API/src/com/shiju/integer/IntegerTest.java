package com.shiju.integer;

/*
 * @Author 时距
 * @PackageName:com.shiju.integer
 * @ClassName : IntegerTest
 * @Date 2021/3/26 11:48
 * @Description:
 * 需求:有一个字符串:"91 27 46 38 50",把其中的每一个数存到int类型的数组中
 * 思路:
 *      1.定义一个字符串
 *      2.把字符串中的数据存储到一个int类型的数组中
 *      3.遍历数组输出结果
 **/
public class IntegerTest {
    public static void main(String[] args) {
        String str = "91 27 46 38 50";
        String[] s = str.split(" ");
        int[] arr = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i == arr.length - 1){
                System.out.println("]");
            }else {
                System.out.print(", ");
            }
        }
    }
}
