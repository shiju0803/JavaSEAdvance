package com.shiju.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * toList和toSet方法演示
 * @author shiju
 * @date 2021/04/02 15:11
 **/
public class StreamDemo04 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(List.of(1,4,2,5,8,3,9,6,7,10,10,10,10,10));

        //filter负责过滤数据的.
        //collect负责收集数据.
        //获取流中剩余的数据,但是他不负责创建容器,也不负责把数据添加到容器中.
        //Collectors.toList() : 在底层会创建一个List集合.并把所有的数据添加到List集合中.
        List<Integer> list = list1.stream().filter(number -> number % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(list);

        Set<Integer> set = list1.stream().filter(number -> number % 2 == 0)
                .collect(Collectors.toSet());
        System.out.println(set);
    }
}
