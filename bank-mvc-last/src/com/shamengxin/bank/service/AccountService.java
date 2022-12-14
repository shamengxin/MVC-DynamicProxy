package com.shamengxin.bank.service;

import com.shamengxin.bank.exceptions.AppException;
import com.shamengxin.bank.exceptions.MoneyNotEnoughException;

public interface AccountService {
    public void transfer(String fromActno,String toActno,double money) throws MoneyNotEnoughException, AppException;
}
