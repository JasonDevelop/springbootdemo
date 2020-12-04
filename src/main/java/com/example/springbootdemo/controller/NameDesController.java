package com.example.springbootdemo.controller;

import com.example.springbootdemo.service.NameDesService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/name_des")
public class NameDesController {
    @Resource
    NameDesService nameDesService;
    @RequestMapping(value = "/get_all", method = RequestMethod.GET)
    String getAll(@RequestParam("name") String name){
        return nameDesService.queryByName(name).toString();
    }
}
