package com.shiju.homework.test2;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author shiju
 * @date 2021/04/13 18:51
 *
 * test3.元注解 有 哪三个?   这三个元注解是不是 程序员自己定义的?  关于 @Retention 元注解有几个值,  各自表示 什么意思?
 * @Target ,@Retention ,@Intention
 * 这三个元注解是由JDK官方提供的,不是由程序员自己定义的.
 * RetentionPolicy.SOURCE----注解只保留在源代码级别,编译时会被忽略
 * RetentionPolicy.CLASS-----注解只会保留在编译级别,存在Class文件中,当Class文件被加载到Jvm时会被忽略
 * RetentionPolicy.RUNTIME-----注解会被保留在JVM中,运行时会被读取使用
 **/

public class ConnectionTest {
    public static void main(String[] args) throws Exception {
        //1.获取字节码文件对象
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");
        Properties prop = new Properties();
        prop.load(is);
        //2.获取字节码对象
        Class clazz = Class.forName(prop.getProperty("className"));
        Method method = clazz.getMethod(prop.getProperty("methodName"));
        //3.判断方法上是否有注解
        boolean flag = method.isAnnotationPresent(MysqlInfo.class);
        //4.如果有注解
        if(flag){
            //获取注解信息
            MysqlInfo annotation1 = method.getAnnotation(MysqlInfo.class);
            //获取注解属性值
            String s = annotation1.driverClass();
            String url = annotation1.url();
            String username = annotation1.username();
            String password = annotation1.password();
            //执行方法
            method.invoke(null);
        }
    }
}
