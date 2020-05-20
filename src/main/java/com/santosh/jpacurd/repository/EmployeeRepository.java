package com.santosh.jpacurd.repository;

import com.santosh.jpacurd.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findAll();

    Employee saveAndFlush(Employee employee);
}
