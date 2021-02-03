package com.itheima.controller;

import com.itheima.pojo.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @description:
 * @author: ly
 * @date: 2021/2/3 8:09
 */
@Controller
public class AccountController {
    @Autowired
    private AccountService accountService;
    @RequestMapping("/account/findAll")
    public String findAll(Model model){
        List<Account> list=accountService.findAll();
        model.addAttribute("list",list);
        return "list";
    }
    @RequestMapping("/account/add")
    public String add(Account account){
        accountService.add(account);
        return "redirect:/account/findAll";
    }
}
