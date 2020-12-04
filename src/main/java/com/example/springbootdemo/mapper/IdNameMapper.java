package com.example.springbootdemo.mapper;

import com.example.springbootdemo.pojo.IdName;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface IdNameMapper {
    IdName queryByName(String name);
}
