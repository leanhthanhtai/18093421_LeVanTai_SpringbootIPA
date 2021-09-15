package com.se.service;

import com.se.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ServiceInterface {
    public List<Employee> findAll();
}
