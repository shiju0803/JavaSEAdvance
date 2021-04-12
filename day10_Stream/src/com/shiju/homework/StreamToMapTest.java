package com.shiju.homework;

import java.util.stream.Stream;

/**
 * 有如下整数1，-2，-3，4，-5
 * 使用Stream取元素绝对值并打印
 * @author shiju
 * @date 2021/04/02 20:17
 **/
public class StreamToMapTest {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, -2, -3, 4, -5);
        stream.map(i -> Math.abs(i)).forEach(i -> System.out.println(i));
    }
}
