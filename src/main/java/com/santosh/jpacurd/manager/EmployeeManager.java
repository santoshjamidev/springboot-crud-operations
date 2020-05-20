package com.santosh.jpacurd.manager;

import com.santosh.jpacurd.domain.EmployeeData;
import com.santosh.jpacurd.model.Employee;

import java.util.List;

public interface EmployeeManager {

    Employee insertEmployeeRecord(EmployeeData employeeData);

    List<Employee> getAllEmployees();

    Employee updateExistingRecord(String employeedId, String name);
}
