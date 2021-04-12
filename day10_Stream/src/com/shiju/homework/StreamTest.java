package com.shiju.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * 现在有两个 ArrayList 集合存储队伍当中的多个成员姓名，要求使用Stream方式进行以
 * 下若干操作步骤：
 * 1. 第一个队伍只要名字为3个字的成员姓名；
 * 2. 第一个队伍筛选之后只要前6个人；
 * 3. 第二个队伍只要姓张的成员姓名；
 * 4. 第二个队伍筛选之后不要前1个人；
 * 5. 将两个队伍合并为一个队伍；
 * 6. 根据姓名创建Student对象；
 * 7. 打印整个队伍的Student对象信息。
 * 两个队伍（集合）的信息如下：
 * {"陈玄风","梅超风","陆乘风","曲灵风","武眠风","冯默风","罗玉风"}
 * {"宋远桥","俞莲舟","俞岱岩","张松溪","张翠山","殷梨亭","莫声谷"}
 * @author shiju
 * @date 2021/04/02 20:27
 **/
public class StreamTest {
    public static void main(String[] args) {
        List<String> one = new ArrayList<>(List.of("陈玄风","梅超风","陆乘风","曲灵风","武眠风","冯默风","罗玉风"));
        List<String> two = new ArrayList<>(List.of("宋远桥","俞莲舟","俞岱岩","张松溪","张翠山","殷梨亭","莫声谷"));
        //第一个队伍只要名字为3个字的成员姓名,第一个队伍筛选之后只要前6个人
        Stream<String> stream1 = one.stream().filter(s -> s.length() >= 3).limit(6);
        //第二个队伍只要姓张的成员姓名,第二个队伍筛选之后不要前1个人；
        Stream<String> stream2 = two.stream().filter(s -> s.startsWith("张")).skip(1);
        //将两个队伍合并为一个队伍
        Stream.concat(stream1,stream2).map(s -> new Student(s)).forEach(s -> System.out.println(s));

       /* // 第一个队伍只要名字为3个字的成员姓名；
        // 第一个队伍筛选之后只要前6个人；
        Stream<String> streamOne = one.stream().filter(s -> s.length() == 3).limit(6);

        // 第二个队伍只要姓张的成员姓名；
        // 第二个队伍筛选之后不要前1个人；
        Stream<String> streamTwo = two.stream().filter(s -> s.startsWith("张")).skip(1);

        // 将两个队伍合并为一个队伍；
        // 根据姓名创建Student对象；
        // 打印整个队伍的Student对象信息。
        Stream.concat(streamOne,streamTwo).map(name-> new Student(name)).forEach(s-> System.out.println(s));*/

    }
}
