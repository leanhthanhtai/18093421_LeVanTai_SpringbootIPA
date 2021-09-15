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
    public List<Employee> findAllEmployee() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee getEmployee(long id) {

        return employeeRepo.findEmployeeById(id);
    }

    @Override
    public void deleteEmployee(long id) {

        employeeRepo.deleteById(id);
    }

    @Override
    public void editEmployee(long id) {

    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }
}
