package com.itheima.service;

import com.itheima.pojo.Account;

import java.util.List;

/**
 * @description:
 * @author: ly
 * @date: 2021/2/3 8:09
 */
public interface AccountService {

    List<Account> findAll();

    void add(Account account);
}
