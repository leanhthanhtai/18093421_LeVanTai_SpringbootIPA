package com.se.service;

import com.se.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ServiceInterface {
    public List<Employee> findAllEmployee();
    public Employee getEmployee(long id);
    public void deleteEmployee(long id);
    public void editEmployee(long id);
    public Employee saveEmployee(Employee employee);
}
