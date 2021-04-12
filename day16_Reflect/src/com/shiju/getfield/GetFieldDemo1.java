package com.shiju.getfield;

import java.lang.reflect.Field;

/**
 * @author shiju
 * @date 2021/04/10 15:25
 **/
public class GetFieldDemo1 {
    public static void main(String[] args) throws Exception{
        //想要获取的成员变量必须是真实存在的
        //1.获取字节码对象
        Class clazz = Class.forName("com.shiju.reflect.Student");
        //method1(clazz);
        //method2(clazz);
        //method3(clazz);
        method4(clazz);
    }

    private static void method4(Class clazz) throws NoSuchFieldException {
        //public Field getDeclaredField(String name)
        //    获取一个成员变量(可以获取私有的)
        Field field = clazz.getDeclaredField("name");
        System.out.println(field);
    }

    private static void method3(Class clazz) {
        //public Field[] getDeclaredFields()
        //    获取所有的成员变量(包括私有的)
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }
    }

    private static void method2(Class clazz) throws NoSuchFieldException {
        //public Field getField(String name)
        //    获取某一个成员变量(public修饰的)
        Field field = clazz.getField("name");
        System.out.println(field);
    }

    private static void method1(Class clazz) {
        //public Field[] getFields()
        //    获取多个成员变量(public修饰的)
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
    }
}
