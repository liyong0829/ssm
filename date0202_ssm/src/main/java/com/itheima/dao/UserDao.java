package com.itheima.dao;

import com.itheima.pojo.User;
import org.apache.ibatis.annotations.Select;

/**
 * @description:
 * @author: ly
 * @date: 2021/2/3 10:01
 */
public interface UserDao {
    @Select("select * from user where username=#{username} and password=#{password}")
    User findByUser(User loginUser);
}
