package com.se.controller;

import com.se.entity.Employee;
import com.se.service.ServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    ServiceImp serviceImp;

    @GetMapping("/employee")
    public List<Employee> getEmployees(){
        return serviceImp.findAllEmployee();
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable("id") long id){
        return serviceImp.getEmployee(id);
    }

    @PostMapping("/employee")
    public Employee saveEmployee(@RequestBody Employee employee){
        return serviceImp.saveEmployee(employee);
    }

    @DeleteMapping("/employee/{id}")
    public String deleteEmployee(@PathVariable("id") long id){
        serviceImp.deleteEmployee(id);
        return "Delete Successful!";
    }
}
