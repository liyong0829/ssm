package com.itheima.dao;

import com.itheima.pojo.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @description:
 * @author: ly
 * @date: 2021/2/3 8:30
 */
public interface AccountDao {
    @Select("select * from account")
    List<Account> findAll();

    @Insert("insert into account(name,money) values(#{name},#{money})")
    void add(Account account);
}
