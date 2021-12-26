package com.zjm.service;

import com.zjm.pojo.User;

public interface UserService {
    //通过用户名和密码查询User
    User queryUserByUsernameAndPassword(User user);

    //增加一个用户信息
    int addUser(User user);
}
