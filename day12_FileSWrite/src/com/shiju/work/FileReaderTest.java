package com.shiju.work;

import java.io.*;

/**
 * 使用字符的便捷流(FileReader,FileWriter)复制文本文件,一次一个字符,一个一个字符数组分别实现
 * @author shiju
 * @date 2021/04/05 20:13
 **/
public class FileReaderTest {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\c.txt");
        FileWriter fw = new FileWriter("D:\\a.txt");
        //复制文本文件,一次一个字符
        copyByChar(fr, fw);
        //复制文本文件,一个一个字符数组分别实现
        //copyByChars(fr, fw);
    }

    private static void copyByChars(FileReader fr, FileWriter fw) throws IOException {
        char[] chars = new char[1024];
        int len;
        while ((len = fr.read(chars)) != -1){
            fw.write(chars,0,len);
        }
        fr.close();
        fw.close();
    }

    private static void copyByChar(FileReader fr, FileWriter fw) throws IOException {
        int b;
        while ((b = fr.read()) != -1){
            fw.write(b);
        }
        fr.close();
        fw.close();
    }
}
