package com.shiju.objectoutputstream;

import java.io.*;

/**
 * @author shiju
 * @date 2021/04/05 16:32
 **/
public class ConvertedDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //写对象--->序列化
        method1();

        //读对象---->反序列化
        method2();
    }

    private static void method2() throws IOException, ClassNotFoundException {
        //创建读取对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day12_FileSWrite\\oos.txt"));
        //读取对象信息并强转成学生对象
        Student s  = (Student)ois.readObject();
        //打印学生对象信息
        System.out.println(s.toString());
        //释放资源
        ois.close();
    }

    private static void method1() throws IOException {
        //创建一个写入指定的OutputStream的ObjectOutputStream的ObjectOutputStream
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day12_FileSWrite\\oos.txt"));
        //创建对象
        Student s = new Student("黄桂田",23);
        //将指定的对象写入ObjectOutputStream
        oos.writeObject(s);
        //释放资源
        oos.close();
    }
}
