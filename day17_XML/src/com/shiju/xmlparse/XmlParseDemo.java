package com.shiju.xmlparse;

import com.shiju.domain.Student;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author shiju
 * @date 2021/04/12 11:29
 **/
public class XmlParseDemo {
    /**
     * 利用dom4j解析xml文件
     */
    public static void main(String[] args) throws DocumentException {
        //1.获取一个解析器对象
        SAXReader saxReader = new SAXReader();
        //2.利用解析器把xml文件加载到内存中,并返回一个文档对象
        Document document = saxReader.read(new File("E:\\IdeaProjects\\JavaSEAdvance\\day17_XML\\src\\xml\\myxml.xml"));
        //3.获取到根标签
        Element rootElement = document.getRootElement();
        //4.获取根标签下面的子标签 <student>
        List<Element> list = rootElement.elements("student");

        //用来装学生对象
        List<Student> students = new ArrayList<>();
        //5.遍历集合,得到每一个student标签
        for (Element element : list) {
            //element依次代表每一个student标签
            //获取<student>的id属性的值
            String id = element.attribute("id").getValue();
            //获取<student>的name属性的值
            String name = element.element("name").getText();
            //获取<student>的age属性的值
            String age = element.element("age").getText();
            //获取<student>的province属性的值
            String province = element.element("province").getText();
            //把获取到的id、name和age封装尾Student对象
            Student s = new Student(id,name,Integer.parseInt(age),province);
            //把Student对象添加到集合
            students.add(s);
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
