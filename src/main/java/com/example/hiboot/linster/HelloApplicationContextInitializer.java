package com.example.hiboot.linster;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @ProjectName: hiboot
 * @Package: com.example.hiboot.linster
 * @ClassName: HelloApplicationContextInitlizer
 * @Author: ZhangJunjie
 * @Description:
 * @Date: 2020/7/14 20:45
 * @Version: 1.0
 */
public class HelloApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println("HelloApplicationContextInitializer is running !" + applicationContext);
    }
}

