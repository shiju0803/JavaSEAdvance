package com.shiju.file;

import java.io.*;

/**
 * @author shiju
 * @date 2021/04/02 16:36
 **/
public class FileDemo {
    public static void main(String[] args) throws IOException {
        /*//File(String pathname) 通过将给定的路径字符串创建新的File实例
        String path = "E:\\shiju\\a.txt";
        File f1 = new File(path);
        //File(String parent,String child) 从父路径名和子路径名字符串创建新的File实例
        File f2 = new File("E:\\shiju","a.txt");
        //File(File parent, String child): 从父抽象路径名和子路径名字符串创建新的 File实例*/
        File f3 = new File("E:\\东京不太热.avi");
        File f4 = new File("java.txt");
        f3.createNewFile();
        System.out.println(f4.getAbsolutePath());
    }
}
