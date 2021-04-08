package com.shiju.work;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 已知数组arr1中有如下元素{郭靖，杨康}，arr2中有如下元素{黄蓉，穆念慈}，
 * 使用Stream将二者合并到List集合
 * @author shiju
 * @date 2021/04/02 20:21
 **/
public class ConcatAndToListTest {
    public static void main(String[] args) {
        String[] arr1 = {"郭靖","杨康"};
        String[] arr2 = {"黄蓉","穆念慈"};
        //使用Stream将二者合并到List集合
        List<String> list = Stream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).collect(Collectors.toList());
        System.out.println(list);
    }

}
