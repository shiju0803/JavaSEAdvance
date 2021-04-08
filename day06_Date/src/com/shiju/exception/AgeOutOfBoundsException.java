package com.shiju.exception;

/**
 * @Author 时距
 * @PackageName:com.shiju.exception
 * @ClassName : AgeOutOfBoundsException
 * @Date 2021/3/27 20:46
 * @Description:
 */
public class AgeOutOfBoundsException extends RuntimeException{
    public AgeOutOfBoundsException() {
    }

    public AgeOutOfBoundsException(String message) {
        super(message);
    }
}
