package com.example.hiboot.service.impl;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * description :
 *
 * @author : HandSomeMaker
 * @date : 2020/7/19 0:06
 */
@Service
public class MyService {
    @Scheduled(cron = "0/4 * * * * *")
    public void hello(){
        System.out.println("显示消息");
    }
}
