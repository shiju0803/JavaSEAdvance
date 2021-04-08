package com.shiju.work;

import javax.sound.sampled.Line;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 在D盘下，有一c.txt 文件中内容为：HelloWorld
 * 在c.txt文件原内容基础上，添加五句 I love java，而且要实现一句一行操作(注：原文不可覆盖)。
 * @author shiju
 * @date 2021/04/04 23:16
 **/
public class OutputStreamTest03 {
    public static void main(String[] args) throws IOException {
        //创建输出流对象,并开启追加写入
        OutputStream os = new FileOutputStream("D:\\c.txt",true);
        //循环写入数据
        int i = 0;
        while (i < 5){
            os.write(System.lineSeparator().getBytes());
            os.write("I love java".getBytes());
            i++;
        }
        //释放资源
        os.close();
    }
}
