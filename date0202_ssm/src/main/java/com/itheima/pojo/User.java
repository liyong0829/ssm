package com.itheima.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @description:
 * @author: ly
 * @date: 2021/2/3 9:58
 */
@Data
public class User implements Serializable {
    private int id;
    private String username;
    private String password;
}
