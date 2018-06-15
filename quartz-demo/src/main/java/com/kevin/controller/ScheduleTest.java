package com.kevin.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.SchedulingException;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by jinyugai on 2018/6/13.
 */
@Configuration
@EnableScheduling
@Component
public class ScheduleTest {
    @Scheduled(fixedRate = 5000)
    public void scheduledUpdateTrigger() throws SchedulingException{
        System.out.println("5s运行一次，测试用的");
    }

}
