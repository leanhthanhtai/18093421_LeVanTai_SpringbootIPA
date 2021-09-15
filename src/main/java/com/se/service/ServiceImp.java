package com.se.service;

import com.se.entity.Employee;
import com.se.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ServiceImp implements ServiceInterface {

    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    @Transactional
    public List<Employee> findAll() {
        return employeeRepo.findAll();
    }
}
