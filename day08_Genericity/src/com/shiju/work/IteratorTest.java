package com.shiju.work;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 请定义一个Collection类型的集合，存储以下字符串：
 * “JavaEE企业级开发指南”，”Oracle高级编程”，”MySQL从入门到精通”，”Java架构师之路”
 * 请编程实现以下功能：
 *  使用迭代器遍历所有元素，并打印
 *  使用迭代器遍历所有元素，筛选书名小于10个字符的，并打印；
 *  使用迭代器遍历所有元素，筛选书名中包含“Java”的，并打印
 *  如果书名中包含“Oracle”，则删掉此书。删掉后，遍历集合，打印所有书名。
 * (注意：以上功能写在一个main()方法中，但请单独实现)
 *
 * @author shiju
 * @date 2021/03/30 15:51
 **/
public class IteratorTest {
    public static void main(String[] args) {
        //定义一个Collection类型的集合
        Collection<String> collection = new ArrayList<>();
        collection.add("JavaEE企业级开发指南");
        collection.add("Oracle高级编程");
        collection.add("MySQL从入门到精通");
        collection.add("Java架构师之路");

        //使用迭代器遍历所有元素，并打印
        Iterator<String> it1 = collection.iterator();
        while (it1.hasNext()) {
            String s = it1.next();
            System.out.println(s);
        }
        System.out.println("------------------");

        //使用迭代器遍历所有元素，筛选书名小于10个字符的，并打印
        Iterator<String> it2 = collection.iterator();
        System.out.println("书名小于10个字符的有:");
        while (it2.hasNext()) {
            String s = it2.next();
            if (s.length() < 10) {
                System.out.println(s);
            }
        }
        System.out.println("------------------");

        //使用迭代器遍历所有元素，筛选书名中包含“Java”的，并打印
        Iterator<String> it3 = collection.iterator();
        System.out.println("书名中包含“Java”的有:");
        while (it3.hasNext()) {
            String s = it3.next();
            if (s.contains("Java")) {
                System.out.println(s);
            }
        }

        System.out.println("------------------");
        //如果书名中包含“Oracle”，则删掉此书。删掉后，遍历集合，打印所有书名
        Iterator<String> it4 = collection.iterator();
        System.out.println("书名中包含“Oracle”的有:");
        while (it4.hasNext()) {
            String s = it4.next();
            if (s.contains("Oracle")) {
                System.out.println(s);
                it4.remove();
            }
        }
        System.out.println("现在集合中的书名:");
        Iterator<String> it5 = collection.iterator();
        while (it5.hasNext()) {
            String s = it5.next();
            System.out.println(s);
        }
    }
}
