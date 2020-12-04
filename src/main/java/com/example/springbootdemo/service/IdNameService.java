package com.example.springbootdemo.service;

import com.example.springbootdemo.pojo.IdName;

public interface IdNameService {
    IdName queryByName(String name);
}
