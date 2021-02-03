package com.itheima.controller;

import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @description:
 * @author: ly
 * @date: 2021/2/3 9:59
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/user/login")
    public String login(User loginUser, HttpSession session){
        User user=userService.login(loginUser);
        session.setAttribute("user",user);
        return "redirect:/account/findAll";
    }
}
