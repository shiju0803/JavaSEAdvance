package com.shiju.homework;

import java.io.*;

/**
 * 使用字符缓冲流(BufferedReader,BufferedWriter)复制文本文件,一次读写一行.
 * @author shiju
 * @date 2021/04/05 20:26
 **/
public class BufferedReaderTest {
    public static void main(String[] args) throws IOException {
        //创建字符缓冲流输入输出对象
        BufferedReader br = new BufferedReader(new FileReader("D:\\c.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\a.txt"));
        String s = "";
        //一次读取一行数据
        while ((s = br.readLine()) != null){
            //一次写入一行数据
            bw.write(s);
            //输入跨平台换行符
            bw.newLine();
        }
        //释放资源
        br.close();
        bw.close();
    }
}
