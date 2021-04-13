package com.shiju.homework;

import com.shiju.domain.Ultraman;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.lang.reflect.Method;

/**
 * 自己编写一个 xml 文件, 里面 通过自定义的标签 来指向 某个类的 全限定类名,然后 去 使用反射 造出对象, 调用方法.
 * @author shiju
 * @date 2021/04/12 19:39
 **/
public class ReflectByXml {
    public static void main(String[] args) throws Exception {
        //1.创建一个解析器对象
        SAXReader saxReader = new SAXReader();
        //2.用解析器对象将xml加载到内存中,并返回一个文档对象
        Document document = saxReader.read(new File("E:\\IdeaProjects\\JavaSEAdvance\\day17_XML\\src\\xml\\prop.xml"));
        //3.获取根节点
        Element rootElement = document.getRootElement();
        //4.获取子节点
        String className = rootElement.element("className").getText();
        String methodName = rootElement.element("methodName").getText();
        //5.获取class对象
        Class clazz = Class.forName(className);
        //6.通过class对象获取方法对象
        Method method = clazz.getMethod(methodName);
        //7.创建对象
        Ultraman ultraman = (Ultraman) clazz.newInstance();
        //8.调用方法
        method.invoke(ultraman);
    }
}
