package com.shiju.work;

import java.util.HashMap;
import java.util.Map;

/**
 * 七、有2个数组，第一个数组内容为：[黑龙江省,浙江省,江西省,广东省,福建省]，
 * 第二个数组为：[哈尔滨,杭州,南昌,广州,福州]，
 * 将第一个数组元素作为key，
 * 第二个数组元素作为value存储到Map集合中。
 * 如{黑龙江省=哈尔滨, 浙江省=杭州, …}。
 * @author shiju
 * @date 2021/04/01 22:17
 **/
public class ArrayToMap {
    public static void main(String[] args) {
        //定义两个个数组存入数据
        String[] key = {"黑龙江省","浙江省","江西省","广东省","福建省"};
        String[] value = {"哈尔滨","杭州","南昌","广州","福州"};
        //定义一个Map
        Map<String,String> map = new HashMap<>();
        //遍历数组将元素存入map
        for (int i = 0; i < key.length; i++) {
            map.put(key[i],value[i]);
        }
        System.out.println(map);
    }
}
