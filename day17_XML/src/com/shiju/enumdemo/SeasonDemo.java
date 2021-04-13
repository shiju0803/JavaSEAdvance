package com.shiju.enumdemo;

/**
 * @author shiju
 * @date 2021/04/12 16:50
 **/
public class SeasonDemo {
    public static void main(String[] args) {

    }
}
enum Season{
    SPRING("春天"),
    SUMMER("夏天"),
    AUTUMN("秋天"),
    WINTER("冬天");
    private String name;
    Season(){}
    Season(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                '}';
    }
}