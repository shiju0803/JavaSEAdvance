package com.shiju.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author shiju
 * @date 2021/03/31 15:33
 **/
public class MapDemo {
    public static void main(String[] args) {
        //创建集合对象
        HashMap<String,String> map = new HashMap<>();

        //V put(K key,V value)将指定的值与该映射中指定建相关联
        map.put("001","黄桂田");
        map.put("002","大黄狗");
        map.put("003","大傻逼");
        map.put("004","汪汪汪");
        System.out.println(map);
        //遍历方式一
        for (String s : map.keySet()) {
            System.out.println(s + "=" + map.get(s));
        }
        System.out.println("-----------------------");
        //遍历方式二
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }

    }
}
