package com.example.springbootdemo.service;

import com.example.springbootdemo.mapper.NameDesMapper;
import com.example.springbootdemo.pojo.NameDes;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service("nameDesService")
public class NameDesServiceImpl implements NameDesService{
    @Resource
    NameDesMapper nameDesMapper;
    @Override
    public NameDes queryByName(String name) {
        return nameDesMapper.queryByName(name);
    }
}
