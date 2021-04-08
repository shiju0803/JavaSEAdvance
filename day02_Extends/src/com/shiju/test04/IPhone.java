package com.shiju.test04;

/**
 * @Author 时距
 * @PackageName:com.shiju.Test04
 * @ClassName : IPhone
 * @Date 2021/3/21 20:04
 * @Description:
 * 定义类IPhone，要求如下：
		继承类 Phone
			构造方法包括：空参构造和满参构造方法
			重写方法：
			void playMusic(String s)，要求：输出打印"XXX手机正在播放歌曲:s"
			PS：XXX是Phone类中的 brand属性值，s是传入的参数
 **/
public class IPhone extends Phone{
    public IPhone() {
    }

    public IPhone(String brand) {
        super(brand);
    }

    @Override
    public void playMusic(String s) {
        System.out.println(brand + "手机正在播放歌曲:" + s);
    }
}
