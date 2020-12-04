package com.example.springbootdemo.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSON;
import com.example.springbootdemo.pojo.UserLogin;
import com.example.springbootdemo.service.IdNameService;
import com.example.springbootdemo.service.IdNameServiceImpl;
import com.example.springbootdemo.service.UserLoginServicesI;
import jdk.nashorn.internal.ir.debug.JSONWriter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
@RestController
public class InfoController {
    @Resource
    private UserLoginServicesI userLoginServicesI;
    @Resource
    private IdNameService idNameService;

    @RequestMapping(value = "/get_id",method = RequestMethod.GET)
    public String getId(@RequestParam String name){
        return idNameService.queryByName(name).getId()+" "+idNameService.queryByName(name).getName();
    }

    @RequestMapping(value = "/get_name", method = RequestMethod.GET)
    public String getName(){
        StringBuilder res = new StringBuilder();
        List<UserLogin> userLoginList = userLoginServicesI.queryAll();
        for (UserLogin userLogin:userLoginList){
            res.append(userLogin.getUsername()+" "+userLogin.getPassword()+" \n");
        }
        return JSON.toJSONString(res);
        //return res.toString();
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String insert(@RequestParam String username, @RequestParam String password){
        userLoginServicesI.add(new UserLogin(username,password));
        return getName();
    }

    @RequestMapping(value = "/get_password",method = RequestMethod.GET)
    public String getPwd(@RequestParam String username){
        return userLoginServicesI.queryByName(username).getPassword();
    }

}
