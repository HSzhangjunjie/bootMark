package com.example.hiboot.service.impl;

import com.example.hiboot.service.ITickerService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

/**
 * 将服务提供者注册到注册中心
 *  1、引入Dubbo和ZooKeeper相关依赖
 *  2、配置Dubbo扫描包和注册中心地址
 *  3、使用@DubboService发布服务
 */
@Component
/*把服务发送出去*/
@DubboService
public class TicketServiceImpl implements ITickerService {
    @Override
    public String getTicket() {
        return "电影票";
    }
}
