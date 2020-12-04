package com.example.springbootdemo.service;

import com.example.springbootdemo.pojo.IdName;
import com.example.springbootdemo.pojo.NameDes;

public interface NameDesService {
    NameDes queryByName(String name);
}
