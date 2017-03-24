package com.employee.controller;

import com.example.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Description:
 * Author: masong
 * Date: 2017/3/24 14:10
 * Version: v1.0
 */
@RestController
public class EmployeeController {

    @RequestMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable("id") Long id) {

        sleep();
        return new Employee(id,1L,"张三");
    }

    @RequestMapping("/employee")
    public List<Employee> getEmployeesByCompanyId(@RequestParam("companyId") Long companyId){
        List<Employee> employees = new ArrayList<Employee>();

        employees.add(new Employee(1L, companyId, "张三"));
        employees.add(new Employee(2L, companyId, "李四"));
        employees.add(new Employee(3L, companyId, "王五"));

        sleep();
        return employees;
    }

    private void sleep() {
        Random rand = new Random();
        int time = rand.nextInt(2000);

        try {
            Thread.sleep(time);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
