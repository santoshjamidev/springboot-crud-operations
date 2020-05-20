package com.santosh.jpacurd.controller;

import com.santosh.jpacurd.domain.EmployeeData;
import com.santosh.jpacurd.manager.EmployeeManager;
import com.santosh.jpacurd.model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/curd")
public class CurdOperationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CurdOperationController.class);

    @Autowired
    private EmployeeManager employeeManager;

    @GetMapping(path = "/findAll")
    public List<Employee> getAllEmployees() {

        LOGGER.info("CurdOperationController: getAllEmployees ");

        return employeeManager.getAllEmployees();
    }

    @PostMapping(path = "/insert")
    public Employee insertEntryIntoTable(@RequestBody EmployeeData employee) {

        LOGGER.info("CurdOperationController: Emp Name is "+employee.getName());

        return employeeManager.insertEmployeeRecord(employee);
    }

    @GetMapping(path = "/update")
    public Employee updateExistingRecord(@RequestParam("empId") String empId, @RequestParam("name") String name) {

        LOGGER.info("CurdOperationController: updateExistingRecord "+empId + " Name is "+name);

        return employeeManager.updateExistingRecord(empId,name);
    }
}
