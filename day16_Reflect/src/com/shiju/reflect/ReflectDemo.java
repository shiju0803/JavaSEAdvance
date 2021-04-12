package com.shiju.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 反射获取对象构造方法,并创建对象
 * @author shiju
 * @date 2021/04/10 14:37
 **/
public class ReflectDemo {
    public static void main(String[] args) throws Exception {
        //T newInstance(Object....initargs):根据指定的构造方法创建对象
        //1.获取Class对象
        Class clazz = Class.forName("com.shiju.reflect.Student");
        //method1(clazz);
        //method2(clazz);
        //method3(clazz);
    }

    private static void method3(Class clazz) throws Exception {
        //直接使用字节码创建对象（默认是按照空参数构造方法创建的对象）
        //已过时
        Object o = clazz.newInstance();
        System.out.println(o);
    }

    private static void method2(Class clazz) throws Exception {
        //2.获取一个私有化构造方法
        Constructor constructor = clazz.getDeclaredConstructor(String.class);
        //3.如果构造方法是私有的，需要调用方法取消权限检查（暴力反射）
        constructor.setAccessible(true);
        //4.利用私有化构造来创建Student对象
        Student s2 = (Student) constructor.newInstance("张三");
    }

    private static void method1(Class clazz) throws Exception {
        //2.获取空参构造方法对象
        Constructor constructor = clazz.getConstructor();

        //3.利用空参构造来创建Student对象
        Student s = (Student) constructor.newInstance();
    }
}
