package com.atguigu.spring.cloud.handler;

import com.atguigu.spring.cloud.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HumanResourceHandler {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/consumer/ribbon/get/employee")
    public Employee getEmployeeRemote() {
        // 远程调用方法的主机地址
//        String host = "http://localhost:1000";
        // 将远程微服务调用地址从ip+port改为微服务名称
        String host = "http://atguigu-provider";

        // 远程调用方法的具体 URL 地址
        String url = "/provider/get/employee/remote";
        return restTemplate.getForObject(host + url, Employee.class);
    }
}
