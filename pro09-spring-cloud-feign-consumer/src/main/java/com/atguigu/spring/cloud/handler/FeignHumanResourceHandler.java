package com.atguigu.spring.cloud.handler;

import com.atguigu.spring.cloud.Employee;
import com.atguigu.spring.cloud.api.EmployeeRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FeignHumanResourceHandler {

    // 装配用来调用远程微服务的接口，后面像调用本地方法一样直接使用
    @Autowired
    private EmployeeRemoteService employeeRemoteService;

    @RequestMapping("/feign/consumer/get/emp")
    public Employee getEmployeeRemote() {
        // 通过Feign调用
        return employeeRemoteService.getEmployeeRemote();
    }

    @RequestMapping("/feign/consumer/search")
    public List<Employee> getEmpListRemote(String keyword) {
        // 通过Feign调用
        return employeeRemoteService.getEmpListRemote(keyword);
    }
}
