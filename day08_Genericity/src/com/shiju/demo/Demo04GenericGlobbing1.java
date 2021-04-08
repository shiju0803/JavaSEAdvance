package com.shiju.demo;

import java.util.ArrayList;

public class Demo04GenericGlobbing1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Number> list2 = new ArrayList<>();
        ArrayList<Object> list3 = new ArrayList<>();
        printList1(list1);
        printList1(list2);
    }
    /**
    * @Author 时距 2021/3/29 16:59
    * @Param [list] @Return void
    * @Description:
    */
    private static void printList1(ArrayList<? extends Number> list) { }
    private static void printList2(ArrayList<? super Number> list) { }
    private static void printList3(ArrayList<?> list) { }
}
