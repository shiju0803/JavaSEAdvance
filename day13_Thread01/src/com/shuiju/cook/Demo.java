package com.shuiju.cook;

/**
 * @author shiju
 * @date 2021/04/06 19:23
 **/
public class Demo {
    public static void main(String[] args) {
        Cooker c = new Cooker();
        Foodie f = new Foodie();

        c.start();
        f.start();
    }
}
