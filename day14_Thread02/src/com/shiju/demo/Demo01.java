package com.shiju.demo;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author shiju
 * @date 2021/04/07 18:15
 **/
public class Demo01 {
    public static void main(String[] args) throws InterruptedException {
        //非线程安全,效率高
        HashMap<Integer, Integer> map = new HashMap<>();
        //线程安全,效率低(不推荐)
        //Hashtable<Integer, Integer> map = new Hashtable<>();
        //线程安全,效率高(推荐)
        //ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<>();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5001; i++) {
                map.put(i ,i);
            }
        });

        Thread t2 = new Thread(() ->{
            for (int i = 0; i < 5001; i++) {
                map.put(i,i);
            }
        });
        t1.start();
        //Thread.sleep(1000);
        t2.start();
        for(int i = 0;i < 5001;i++){
            System.out.println(map.get(i));
        }
    }
}
