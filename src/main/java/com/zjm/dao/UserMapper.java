package com.zjm.dao;

import com.zjm.pojo.User;

public interface UserMapper {

    //通过用户名和密码查询User
    User queryUserByUsernameAndPassword(User user);

    //增加一个用户信息
    int addUser(User user);
}
