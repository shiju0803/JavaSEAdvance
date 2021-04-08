package com.shiju.test;

/*
 * @Author 时距
 * @PackageName:com.shiju.test
 * @ClassName : TestInterface
 * @Date 2021/3/22 14:09
 * @Description:
 **/
public class TestInterface implements InterA,InterB{
    public static void main(String[] args) {
        InterImpl ia = new InterImpl();
        InterA.show();
        InterB.show();
    }
}
class InterAImpl implements InterA{

}