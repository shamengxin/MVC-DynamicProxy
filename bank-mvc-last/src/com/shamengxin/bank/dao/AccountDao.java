package com.shamengxin.bank.dao;

import com.shamengxin.bank.pojo.Account;

import java.util.List;

public interface AccountDao {
    public int insert(Account act);
    public int deleteByID(Long id);
    public int update(Account act);
    public Account selectByActno(String actno);
    public List<Account> selectAll();
}
