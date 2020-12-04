package com.example.springbootdemo.mapper;

import com.example.springbootdemo.pojo.NameDes;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface NameDesMapper {
    NameDes queryByName(@Param("name") String name);
}
