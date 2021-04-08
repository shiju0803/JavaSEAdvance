package com.shiju.test02;

public interface InterC extends InterA,InterB{
    @Override
    default void method(){

    }

    @Override
    void methodAbs();

    @Override
    default void methDefault() {

    }

    @Override
    void show();
}
