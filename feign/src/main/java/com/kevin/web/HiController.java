package com.kevin.web;

import com.kevin.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jinyugai on 2018/6/12.
 */
@RestController
public class HiController {
    @Autowired
    SchedualServiceHi schedualServiceHi;
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    /**
     * 在Web层的controller层，对外暴露一个”/hi”的API接口，
        通过上面定义的Feign客户端SchedualServiceHi 来消费服务
     */

    public String sayHi(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
