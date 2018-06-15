package com.kevin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jinyugai on 2018/6/14.
 */
@RestController
@RequestMapping("/user")
public class UserController {
/*
    注：访问 ip:port/user/queryUser进行cas测试
*/
    @RequestMapping("/queryUser")
    public Map<String , String> queryUser(HttpServletRequest http){
        Map<String,String> map= new HashMap<>();
        map.put("session",http.getSession().getId());
        return  map;
    }
}
