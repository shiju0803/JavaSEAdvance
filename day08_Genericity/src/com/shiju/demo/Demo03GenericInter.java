package com.shiju.demo;

/**
 * @Author 时距
 * @PackageName:com.shiju.demo
 * @ClassName : Demo01GenericMethod
 * @Date 2021/3/29 16:05
 * @Description:自定义泛型接口
 * 定义一个泛型方法, 传递一个集合和四个元素, 将元素添加到集合中并返回
 */
public class Demo03GenericInter {
    public static void main(String[] args) {
        GenericImpl1<String> generic = new GenericImpl1<>();
        generic.method("黄桂田,汪汪汪~~~");

        GenericImpl2 genericImpl2 = new GenericImpl2();
        genericImpl2.method(12);
    }
}
interface Generic<E>{
     void method(E e);
}
class GenericImpl1<E> implements Generic<E>{
    @Override
    public void method(E e) {
        System.out.println(e);
    }
}
class GenericImpl2 implements Generic<Integer>{
    @Override
    public void method(Integer i) {
        System.out.println(i);
    }
}