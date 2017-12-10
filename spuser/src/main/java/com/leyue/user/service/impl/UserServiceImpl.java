package com.leyue.user.service.impl;

import com.leyue.user.mapper.UserMapper;
import com.leyue.user.model.User;
import com.leyue.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lihao on 17/11/30.
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public List<User> findByName(String userName) {
        return userMapper.findByName(userName);
    }

    @Override
    public List<User> allListByOrder(String filed) {
        return userMapper.allListByOrder(filed);
    }

    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }

    @Override
    public void insertUser2(User user) {
        userMapper.insertUser2(user);
    }

    @Override
    public List<User> search(User user) {
        return userMapper.search(user);
    }

    @Override
    public List<User> search2(User user) {
        return userMapper.search2(user);
    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }
}
