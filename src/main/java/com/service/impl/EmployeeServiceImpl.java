package com.service.impl;


import com.dao.EmployeeMapper;
import com.entity.Employee;
import com.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> queryAll() {
        List<Employee> employees = employeeMapper.queryAll();
        return  employees;
    }
}
