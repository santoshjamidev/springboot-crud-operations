package com.santosh.jpacurd.manager;

import com.santosh.jpacurd.domain.EmployeeData;
import com.santosh.jpacurd.model.Employee;
import com.santosh.jpacurd.repository.EmployeeRepository;
import com.santosh.jpacurd.transformer.EmployeeDataTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeManagerImpl implements EmployeeManager {

    @Autowired
    private EmployeeDataTransformer employeeDataTransformer;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee insertEmployeeRecord(EmployeeData employeeData) {

        Employee employeeDataModel = employeeDataTransformer.transform(employeeData);

        return employeeRepository.save(employeeDataModel);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee updateExistingRecord(String employeedId, String name) {
        Employee employeeDataModel =  employeeRepository.findById(new Long(employeedId)).get();
        employeeDataModel.setName(name);
        return employeeRepository.save(employeeDataModel);
    }
}
