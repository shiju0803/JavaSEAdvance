package com.shiju.homework;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 利用字节输出流一次写一个字节的方式，向D盘的a.txt文件输出字符‘a’。
 * @author shiju
 * @date 2021/04/04 23:06
 **/
public class OutputStreamTest {
    public static void main(String[] args) throws IOException {
       OutputStream os = new FileOutputStream("D:\\a.txt");
       os.write('a');
       os.close();
    }
}
