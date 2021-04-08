package com.shiju.work;

import java.lang.invoke.VarHandle;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 有如下7个元素黄药师，冯蘅，郭靖，黄蓉，郭芙，郭襄，郭破虏，
 * 使用Stream将以郭字开头的元素存入新数组
 *
 * @author shiju
 * @date 2021/04/02 19:43
 **/
public class FilterTest {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("黄药师", "冯蘅", "郭靖", "黄蓉", "郭芙", "郭襄", "郭破虏");
        List<String> list = stream1.filter(s -> s.startsWith("郭")).collect(Collectors.toList());
        String[] arr = list.toArray(new String[0]);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
