package com.controller;



import com.entity.Employee;
import com.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController  //import
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;
    @RequestMapping("/list")
    public List<Employee> list(){
        //t通过业务层查询员工信息返回给浏览器用户看
        List<Employee> employees =employeeService.queryAll();
        System.out.println(employees);
        return employees;
    }
}
