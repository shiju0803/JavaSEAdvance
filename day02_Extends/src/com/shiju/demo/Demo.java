package com.shiju.demo;

/**
 * @Author 时距
 * @PackageName:com.shiju.demo
 * @ClassName : demo
 * @Date 2021/3/21 11:03
 * @Description:
 * 需求:
    1. 定义手机类 IPearV1
         call(String name) : 打电话方法
         smallBlack() : 语音助手 (speak english...)
   2. 定义新手机类 IPearV2
         call(String name) : 打电话方法
         smallBlack() : 语音助手 (speak english...  说中文)
 **/
public class Demo {
    public static void main(String[] args) {
        IPearV2 i = new IPearV2();
        i.smallBlack();
    }
}
class IPearV1 {
    public void call(String name){
        System.out.println("给" + name + "打电话");
    }

    public void smallBlack(){
        System.out.println("speak english...");
    }
}

class IPearV2 extends IPearV1 {
    @Override
    public void call(String name) {
        super.call(name);
    }
    @Override
    public void smallBlack(){
        super.smallBlack();
        System.out.println("说中文");
    }
}

