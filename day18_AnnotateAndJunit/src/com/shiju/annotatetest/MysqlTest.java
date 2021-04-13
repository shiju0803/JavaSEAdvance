package com.shiju.annotatetest;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author shiju
 * @date 2021/04/13 11:56
 **/
public class MysqlTest {
    public static void main(String[] args) throws Exception {
        //1.获取字节码文件对象
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");
        Properties prop = new Properties();
        prop.load(is);

        //2.获取字节码文件对象
        Class clzz = Class.forName(prop.getProperty("className"));
        //3.获取要执行的方法名
        String methodName = prop.getProperty("methodName");
        //获取method对象
        Method method = clzz.getDeclaredMethod(methodName);
        //4.判断注解是否存在,存在才获取注解信息,才执行方法
        boolean isPresent = method.isAnnotationPresent(JdbcInfo.class);
        if(isPresent){
            // 进来,则说明有注解信息, 获得到了注解 信息, 进一步获得 4 个 属性的值
            JdbcInfo annotation = method.getAnnotation(JdbcInfo.class);
            System.out.println(annotation.driverClass());
            System.out.println(annotation.url());
            System.out.println(annotation.username());
            System.out.println(annotation.password());

            method.invoke(null);
        }
    }
}
