package com.shiju.work;

import java.io.*;

/**
 * 使用转换流(InputStreamReader,OutputStreamWriter)复制文本文件,一次一个字符,一个一个字符数组分别实现
 * @author shiju
 * @date 2021/04/05 19:56
 **/
public class InputStreamReaderTest {
    public static void main(String[] args) throws IOException {
        //一次复制一个字节
        method1();
        //一次复制一个字符数组
        method2();
    }

    private static void method2() throws IOException {
        //创建转换流对象
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\a.txt"), "UTF-8");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\b.txt"), "UTF-8");
        char[] chars = new char[1024];
        int len;
        while ((len = isr.read(chars)) != -1){
            osw.write(chars,0,len);
        }
        isr.close();
        osw.close();
    }

    private static void method1() throws IOException {
        //创建转换流对象
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\a.txt"), "UTF-8");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\b.txt"), "UTF-8");
        int ch;
        while ((ch = isr.read()) != -1){
            osw.write((char)ch);
        }
        isr.close();
        osw.close();
    }
}
