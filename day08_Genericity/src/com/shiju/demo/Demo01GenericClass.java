package com.shiju.demo;

/**
 * @Author 时距
 * @PackageName:com.shiju.demo
 * @ClassName : Demo01GenericClass
 * @Date 2021/3/29 15:50
 * @Description:
 */
public class Demo01GenericClass {
    public static void main(String[] args) {
        Box<String> b = new Box<>();
        b.setElement("黄桂田是傻傻~~~");
        String element = b.getElement();
        System.out.println(element);

        Box<Integer> b2 = new Box<>();
        b2.setElement(19);
    }
}
