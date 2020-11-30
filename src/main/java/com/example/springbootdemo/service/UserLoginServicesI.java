package com.example.springbootdemo.service;

import com.example.springbootdemo.pojo.UserLogin;

import java.util.List;

public interface UserLoginServicesI {
    List<UserLogin> queryAll();
    int add(UserLogin userLogin);
    UserLogin queryByName(String username);
}
