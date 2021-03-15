package com.atguigu.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 主启动类
 */
@SpringBootApplication
@EnableFeignClients // 启动Feign
public class AtguiguMainType {
    public static void main(String[] args) {
        SpringApplication.run(AtguiguMainType.class, args);
    }
}
