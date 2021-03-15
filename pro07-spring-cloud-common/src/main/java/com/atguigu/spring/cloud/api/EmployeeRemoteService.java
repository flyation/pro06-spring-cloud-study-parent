package com.atguigu.spring.cloud.api;

import com.atguigu.spring.cloud.Employee;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

// @FeignClient表示当前接口和一个Provier对应
@FeignClient("atguigu-provider")
public interface EmployeeRemoteService {

    /**
     * 远程调用的接口方法<br>
     * RequestMapping注解映射的地址要一致<br>
     * 方法声明要一致<br>
     * 用来获取请求参数的@RequestParam、@PathVariable、@RequestBody要一致<br>
     * @return
     */
    @RequestMapping("/provider/get/employee/remote")
    Employee getEmployeeRemote();

    @RequestMapping("/provider/get/emp/list/remote")
    List<Employee> getEmpListRemote(@RequestParam("keyword") String keyword);
}
