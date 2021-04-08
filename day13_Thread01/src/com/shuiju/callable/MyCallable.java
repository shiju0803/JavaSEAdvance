package com.shuiju.callable;

import java.util.concurrent.Callable;

/**
 * @author shiju
 * @date 2021/04/06 11:13
 **/
public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        for (int i = 1; i <= 100 ; i++) {
            System.out.println("向美女表白" + i + "次");
        }
        //返回值就表示线程运行完毕之后的结果
        return "答应";
    }
}
