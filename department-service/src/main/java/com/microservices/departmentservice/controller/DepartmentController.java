package com.microservices.departmentservice.controller;

import com.microservices.departmentservice.model.Department;
import com.microservices.departmentservice.repository.DepartmentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    //private static final as we cannot make any changes in the logs
    private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @Autowired
    private DepartmentRepository repository;

    @PostMapping
    public Department add(@RequestBody Department department){
        LOGGER.info("Department add: {}", department);
        return repository.addDepartment(department);
    }

    @GetMapping
    public List<Department> findAll(){
        LOGGER.info("Department find");
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Department findById(@PathVariable Long id){
        LOGGER.info("Department find: id={}", id);
        return repository.findById(id);
    }
}
