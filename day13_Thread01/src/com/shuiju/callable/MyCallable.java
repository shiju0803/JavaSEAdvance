package com.shuiju.callable;

import java.util.concurrent.Callable;

/**
 * @author shiju
 * @date 2021/04/06 11:13
 **/
public class MyCallable implements Callable<String>{

    @Override
    public String call() throws Exception {
        for (int i = 1; i <= 20; i++) {
            System.out.println("代码敲了" + i + "遍");
        }
        return "月薪过万";
    }
}
