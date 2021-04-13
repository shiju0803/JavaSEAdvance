package com.shiju.homework.test7;

import com.shiju.homework.test2.MysqlInfo;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.lang.reflect.Method;

/**
 * @author shiju
 * @date 2021/04/13 19:54
 **/
public class ConnTest {
    public static void main(String[] args) throws Exception {
        //1.解析器对象
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(new File("day18_AnnotateAndJunit/src/jdbc.xml"));
        //2.获取根节点
        Element rootElement = document.getRootElement();
        //3.获取根节点下的元素
        String className = rootElement.element("className").getText();
        String methodName = rootElement.element("methodName").getText();

        //2.获取字节码对象
        Class clazz = Class.forName(className);
        Method method = clazz.getMethod(methodName);
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
