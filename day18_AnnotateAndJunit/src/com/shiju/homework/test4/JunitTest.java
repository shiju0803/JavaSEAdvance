package com.shiju.homework.test4;

import com.shiju.annotate.Test1;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author shiju
 * @date 2021/04/13 19:19
 **/
public class JunitTest {
    @After
    public void function1(){
        System.out.println("方法一");
    }
    @Test
    public void function2(){
        System.out.println("方法二");
    }
    @Before
    public void function3(){
        System.out.println("方法三");
    }
}
