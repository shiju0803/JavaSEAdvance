package com.shiju.bufferedwriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author shiju
 * @date 2021/04/05 14:23
 **/
public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {
        //创建字符缓冲输出流
        BufferedReader bw = new BufferedReader(new FileReader("D:\\a.txt"));
        //读取数据
        String str = "";
        while ((str = bw.readLine()) != null){
            System.out.println(str);
        }
    }
}
