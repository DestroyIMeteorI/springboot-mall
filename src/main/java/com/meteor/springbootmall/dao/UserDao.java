package com.meteor.springbootmall.dao;

import com.meteor.springbootmall.dto.UserRegisterRequest;
import com.meteor.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
