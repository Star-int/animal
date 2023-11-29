package com.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {

    List<Employee> queryAll();


}
