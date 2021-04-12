package com.shiju.homework;

import java.io.File;

/**
 * 请在D盘根目录下创建一个文件：test1.txt(随意录入一些内容)，再创建一个目录：测试目录
 * 	请编写main()方法，创建以下两个File对象：
 * 		File file1 = new File("d:\\test1.txt");
 *      File file2 = new File("d:\\测试目录");
 * 	要求：
 * 		1. 获取、打印file1和file2的绝对路径；
 * 		2. 获取、打印file1和file2的文件名和目录名；
 * 		3. 获取、打印file1和file2的文件大小；
 * 		4. 分别判断file1和file2是否存在；
 * 		5. 分别判断file1和file2是否是文件？是否是目录？
 * @author shiju
 * @date 2021/04/02 20:58
 **/
public class FileTest {
    public static void main(String[] args) {
        //创建以下两个File对象
        File file1 = new File("d:\\test1.txt");
  		File file2 = new File("d:\\测试目录");
  		//获取、打印file1和file2的绝对路径
        System.out.println("文件file1的绝对路径:" + file1.getAbsolutePath());
        System.out.println("文件file2的绝对路径:" + file2.getAbsolutePath());
        //获取、打印file1和file2的文件名和目录名
        System.out.println("file1文件名:" + file1.getName());
        System.out.println("file2文件名:" +file2.getName());
        //获取、打印file1和file2的文件大小
        System.out.println("file1文件大小:" + file1.length());
        System.out.println("file2文件大小:" + file2.length());
        //分别判断file1和file2是否存在
        if(file1.exists()){
            System.out.println("file1文件存在");
        }else {
            System.out.println("file1文件不存在");
        }
        if(file2.exists()){
            System.out.println("file2文件存在");
        }else{
            System.out.println("file2文件存在");
        }
        //分别判断file1和file2是否是文件？是否是目录？
        if(file1.isFile()){
            System.out.println("file1是文件");
        }else{
            System.out.println("file1是目录");
        }
        if(file2.isFile()){
            System.out.println("file2是文件");
        }else{
            System.out.println("file2是目录");
        }
    }
}
