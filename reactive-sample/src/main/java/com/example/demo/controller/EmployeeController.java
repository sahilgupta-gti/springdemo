package com.example.demo.controller;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.awt.*;

@RequestMapping(value = "/api/controller")
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping(value = "/employees", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<EmployeeDTO> getAllEmployees() {
        return employeeRepository.getAllEmployees();
    }
}
