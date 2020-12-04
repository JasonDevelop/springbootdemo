package com.example.springbootdemo.service;

import com.example.springbootdemo.mapper.IdNameMapper;
import com.example.springbootdemo.pojo.IdName;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service("idNameService")
public class IdNameServiceImpl implements IdNameService{
    @Resource
    private IdNameMapper idNameMapper;
    @Override
    public IdName queryByName(String name) {
        return idNameMapper.queryByName(name);
    }
}
