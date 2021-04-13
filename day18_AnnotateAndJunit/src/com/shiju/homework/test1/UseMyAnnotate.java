package com.shiju.homework.test1;
/**
 * 自定义注解类,有以下两个属性name和age,分别赋予默认值,然后在测试类中用反射获取属性值并创建person对象
 * @author shiju
 * @date 2021/04/13 16:49
 **/
public class UseMyAnnotate {
    public static void main(String[] args) throws Exception {
        //1.获取字节码文件对象
        Class clzz = Class.forName("com.shiju.homework.test1.Person");
        //2.判断类名上是否有注解
        boolean flag = clzz.isAnnotationPresent(MyAnnotate.class);
        //3.如果有则获取注解的属性值
        if (flag) {
            MyAnnotate annotation = (MyAnnotate) clzz.getAnnotation(MyAnnotate.class);
            String name = annotation.name();
            int age = annotation.age();
            Person p = new Person(name,age);
            System.out.println(p.toString());
        }
    }
}
