package com.shiju.properties;

import com.shiju.objectoutputstream.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Properties;

/**
 * @author shiju
 * @date 2021/04/05 18:37
 **/
public class PropertiesDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Properties prop = new Properties();

        prop.setProperty("itheima001","佟丽娅");
        prop.setProperty("itheima002","赵丽颖");
        prop.setProperty("itheima003","刘诗诗");

        //void store(Writer writer, String comments)：
        FileWriter fw = new FileWriter("E:\\fw.txt");
        prop.store(fw,null);
        fw.close();
    }
}
