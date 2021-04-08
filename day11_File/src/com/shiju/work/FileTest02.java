package com.shiju.work;

import java.io.File;
import java.io.IOException;

/**
 * 请在D盘下创建一个目录“多级目录”，下面随意创建一些文件和目录。
 * 	请编写main()方法，创建以下File对象：
 * 		File file = new File(“D:\\多级目录”);
 * 	要求：
 * 		1. 获取这个file目录下所有的子文件/子目录的File数组
 * 		2. 遍历这个数组，判断每个File对象是否文件
 * 			如果是文件，打印：【文件】+ 绝对路径
 * 			如果是目录，打印：【目录】+ 绝对路径
 * @author shiju
 * @date 2021/04/02 21:22
 **/
public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\多级目录");
        printPath(file);
    }

    private static void printPath(File file) {
        if(!file.isFile()){
            File[] files = file.listFiles();
            for (File f : files) {
                if(f.isFile()){
                    System.out.println("【文件】+ " + f.getAbsolutePath());
                }else {
                    System.out.println("【目录】+ " + f.getAbsolutePath());
                    printPath(f);
                }
            }
        }else {
            System.out.println("非法的文件路径!");
        }
    }
}
