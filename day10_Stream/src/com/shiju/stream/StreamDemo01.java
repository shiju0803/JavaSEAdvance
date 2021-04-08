package com.shiju.stream;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Stream;

/**
 * @author shiju
 * @date 2021/04/02 11:29
 **/
public class StreamDemo01 {
    public static void main(String[] args) {
        //单列集合
        // 可以使用Collection接口中的默认方法stream()生成流
        // default Stream<E> stream()
       /* ArrayList<String> list = new ArrayList<>(List.of("黄桂田","沙雕","2333333"));
        Stream<String> stream = list.stream();
        stream.forEach(s -> System.out.println(s));
        //双列集合
        //  间接的生成流
        // 可以通过KeySet或者enterSet获取一个Set集合,再获取Stream流
        HashMap<Integer, String> map = new HashMap<>(Map.of(001,"黄大傻",002,"23333"));
        Stream<Integer> key = map.keySet().stream();
        Stream<String>  value = map.values().stream();
        Stream<Map.Entry<Integer,String>> entryStream = map.entrySet().stream();
        entryStream.forEach(e -> System.out.println(e));*/
        //数组
        //Arrays中的静态方法stream生成流
        //同种数据类型的多个数据
        int[] arr = {1,2,3,4,5,6};
        Arrays.stream(arr).forEach(s -> System.out.println(s));
    }
}
