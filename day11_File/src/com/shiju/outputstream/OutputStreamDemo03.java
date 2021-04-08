package com.shiju.outputstream;

import java.io.*;

/**
 * @author shiju
 * @date 2021/04/03 14:39
 **/
public class OutputStreamDemo03 {
    public static void main(String[] args) throws IOException {
        //创建输入输出流对象
        InputStream is = new FileInputStream("F:\\学习资料\\01_java语言基础\\1-1-Java基础语法\\第1节 java运行环境\\1_1_1_05_命令提示符_常用命令.flv");
        OutputStream os = new FileOutputStream("day11_File\\1_1_1_05_命令提示符_常用命令.avi");
        //一次读取一个字节,太慢了
        //method1(is, os);
        byte[] arr = new byte[102400];
        int len;
        while ((len = is.read(arr)) != -1) {
            os.write(arr, 0, len);
        }
        is.close();
        os.close();
    }

    private static void method1(InputStream is, OutputStream os) throws IOException {
        int b;
        //循环读取文件并输出到指定路径
        while ((b = is.read()) != -1) {
            os.write(b);
        }
        is.close();
        os.close();
    }
}
