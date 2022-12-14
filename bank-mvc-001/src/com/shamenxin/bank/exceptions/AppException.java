package com.shamenxin.bank.exceptions;

/**
 * APP异常
 * @author 傻萌新
 * @version 1.0
 * @since 1.0
 */
public class AppException extends Exception{
    public AppException() {

    }

    public AppException(String message) {
        super(message);
    }
}
