package com.meteor.springbootmall.service;

import com.meteor.springbootmall.dto.UserLoginRequest;
import com.meteor.springbootmall.dto.UserRegisterRequest;
import com.meteor.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);
}
