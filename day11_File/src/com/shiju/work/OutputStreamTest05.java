package com.shiju.work;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/**
 * 利用字节输入流读取D盘文件b.txt的内容，文件内容确定都为纯ASCII字符
 * ,使用循环读取，一次读取一个字节数组，直到读取到文件末尾，将读取到的字节数组转换成字符串输出到控制台。
 * @author shiju
 * @date 2021/04/04 23:38
 **/
public class OutputStreamTest05 {
    public static void main(String[] args) throws IOException {
        //创建输入流对象
        InputStream is = new FileInputStream("D:\\b.txt");
        //循环读取字符
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        for (int i = 0; i < len; i++) {
            System.out.println(bytes[i]);
        }
        //释放资源
        is.close();
    }
}
