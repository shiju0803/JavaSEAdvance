package com.shiju.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author shiju
 * @date 2021/04/03 10:54
 **/
public class OutputStreamDemo {
    public static void main(String[] args) throws IOException {
        //创建字节输出流的对象
        OutputStream fos = new FileOutputStream("day11_File\\a.txt");
        //写数据
        //fos.write(98);
        //fos.write(9);
        byte[] bt = {65,66,67,68};
        //fos.write(bt);
        fos.write(bt,1,2);
        //释放资源
        fos.close();
    }
}
