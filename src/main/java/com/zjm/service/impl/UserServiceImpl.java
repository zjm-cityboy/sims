package com.zjm.service.impl;

import com.zjm.dao.UserMapper;
import com.zjm.pojo.User;
import com.zjm.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User queryUserByUsernameAndPassword(User user) {
        return userMapper.queryUserByUsernameAndPassword(user);
    }

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }
}
