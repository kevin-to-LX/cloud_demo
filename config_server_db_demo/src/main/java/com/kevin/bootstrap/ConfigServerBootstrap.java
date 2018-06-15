package com.kevin.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Created by jinyugai on 2018/6/14.
 */

@SpringBootApplication
public class ConfigServerBootstrap {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ConfigServerBootstrap.class);

        // 测试用数据，仅用于本文测试使用
    }

}
