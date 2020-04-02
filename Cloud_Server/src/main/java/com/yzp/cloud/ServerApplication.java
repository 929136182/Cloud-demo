package com.yzp.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program:
 * @description:
 * @author: yzp
 * @create: 2020/2/13 19:13
 */
@SpringBootApplication
@EnableEurekaServer //标记这是一个注册中心 服务端
public class ServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class,args);
    }
}
