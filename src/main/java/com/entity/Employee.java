package com.entity;


import lombok.Data;

@Data   //包含get、set、tostring方法
public class Employee {

    private long id;
    private String name;
    private int age;
    private int salary;
    private long tel;


}
