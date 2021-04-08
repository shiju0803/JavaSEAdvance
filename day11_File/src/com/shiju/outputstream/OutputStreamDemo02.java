package com.shiju.outputstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author shiju
 * @date 2021/04/03 14:17
 **/
public class OutputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        //创建字节流输入对象
        //文件存在时不报错,文件不存在会报错
        InputStream fs = new FileInputStream("day11_File\\a.txt");
        //读取文件内容,每次只能读取一个字节
        //返回值是读取字节的码表值
        int b;
        //读取,赋值,判断
        while ((b = fs.read()) != -1){
            System.out.print((char) b);
        }
        //释放资源
        fs.close();
    }
}
