package com.service;




import com.entity.Employee;

import java.util.List;

public interface IEmployeeService {
    //查询所有员工信息
    List<Employee> queryAll();
}
