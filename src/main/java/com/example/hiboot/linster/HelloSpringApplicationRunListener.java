package com.example.hiboot.linster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @ProjectName: hiboot
 * @Package: com.example.hiboot.linster
 * @ClassName: HelloSpringApplictaionRunLinster
 * @Author: ZhangJunjie
 * @Description:
 * @Date: 2020/7/14 20:47
 * @Version: 1.0
 */
public class HelloSpringApplicationRunListener implements SpringApplicationRunListener {
    public HelloSpringApplicationRunListener(SpringApplication application,String[] args) {
    }

    @Override
    public void starting() {
        System.out.println("HelloSpringApplicationRunListener is starting");
    }

    @Override
    public void environmentPrepared(ConfigurableEnvironment environment) {
        System.out.println("HelloSpringApplicationRunListener is environmentPrepared" + environment);
    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        System.out.println("HelloSpringApplicationRunListener is contextPrepared" + context);
    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        System.out.println("HelloSpringApplicationRunListener is contextLoaded" + context);
    }

    @Override
    public void started(ConfigurableApplicationContext context) {
        System.out.println("HelloSpringApplicationRunListener is started" + context);
    }

    @Override
    public void running(ConfigurableApplicationContext context) {
        System.out.println("HelloSpringApplicationRunListener is running" + context);
    }

    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {
        System.out.println("HelloSpringApplicationRunListener is failed");
    }
}
