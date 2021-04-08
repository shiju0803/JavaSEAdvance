package com.shiju.filereader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/**
 * @author shiju
 * @date 2021/04/05 11:14
 **/
public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        //创建数据读取对象
        Reader r = new FileReader("day12_FileSWrite\\a.txt");
        //一次读一个字符数组
        char[] chars = new char[1024];
        int len;
        while ((len = r.read(chars)) != -1){
            System.out.print(new String(chars,0,len));
        }
        //释放资源
        r.close();
    }
}
