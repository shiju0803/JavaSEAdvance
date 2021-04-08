package com.shiju.work;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 利用字节输出流一次写一个字节数组的方式向D盘的b.txt文件输出内容:"i love java"。
 * @author shiju
 * @date 2021/04/04 23:10
 **/
public class OutputStreamTest02 {
    public static void main(String[] args) throws IOException {
        //定义数组存储数据
        byte[] bt = {'i',' ','l','o','v','e',' ','j','a','v','a'};
        //创建输出流对象
        OutputStream os = new FileOutputStream("D:\\b.txt");
        //写数据
        os.write(bt,0,bt.length);
        //释放资源
        os.close();
    }
}
