package com.shiju.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author shiju
 * @date 2021/04/13 14:20
 **/
public class JunitDemo {
    @After
    public void after(){
        System.out.println("after....");
    }
    @Test
    public void add(){
        int a = 10;
        int b = 2;
        int c = a / 2;
        System.out.println(c);
    }
    @Before
    public void before(){
        System.out.println("before...");
    }
}
