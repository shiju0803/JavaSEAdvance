package com.shiju.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author shiju
 * @date 2021/03/31 18:17
 **/
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Student,String> map = new HashMap<>();
        Student s1 = new Student("黄桂田",21);
        Student s2 = new Student("黄小美",19);
        Student s3 = new Student("黄修修",23);
        Student s4 = new Student("黄修修",23);
        map.put(s1,"北京");
        map.put(s2,"河南");
        map.put(s3,"天津");
        map.put(s4,"湖北");
        //方法一
        for (Student key : map.keySet()) {
            System.out.println(key + "****" + map.get(key));
        }
        System.out.println("*************************************");
        //方法二
        Set<Map.Entry<Student, String>> entries = map.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "_____" + value);
        }
        System.out.println("*************************************");
        //方法三
        map.forEach((Student key, String value) ->{
            System.out.println(key + "-----" + value);
        });
    }
}
