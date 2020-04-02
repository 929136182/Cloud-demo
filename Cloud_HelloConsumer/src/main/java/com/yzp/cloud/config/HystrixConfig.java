package com.yzp.cloud.config;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program:
 * @description:
 * @author: yzp
 * @create: 2020/2/13 21:12
 */
@Configuration
public class HystrixConfig {
    //配置服务的实时数据采集 默认servlet
    @Bean
    public ServletRegistrationBean creates(){
        ServletRegistrationBean registrationBean =new ServletRegistrationBean();
        registrationBean.setServlet(new HystrixMetricsStreamServlet());
        registrationBean.addUrlMappings("/hystrix.stream");
        return registrationBean;
    }
}
