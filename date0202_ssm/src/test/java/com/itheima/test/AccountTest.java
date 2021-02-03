package com.itheima.test;

import com.itheima.dao.AccountDao;
import com.itheima.pojo.Account;
import com.itheima.service.AccountService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @description:
 * @author: ly
 * @date: 2021/2/3 8:20
 */
public class AccountTest {
    @Test
    //测试service
    public void fun1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-service.xml");
        AccountService bean = context.getBean(AccountService.class);
        bean.findAll();
    }
    @Test
    //测试dao
    public void fun2(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-dao.xml");
        AccountDao bean = context.getBean(AccountDao.class);
        List<Account> list = bean.findAll();
        for (Account account : list) {
            System.out.println(account);
        }
    }
}
