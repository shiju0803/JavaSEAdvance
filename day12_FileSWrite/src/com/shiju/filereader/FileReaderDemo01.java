package com.shiju.filereader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

/**
 * @author shiju
 * @date 2021/04/05 11:25
 **/
public class FileReaderDemo01 {
    public static void main(String[] args) throws IOException {
        //创建字符流写入对象
        Writer writer = new FileWriter("D:\\a.txt");
        //创建键盘输入对象
        Scanner sc = new Scanner(System.in);
        //键盘输入数据
        System.out.println("请输入用户名");
        String name = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();
        //写入数据
        writer.write(name + System.lineSeparator());
        writer.write(password + System.lineSeparator());
        //刷新流
        writer.flush();
        //释放资源
        writer.close();
    }
}
