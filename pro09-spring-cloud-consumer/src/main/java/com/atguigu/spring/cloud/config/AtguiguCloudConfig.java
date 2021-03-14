package com.atguigu.spring.cloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 配置类
 */
@Configuration
public class AtguiguCloudConfig {

    @Bean
    @LoadBalanced // Ribbon负载均衡、以及通过微服务名解析实际的服务地址
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
