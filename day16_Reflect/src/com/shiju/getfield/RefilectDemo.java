package com.shiju.getfield;

import com.shiju.reflect.Student;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 反射获取成员变量并使用
 * @author shiju
 * @date 2021/04/10 15:42
 **/
public class RefilectDemo {
    public static void main(String[] args) throws Exception{
        //1.获取class对象
        Class clazz = Class.forName("com.shiju.reflect.Student");
        //getField(clazz);
        //getMethod1(clazz);
        //getMethod2(clazz);
        //getMethod3(clazz);
        //getMethod4(clazz);
        //getMethod5(clazz);
    }

    private static void getMethod5(Class clazz) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        //2.获取method对象
        Method method = clazz.getMethod("function", int.class, int.class);
        Method method1 = clazz.getMethod("getName");
        Method method2 = clazz.getDeclaredMethod("function2", String.class);
        //3.1创建Student对象,当做方法的调用者
        Student s = (Student) clazz.newInstance();
        s.setName("黄狗");
        //3.2运行方法
        Object result = method.invoke(null,12,23);
        Object name = method1.invoke(s);
        method2.setAccessible(true);
        Object value = method2.invoke(null,"阿黄");
        //4.打印结果
        System.out.println(result);
        System.out.println(name);
        System.out.println(value);
    }

    private static void getMethod4(Class clazz) throws NoSuchMethodException {
        //获取一个成员方法(可以获取私有的)
        Method method = clazz.getDeclaredMethod("show", String.class);
        System.out.println(method);
    }

    private static void getMethod3(Class clazz) throws NoSuchMethodException {
        //2.获取某一个成员方法(public修饰的)
        Method method = clazz.getMethod("setName", String.class);
        System.out.println(method);
    }

    private static void getMethod2(Class clazz) {
        //2.获取所有的成员方法(包括私有的)
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }

    private static void getMethod1(Class clazz) {
        //2.获取多个成员方法(public修饰的)
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }

    private static void getField(Class clazz) throws NoSuchFieldException, InstantiationException, IllegalAccessException {
        //2.获取成员变量Field对象
        Field name = clazz.getDeclaredField("name");
        //3.取消访问检查
        name.setAccessible(true);

        //4.调用get方法获取值
        //4.1创建一个对象
        Student s = (Student) clazz.newInstance();
        //s.setName("黄桂田");
        name.set(s,"黄桂田");
        //4.2获取指定对象的name的值
        Object o = name.get(s);
        //5.打印结果
        System.out.println(o);
    }
}
