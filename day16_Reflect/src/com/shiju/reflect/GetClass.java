package com.shiju.reflect;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 获取class对象的三种方式
 *
 * @author shiju
 * @date 2021/04/10 11:29
 **/
public class GetClass {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        InputStream is = classLoader.getResourceAsStream("prop.properties");
        Properties props = new Properties();
        props.load(is);
        String className = props.getProperty("className");

        //1.Class类中的静态方法forName("全类名")
        //全类名:包名+类名
        Class clazz = Class.forName(className);
        System.out.println(clazz);

        //2.通过class属性来获取
        Class clazz2 = Student.class;
        System.out.println(clazz2);

        //3.利用对象的getClass方法来获取class对象
        //getClass方法是定义在Object类中
        Student s = new Student();
        Class clazz3 = s.getClass();
        System.out.println(clazz3);
    }
}
