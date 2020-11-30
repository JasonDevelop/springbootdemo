package com.example.springbootdemo.controller;

import com.example.springbootdemo.mapper.UserLoginMapper;
import com.example.springbootdemo.pojo.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/hello")
public class HelloController {
    // http://localhost:8080/hello/hello
    @RequestMapping("hello")
    public String hello(){
        return "hello from springboot demo";
    }
    // http://localhost:8080/hello/say?name=Alexander
    @RequestMapping(value = "say",method = RequestMethod.GET)
    public String say(@RequestParam String name){
        return "hello " +name+" from springboot demo";
    }

}
