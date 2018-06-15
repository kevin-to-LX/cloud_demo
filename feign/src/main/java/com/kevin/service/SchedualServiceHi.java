package com.kevin.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by jinyugai on 2018/6/12.
 */
@FeignClient(value = "service-hi")
public interface SchedualServiceHi {
    /**
    *定义一个feign接口，通过@ FeignClient（“服务名”），来指定调用哪个服务
     * */

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
