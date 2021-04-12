package com.shiju.classloader;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author shiju
 * @date 2021/04/10 10:44
 **/
public class ClassLoaderDemo {
    public static void main(String[] args) throws IOException {
        //获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        //利用加载器去加载一个指定的文件
        //参数:文件路径
        //返回值:字节流
        InputStream is = systemClassLoader.getResourceAsStream("prop.properties");
        Properties prop = new Properties();
        prop.load(is);

        System.out.println(prop.get("name"));
        System.out.println(prop.get("age"));

        System.out.println(prop);
        is.close();
    }
}
