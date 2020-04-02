package com.yzp.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @program:
 * @description:
 * @author: yzp
 * @create: 2020/2/13 20:45
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy //启用网关代理
@EnableHystrixDashboard //启动hystrix的监控 仪表盘
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class,args);
    }
}
