package com.shiju.homework;

import com.shiju.reflect.Student;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author shiju
 * @date 2021/04/10 19:26
 **/
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        //获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        //用类加载器加载配置文件
        InputStream is = systemClassLoader.getResourceAsStream("prop.properties");
        Properties prop = new Properties();
        prop.load(is);
        //获取全类名
        Object key;
        String className = (String) prop.get("className");
        String fieldName = (String) prop.get("fieldName");
        String methodName = (String) prop.get("methodName");
        //获取class对象
        Class clazz = Class.forName(className);
        //获取方法对象
        Method method1 = clazz.getMethod(methodName,int.class,int.class);
        //获取字段对象
        Field field = clazz.getDeclaredField(fieldName);
        field.setAccessible(true);
        //创建学生对象
        Student s = (Student) clazz.newInstance();
        //调用方法并打印结果
        System.out.println(method1.invoke(s, 1, 2));
        //通过字段设置值,获取值
        field.set(s,"黄桂田");
        String name2 = (String) field.get(s);
        System.out.println(name2);
    }
}
