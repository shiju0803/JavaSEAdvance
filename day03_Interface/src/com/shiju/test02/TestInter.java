package com.shiju.test02;

/*
 * @Author 时距
 * @PackageName:com.shiju.test02
 * @ClassName : TestInter
 * @Date 2021/3/22 14:53
 * @Description:
 **/
public class TestInter {
    public static void main(String[] args) {
        InterCImpl ic = new InterCImpl();
        ic.show();
        ic.method();
        InterA.method1();
    }
}
class InterCImpl implements InterC{

    @Override
    public void methodAbs() {

    }

    @Override
    public void methDefault() {

    }

    @Override
    public void show() {
        System.out.println("Hello World~!");
    }

    @Override
    public void method() {
        System.out.println("黄傻傻~~");
    }
}
