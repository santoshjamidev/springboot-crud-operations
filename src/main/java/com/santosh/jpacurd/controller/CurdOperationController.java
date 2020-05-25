package com.santosh.jpacurd.controller;

import com.santosh.jpacurd.domain.EmployeeData;
import com.santosh.jpacurd.manager.EmployeeManager;
import com.santosh.jpacurd.model.Employee;
import com.santosh.jpacurd.util.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = Constants.BASE_PATH)
public class CurdOperationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CurdOperationController.class);

    @Autowired
    @Qualifier(value = "Implementation1")
    private EmployeeManager employeeManager;

    @Autowired
    @Qualifier(value = "Implementation2")
    private EmployeeManager employeeManager2;

    @GetMapping(path = Constants.FIND_ALL_EMPLOYEES, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Employee> getAllEmployees() {

        LOGGER.info("CurdOperationController: getAllEmployees ");

        return employeeManager.getAllEmployees();
    }

    @GetMapping(path = Constants.FIND_ALL_EMPLOYEES + "/2")
    public List<Employee> getAllEmployees2() {

        LOGGER.info("CurdOperationController: getAllEmployees ");

        return employeeManager2.getAllEmployees();
    }

    @PostMapping(path = Constants.INSERT_EMPLOYEE)
    public Employee insertEntryIntoTable(@RequestBody EmployeeData employee) {

        LOGGER.info("CurdOperationController: Emp Name is "+employee.getName());

        return employeeManager.insertEmployeeRecord(employee);
    }

    @GetMapping(path = Constants.UPDATE_EMPLOYEE)
    public Employee updateExistingRecord(@RequestParam("empId") String empId, @RequestParam("name") String name) {

        LOGGER.info("CurdOperationController: updateExistingRecord "+empId + " Name is "+name);

        return employeeManager.updateExistingRecord(empId,name);
    }
}
