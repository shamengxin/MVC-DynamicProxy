package com.shamengxin.bank.exceptions;

/**
 * 余额不足异常
 * @author 傻萌新
 * @version 2.0
 * @since 2.0
 */
public class MoneyNotEnoughException extends Exception{
    public MoneyNotEnoughException() {
    }

    public MoneyNotEnoughException(String message) {
        super(message);
    }
}
