package com.shiju.work;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

/**
 * 从控制台循环接收用户录入的学生信息，输入格式为：学号-学生名字
 * 将学生信息保存到D盘下面的stu.txt文件中，一个学生信息占据一行数据。
 * 当用户输入end时停止输入。
 * @author shiju
 * @date 2021/04/05 08:55
 **/
public class OutputStreamTest08 {
    public static void main(String[] args) throws IOException {
        //创建输出流对象,并开启追加
        OutputStream os = new FileOutputStream("D:\\stu.txt");
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入学生信息(学号-学生姓名),输入'end'结束:");
            String s = sc.nextLine();
            if(s.equals("end")){
                break;
            }else {
                os.write(s.getBytes());
                os.write(System.lineSeparator().getBytes());
            }
        }
    }
}
