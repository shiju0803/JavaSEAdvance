package com.shiju.homework;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Properties;

/**
 * 1)写一个配置文件config.properties，记录要执行的类名和方法名
 * 2)通过修改配置文件，利用反射执行创建任意类的任意方法。
 *
 * @author shiju
 * @date 2021/04/12 21:13
 **/
public class ReflectByProp {
    public static void main(String[] args) throws Exception {
        //1.获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        //2.将配置文件加载到内存中
        InputStream is = systemClassLoader.getResourceAsStream("config.properties");
        //3.读取数据
        Properties prop = new Properties();
        prop.load(is);
        //4.获取方法名和全类名
        String className = prop.get("className").toString();
        String methodName = prop.get("methodName").toString();

        //5.获取class对象和成员方法对象
        Class clazz = Class.forName(className);
        //6.创建对象,调用方法
        Object o = clazz.newInstance();
        Method method = clazz.getMethod(methodName);
        //7.调用方法
        method.invoke(o);
    }
}
