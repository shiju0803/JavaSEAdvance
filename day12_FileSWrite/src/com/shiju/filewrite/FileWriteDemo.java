package com.shiju.filewrite;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @author shiju
 * @date 2021/04/05 10:27
 **/
public class FileWriteDemo {
    public static void main(String[] args) throws IOException {
        Writer fw = new FileWriter("day12_FileSWrite\\a.txt");
        //写入一个字符
        fw.write('A');
        fw.write(System.lineSeparator());
        //写入字符数组
        char[] chars = {'中','国','C','h','i','n','a'};
        fw.write(chars,0,chars.length);
        fw.write(System.lineSeparator());
        //写入字符串
        fw.write("黄桂田是傻傻");

        //释放资源
        fw.close();
    }
}
