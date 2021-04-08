package com.shiju.work;

import java.io.*;

/**
 * 写4个方法,分别用普通字节流,高效字节流,一次复制一个字节,一次复制一个字节数组复制同一个视频文件测试所耗的毫秒值...
 * @author shiju
 * @date 2021/04/05 19:31
 **/
public class CopyFile {
    public static void main(String[] args) throws IOException {
        //普通字节流.一次复制一字节
        method1();
        //普通字节流.一次复制一个字节数组
        method2();
        //字节缓冲流,一次复制一个字节
        method3();
        //字节缓冲流,一次复制一个字节数组
        method4();
    }

    private static void method4() throws IOException {
        //创建输入输出缓冲流对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\嘿嘿嘿.avi"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("F:\\嘿嘿嘿.avi"));
        long start = System.currentTimeMillis();
        //循环读取写入数据,一次读写一个字节
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1){
            bos.write(bytes,0,len);
        }
        //释放资源
        bis.close();
        bos.close();
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("方法4,共耗时" + time + "ms");
    }

    private static void method3() throws IOException {
        //创建输入输出缓冲流对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\嘿嘿嘿.avi"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("F:\\嘿嘿嘿.avi"));
        long start = System.currentTimeMillis();
        //循环读取写入数据,一次读写一个字节
        int b;
        while ((b = bis.read()) != -1){
            bos.write(b);
        }
        //释放资源
        bis.close();
        bos.close();
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("方法3,共耗时" + time + "ms");
    }

    private static void method2() throws IOException {
        //创建输入输出流对象
        InputStream is = new FileInputStream("E:\\嘿嘿嘿.avi");
        OutputStream os = new FileOutputStream("F:\\嘿嘿嘿.avi");
        long start = System.currentTimeMillis();
        //循环读取写入数据,一次读写一个字节
        byte[] bytes = new byte[1024];
        int len;
        while ((len = is.read(bytes)) != -1){
            os.write(bytes,0,len);
        }
        //释放资源
        is.close();
        os.close();
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("方法2,共耗时" + time + "ms");
    }

    private static void method1() throws IOException {
        //创建输入输出流对象
        InputStream is = new FileInputStream("E:\\嘿嘿嘿.avi");
        OutputStream os = new FileOutputStream("F:\\嘿嘿嘿.avi");
        long start = System.currentTimeMillis();
        //循环读取写入数据,一次读写一个字节
        int b;
        while ((b = is.read()) != -1){
            os.write(b);
        }
        //释放资源
        is.close();
        os.close();
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("方法1,共耗时" + time + "ms");
    }
}
