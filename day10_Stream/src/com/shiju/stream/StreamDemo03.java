package com.shiju.stream;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shiju
 * @date 2021/04/02 14:47
 **/
public class StreamDemo03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of(
                 "吴邪", "张起灵", "张海客","王胖子", "阿宁", "吴三省", "吴二白", "黑瞎子"));
        //获取第一个姓张的
        list.stream().filter(s -> s.startsWith("张")).limit(1).forEach(s -> System.out.println(s));
        //统计姓张的和姓吴的人数
        long a = list.stream().filter(s -> s.startsWith("张")).count();
        System.out.println("姓张的有:" + a + "个");
    }
}
