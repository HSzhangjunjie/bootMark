package com.example.hiboot.config;

import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ProjectName: hiboot
 * @Package: com.example.hiboot.config
 * @ClassName: MyServerConfig
 * @Author: ZhangJunjie
 * @Description:
 * @Date: 2020/7/8 20:57
 * @Version: 1.0
 */
@Configuration
public class MyServerConfig {
    // 配置嵌入式Servlet容器
    @Bean
    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryWebServerFactoryCustomizer(){
        return new WebServerFactoryCustomizer<ConfigurableWebServerFactory>() {
            // 定制嵌入式Servlet容器规则
            @Override
            public void customize(ConfigurableWebServerFactory factory) {
//                factory.setPort(8099);
            }
        };
    }
}
