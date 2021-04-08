package com.shiju.test6;

/*
 * @Author 时距
 * @PackageName:com.shiju.test6
 * @ClassName : StringHandlerDemo
 * @Date 2021/3/24 14:01
 * @Description:
 * 1.编写一个接口(StringHandler)
 * 2.在该接口中存在一个抽象方法(show(String msg)),该方法是有参数无返回值
 * 3.在测试类(StringHandlerDemo)中存在一个方法(useStringHandler),
 * 方法的参数是StringHandler类型的,在方法内部调用了StringHandler的printMessage方法
 **/
public class StringHandlerDemo {
    public static void main(String[] args) {
        //匿名内部类实现方法
        useStringHandler(new StringHandler() {
            @Override
            public void printMessage(String msg) {
                System.out.println("匿名内部类" + msg);
            }
        });
        //Lambda表达式实现
        useStringHandler((String msg) -> {
            System.out.println("Lambda表达式实现" + msg);
        });
        //Lambda表达式省略实现
        useStringHandler(msg -> System.out.println("Lambda表达式实现" + msg));
    }
    public static void useStringHandler(StringHandler sh) {
        sh.printMessage("哈哈哈哈");
    }
}

interface StringHandler {
    void printMessage(String msg);
}

class StringHandlerImpl implements StringHandler {

    @Override
    public void printMessage(String msg) {
        System.out.println("实现类想show..." + msg);
    }
}