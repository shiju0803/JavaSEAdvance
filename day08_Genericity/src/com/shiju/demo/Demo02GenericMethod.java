package com.shiju.demo;

import java.util.ArrayList;

/**
 * @Author 时距
 * @PackageName:com.shiju.demo
 * @ClassName : Demo01GenericMethod
 * @Date 2021/3/29 16:05
 * @Description:自定义泛型方法
 * 定义一个泛型方法,传递一个集合和四个元素,将元素添加到集合中并返回
 */
public class Demo02GenericMethod {
    public static void main(String[] args) {
        ArrayList<String> list = addElement(new ArrayList<>(),"哈哈","黄","桂","田");;
        System.out.println(list);
        ArrayList<Integer> list2 = addElement(new ArrayList<>(),1,2,3,4);;
        System.out.println(list2);
    }
    /**
    * @Param [list, t1, t2, t3, t4]
    * @Description:
    * @Author 时距 2021/3/30 11:38
    * @Return java.util.ArrayList<T>        
    */
    public static <T> ArrayList<T> addElement(ArrayList<T> list,T t1,T t2,T t3,T t4){
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);
        return list;
    }
}
