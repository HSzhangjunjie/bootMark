package com.example.hiboot;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

// 开启缓存
@EnableCaching
@SpringBootApplication
// 开启基于注解的RabbitMQ
@EnableRabbit
@EnableAsync
@EnableScheduling
public class HibootApplication {

    public static void main(String[] args) {
        // Spring应用启动
        SpringApplication.run(HibootApplication.class, args);
    }

}


