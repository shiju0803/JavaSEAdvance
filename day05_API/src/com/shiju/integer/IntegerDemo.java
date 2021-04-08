package com.shiju.integer;

/*
 * @Author 时距
 * @PackageName:com.shiju
 * @ClassName : integer
 * @Date 2021/3/26 11:12
 * @Description:
 **/
public class IntegerDemo {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(20);
        Integer i2 = Integer.valueOf("20");
        System.out.println(i1 + "  " + i2);


        String str = "1314";
        System.out.println(Integer.parseInt(str));
        System.out.println(Integer.valueOf(str));
    }
}
