package com.shiju.test6;

/*
 * @Author 时距
 * @PackageName:com.shiju.test6
 * @ClassName : TestLambda
 * @Date 2021/3/23 21:54
 * @Description:
 * 1.编写一个接口(ShowHandler)
 * 2.在该接口中存在一个抽象方法(show),该方法是无参数无返回值
 * 3.在测试类(ShowHandlerDemo)中存在一个方法(useShowHandler),
 * 方法的参数是ShowHandler类型的,在方法内部调用了ShowHandler的show方法
 **/
public class ShowHandlerDemo {
    public static void main(String[] args) {
        useShowHandler(new ShowHandler() {
            @Override
            public void show() {
                System.out.println("我是Lambda中的show方法");
            }
        });

        //Lambda实现
        useShowHandler(() -> { System.out.println("我是匿名内部类中的show方法"); });
    }
    public static void useShowHandler(ShowHandler s){
        s.show();
    }
}
interface ShowHandler{
    void show();
}