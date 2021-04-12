package com.shiju.homework;

import java.util.ArrayList;

/**
 * 1.请自定义一个泛型类Template<T>,并测试
 * 2.请自定义一个泛型方法ArrayList<T> add(ArrayList<T>,T t1,T t2,T t3),
 * 实现添加任意对象到集合,并测试
 * 3.请自定义一个泛型接口Flyable<T>, 接口中定义一个抽象方法 void fly(T t);
 * 请编写代码测试接口的使用(通过实现类使用接口.)
 *
 * @author shiju
 * @date 2021/03/30 17:40
 **/
public class GenericTest {
    public static void main(String[] args) {
        Template<String> t = new Template<>();
        t.setElement("这是一个泛型类");
        System.out.println(t.getElement());

        ArrayList<Integer> list1 = add(new ArrayList<>(),1,2,3,4);
        ArrayList<String> list2 = add(new ArrayList<>(),"aaa","bbb","ccc","ddd");
        System.out.println(list1);
        System.out.println(list2);

        FlyableImpl imp = new FlyableImpl();
        imp.fly();
    }

    //请自定义一个泛型方法ArrayList<T> add(ArrayList<T>,T t1,T t2,T t3)
    public static <T> ArrayList<T> add(ArrayList<T> list,T t1,T t2,T t3,T t4){
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);
        return list;
    }
}
//泛型类
class  Template<T>{
    private T element;

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }
}
//请自定义一个泛型接口Flyable<T>, 接口中定义一个抽象方法 void fly(T t)
interface Flyable<T>{
    void fly();
}
//请编写代码测试接口的使用(通过实现类使用接口.)
class FlyableImpl implements Flyable<String>{
    @Override
    public void fly() {
        System.out.println("小鸟不会飞~");
    }
}