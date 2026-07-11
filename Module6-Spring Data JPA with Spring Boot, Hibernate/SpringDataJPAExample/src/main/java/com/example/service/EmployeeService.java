package com.example.service;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public void saveEmployee(Employee employee) {
        repository.save(employee);
    }

    public void displayEmployees() {
        repository.findAll().forEach(System.out::println);
    }
}