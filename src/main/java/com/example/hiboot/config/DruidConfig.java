package com.example.hiboot.config;

import org.springframework.context.annotation.Configuration;

/**
 * @ProjectName: hiboot
 * @Package: com.example.hiboot.config
 * @ClassName: DruidConfig
 * @Author: ZhangJunjie
 * @Description:
 * @Date: 2020/7/13 21:36
 * @Version: 1.0
 */
@Configuration
public class DruidConfig {
//    // 配置Druid监控
//    // 配置一个管理后台的Servlet
//    @Bean
//    public ServletRegistrationBean<StatViewServlet> statViewServlet() {
//        ServletRegistrationBean<StatViewServlet> bean = new ServletRegistrationBean<>(new StatViewServlet(), "/druid/");
//        // 配置参数
//        Map<String, String> initParams = new HashMap<>();
//        initParams.put("jmxUsername", "admin");
//        initParams.put("jmxPassword", "admin");
//        initParams.put("resetEnable", "");
//
//        bean.setInitParameters(initParams);
//        return bean;
//    }
//
//    // 配置一个web监控的filter
//    @Bean
//    public FilterRegistrationBean<WebStatFilter> webStatFilter() {
//        FilterRegistrationBean<WebStatFilter> bean = new FilterRegistrationBean<>();
//        bean.setFilter(new WebStatFilter());
//        // 配置参数
//        Map<String, String> initParams = new HashMap<>();
//        initParams.put("exclusions", "*.js,*.css,/druid/*");
//        bean.setInitParameters(initParams);
//        bean.setUrlPatterns(Collections.singletonList("/*"));
//        return bean;
//    }
}
