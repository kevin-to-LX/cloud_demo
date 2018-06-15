package com.keivn.controller;

import com.keivn.service.Helloservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jinyugai on 2018/6/12.
 */
@RestController
public class HelloController {
    @Autowired
    Helloservice helloservice;

    @RequestMapping("/hi")
    public String hi(@RequestParam String name){
        return helloservice.hiservice(name);
    }


}
