package com.itheima.interceptors;


import com.itheima.pojo.User;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description:
 * @author: ly
 * @date: 2021/2/3 10:16
 */
public class PriviligesInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        User user = (User) request.getSession().getAttribute("user");
        if(user==null){
            System.out.println("未登陆");
            response.sendRedirect(request.getContextPath()+"/pages/index.jsp");
            return false;
        }else {
            return true;
        }

    }
}
