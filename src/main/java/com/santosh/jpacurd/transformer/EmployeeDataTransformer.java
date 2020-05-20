package com.santosh.jpacurd.transformer;

import com.santosh.jpacurd.domain.EmployeeData;
import com.santosh.jpacurd.model.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDataTransformer {

    public Employee transform(EmployeeData employeeData) {
        Employee employee = new Employee(employeeData.getName(), employeeData.getSalary(), employeeData.getCompany());
        return employee;
    }
}
