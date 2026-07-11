package com.example;

import com.example.entity.Employee;
import com.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataJpaApplication implements CommandLineRunner {

    @Autowired
    EmployeeService service;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaApplication.class, args);
    }

    @Override
    public void run(String... args) {

        service.saveEmployee(new Employee("Harshitha", "CSE"));
        service.saveEmployee(new Employee("Rahul", "IT"));

        service.displayEmployees();
    }
}