package com.springbootlogging.loggerapp;

import com.springbootlogging.loggerapp.models.Employee;
import com.springbootlogging.loggerapp.repositories.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LoggerAppApplication {

    private static final Logger log = LoggerFactory.getLogger(LoggerAppApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(LoggerAppApplication.class, args);
        System.out.println(System.getProperty("user.dir"));
    }

    @Bean
    public CommandLineRunner insert_employee_info(EmployeeRepository employeeRepository) {
        return (args) -> {
            employeeRepository.save(new Employee("Ahmad", "Jamalzada"));
            employeeRepository.save(new Employee("Dirk", "Bouwmeester"));
            employeeRepository.save(new Employee("Karel", "van den Berg"));

            for (Employee employee : employeeRepository.findAll()) {
                log.info("The employee is: " + employee.toString());
            }
        };
    }

}
