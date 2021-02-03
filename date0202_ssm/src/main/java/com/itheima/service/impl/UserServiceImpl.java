package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: ly
 * @date: 2021/2/3 10:01
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User login(User loginUser) {
        User user=userDao.findByUser(loginUser);
        return user;
    }
}
