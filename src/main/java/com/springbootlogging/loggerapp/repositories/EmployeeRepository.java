package com.springbootlogging.loggerapp.repositories;

import com.springbootlogging.loggerapp.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
