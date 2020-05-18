package com.santosh.jpacurd.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/curd")
public class CurdOperationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CurdOperationController.class);

    @GetMapping(path = "/insert")
    public String insertEntryIntoTable(@RequestParam("empName") String empName) {

        LOGGER.info("CurdOperationController: Emp Name is "+empName);

        return "Hello "+empName;
    }
}
