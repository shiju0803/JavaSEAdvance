package com.shiju.annotate;

import java.lang.reflect.Method;

/**
 * @author shiju
 * @date 2021/04/13 11:11
 **/
public class AnnoDemo {
    public static void main(String[] args) throws Exception {
        //1.通过反射获取到UseTest类的字节码文件对象
        Class clazz = Class.forName("com.shiju.annotate.UseTest");
        //创建对象
        UseTest useTest = (UseTest) clazz.newInstance();
        //2.通过反射获取这个类中所有的方法对象
        Method[] methods = clazz.getDeclaredMethods();

        //3.遍历数组,得到每一个方法对象
        for (Method method : methods) {
            //判断当前方法上是否有指定的注解
            if(method.isAnnotationPresent(Test1.class)){
                method.invoke(useTest);
            }
        }
    }
}
