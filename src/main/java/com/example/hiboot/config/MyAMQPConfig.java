package com.example.hiboot.config;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ProjectName: hiboot
 * @Package: com.example.hiboot.config
 * @ClassName: MyAMQPConfig
 * @Author: ZhangJunjie
 * @Description:
 * @Date: 2020/7/16 22:11
 * @Version: 1.0
 */
@Configuration
public class MyAMQPConfig {
    @Bean
    public MessageConverter messageConverter(){
        return new Jackson2JsonMessageConverter();
    }
}
