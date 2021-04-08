package com.shiju.test04;

/**
 * @Author 时距
 * @PackageName:com.shiju.Test04
 * @ClassName : TestDemo
 * @Date 2021/3/21 20:04
 * @Description:
 * 定义测试类TestDemo，在main方法实现以下功能：
		创建并初始化一个IPhone 对象 phone，调用phone的playMusic(String s)方法,传入参数"菊花台"
		打印出如下语句:
			华为手机正在播放歌曲:菊花台
 **/
public class TestDemo {
    public static void main(String[] args) {
        IPhone phone = new IPhone("华为");
        phone.playMusic("菊花台");
    }
}
