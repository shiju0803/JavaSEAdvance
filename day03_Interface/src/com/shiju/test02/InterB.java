package com.shiju.test02;

public interface InterB {
    public abstract void show();

    default void method(){
        System.out.println("好大儿........");
    }
}
