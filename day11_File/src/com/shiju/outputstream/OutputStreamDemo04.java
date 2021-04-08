package com.shiju.outputstream;

import java.io.*;

/**
 * @author shiju
 * @date 2021/04/03 15:39
 **/
public class OutputStreamDemo04 {
    public static void main(String[] args) throws IOException {
        //创建一个字节缓冲输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day11_File\\a.txt"));
        //创建一个字节缓冲输入流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day11_File\\b.txt"));
        //method1(bis, bos);
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1){
            bos.write(bytes,0,len);
        }
        bis.close();
        bos.close();
    }

    private static void method1(BufferedInputStream bis, BufferedOutputStream bos) throws IOException {
        //读写数据
        int a;
        while ((a = bis.read()) != -1){
            bos.write(a);
        }
        //释放资源
        bis.close();
        bos.close();
    }
}
