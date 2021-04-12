package com.shiju.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author shiju
 * @date 2021/03/31 21:39
 **/
public class MapTest {
    public static void main(String[] args) {
     /*   Map<String,Integer> map = new HashMap<>();
        map.put("张三",23);
        map.put("李四",12);
        map.put("赵六",52);
        //增强for
        for (Integer value : map.values()) {
            System.out.println(value);
        }
        System.out.println("--------");
        //迭代器
        Iterator<Integer> it = map.values().iterator();
        while (it.hasNext()){
            Integer i = it.next();
            System.out.println(i);
        }*/
        Map<Car,String> map = new HashMap<>();
        Car c1 = new Car("BMW");
        Car c2 = new Car("AAA");
        map.put(c1,"22222");
        map.put(c2,"33333");
        Set<Car> keys = map.keySet();
        for (Car key : keys) {
            System.out.println(key + "***" + map.get(key));
        }
        System.out.println("------------------");
        Set<Map.Entry<Car, String>> entries = map.entrySet();
        for (Map.Entry<Car, String> entry : entries) {
            System.out.println(entry.getKey() + "***" + entry.getValue());
        }

    }
}
class Car{
    private String name;

    public Car() {
    }

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}