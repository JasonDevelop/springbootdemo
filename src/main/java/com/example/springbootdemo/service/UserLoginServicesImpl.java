package com.example.springbootdemo.service;

import com.example.springbootdemo.mapper.UserLoginMapper;
import com.example.springbootdemo.pojo.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userLoginServices")
public class UserLoginServicesImpl implements UserLoginServicesI {

    @Autowired
    UserLoginMapper userLoginMapper;
    @Override
    public List<UserLogin> queryAll() {
        return userLoginMapper.queryAll();
    }

    @Override
    public int add(UserLogin userLogin) {
        return userLoginMapper.add(userLogin);
    }

    @Override
    public UserLogin queryByName(String username) {
        return userLoginMapper.queryByName(username);
    }
}
