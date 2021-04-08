package com.shiju.demo;

/**
 * @Author 时距
 * @PackageName:com.shiju.demo
 * @ClassName : Box
 * @Date 2021/3/29 15:49
 * @Description:
 */
public class Box<E> {
    private E element;

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }
}
