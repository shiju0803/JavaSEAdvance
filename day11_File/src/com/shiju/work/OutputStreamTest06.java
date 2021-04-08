package com.shiju.work;

import java.io.*;
import java.util.stream.Stream;

/**
 * 利用字节流将E盘下的a.png图片复制到D盘下(文件名保存一致)
 * 要求：
 * 一次读写一个字节的方式
 * @author shiju
 * @date 2021/04/04 23:47
 **/
public class OutputStreamTest06 {
    public static void main(String[] args) throws IOException {
        //创建输入输出流对象
        InputStream is = new FileInputStream("E:\\a.png");
        OutputStream os = new FileOutputStream("D:\\a.png");
        int len;
        while ((len = is.read()) != -1){
            os.write(len);
        }
        //释放资源
        is.close();
        os.close();
    }
}
