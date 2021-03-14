package com.atguigu.spring.cloud.handler;

import com.atguigu.spring.cloud.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class EmployeeHandler {

    @RequestMapping("/provider/get/employee/remote")
    public Employee getEmployeeRemote(HttpServletRequest request) {
        // 获取服务器端口号
        int serverPort = request.getServerPort();
        return new Employee(555, "tom555" + serverPort, 555.55);
    }
}
