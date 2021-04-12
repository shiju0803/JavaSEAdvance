package com.shiju.homework;

import com.shiju.reflect.Student;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 能够通过反射去获得 构造函数, 并且 造对象出来.
 * @author shiju
 * @date 2021/04/10 19:02
 **/
public class GetConstructorTest {
    public static void main(String[] args) throws Exception {
        //获取class对象
        Class clazz = Class.forName("com.shiju.reflect.Student");
        Student s = (Student)clazz.getConstructor(String.class,int.class).newInstance("黄桂田",23);
        //System.out.println(s.toString());

        //获取Field
        Field name = clazz.getDeclaredField("name");
        Field age = clazz.getDeclaredField("age");
        //取消临时检查
        name.setAccessible(true);
        age.setAccessible(true);
        //创建学生对象
        Student stu = (Student)clazz.newInstance();
        //设置值,获取值
        name.set(stu,"阿黄");
        //System.out.println(name.get(stu));

        //获取方法
        Method method = clazz.getMethod("function", int.class, int.class);
        System.out.println(method.invoke(stu, 12, 23));
    }
}
