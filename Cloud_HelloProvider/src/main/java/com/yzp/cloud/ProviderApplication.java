package com.yzp.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program:
 * @description:
 * @author: yzp
 * @create: 2020/2/13 19:28
 */
@SpringBootApplication
@EnableDiscoveryClient //发现注册服务
@MapperScan("com.yzp.cloud.dao")
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class,args);
    }
}
