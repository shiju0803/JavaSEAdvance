package com.shiju.homework;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 使用类加载器去 读取 D盘上的 "prop.properties" 配置文件,并且获得 文件中 key 对应的 值
 * @author shiju
 * @date 2021/04/10 18:42
 **/
public class ReadProperties {
    public static void main(String[] args) throws IOException {
        //获取系统类加载器
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        //利用加载器去加载D盘下的配置文件
        InputStream is = classLoader.getResourceAsStream("prop.properties");
        //加载配置文件中的数据
        Properties prop = new Properties();
        prop.load(is);
        System.out.println(prop.get("name"));
        System.out.println(prop.get("password"));
        System.out.println(prop.get("address"));
    }
}
