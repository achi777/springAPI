package com.example.myapi;

import com.example.myapi.model.Employee;
import com.example.myapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyapiApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MyapiApplication.class, args);
    }

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
        Employee employee = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
//        employee.setFirstName("Mamuka");
//        employee.setLastName("Kutaisidze");
//        employee.setEmailId("mamukia@gmail.com");
//        employeeRepository.save(employee);
        System.out.println(employee);
        System.out.println(employee2);
        System.out.println(employee3);
    }
}
