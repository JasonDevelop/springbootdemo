package com.example.springbootdemo;

import com.example.springbootdemo.mapper.IdNameMapper;
import com.example.springbootdemo.mapper.NameDesMapper;
import com.example.springbootdemo.mapper.UserLoginMapper;
import com.example.springbootdemo.pojo.NameDes;
import com.example.springbootdemo.pojo.UserLogin;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@SpringBootTest
class SpringbootdemoApplicationTests {
    @Autowired
    DataSource dataSource;
    @Resource
    UserLoginMapper userLoginMapper;
    @Resource
    NameDesMapper nameDesMapper;
    @Resource
    IdNameMapper idNameMapper;
    @Test
    void testNameDes(){
        NameDes nameDes = nameDesMapper.queryByName("a");
        System.out.println(nameDes);
    }
    @Test
    void print(){
        List<UserLogin> userLogins = userLoginMapper.queryAll();
        userLogins.forEach(e-> System.out.println(e.getUsername()+" "+e.getPassword()));
    }


    @Test
    void contextLoads() throws SQLException {
        System.out.println(dataSource.getClass());
        Connection connection = dataSource.getConnection();
        System.out.println(connection);

        //template模板，拿来即用
        connection.close();
    }

    @Test
    public void toTest(){
        List<UserLogin> userLogins = userLoginMapper.queryAll();
        userLogins.forEach(e-> System.out.println(e.getUsername()+" "+e.getPassword()));
    }

}
