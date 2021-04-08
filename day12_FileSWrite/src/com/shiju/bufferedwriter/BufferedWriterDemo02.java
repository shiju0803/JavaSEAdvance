package com.shiju.bufferedwriter;

import java.io.*;
import java.util.Arrays;

/**
 * 读取文件内容并排序,将排序后的内容重新写入另外一个文件
 * @author shiju
 * @date 2021/04/05 14:40
 **/
public class BufferedWriterDemo02 {
    public static void main(String[] args) throws IOException {
        //创建字符读取流对象
        BufferedReader br = new BufferedReader(new FileReader("D:\\b.txt"));
        //读取数据
        String s = br.readLine();
        //将读出来的字符串切割为字符数组
        String[] strArr = s.split(" ");
        int[] arr = new int[strArr.length];
        //将字符串数组转换成int型数组
        for (int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }
        //对数组元素进行排序
        Arrays.sort(arr);
        //创建字符写入流
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\c.txt"));
        //遍历数组,写入数据
        for (int i : arr) {
            bw.write(i + " ");
        }
        //释放资源
        br.close();
        bw.close();
    }
}
