package com.shiju.template;

/*
 * @Author 时距
 * @PackageName:com.shiju.Template
 * @ClassName : Demo
 * @Date 2021/3/21 20:18
 * @Description:
 **/
public abstract class Demo {
    public void write(){
        System.out.println("<<我的爸爸>>");
        body();
        System.out.println("啊~这就是我的爸爸");
    }
    public abstract void body();
}
