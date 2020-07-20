package com.example.hiboot.config;

import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;

/**
 * @ProjectName: hiboot
 * @Package: com.example.hiboot.config
 * @ClassName: MyBatisConfig
 * @Author: ZhangJunjie
 * @Description:
 * @Date: 2020/7/14 0:07
 * @Version: 1.0
 */
@org.springframework.context.annotation.Configuration
public class MyBatisConfig {
    @Bean
    public ConfigurationCustomizer configurationContributor(){
        return configuration -> {
            // 开启驼峰命名规则
            configuration.setMapUnderscoreToCamelCase(true);
        };
    }
}
