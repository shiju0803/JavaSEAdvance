package com.shiju.homework;

import com.shiju.domain.Student;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author shiju
 * @date 2021/04/12 18:34
 **/
public class StudentParse {
    public static void main(String[] args) throws DocumentException {
        //1.获取一个解析器对象
        SAXReader saxReader = new SAXReader();
        //2.利用解析器将xml文件加载到内存中,并返回一个文档对象
        Document document = saxReader.read(new File("E:\\IdeaProjects\\JavaSEAdvance\\day17_XML\\src\\xml\\students.xml"));
        //3.利用文档对象获取根节点
        Element rootElement = document.getRootElement();
        //4.获取到根节点下所有的<student>子标签,并返回一个集合
        List<Element> elements = rootElement.elements();
        //定义一个集合用来装student对象
        List<Student> list = new ArrayList<>();
        //5.遍历子标签集合,取出每一个student标签
        for (Element element : elements) {
            //5.1获取student子标签下的id值
            String id = element.attribute("id").getValue();
            //5.2获取student子标签下的name值
            String name = element.element("name").getText();
            //5.3获取student子标签下的age值
            String age = element.element("age").getText();
            //5.4获取student子标签下的province值
            String province = element.element("province").getText();
            //6.将上面获取到的数据封装成Student对象,存入集合中
            Student stu = new Student(id,name,Integer.parseInt(age),province);
            list.add(stu);
        }
        //7.遍历集合,打印数据
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
