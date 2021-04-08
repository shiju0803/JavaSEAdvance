package com.shiju.work;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 	请使用ConcurrentHashMap定义一个线程安全的Map，使用两个线程访问它：
 * 	第一个线程：向集合中添加键、值都是：1--10000的数字；
 * 	第二个线程：向集合中添加键、值都是：10001--20000的数字；
 * 	确保两个线程全部操作集合完毕，然后打印集合的每个元素，测试其准确性。
 * @author shiju
 * @date 2021/04/07 20:36
 **/
public class ConcurrentHashMapTest {
    public static void main(String[] args) {
        //使用ConcurrentHashMap定义一个线程安全的Map
        ConcurrentHashMap<Integer,Integer> map = new ConcurrentHashMap<>();

        for (int i = 1; i <= 10000; i++) {
            int j = i;
            new Thread(() -> map.put(j,j)).start();
        }
        for (int i = 10001; i <= 20000; i++) {
            int j = i;
                new Thread(() -> map.put(j,j)).start();
        }
        for (int i = 1; i < map.size(); i++) {
            System.out.println(i + "=" + map.get(i));
        }
    }
}
