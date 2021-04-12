package com.shiju.homework;

/*
 * @Author 时距
 * @PackageName:com.shiju.work
 * @ClassName : IPhone
 * @Date 2021/3/21 19:49
 * @Description:
 * 定义一个IPhone类,继承Phone类
		重写sendMessage()方法,输出:"发彩信"
		重写playGame()方法,输出:"打王者农药"
		定义自己特有的行为 :
			siri() 打印"人工智障"
 **/
public class IPhone extends Phone{
    @Override
    public void sendMessage() {
        System.out.println("发彩信");
    }

    @Override
    public void playGame() {
        System.out.println("打王者农药");
    }
    public void siri(){
        System.out.println("人工智障");
    }
}
