package com.shiju.homework;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * 在D盘下有一个文本文件test.txt(里面的内容由数字和字母组成)
 * 定义一个方法统计test.txt文件中’a’字符出现的次数。
 * 比如a字符在文件中出现了10次则调用方法传入a后，方法内部输出：a出现10次
 * @author shiju
 * @date 2021/04/05 08:25
 **/
public class OutputStreamTest07 {
    public static  void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("D:\\test.txt");
        Map<Character,Integer> map = new HashMap<>();
        countChar(is, map);
        for (Character c : map.keySet()) {
            System.out.println(c + "出现" + map.get(c) + "次");
        }
    }

    private static void countChar(InputStream is, Map<Character, Integer> map) throws IOException {
        byte[] bytes = new byte[1024];
        int len;
        while ((len = is.read(bytes)) != -1){
            for (int i = 0; i < len; i++) {
                if(map.containsKey((char)bytes[i])){
                    int count = map.get((char)bytes[i]);
                    count++;
                    map.put((char) bytes[i],count);
                }else {
                    map.put((char)bytes[i],1);
                }
            }
        }
    }
}
