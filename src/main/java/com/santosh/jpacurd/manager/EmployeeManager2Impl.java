package com.santosh.jpacurd.manager;

import com.santosh.jpacurd.domain.EmployeeData;
import com.santosh.jpacurd.model.Employee;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Qualifier(value = "Implementation2")
public class EmployeeManager2Impl implements EmployeeManager {

    @Override
    public Employee insertEmployeeRecord(EmployeeData employeeData) {
        return null;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return null;
    }

    @Override
    public Employee updateExistingRecord(String employeedId, String name) {
        return null;
    }
}

//Component
//RestController
//        Service
//Repository

