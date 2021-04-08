package com.shiju.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * @author shiju
 * @date 2021/04/02 11:48
 **/
public class StreamDemo02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("张三丰", "张无忌", "张翠山", "殷素素", "小昭", "张三丰", "小昭", "张无忌"));
        //Stream<T> limit(long maxSize): 截取指定参数个数的数据
        //list.stream().limit(2).forEach(s -> System.out.println(s));

        //Stream<T> skip(long n):        跳过指定参数个数的数据
        //list.stream().skip(2).forEach(s -> System.out.println(s));
        //需求3：跳过2个元素，把剩下的元素中前2个在控制台输出
        list.stream().skip(4).limit(2).forEach(s -> System.out.println(s));

        //static<T> Stream<T> concat(Stream a,Stream b): 合并a和b两个流为一个流
//        ArrayList<String> list2 = new ArrayList<>(List.of("金毛狮王","白眉鹰王","玄冥二老","明教教主","明教圣女"));
//        Stream.concat(list.stream(),list2.stream()).forEach(s -> System.out.println(s));

        //Stream<T> distinct(): 去除流中重复的元素.依赖(hashCode和equals方法)
        //list.stream().distinct().forEach(s -> System.out.println(s));

        //void forEach(Consumer action):对此流的每个元素执行操作
        //Consumer接口中的方法 void accept(T t):对给定的参数执行此操作
        //在forEach方法的底层,会循环获取到流中的每一个数据
        //并循环调用accept方法,并把每一个数据传递给accept方法
        //s就依次表示了流中的每一个数据.
        //所以,我们只要在accept方法中,写上处理的业务逻辑就可以了.
        list.stream().forEach(
                new Consumer<String>() {
                    @Override
                    public void accept(String s) {
                        System.out.println(s);
                    }
                }
        );
        System.out.println("====================");
        //lambda表达式的简化格式
        //是因为Consumer接口中,只有一个accept方法
        list.stream().forEach(
                (String s)->{
                    System.out.println(s);
                }
        );
        System.out.println("====================");
        //lambda表达式还是可以进一步简化的.
        list.stream().forEach(s->System.out.println(s));
    }
}
