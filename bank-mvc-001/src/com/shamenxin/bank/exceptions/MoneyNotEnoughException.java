package com.shamenxin.bank.exceptions;

/**
 * 余额不足异常
 * @author 傻萌新
 * @version 1.0
 * @since 1.0
 */
public class MoneyNotEnoughException extends Exception{
    public MoneyNotEnoughException() {
    }

    public MoneyNotEnoughException(String message) {
        super(message);
    }
}
