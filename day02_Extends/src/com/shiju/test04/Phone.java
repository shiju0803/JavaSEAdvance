package com.shiju.test04;

/**
 * @Author 时距
 * @PackageName:com.shiju.Test04
 * @ClassName : Phone
 * @Date 2021/3/21 20:04
 * @Description:
 * 定义类Phone，要求如下：
		包含空参、满参构造和以下成员变量
			品牌 brand（ String 型）
        生成所有成员变量set/get方法
        定义方法：void playMusic(String s)
 **/
public class Phone {
    String brand;

    public Phone() { }

    public Phone(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void playMusic(String s){

    }
}
