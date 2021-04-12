package com.shiju.homework;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 利用字节输入流读取D盘文件a.txt的内容，文件内容确定都为纯ASCII字符
 * ,使用循环读取，一次读取一个字节，直到读取到文件末尾。将读取的字节输出到控制台
 * @author shiju
 * @date 2021/04/04 23:35
 **/
public class OutputStreamTest04 {
    public static void main(String[] args) throws IOException {
        //创建输入流对象
        InputStream is = new FileInputStream("D:\\a.txt");
        //循环读取字符
        int b;
        while ((b = is.read()) != -1){
            //打印字符
            System.out.println(b);
        }
        //释放资源
        is.close();
    }
}
