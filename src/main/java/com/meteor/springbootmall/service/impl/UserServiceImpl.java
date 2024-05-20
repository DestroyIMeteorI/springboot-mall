package com.meteor.springbootmall.service.impl;

import com.meteor.springbootmall.dao.UserDao;
import com.meteor.springbootmall.dto.UserRegisterRequest;
import com.meteor.springbootmall.model.User;
import com.meteor.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
