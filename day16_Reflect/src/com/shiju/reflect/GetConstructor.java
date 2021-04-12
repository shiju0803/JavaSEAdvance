package com.shiju.reflect;

import java.lang.reflect.Constructor;

/**
 * @author shiju
 * @date 2021/04/10 14:19
 **/
public class GetConstructor {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        //获取Class对象
        Class clazz = Class.forName("com.shiju.reflect.Student");
        //public Constructor[] getConstructors()
        //    获取构造方法的数组(public修饰的)
        //method1(clazz);
        //public Constructor getConstructor(Class<?>... parameterTypes)
        //    获取一个构造方法(public修饰的)
        //
        //public Constructor[] getDeclaredConstructors()
        //    获取所有的构造方法(包括私有的)
        //method2(clazz);
        //public Constructor getDeclaredConstructor()
        //    获取一个构造方法(可以获取私有)
        //method3(clazz);

    }

    private static void method3(Class clazz) throws NoSuchMethodException {
        Constructor constructor = clazz.getDeclaredConstructor(String.class);
        System.out.println(constructor);
    }

    private static void method2(Class clazz) {
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        for (Constructor<?> con : constructors) {
            System.out.println(con);
        }
    }

    private static void method1(Class clazz) {
        Constructor<?>[] constructor = clazz.getConstructors();
        for (Constructor<?> c : constructor) {
            System.out.println(c);
        }
    }
}
